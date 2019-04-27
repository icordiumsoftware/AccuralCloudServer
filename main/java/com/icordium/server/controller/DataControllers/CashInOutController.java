package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.CashInOutService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.CashinandcashoutEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ISH on 2/23/2019.
 */

@RestController
@RequestMapping("/cahinout")
public class CashInOutController {
    @Autowired
    private CashInOutService areaService;

    @GetMapping("/all")
    public List<CashinandcashoutEntity> allLocations(HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return new ArrayList<>();
            }
        } catch (NullPointerException e) {
            return new ArrayList<>();
        }
        return areaService.findAllCashinandcashout();
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody CashinandcashoutEntity areasEntity, HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            return "{\"status\":\"error\"}";
        }
        return areaService.saveCashinandcashout(areasEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody CashinandcashoutEntity locationEntity, HttpServletRequest request) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            return "{\"status\":\"error\"}";
        }
        return areaService.updateCashinandcashout(locationEntity);
    }

    @GetMapping("/find/{id}")
    public CashinandcashoutEntity getLocationById(@PathVariable String id) {
        return areaService.findById(DataTypeValidator.parseInt(id));
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
        return areaService.deleteById(DataTypeValidator.parseInt(id));
    }
}