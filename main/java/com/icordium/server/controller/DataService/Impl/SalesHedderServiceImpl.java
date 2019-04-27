package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.SalesHedderRepository;
import com.icordium.server.controller.DataService.SalesHedderService;
import com.icordium.server.controller.datamodel.SaleshedderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesHedderServiceImpl implements SalesHedderService {
    @Autowired
    private SalesHedderRepository salesHedderRepository;

    @Override
    public List<SaleshedderEntity> findAllSalesHedder() {
        return salesHedderRepository.findAll();
    }

    @Override
    public String saveSalesHedder(SaleshedderEntity saleshedderEntity) {
        salesHedderRepository.save(saleshedderEntity);
        salesHedderRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + saleshedderEntity.getIdsaleshedder() + "\"}";
    }

    @Override
    public String updateSalesHedder(SaleshedderEntity saleshedderEntity) {
        if (saleshedderEntity.getIdsaleshedder() != 0) {
            salesHedderRepository.save(saleshedderEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public SaleshedderEntity findById(int id) {
        return salesHedderRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        salesHedderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long SalesHedderCount() {
        return salesHedderRepository.count();
    }
}