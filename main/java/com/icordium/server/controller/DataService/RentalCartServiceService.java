package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.RentcartserviceEntity;

import java.util.List;

public interface RentalCartServiceService {
    List<RentcartserviceEntity> findAllCartService();

    List<RentcartserviceEntity> findByCartIdCartService(int cartIdcart);

    String saveCartService(RentcartserviceEntity entity);

    String updateCartService(RentcartserviceEntity entity);

    RentcartserviceEntity findById(int id);

    String deleteById(int id);
}