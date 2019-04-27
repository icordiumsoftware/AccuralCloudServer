package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.GoodsLocationTransferHedderService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.LocationtranferhedderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */


@RestController
@RequestMapping("/locationtranferhedder")
public class LocationTransferController {
    @Autowired
    private GoodsLocationTransferHedderService goodsLocationTransferHedderService;

    @GetMapping("/all")
    public List<LocationtranferhedderEntity> allProductType() {
        return goodsLocationTransferHedderService.findAllGoodsLocationTransferHedder();
    }

    @GetMapping("/active/{status")
    public List<LocationtranferhedderEntity> allActiveProductType(@PathVariable("status") String status) {
        return goodsLocationTransferHedderService.findAllActiveGoodsLocationTransferHedder(DataTypeValidator.parseInt(status));
    }

    @GetMapping("/find/{id")
    public LocationtranferhedderEntity FindTranferHedder(@PathVariable("id") int id) {
        return goodsLocationTransferHedderService.findById(id);
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody LocationtranferhedderEntity goodrevicehedderEntity, HttpServletRequest request) {
        goodrevicehedderEntity.setFromlocation(DataTypeValidator.parseInt(request.getSession().getAttribute("LocationID"))
        );
        return goodsLocationTransferHedderService.saveGoodsLocationTransferHedder(goodrevicehedderEntity);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody LocationtranferhedderEntity goodrevicehedderEntity) {
        return goodsLocationTransferHedderService.updateGoodsLocationTransferHedder(goodrevicehedderEntity);
    }
}