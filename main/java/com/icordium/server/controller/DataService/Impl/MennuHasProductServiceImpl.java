package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ProductHasMenuItemRepository;
import com.icordium.server.controller.DataService.MennuHasProductService;
import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ISH on 4/1/2019.
 */
@Service
public class MennuHasProductServiceImpl implements MennuHasProductService {
    @Autowired
    private ProductHasMenuItemRepository productHasMenuItemRepository;

    @Override
    public List<ProductHasMenuitemEntity> findAll() {
        return productHasMenuItemRepository.findAll();
    }

    @Override
    public List<ProductHasMenuitemEntity> findAllByProduct(int idproduct) {
        return productHasMenuItemRepository.findByProductIdproduct(idproduct);
    }

    @Override
    public List<ProductHasMenuitemEntity> findAllByMenuId(int idmenu) {
        return productHasMenuItemRepository.findByMenuitemIdmenuitem(idmenu);
    }

    @Override
    public String saveMenu(ProductHasMenuitemEntity entity) {
        productHasMenuItemRepository.save(entity);
        return "{\"status\":\"success\"}";
    }

    @Override
    public String update(ProductHasMenuitemEntity entity) {
        if (entity.getIdproductHasMenuitem() != 0) {
            productHasMenuItemRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public ProductHasMenuitemEntity findById(int id) {
        return productHasMenuItemRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        productHasMenuItemRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}