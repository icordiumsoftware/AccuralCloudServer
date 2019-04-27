package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.SalaryAdvanceService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.SalaryadvanceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ISH on 3/22/2019.
 */
@RestController
@RequestMapping("/salaryadvance")
public class SalaryAdvanceController {

    @Autowired
    private SalaryAdvanceService salaryAdvanceService;

    @GetMapping("/all")
    public List<SalaryadvanceEntity> allLocations(HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return new ArrayList<>();
            }
        } catch (NullPointerException e) {
            return new ArrayList<>();
        }
        return salaryAdvanceService.findAllSalaryAdvance();
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody SalaryadvanceEntity areasEntity, HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            return "{\"status\":\"error\"}";
        }
        areasEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        return salaryAdvanceService.saveSalaryAdvance(areasEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody SalaryadvanceEntity locationEntity, HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            return "{\"status\":\"error\"}";
        }
        return salaryAdvanceService.updateSalaryAdvance(locationEntity);
    }

    @GetMapping("/find/{id}")
    public SalaryadvanceEntity getLocationById(@PathVariable String id) {
        return salaryAdvanceService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id, HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            return "{\"status\":\"error\"}";
        }
        return salaryAdvanceService.deleteById(DataTypeValidator.parseInt(id));
    }
}