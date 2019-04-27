package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.StockService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StocksController {
    @Autowired
    StockService stockService;

    @GetMapping(value = "/location/{locationid}/product/{productid}")
    public StockEntity getProductById(@PathVariable String locationid, @PathVariable String productid) {
        return stockService.findByLocationAndProduct(DataTypeValidator.parseInt(locationid), DataTypeValidator.parseInt(productid));
    }

    @GetMapping(value = "/location/{locationid}")
    public List<StockEntity> getProductById(@PathVariable String locationid) {
        return stockService.findStockByLocation(DataTypeValidator.parseInt(locationid));
    }
}