package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalBookingOtherRepository;
import com.icordium.server.controller.DataService.BookingOtherService;
import com.icordium.server.controller.datamodel.RentalotherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingOtherServiceImpl implements BookingOtherService {
    @Autowired
    private RentalBookingOtherRepository bookingOtherRepository;

    @Override
    public List<RentalotherEntity> findAllBookingOther() {
        return bookingOtherRepository.findAll();
    }

    @Override
    public List<RentalotherEntity> findByCartIdBookingOther(int id) {
        return bookingOtherRepository.findByRentalbookingIdrentalbooking(id);
    }

    @Override
    public String saveBookingOther(RentalotherEntity rentalotherEntity) {
        bookingOtherRepository.save(rentalotherEntity);
        bookingOtherRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentalotherEntity.getIdrentalother() + "\"}";
    }

    @Override
    public String updateBookingOther(RentalotherEntity rentalotherEntity) {
        if (rentalotherEntity.getIdrentalother() != 0) {
            bookingOtherRepository.save(rentalotherEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalotherEntity findById(int id) {
        return bookingOtherRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        bookingOtherRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}