package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.RentalCartOtherService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.RentcartotherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rentalCartOther")
public class RentCartOtherController {
    @Autowired
    private RentalCartOtherService rentalCartOtherService;

    @GetMapping("/all")
    public String allRentCartService() {
        try {
            JSONArray array = new JSONArray();
            for (RentcartotherEntity entity : rentalCartOtherService.findAllCartOthers()) {
                JSONObject object = new JSONObject();
                object.put("idrentcartother", entity.getIdrentcartother());
                object.put("description", entity.getDescription());
                object.put("price", entity.getPrice());
                object.put("qty", entity.getQty());
                object.put("freeqty", entity.getFreeqty());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("total", entity.getQty() * entity.getPrice());
                array.put(object);
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @GetMapping("/byCartid/{id}")
    public String allByRentCartService(@PathVariable String id) {
        try {
            JSONArray array = new JSONArray();
            for (RentcartotherEntity entity : rentalCartOtherService.findByCartCartOthers(DataTypeValidator.parseInt(id))) {
                JSONObject object = new JSONObject();
                object.put("idrentcartother", entity.getIdrentcartother());
                object.put("description", entity.getDescription());
                object.put("price", entity.getPrice());
                object.put("qty", entity.getQty());
                object.put("freeqty", entity.getFreeqty());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("total", entity.getQty() * entity.getPrice());
                array.put(object);
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }

    }

    @PostMapping(value = "/add")
    public String addService(@RequestBody RentcartotherEntity rentcartotherEntity) {
        return rentalCartOtherService.saveCartOther(rentcartotherEntity);
    }

    @PostMapping(value = "/update")
    public String updateService(@RequestBody RentcartotherEntity rentcartotherEntity) {
        return rentalCartOtherService.updateCartOther(rentcartotherEntity);
    }

    @GetMapping("/find/{id}")
    public RentcartotherEntity getServiceById(@PathVariable String id) {
        return rentalCartOtherService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteServiceById(@PathVariable String id) {
        return rentalCartOtherService.deleteById(DataTypeValidator.parseInt(id));
    }
}