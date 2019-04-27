package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.ProductHistoryService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.ProducthistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producthistory")
public class ProductHistoryController {
    @Autowired
    ProductHistoryService productHistoryService;

    @GetMapping(value = "/location/{locationid}/product/{productid}")
    public List<ProducthistoryEntity> getProductById(@PathVariable String locationid, @PathVariable String productid) {
        return productHistoryService.findByIDProductAndIDLocationProductHistoryStocks(DataTypeValidator.parseInt(productid), DataTypeValidator.parseInt(locationid));
    }
}