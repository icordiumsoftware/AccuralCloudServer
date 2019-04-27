package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentcartproductEntity;

import java.util.List;

public interface RentalCartProductService {
    List<RentcartproductEntity> findAllCartProduct();

    List<RentcartproductEntity> findByCartIdCartProduct(int cartIdcart);

    String saveCartProduct(RentcartproductEntity rentcartproductEntity);

    String updateCartProduct(RentcartproductEntity rentcartproductEntity);

    RentcartproductEntity findById(int id);

    String deleteById(int id);
}