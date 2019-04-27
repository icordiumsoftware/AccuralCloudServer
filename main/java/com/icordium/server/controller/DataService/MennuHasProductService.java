package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;

import java.util.List;

/**
 * Created by ISH on 4/1/2019.
 */
public interface MennuHasProductService {
    List<ProductHasMenuitemEntity> findAll();

    List<ProductHasMenuitemEntity> findAllByProduct(int idproduct);

    List<ProductHasMenuitemEntity> findAllByMenuId(int idmenu);

    String saveMenu(ProductHasMenuitemEntity entity);

    String update(ProductHasMenuitemEntity entity);

    ProductHasMenuitemEntity findById(int id);

    String deleteById(int id);
}
