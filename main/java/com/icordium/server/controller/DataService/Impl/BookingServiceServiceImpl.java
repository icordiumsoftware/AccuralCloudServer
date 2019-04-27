package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalBookingServiceRepository;
import com.icordium.server.controller.DataService.BookingServiceService;
import com.icordium.server.controller.datamodel.BookingserviceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceServiceImpl implements BookingServiceService {
    @Autowired
    private RentalBookingServiceRepository rentalBookingServiceRepository;

    @Override
    public List<BookingserviceEntity> findAllCartHedders() {
        return rentalBookingServiceRepository.findAll();
    }

    @Override
    public List<BookingserviceEntity> findAllByBookingId(int idbookingservice) {
        return rentalBookingServiceRepository.findByRentalbookingIdrentalbooking(idbookingservice);
    }

    @Override
    public String saveBookingService(BookingserviceEntity bookingserviceEntity) {
        rentalBookingServiceRepository.save(bookingserviceEntity);
        rentalBookingServiceRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + bookingserviceEntity.getIdbookingservice() + "\"}";
    }

    @Override
    public String updateCartHedder(BookingserviceEntity bookingserviceEntity) {
        if (bookingserviceEntity.getIdbookingservice() != 0) {
            BookingserviceEntity update = rentalBookingServiceRepository.save(bookingserviceEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public BookingserviceEntity findById(int id) {
        return rentalBookingServiceRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalBookingServiceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}