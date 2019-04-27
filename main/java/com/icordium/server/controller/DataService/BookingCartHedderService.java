package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.BookingcartEntity;

import java.util.List;

public interface BookingCartHedderService {
    List<BookingcartEntity> findAllCartHedders();

    List<BookingcartEntity> findAllCartHeddersByStatus(int cartstatus);

    String saveCartHedder(BookingcartEntity cartEntity);

    String updateCartHedder(BookingcartEntity cartEntity);

    BookingcartEntity findById(int id);

    String deleteById(int id);
}