package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalbookingEntity;

import java.util.List;

public interface RentalBookingService {
    List<RentalbookingEntity> findAllCartHedders();

    List<RentalbookingEntity> findAllByStatus(int status);

    String saveCartHedder(RentalbookingEntity rentalbookingEntity);

    String updateCartHedder(RentalbookingEntity rentalbookingEntity);

    RentalbookingEntity findById(int id);

    String deleteById(int id);

    long count();
}