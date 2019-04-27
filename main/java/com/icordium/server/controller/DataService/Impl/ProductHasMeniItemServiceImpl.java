package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ProductHasMenuItemRepository;
import com.icordium.server.controller.DataService.ProductHasMeniItemService;
import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductHasMeniItemServiceImpl implements ProductHasMeniItemService {
    @Autowired
    private ProductHasMenuItemRepository productHasMenuItemRepository;

    @Override
    public List<ProductHasMenuitemEntity> findAllProductHasMeniItem() {
        return productHasMenuItemRepository.findAll();
    }

    @Override
    public List<ProductHasMenuitemEntity> findByMenuIDProductHasMeniItem(int idMenuItem) {
        return productHasMenuItemRepository.findByMenuitemIdmenuitem(idMenuItem);
    }

    @Override
    public String saveProductHasMeniItem(ProductHasMenuitemEntity productHasMenuitemEntity) {
        productHasMenuItemRepository.save(productHasMenuitemEntity);
        productHasMenuItemRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + productHasMenuitemEntity.getIdproductHasMenuitem() + "\"}";
    }

    @Override
    public String updateProductHasMeniItem(ProductHasMenuitemEntity productHasMenuitemEntity) {
        if (productHasMenuitemEntity.getIdproductHasMenuitem() != 0) {
            productHasMenuItemRepository.save(productHasMenuitemEntity);
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