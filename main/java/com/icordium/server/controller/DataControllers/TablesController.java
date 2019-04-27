package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.TableService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.TablesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tables")
public class TablesController {
    @Autowired
    private TableService tableService;

    @GetMapping("/all")
    public List<TablesEntity> allTables() {
        return tableService.findAllTable();
    }

    @GetMapping("/byarea/{id}")
    public List<TablesEntity> allTablesByArea(@PathVariable String id) {
        return tableService.findAllTableByArea(DataTypeValidator.parseInt(id), 1);
    }

    @PostMapping("/add")
    public String addTable(@RequestBody TablesEntity areasEntity) {
        return tableService.saveTable(areasEntity);
    }

    @PutMapping("/update")
    public String updateTable(@RequestBody TablesEntity locationEntity) {
        return tableService.updateTable(locationEntity);
    }

    @GetMapping("/changestatus/{id}")
    public String updateStatusTable(@PathVariable String id) {
        TablesEntity tablesEntity = tableService.findById(DataTypeValidator.parseInt(id));
        return tableService.updateTable(tablesEntity);
    }

    @GetMapping("/find/{id}")
    public TablesEntity getTableById(@PathVariable String id) {
        return tableService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteTablebyId(@PathVariable String id) {
        return tableService.deleteById(DataTypeValidator.parseInt(id));
    }
}