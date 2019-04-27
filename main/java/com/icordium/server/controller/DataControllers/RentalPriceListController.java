package com.icordium.server.controller.DataControllers;


import com.icordium.server.controller.DataService.RentalPriceListService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.RentalpricelistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentalpricelist")
public class RentalPriceListController {
    @Autowired
    private RentalPriceListService rentalPriceListService;

    @GetMapping("/all")
    public List<RentalpricelistEntity> allLocations() {
        return rentalPriceListService.findAllRentalPrice();
    }

    @PostMapping("/add")
    public String addRentalPrice(@RequestBody RentalpricelistEntity rentalpricelistEntity) {
        return rentalPriceListService.saveRentalpriceList(rentalpricelistEntity);
    }

    @PutMapping("/update")
    public String updateRentalPrice(@RequestBody RentalpricelistEntity rentalpricelistEntity) {
        return rentalPriceListService.updateRentalpriceList(rentalpricelistEntity);
    }

    @GetMapping("/findbyproduct/{id}")
    public List<RentalpricelistEntity> getRentalPriceByProductId(@PathVariable String id) {
        return rentalPriceListService.findAllRentalPriceByProductId(DataTypeValidator.parseInt(id));
    }

    @GetMapping("/findbycategory/{id}")
    public List<RentalpricelistEntity> getRentalPriceByCategoryId(@PathVariable String id) {
        return rentalPriceListService.findAllRentalPriceByRentalPriceCategory(DataTypeValidator.parseInt(id));
    }

    @GetMapping("/findbyproductandcategory/{id}/category/{idcategory}")
    public List<RentalpricelistEntity> getRentalPriceByProductIdCategory(@PathVariable String id, @PathVariable String idcategory) {
        return rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategory(DataTypeValidator.parseInt(id), DataTypeValidator.parseInt(idcategory));
    }

    @GetMapping("/find/{id}")
    public RentalpricelistEntity getRentalPriceById(@PathVariable String id) {
        return rentalPriceListService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteRentalPricebyId(@PathVariable String id) {
        return rentalPriceListService.deleteById(DataTypeValidator.parseInt(id));
    }

}