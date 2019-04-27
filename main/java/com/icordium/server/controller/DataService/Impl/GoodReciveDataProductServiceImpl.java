package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.GoodReciveDataProductRepository;
import com.icordium.server.controller.DataService.GoodReciveDataProductService;
import com.icordium.server.controller.datamodel.GoodrecivedataproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodReciveDataProductServiceImpl implements GoodReciveDataProductService {
    @Autowired
    private GoodReciveDataProductRepository goodReciveDataProductRepository;

    @Override
    public List<GoodrecivedataproductEntity> findAllGoodReciveDataProduct() {
        return goodReciveDataProductRepository.findAll();
    }

    @Override
    public List<GoodrecivedataproductEntity> findAllGoodReciveDataProductBYgrn(int id) {
        return goodReciveDataProductRepository.findByGoodrevicehedderIdgoodrevicehedder(id);
    }

    @Override
    public ArrayList<GoodrecivedataproductEntity> findAllActiveGoodReciveDataProduct(int status) {
        List<GoodrecivedataproductEntity> entities = goodReciveDataProductRepository.findByGoodrevicehedderIdgoodrevicehedder(status);
        ArrayList<GoodrecivedataproductEntity> retentities = new ArrayList<>();
        for (GoodrecivedataproductEntity entity : entities) {
            if (entity.getGoodrevicehedderByGoodrevicehedderIdgoodrevicehedder().getStatus() == 0) {
                retentities.add(entity);
            }
        }
        return retentities;
    }

    @Override
    public String saveGoodReciveDataProduct(GoodrecivedataproductEntity goodrecivedataproductEntity) {
        goodReciveDataProductRepository.save(goodrecivedataproductEntity);
        goodReciveDataProductRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + goodrecivedataproductEntity.getIdgoodrecivedataproduct() + "\"}";
    }

    @Override
    public String updateGoodReciveDataProduct(GoodrecivedataproductEntity goodrecivedataproductEntity) {
        if (goodrecivedataproductEntity.getIdgoodrecivedataproduct() != 0) {
            GoodrecivedataproductEntity update = goodReciveDataProductRepository.save(goodrecivedataproductEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public GoodrecivedataproductEntity findById(int id) {
        return goodReciveDataProductRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        goodReciveDataProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}