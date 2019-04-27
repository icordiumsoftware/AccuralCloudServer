package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalPriceListRepository;
import com.icordium.server.controller.DataService.RentalPriceListService;
import com.icordium.server.controller.datamodel.RentalpricelistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalPriceListServiceImpl implements RentalPriceListService {
    @Autowired
    RentalPriceListRepository rentalPriceListRepository;

    @Override
    public List<RentalpricelistEntity> findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(int idproduct, int idcategory, double dateqty) {
        return rentalPriceListRepository.findByProductIdproductAndRentalpricecategoryIdrentalpricecategoryAndEndpointGreaterThanEqualAndStartpointIsLessThanEqual(idproduct, idcategory, dateqty, dateqty);
    }

    @Override
    public List<RentalpricelistEntity> findAllRentalPriceByRentalPriceCategory(int idcategory) {
        return rentalPriceListRepository.findByRentalpricecategoryIdrentalpricecategory(idcategory);
    }

    @Override
    public List<RentalpricelistEntity> findAllRentalPrice() {
        return rentalPriceListRepository.findAll();
    }

    @Override
    public List<RentalpricelistEntity> findAllRentalPriceByProductIdAndRentalPriceCategory(int idproduct, int idcategory) {
        return rentalPriceListRepository.findByProductIdproductAndRentalpricecategoryIdrentalpricecategory(idproduct, idcategory);
    }

    @Override
    public List<RentalpricelistEntity> findAllRentalPriceByProductId(int idproduct) {
        return rentalPriceListRepository.findByProductIdproduct(idproduct);
    }

    @Override
    public String saveRentalpriceList(RentalpricelistEntity rentalpricelistEntity) {
        rentalPriceListRepository.save(rentalpricelistEntity);
        rentalPriceListRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentalpricelistEntity.getIdrentalpricelist() + "\"}";
    }

    @Override
    public String updateRentalpriceList(RentalpricelistEntity rentalpricelistEntity) {
        if (rentalpricelistEntity.getIdrentalpricelist() != 0) {
            RentalpricelistEntity update = rentalPriceListRepository.save(rentalpricelistEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalpricelistEntity findById(int id) {
        return rentalPriceListRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalPriceListRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}