package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.GoodrevicehedderEntity;

import java.util.List;

public interface GoodReciveHedderService {
    List<GoodrevicehedderEntity> findAllGoodReciveHedder();

    List<GoodrevicehedderEntity> findAllActiveGoodReciveHedder(int status);

    String saveGoodReciveHedder(GoodrevicehedderEntity goodrevicehedderEntity);

    String updateGoodReciveHedder(GoodrevicehedderEntity goodrevicehedderEntity);

    GoodrevicehedderEntity findById(int id);

    String deleteById(int id);

    String GenarateById(int id);
}