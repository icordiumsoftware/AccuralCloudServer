package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.ProducttypeEntity;

import java.util.List;

/**
 * Created by ISH on 8/30/2018.
 */
public interface ProductTypeService {
    List<ProducttypeEntity> findAllProductType();

    List<ProducttypeEntity> findAllActiveProductType();

    String saveProductType(ProducttypeEntity productTypeDTO);

    String updateProductType(ProducttypeEntity productTypeDTO);

    ProducttypeEntity findById(int id);

    String deleteById(int id);
}
