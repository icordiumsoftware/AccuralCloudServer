package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.TableHeadsService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.TableheadsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tableheads")
public class TablesHeadsController {
    @Autowired
    private TableHeadsService tableHeadsService;

    @GetMapping("/all")
    public List<TableheadsEntity> allLocations() {
        return tableHeadsService.findAllTableHeads();
    }

    @GetMapping("/bytaleid/{id}")
    public List<TableheadsEntity> allTableHeadsByTableId(@PathVariable String id) {
        return tableHeadsService.findAllTableHeadsByTableId(1, DataTypeValidator.parseInt(id));
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody TableheadsEntity tableheadsEntity) {
        return tableHeadsService.saveTableHeads(tableheadsEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody TableheadsEntity locationEntity) {
        return tableHeadsService.updateTableHeads(locationEntity);
    }

    @GetMapping("/find/{id}")
    public TableheadsEntity getLocationById(@PathVariable String id) {
        return tableHeadsService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id) {
        return tableHeadsService.deleteById(DataTypeValidator.parseInt(id));
    }
}