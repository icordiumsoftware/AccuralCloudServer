package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.RentalCartServiceService;
import com.icordium.server.controller.DataService.ServiceService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.RentcartserviceEntity;
import com.icordium.server.controller.datamodel.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rentalCartService")
public class RentalCartServiceController {
    @Autowired
    private RentalCartServiceService rentalCartServiceService;
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/all")
    public String allRentCartService() {
        try {
            JSONArray array = new JSONArray();
            for (RentcartserviceEntity entity : rentalCartServiceService.findAllCartService()) {
                JSONObject object = new JSONObject();
                ServiceEntity serviceEntity = entity.getServiceByServiceIdservice();
                object.put("idrentcartservice", entity.getCartIdcart());
                object.put("serviceIdservice", entity.getServiceIdservice());
                object.put("serviceDescription", serviceEntity.getServicename());
                object.put("freeqty", entity.getFreeqty());
                object.put("price", serviceEntity.getRetailprice());
                object.put("qty", entity.getQty());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("discount", entity.getDiscount());
                object.put("total", (entity.getQty() * serviceEntity.getRetailprice()) - entity.getDiscount());
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
            for (RentcartserviceEntity entity : rentalCartServiceService.findByCartIdCartService(DataTypeValidator.parseInt(id))) {
                JSONObject object = new JSONObject();
                ServiceEntity serviceEntity = entity.getServiceByServiceIdservice();
                object.put("idrentcartservice", entity.getCartIdcart());
                object.put("serviceIdservice", entity.getServiceIdservice());
                object.put("serviceDescription", serviceEntity.getServicename());
                object.put("freeqty", entity.getFreeqty());
                object.put("price", serviceEntity.getRetailprice());
                object.put("qty", entity.getQty());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("discount", entity.getDiscount());
                object.put("total", (entity.getQty() * serviceEntity.getRetailprice()) - entity.getDiscount());
                array.put(object);
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @PostMapping(value = "/add")
    public String addCartService(@RequestBody RentcartserviceEntity rentcartserviceEntity) {
        return rentalCartServiceService.saveCartService(rentcartserviceEntity);
    }

    @PostMapping(value = "/update")
    public String updateCartService(@RequestBody RentcartserviceEntity rentcartserviceEntity) {
        return rentalCartServiceService.updateCartService(rentcartserviceEntity);
    }

    @GetMapping("/find/{id}")
    public RentcartserviceEntity getCartServiceById(@PathVariable String id) {
        return rentalCartServiceService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteCartServiceById(@PathVariable String id) {
        return rentalCartServiceService.deleteById(DataTypeValidator.parseInt(id));
    }
}