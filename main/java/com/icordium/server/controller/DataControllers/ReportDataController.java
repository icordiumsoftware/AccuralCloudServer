package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.CustomResultDTO.KOTDTO;
import com.icordium.server.controller.CustomResultDTO.MenuInvoice;
import com.icordium.server.controller.ReportService.KOTReportService;
import com.icordium.server.controller.ReportService.MenuSalesReportService;
import com.icordium.server.controller.ReportService.TableHeadOrderReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reports")
public class ReportDataController {

    // Report Service
    @Autowired
    private KOTReportService kotReportService;
    @Autowired
    private TableHeadOrderReportService orderReportService;
    @Autowired
    private MenuSalesReportService menuSalesReportService;

    @GetMapping("/kot/{orderid}")
    public KOTDTO allTablesHeadsOrderbyheadidandstatus(@PathVariable(value = "orderid") String orderid) {
        return kotReportService.getKotReportData(orderid);
    }

    @GetMapping("/headorderdata/{tableheadid}")
    public MenuInvoice TableHeadPendingAllOrderData(@PathVariable(value = "tableheadid") String tableheadid) {
        return orderReportService.getMenuInvoiceData(tableheadid);
    }

    @GetMapping("/menuinvoice/{menuinvoiceid}")
    public MenuInvoice MenuInvoiceData(@PathVariable(value = "menuinvoiceid") String tableheadid) {
        return menuSalesReportService.getMenuInvoiceData(tableheadid);
    }
}