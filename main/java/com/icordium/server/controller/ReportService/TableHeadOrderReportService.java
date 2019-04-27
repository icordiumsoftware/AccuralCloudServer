package com.icordium.server.controller.ReportService;

import com.icordium.server.controller.CustomResultDTO.MenuInvoice;

/**
 * Created by ISH on 3/27/2019.
 */
public interface TableHeadOrderReportService {
    MenuInvoice getMenuInvoiceData(String tableheadid);
}
