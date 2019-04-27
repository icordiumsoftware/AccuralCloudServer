package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ProductRepository;
import com.icordium.server.controller.DataService.ProductService;
import com.icordium.server.controller.datamodel.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public String saveProduct(ProductEntity productEntity) {
        // decode the string and write to file
//        try {
//        byte[] decodedBytes = Base64.getDecoder().decode(productEntity.getIcon());
//            String filename = DataGenerator.getTimeMilescound();
//            FileUtils.writeByteArrayToFile(new File(filename+".WebP"), decodedBytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        productRepository.save(productEntity);
        productRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + productEntity.getIdproduct() + "\"}";
    }

    @Override
    public String updateProduct(ProductEntity productEntity) {
        if (productEntity.getIdproduct() != 0) {
            System.out.println("Update product" + productEntity.getIdproduct());
            ProductEntity update = productRepository.save(productEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public ProductEntity findById(int id) {
        return productRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        productRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long productCountByRentStatus(int status) {
        return productRepository.countByRentingstatus(status);
    }

    @Override
    public long productCount() {
        return productRepository.count();
    }
}