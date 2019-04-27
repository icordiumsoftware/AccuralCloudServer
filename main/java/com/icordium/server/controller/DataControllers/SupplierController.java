package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.SupplierService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.SupplierEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/all")
    public List<SupplierEntity> allLocations() {
        return supplierService.findAllSupplier();
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody SupplierEntity supplierEntity) {
        return supplierService.saveSupplier(supplierEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody SupplierEntity supplierEntity) {
        return supplierService.updateSupplier(supplierEntity);
    }

    @GetMapping("/find/{id}")
    public SupplierEntity getLocationById(@PathVariable String id) {
        return supplierService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id) {
        return supplierService.deleteById(DataTypeValidator.parseInt(id));
    }
}