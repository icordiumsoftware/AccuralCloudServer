package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.StockRepository;
import com.icordium.server.controller.DataService.StockService;
import com.icordium.server.controller.datamodel.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<StockEntity> findAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public List<StockEntity> findStockByLocation(int Locationid) {
        return stockRepository.findByIdlocation(Locationid);
    }

    @Override
    public String saveStock(StockEntity stockEntity) {
        stockRepository.save(stockEntity);
        stockRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + stockEntity.getIdstock() + "\"}";
    }

    @Override
    public String updateStock(StockEntity stockEntity) {
        if (stockEntity.getIdstock() != 0) {
            stockRepository.save(stockEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public StockEntity findById(int id) {
        return stockRepository.findById(id).get();
    }

    @Override
    public StockEntity findByLocationAndProduct(int locationid, int productid) {
        return stockRepository.getByIdlocationAndIdproduct(locationid, productid);
    }

    @Override
    public String deleteById(int id) {
        stockRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count() {
        return stockRepository.count();
    }

    @Override
    public long countZeroStock() {
        return stockRepository.countByQtyinhandEquals(0.00);
    }
}