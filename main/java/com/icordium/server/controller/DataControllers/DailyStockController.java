package com.icordium.server.controller.DataControllers;

//import com.icordium.server.controller.DataService.DailystockbookEntity;
//import com.icordium.server.controller.DataService.DailyStockService;

import com.icordium.server.controller.DataService.DailyStockService;
import com.icordium.server.controller.datamodel.DailystockbookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/DailyStock")
public class DailyStockController {
    @Autowired
    private DailyStockService dailyStockService;

    @GetMapping("/all")
    public List<DailystockbookEntity> findAllDailyStockBook() {
        return dailyStockService.findAllDailyStockBook();
    }

    @GetMapping("/productid/{ProductId}/location/{locationIdlocation}/fromdate/{fromdate}/todate/{todate}")
    List<DailystockbookEntity> findByProductAndDateBetweenLocation(@PathVariable int ProductId, @PathVariable int locationIdlocation, @PathVariable String fromdate, @PathVariable String todate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date from = format.parse(fromdate);
        Date to = format.parse(todate);
        return dailyStockService.findByProductAndDateBetween(ProductId, locationIdlocation, from, to);

    }

}