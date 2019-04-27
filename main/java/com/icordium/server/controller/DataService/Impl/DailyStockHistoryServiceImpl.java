package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DailyStockHistoryREpository;
import com.icordium.server.controller.DataService.DailyStockHistoryService;
import com.icordium.server.controller.datamodel.DailystockhistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyStockHistoryServiceImpl implements DailyStockHistoryService {
    @Autowired
    private DailyStockHistoryREpository dailyStockHistoryREpository;

    @Override
    public String saveDailyStockHistory(DailystockhistoryEntity dailystockhistoryEntity) {
        dailyStockHistoryREpository.save(dailystockhistoryEntity);
        dailyStockHistoryREpository.flush();
        return "{\"status\":\"success\",\"id\":\"" + dailystockhistoryEntity.getIddailystockhistory() + "\"}";
    }
}