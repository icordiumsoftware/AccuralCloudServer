package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.GoodrecivedataproductEntity;

import java.util.List;

public interface GoodReciveDataProductService {
    List<GoodrecivedataproductEntity> findAllGoodReciveDataProduct();

    List<GoodrecivedataproductEntity> findAllGoodReciveDataProductBYgrn(int id);

    List<GoodrecivedataproductEntity> findAllActiveGoodReciveDataProduct(int status);

    String saveGoodReciveDataProduct(GoodrecivedataproductEntity goodrecivedataproductEntity);

    String updateGoodReciveDataProduct(GoodrecivedataproductEntity goodrecivedataproductEntity);

    GoodrecivedataproductEntity findById(int id);

    String deleteById(int id);
}