package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.RentalPriceCategoryService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.RentalpricecategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentalPriceCategory")
public class RentalPriceCategoryController {
    @Autowired
    private RentalPriceCategoryService rentalPriceCategoryService;

    @GetMapping("/all")
    public List<RentalpricecategoryEntity> allProductType() {
        return rentalPriceCategoryService.findAllRentalPriceCategory();
    }

    @GetMapping("/active")
    public List<RentalpricecategoryEntity> allActiveProductType() {
        return rentalPriceCategoryService.findAllRentalPriceCategory();
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody RentalpricecategoryEntity rentalpricecategoryEntity) {
        return rentalPriceCategoryService.saveRentalpricecategory(rentalpricecategoryEntity);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody RentalpricecategoryEntity rentalpricecategoryEntity) {
        return rentalPriceCategoryService.updateRentalpricecategory(rentalpricecategoryEntity);
    }

    @GetMapping("/find/{id}")
    public RentalpricecategoryEntity getProductTypeById(@PathVariable String id) {
        return rentalPriceCategoryService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductTypeyId(@PathVariable String id) {
        return rentalPriceCategoryService.deleteById(DataTypeValidator.parseInt(id));
    }

}