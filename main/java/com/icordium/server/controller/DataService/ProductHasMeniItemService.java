package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;

import java.util.List;

public interface ProductHasMeniItemService {
    List<ProductHasMenuitemEntity> findAllProductHasMeniItem();

    List<ProductHasMenuitemEntity> findByMenuIDProductHasMeniItem(int idMenuItem);

    String saveProductHasMeniItem(ProductHasMenuitemEntity productHasMenuitemEntity);

    String updateProductHasMeniItem(ProductHasMenuitemEntity productHasMenuitemEntity);

    ProductHasMenuitemEntity findById(int id);

    String deleteById(int id);
}