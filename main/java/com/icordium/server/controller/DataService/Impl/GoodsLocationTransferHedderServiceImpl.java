package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.GoodsLocationTransferHedderRepository;
import com.icordium.server.controller.DataService.GoodsLocationTransferHedderService;
import com.icordium.server.controller.datamodel.LocationtranferhedderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */
@Service
public class GoodsLocationTransferHedderServiceImpl implements GoodsLocationTransferHedderService {
    @Autowired
    private GoodsLocationTransferHedderRepository goodsLocationTransferHedderRepository;

    @Override
    public List<LocationtranferhedderEntity> findAllGoodsLocationTransferHedder() {
        return goodsLocationTransferHedderRepository.findAll();
    }

    @Override
    public List<LocationtranferhedderEntity> findAllActiveGoodsLocationTransferHedder(int status) {
        return goodsLocationTransferHedderRepository.findByStatus(status);
    }

    @Override
    public String saveGoodsLocationTransferHedder(LocationtranferhedderEntity locationtranferhedderEntity) {
        goodsLocationTransferHedderRepository.save(locationtranferhedderEntity);
        goodsLocationTransferHedderRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + locationtranferhedderEntity.getIdlocationtranferhedder() + "\"}";
    }

    @Override
    public String updateGoodsLocationTransferHedder(LocationtranferhedderEntity locationtranferhedderEntity) {
        if (locationtranferhedderEntity.getIdlocationtranferhedder() != 0) {
            goodsLocationTransferHedderRepository.save(locationtranferhedderEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public LocationtranferhedderEntity findById(int id) {
        return goodsLocationTransferHedderRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        goodsLocationTransferHedderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}