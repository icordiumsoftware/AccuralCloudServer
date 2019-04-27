package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalpricelistEntity;

import java.util.List;

public interface RentalPriceListService {
    List<RentalpricelistEntity> findAllRentalPrice();

    List<RentalpricelistEntity> findAllRentalPriceByProductId(int idproduct);

    List<RentalpricelistEntity> findAllRentalPriceByRentalPriceCategory(int idcategory);

    List<RentalpricelistEntity> findAllRentalPriceByProductIdAndRentalPriceCategory(int idproduct, int idcategory);

    List<RentalpricelistEntity> findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(int idproduct, int idcategory, double dateqty);

    String saveRentalpriceList(RentalpricelistEntity rentalpricelistEntity);

    String updateRentalpriceList(RentalpricelistEntity rentalpricelistEntity);

    RentalpricelistEntity findById(int id);

    String deleteById(int id);
}