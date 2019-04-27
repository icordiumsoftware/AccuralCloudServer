package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalCartRepository;
import com.icordium.server.controller.DataService.BookingCartHedderService;
import com.icordium.server.controller.datamodel.BookingcartEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentBookingCartHedderServiceImpl implements BookingCartHedderService {
    @Autowired
    private RentalCartRepository rentalCartRepository;

    @Override
    public List<BookingcartEntity> findAllCartHedders() {
        return rentalCartRepository.findAll();
    }

    @Override
    public List<BookingcartEntity> findAllCartHeddersByStatus(int cartstatus) {
        return rentalCartRepository.findByCartstatus(cartstatus);
    }

    @Override
    public String saveCartHedder(BookingcartEntity cartEntity) {
        cartEntity.setCartstatus(1);
        rentalCartRepository.save(cartEntity);
        rentalCartRepository.flush();
        System.out.println(cartEntity.getBookingcart() + " Ishaa");
        return "{\"status\":\"success\",\"id\":\"" + cartEntity.getBookingcart() + "\"}";
    }

    @Override
    public String updateCartHedder(BookingcartEntity cartEntity) {
        if (cartEntity.getBookingcart() != 0) {
            rentalCartRepository.save(cartEntity);
            rentalCartRepository.flush();
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public BookingcartEntity findById(int id) {
        return rentalCartRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        rentalCartRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}