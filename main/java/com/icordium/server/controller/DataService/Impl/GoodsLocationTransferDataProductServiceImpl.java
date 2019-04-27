package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.GoodsTranferDataProductRepository;
import com.icordium.server.controller.DataService.GoodsLocationTransferDataProductService;
import com.icordium.server.controller.datamodel.LocationtranferdataproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */
@Service
public class GoodsLocationTransferDataProductServiceImpl implements GoodsLocationTransferDataProductService {
    @Autowired
    private GoodsTranferDataProductRepository goodsTranferDataProductRepository;

    @Override
    public List<LocationtranferdataproductEntity> findAllGoodsLocationtranferdataproduct() {
        return goodsTranferDataProductRepository.findAll();
    }

    @Override
    public List<LocationtranferdataproductEntity> findAllByHdderGoodsLocationtranferdataproduct(int Id) {
        return goodsTranferDataProductRepository.findByLocationtranferhedderIdlocationtranferhedder(Id);
    }

    @Override
    public String saveLocationtranferdataproduct(LocationtranferdataproductEntity locationtranferhedderEntity) {
        goodsTranferDataProductRepository.save(locationtranferhedderEntity);
        goodsTranferDataProductRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + locationtranferhedderEntity.getIdlocationtranferdataproduct() + "\"}";
    }

    @Override
    public String updateLocationtranferdataproduct(LocationtranferdataproductEntity locationtranferhedderEntity) {
        if (locationtranferhedderEntity.getIdlocationtranferdataproduct() != 0) {
            goodsTranferDataProductRepository.save(locationtranferhedderEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public LocationtranferdataproductEntity findById(int id) {
        return goodsTranferDataProductRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        goodsTranferDataProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}