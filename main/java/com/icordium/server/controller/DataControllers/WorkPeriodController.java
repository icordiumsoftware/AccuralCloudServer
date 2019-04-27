package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.WorkPeriodService;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */

@RestController
@RequestMapping("/workperiod")
public class WorkPeriodController {
    @Autowired
    private WorkPeriodService workPeriodService;

    @GetMapping("/checkdetails/{id}")
    public WorkshiftEntity checkdetailsById(@PathVariable("id") int id) {
        return workPeriodService.findById(id);
    }

    @GetMapping("/all")
    public List<WorkshiftEntity> all() {
        return workPeriodService.findAllLocation();
    }
}