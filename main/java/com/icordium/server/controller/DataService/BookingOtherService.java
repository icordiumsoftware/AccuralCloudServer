package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.RentalotherEntity;

import java.util.List;

public interface BookingOtherService {
    List<RentalotherEntity> findAllBookingOther();

    List<RentalotherEntity> findByCartIdBookingOther(int id);

    String saveBookingOther(RentalotherEntity rentalotherEntity);

    String updateBookingOther(RentalotherEntity rentalotherEntity);

    RentalotherEntity findById(int id);

    String deleteById(int id);
}