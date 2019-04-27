package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.GoodReciveDataProductService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.GoodrecivedataproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grnproducts")
public class GoodReciveDataProductController {
    @Autowired
    private GoodReciveDataProductService goodReciveDataProductService;

    @GetMapping("/bygrnid/{id}")
    public List<GoodrecivedataproductEntity> allProduct(@PathVariable("id") String id) {
        return goodReciveDataProductService.findAllGoodReciveDataProduct();
    }

    @GetMapping("/all")
    public List<GoodrecivedataproductEntity> allProductByGRNID() {
        return goodReciveDataProductService.findAllGoodReciveDataProduct();
    }

    @GetMapping("/active/{status")
    public List<GoodrecivedataproductEntity> allActiveProductType(@PathVariable("status") String status) {
        return goodReciveDataProductService.findAllActiveGoodReciveDataProduct(DataTypeValidator.parseInt(status));
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody GoodrecivedataproductEntity goodrevicehedderEntity) {
        return goodReciveDataProductService.saveGoodReciveDataProduct(goodrevicehedderEntity);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody GoodrecivedataproductEntity goodrecivedataproductEntity) {
        return goodReciveDataProductService.updateGoodReciveDataProduct(goodrecivedataproductEntity);
    }
}