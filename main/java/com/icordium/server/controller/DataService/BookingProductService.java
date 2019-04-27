package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.BookingproductEntity;

import java.util.List;

public interface BookingProductService {
    List<BookingproductEntity> findAllBookingProduct();

    String saveBookingProduct(BookingproductEntity bookingproductEntity);

    String updateBookingProduct(BookingproductEntity bookingproductEntity);

    BookingproductEntity findById(int id);

    String deleteById(int id);
}