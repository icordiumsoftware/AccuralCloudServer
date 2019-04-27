package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.AreaService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.AreasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreasController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/all")
    public List<AreasEntity> allLocations() {
        return areaService.findAllArea();
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody AreasEntity areasEntity) {
        return areaService.saveArea(areasEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody AreasEntity locationEntity) {
        return areaService.updateArea(locationEntity);
    }

    @GetMapping("/find/{id}")
    public AreasEntity getLocationById(@PathVariable String id) {
        return areaService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id) {
        return areaService.deleteById(DataTypeValidator.parseInt(id));
    }
}