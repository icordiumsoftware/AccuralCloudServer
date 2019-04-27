package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalpricecategoryEntity;

import java.util.List;

public interface RentalPriceCategoryService {
    List<RentalpricecategoryEntity> findAllRentalPriceCategory();

    String saveRentalpricecategory(RentalpricecategoryEntity rentalpricecategoryEntity);

    String updateRentalpricecategory(RentalpricecategoryEntity rentalpricecategoryEntity);

    RentalpricecategoryEntity findById(int id);

    String deleteById(int id);
}