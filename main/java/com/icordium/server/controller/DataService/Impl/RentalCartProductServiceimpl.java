package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalCartProductRepository;
import com.icordium.server.controller.DataService.RentalCartProductService;
import com.icordium.server.controller.datamodel.RentcartproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalCartProductServiceimpl implements RentalCartProductService {
    @Autowired
    private RentalCartProductRepository rentalCartProductRepository;

    @Override
    public List<RentcartproductEntity> findAllCartProduct() {
        return rentalCartProductRepository.findAll();
    }

    @Override
    public List<RentcartproductEntity> findByCartIdCartProduct(int cartIdcart) {
        return rentalCartProductRepository.findByCartIdcart(cartIdcart);
    }

    @Override
    public String saveCartProduct(RentcartproductEntity rentcartproductEntity) {
        rentalCartProductRepository.save(rentcartproductEntity);
        rentalCartProductRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentcartproductEntity.getIdrentcartrentcartproduct() + "\"}";
    }

    @Override
    public String updateCartProduct(RentcartproductEntity rentcartproductEntity) {
        if (rentcartproductEntity.getIdrentcartrentcartproduct() != 0) {
            rentalCartProductRepository.save(rentcartproductEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentcartproductEntity findById(int id) {
        return rentalCartProductRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalCartProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}