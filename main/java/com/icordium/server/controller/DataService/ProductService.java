package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> findAllProducts();

    String saveProduct(ProductEntity productEntity);

    String updateProduct(ProductEntity productEntity);

    ProductEntity findById(int id);

    String deleteById(int id);

    long productCount();

    long productCountByRentStatus(int status);
}