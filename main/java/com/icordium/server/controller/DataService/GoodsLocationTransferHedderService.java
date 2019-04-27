package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.LocationtranferhedderEntity;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */
public interface GoodsLocationTransferHedderService {
    List<LocationtranferhedderEntity> findAllGoodsLocationTransferHedder();

    List<LocationtranferhedderEntity> findAllActiveGoodsLocationTransferHedder(int status);

    String saveGoodsLocationTransferHedder(LocationtranferhedderEntity locationtranferhedderEntity);

    String updateGoodsLocationTransferHedder(LocationtranferhedderEntity locationtranferhedderEntity);

    LocationtranferhedderEntity findById(int id);

    String deleteById(int id);
}