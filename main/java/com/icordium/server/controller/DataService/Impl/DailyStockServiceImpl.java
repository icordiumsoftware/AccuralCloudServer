package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DailyStockBookRepository;
import com.icordium.server.controller.DataService.DailyStockService;
import com.icordium.server.controller.datamodel.DailystockbookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DailyStockServiceImpl implements DailyStockService {
    @Autowired
    private DailyStockBookRepository dailyStockBookRepository;

    @Override
    public List<DailystockbookEntity> findAllDailyStockBook() {
        return dailyStockBookRepository.findAll();
    }

    @Override
    public List<DailystockbookEntity> findByProductAndDateBetween(int ProductId, int locationIdlocation, Date fromdate, Date todate) {
        return dailyStockBookRepository.findByProductIdproductAndLocationIdlocationAndDateBetweenOrderByBookedorderqtyDesc(ProductId, locationIdlocation, fromdate, todate);
    }

    @Override
    public DailystockbookEntity findById(int id) {
        return dailyStockBookRepository.getOne(id);
    }
}