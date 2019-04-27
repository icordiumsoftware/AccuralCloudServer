package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.EmployeeService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<EmployeeEntity> allProducts() {
        return employeeService.findAllEmployee();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newEmployeeImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        String Pathdb = "/resource/images/employee/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            employeeEntity.setIcon(Pathdb);
        }
        employeeEntity.setFistname(httpServletRequest.getParameter("newFistName"));
        employeeEntity.setLastname(httpServletRequest.getParameter("newLastName"));
        //    employeeEntity.setDateofbirth(httpServletRequest.getParameter("newDateOfBirth"));
        employeeEntity.setIdnumber(httpServletRequest.getParameter("newIdNumber"));
        employeeEntity.setPassportnumber(httpServletRequest.getParameter("newPassportNumber"));
        employeeEntity.setEpfnumber(httpServletRequest.getParameter("newEpfNumber"));
        employeeEntity.setEtfnumber(httpServletRequest.getParameter("newEtfNumber"));
        employeeEntity.setGender(DataTypeValidator.parseInt(httpServletRequest.getParameter("newGender")));
        employeeEntity.setEmail(httpServletRequest.getParameter("newEmail"));
        employeeEntity.setOfficenumber(httpServletRequest.getParameter("newOfficeNumber"));
        employeeEntity.setTelephonenumber(httpServletRequest.getParameter("newMobileNumber"));
        employeeEntity.setMaritalstatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newmarrigestatus")));
        employeeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newstatus")));

        return employeeService.saveEmployee(employeeEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("editEmployeeImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        EmployeeEntity employeeEntity = employeeService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        String Pathdb = "/resource/images/product/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            employeeEntity.setIcon(Pathdb);
        }
        employeeEntity.setFistname(httpServletRequest.getParameter("editFistName"));
        employeeEntity.setLastname(httpServletRequest.getParameter("editLastName"));
        //    employeeEntity.setDateofbirth(httpServletRequest.getParameter("editDateOfBirth"));
        employeeEntity.setIdnumber(httpServletRequest.getParameter("editIdNumber"));
        employeeEntity.setPassportnumber(httpServletRequest.getParameter("editPassportNumber"));
        employeeEntity.setEpfnumber(httpServletRequest.getParameter("editEpfNumber"));
        employeeEntity.setEtfnumber(httpServletRequest.getParameter("editEtfNumber"));
        employeeEntity.setGender(DataTypeValidator.parseInt(httpServletRequest.getParameter("editGender")));
        employeeEntity.setEmail(httpServletRequest.getParameter("editEmail"));
        employeeEntity.setOfficenumber(httpServletRequest.getParameter("editOfficeNumber"));
        employeeEntity.setTelephonenumber(httpServletRequest.getParameter("editMobileNumber"));
        employeeEntity.setMaritalstatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editmarrigestatus")));
        employeeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editstatus")));

        return employeeService.updateEmployee(employeeEntity);
    }

    @GetMapping("/find/{id}")
    public EmployeeEntity getProductById(@PathVariable String id) {
        return employeeService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return employeeService.deleteById(DataTypeValidator.parseInt(id));
    }
}