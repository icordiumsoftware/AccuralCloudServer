package com.icordium.server.controller.ReportService;

import com.icordium.server.controller.CustomResultDTO.KOTDTO;

/**
 * Created by ISH on 3/27/2019.
 */
public interface KOTReportService {
    KOTDTO getKotReportData(String orderid);
}