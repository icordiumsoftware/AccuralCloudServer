package com.icordium.server.controller.DataControllers;


import com.icordium.server.controller.DataService.ProductTypeService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.ProducttypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ISH on 8/30/2018.
 */
@RestController
@RequestMapping("/ProductTypes")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/all")
    public List<ProducttypeEntity> allProductType() {
        return productTypeService.findAllProductType();
    }

    @GetMapping("/active")
    public List<ProducttypeEntity> allActiveProductType() {
        return productTypeService.findAllActiveProductType();
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody ProducttypeEntity productTypeDTO) {
        return productTypeService.saveProductType(productTypeDTO);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody ProducttypeEntity productTypeDTO) {
        return productTypeService.updateProductType(productTypeDTO);
    }

    @GetMapping("/find/{id}")
    public ProducttypeEntity getProductTypeById(@PathVariable String id) {
        return productTypeService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductTypeyId(@PathVariable String id) {
        return productTypeService.deleteById(DataTypeValidator.parseInt(id));
    }

}