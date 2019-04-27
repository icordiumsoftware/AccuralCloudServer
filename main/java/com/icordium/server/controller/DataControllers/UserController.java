package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.EmployeeService;
import com.icordium.server.controller.DataService.LocationService;
import com.icordium.server.controller.DataService.UserService;
import com.icordium.server.controller.DataService.WorkPeriodService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.EmployeeEntity;
import com.icordium.server.controller.datamodel.LocationEntity;
import com.icordium.server.controller.datamodel.UsersEntity;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private WorkPeriodService workPeriodService;

    @GetMapping("/all")
    public List<UsersEntity> allProductType() {
        return userService.findAllUsers();
    }

    @GetMapping("/active")
    public List<UsersEntity> allActiveProductType() {
        return userService.findAllUsers();
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody UsersEntity usersEntity) {
        return userService.saveUser(usersEntity);
    }

    @PostMapping("/userlogin")
    public String userLogin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        try {
            String username = httpServletRequest.getParameter("Username");
            String password = httpServletRequest.getParameter("Password");
            String locationID = httpServletRequest.getParameter("LocationID");
//httpServletRequest.login(username,password);
            UsersEntity usersEntity = userService.findByUsersnameAndPassword(username, password);
            LocationEntity locationEntity = locationService.findById(DataTypeValidator.parseInt(locationID));
            if (usersEntity.getPassword().equals(password) & usersEntity.getUsersname().equals(username) & usersEntity.getStatus() == 1) {
                httpServletRequest.getSession().setAttribute("userid", usersEntity.getIdusers());
                httpServletRequest.getSession().setAttribute("user", usersEntity.getUsersname());
                httpServletRequest.getSession().setAttribute("IP", httpServletRequest.getRemoteAddr());
                httpServletRequest.getSession().setAttribute("LocationID", locationID);
                httpServletRequest.getSession().setAttribute("Location", locationEntity.getLocationname());
                httpServletRequest.getSession().setAttribute("currency", locationEntity.getCurrencytype());
                EmployeeEntity employeeEntity = employeeService.findById(usersEntity.getEmployeeIdemployee());
//                httpServletRequest.getSession().setAttribute("employee", employeeEntity); mysql cannot save object this should byte
                httpServletRequest.getSession().setAttribute("employeeID", usersEntity.getEmployeeIdemployee());
                httpServletRequest.getSession().setAttribute("employeeName", employeeEntity.getFistname());

                List<WorkshiftEntity> allActiveWorkPeriodsAndUserId = workPeriodService.findAllActiveWorkPeriodsAndUserIdWithEndNull(locationEntity.getIdlocation(), usersEntity.getIdusers());
                if (allActiveWorkPeriodsAndUserId.size() == 1) {
                    httpServletRequest.getSession().setAttribute("WorkShiftID", allActiveWorkPeriodsAndUserId.get(0).getIdworkshift());
                } else if (allActiveWorkPeriodsAndUserId.size() < 1) {
                    WorkshiftEntity workshiftEntity = new WorkshiftEntity();
                    workshiftEntity.setStart(new Timestamp(new Date().getTime()));
                    workshiftEntity.setDiscount(0.00);
                    workshiftEntity.setSalesamount(0.00);
                    workshiftEntity.setCashin(0.00);
                    workshiftEntity.setCashout(0.00);
                    workshiftEntity.setPaidout(0.00);
                    workshiftEntity.setPidin(0.00);
                    workshiftEntity.setReturned(0.00);
                    workshiftEntity.setLocationIdlocation(locationEntity.getIdlocation());
                    workshiftEntity.setUsersIdusers(usersEntity.getIdusers());
                    int workshiftReturnID = workPeriodService.saveWorkshiftReturnID(workshiftEntity);
                    httpServletRequest.getSession().setAttribute("WorkShiftID", workshiftReturnID);
                }

                if (usersEntity.getUsertypesIdusertypes() == 3) {
                    httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/tableslist");
                } else {
                    httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/dashboard");
                }
                return "{\"status\":\"success\"}";
            } else if (usersEntity.getPassword().equals(password) & usersEntity.getUsersname().equals(username) & usersEntity.getStatus() == 0) {
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
                return "{\"status\":\"warning\"}";
            } else {
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
            return "{\"status\":\"error\"}";
        }
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody UsersEntity usersEntity) {
        return userService.updateUser(usersEntity);
    }

    @GetMapping("/find/{id}")
    public UsersEntity getProductTypeById(@PathVariable String id) {
        return userService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductTypeyId(@PathVariable String id) {
        return userService.deleteById(DataTypeValidator.parseInt(id));
    }

}