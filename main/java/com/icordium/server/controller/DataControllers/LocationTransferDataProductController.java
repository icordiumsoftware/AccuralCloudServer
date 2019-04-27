package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.GoodsLocationTransferDataProductService;
import com.icordium.server.controller.datamodel.LocationtranferdataproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */

@RestController
@RequestMapping("/locationtranferdataproduct")
public class LocationTransferDataProductController {
    @Autowired
    private GoodsLocationTransferDataProductService goodsLocationTransferHedderService;

    @GetMapping("/all")
    public List<LocationtranferdataproductEntity> allProductType() {
        return goodsLocationTransferHedderService.findAllGoodsLocationtranferdataproduct();
    }

    @GetMapping("/find/{id")
    public LocationtranferdataproductEntity FindTranferHedder(@PathVariable("id") int id) {
        return goodsLocationTransferHedderService.findById(id);
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody LocationtranferdataproductEntity goodrevicehedderEntity) {
        return goodsLocationTransferHedderService.saveLocationtranferdataproduct(goodrevicehedderEntity);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody LocationtranferdataproductEntity goodrevicehedderEntity) {
        return goodsLocationTransferHedderService.updateLocationtranferdataproduct(goodrevicehedderEntity);
    }
}