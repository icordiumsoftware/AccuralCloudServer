package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.LocationtranferdataproductEntity;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */
public interface GoodsLocationTransferDataProductService {
    List<LocationtranferdataproductEntity> findAllGoodsLocationtranferdataproduct();

    List<LocationtranferdataproductEntity> findAllByHdderGoodsLocationtranferdataproduct(int Id);

    String saveLocationtranferdataproduct(LocationtranferdataproductEntity locationtranferhedderEntity);

    String updateLocationtranferdataproduct(LocationtranferdataproductEntity locationtranferhedderEntity);

    LocationtranferdataproductEntity findById(int id);

    String deleteById(int id);
}
