package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentcartotherEntity;

import java.util.List;

public interface RentalCartOtherService {
    List<RentcartotherEntity> findAllCartOthers();

    List<RentcartotherEntity> findByCartCartOthers(int cartIdcart);

    String saveCartOther(RentcartotherEntity rentcartotherEntity);

    String updateCartOther(RentcartotherEntity rentcartotherEntity);

    RentcartotherEntity findById(int id);

    String deleteById(int id);
}