package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.GoodReciveHedderService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.GoodrevicehedderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/grnhedders")
public class GoodReciveController {

    @Autowired
    private GoodReciveHedderService goodReciveHedderService;

    @GetMapping("/all")
    public List<GoodrevicehedderEntity> allProductType() {
        return goodReciveHedderService.findAllGoodReciveHedder();
    }

    @GetMapping("/active/{status}")
    public List<GoodrevicehedderEntity> allActiveProductType(@PathVariable("status") String status) {
        return goodReciveHedderService.findAllActiveGoodReciveHedder(DataTypeValidator.parseInt(status));
    }

    @PostMapping("/add")
    public String addProductType(@RequestBody GoodrevicehedderEntity goodrevicehedderEntity, HttpServletRequest request) {
        goodrevicehedderEntity.setLocationIdlocation(DataTypeValidator.parseInt(request.getSession().getAttribute("LocationID"))
        );
        return goodReciveHedderService.saveGoodReciveHedder(goodrevicehedderEntity);
    }

    @PutMapping("/update")
    public String updateProductType(@RequestBody GoodrevicehedderEntity goodrevicehedderEntity) {
        return goodReciveHedderService.updateGoodReciveHedder(goodrevicehedderEntity);
    }

    @PostMapping("/delete/{id}")
    public String deleteById(@PathVariable String id) {
        return goodReciveHedderService.deleteById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/genarate/{id}")
    public String GenarateById(@PathVariable String id) {
        return goodReciveHedderService.deleteById(DataTypeValidator.parseInt(id));
    }
}