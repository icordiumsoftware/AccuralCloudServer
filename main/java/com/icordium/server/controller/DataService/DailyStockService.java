package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.DailystockbookEntity;

import java.util.Date;
import java.util.List;

public interface DailyStockService {
    List<DailystockbookEntity> findAllDailyStockBook();

    List<DailystockbookEntity> findByProductAndDateBetween(int ProductId, int locationIdlocation, Date fromdate, Date todate);

    DailystockbookEntity findById(int id);
}