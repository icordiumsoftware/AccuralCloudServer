package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ProductTypeRepository;
import com.icordium.server.controller.DataService.ProductTypeService;
import com.icordium.server.controller.datamodel.ProducttypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by ISH on 8/30/2018.
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public List<ProducttypeEntity> findAllProductType() {
        // Database Serach
        return productTypeRepository.findAll();
    }

    @Override
    public List<ProducttypeEntity> findAllActiveProductType() {
        return productTypeRepository.findByStatus(1);
    }

    @Override
    public String saveProductType(ProducttypeEntity productTypeDTO) {
        productTypeRepository.save(productTypeDTO);
        productTypeRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + productTypeDTO.getIdproducttype() + "\"}";
    }

    @Override
    public String updateProductType(ProducttypeEntity productTypeDTO) {
        if (productTypeDTO.getIdproducttype() != 0) {
            ProducttypeEntity update = productTypeRepository.save(productTypeDTO);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }

    }

    @Override
    public ProducttypeEntity findById(int id) {
        Optional<ProducttypeEntity> productTypeDTO = productTypeRepository.findById(id);
        return productTypeDTO.get();
    }

    @Override
    public String deleteById(int id) {
        productTypeRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}