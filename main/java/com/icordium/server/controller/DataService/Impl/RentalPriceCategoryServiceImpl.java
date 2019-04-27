package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalPriceCategoryRepository;
import com.icordium.server.controller.DataService.RentalPriceCategoryService;
import com.icordium.server.controller.datamodel.RentalpricecategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalPriceCategoryServiceImpl implements RentalPriceCategoryService {
    @Autowired
    RentalPriceCategoryRepository rentalPriceCategoryRepository;

    @Override
    public List<RentalpricecategoryEntity> findAllRentalPriceCategory() {
        return rentalPriceCategoryRepository.findAll();
    }

    @Override
    public String saveRentalpricecategory(RentalpricecategoryEntity rentalpricecategoryEntity) {
        rentalPriceCategoryRepository.save(rentalpricecategoryEntity);
        rentalPriceCategoryRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentalpricecategoryEntity.getIdrentalpricecategory() + "\"}";
    }

    @Override
    public String updateRentalpricecategory(RentalpricecategoryEntity rentalpricecategoryEntity) {
        if (rentalpricecategoryEntity.getIdrentalpricecategory() != 0) {
            RentalpricecategoryEntity update = rentalPriceCategoryRepository.save(rentalpricecategoryEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalpricecategoryEntity findById(int id) {
        return rentalPriceCategoryRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalPriceCategoryRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}