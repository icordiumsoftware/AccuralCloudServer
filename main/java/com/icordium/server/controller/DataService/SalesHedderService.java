package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.SaleshedderEntity;

import java.util.List;

public interface SalesHedderService {
    List<SaleshedderEntity> findAllSalesHedder();

    String saveSalesHedder(SaleshedderEntity saleshedderEntity);

    String updateSalesHedder(SaleshedderEntity saleshedderEntity);

    SaleshedderEntity findById(int id);

    String deleteById(int id);

    long SalesHedderCount();
}