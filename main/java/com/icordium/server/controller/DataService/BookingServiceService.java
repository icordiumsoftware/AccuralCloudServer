package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.BookingserviceEntity;

import java.util.List;

public interface BookingServiceService {
    List<BookingserviceEntity> findAllCartHedders();

    List<BookingserviceEntity> findAllByBookingId(int findAllByBookingId);

    String saveBookingService(BookingserviceEntity bookingserviceEntity);

    String updateCartHedder(BookingserviceEntity bookingserviceEntity);

    BookingserviceEntity findById(int id);

    String deleteById(int id);
}