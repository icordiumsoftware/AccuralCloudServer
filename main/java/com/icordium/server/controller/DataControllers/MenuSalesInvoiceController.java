package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.MenuSalesInvoiceService;
import com.icordium.server.controller.datamodel.MenusalesinvoiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ISH on 3/27/2019.
 */

@RestController
@RequestMapping("/menusalesinvoicedata")
public class MenuSalesInvoiceController {
    @Autowired
    private MenuSalesInvoiceService menuSalesInvoiceService;

    //    @GetMapping("/Today")
//    public List<MenusalesinvoiceEntity> allInvoice() {
//        try {
//            return menuSalesInvoiceService.findAllMenuSalesInvoiceByDateToday();
//        } catch (ParseException e) {
//            return null;
//        }
//    }
    @GetMapping("/location/{locationIdlocation}/ByDate/{sdate}/{edate}")
    public List<MenusalesinvoiceEntity> allInvoiceByDates(@PathVariable("locationIdlocation") int idLocation, @PathVariable("sdate") String SDate, @PathVariable("edate") String EDate) {
        return menuSalesInvoiceService.findAllMenuSalesInvoiceByDatePeriod(idLocation, SDate, EDate);
    }


}