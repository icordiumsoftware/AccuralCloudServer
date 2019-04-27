package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.StockEntity;

import java.util.List;

public interface StockService {
    List<StockEntity> findAllStock();

    List<StockEntity> findStockByLocation(int Locationid);

    String saveStock(StockEntity stockEntity);

    String updateStock(StockEntity stockEntity);

    StockEntity findById(int id);

    StockEntity findByLocationAndProduct(int locationid, int productid);

    String deleteById(int id);

    long count();

    long countZeroStock();
}