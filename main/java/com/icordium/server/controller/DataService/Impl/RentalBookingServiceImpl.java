package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalBookingRepository;
import com.icordium.server.controller.DataService.RentalBookingService;
import com.icordium.server.controller.datamodel.RentalbookingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalBookingServiceImpl implements RentalBookingService {
    @Autowired
    private RentalBookingRepository rentalBookingRepository;

    @Override
    public List<RentalbookingEntity> findAllCartHedders() {
        return rentalBookingRepository.findAll();
    }

    @Override
    public List<RentalbookingEntity> findAllByStatus(int status) {
        return rentalBookingRepository.findByStatusOrderByDiliveerydateAsc(status);
    }

    @Override
    public String saveCartHedder(RentalbookingEntity rentalbookingEntity) {
        RentalbookingEntity save = rentalBookingRepository.save(rentalbookingEntity);
        rentalBookingRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + save.getIdrentalbooking() + "\"}";
    }

    @Override
    public String updateCartHedder(RentalbookingEntity rentalbookingEntity) {
        if (rentalbookingEntity.getIdrentalbooking() != 0) {
            RentalbookingEntity update = rentalBookingRepository.save(rentalbookingEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }

    }

    @Override
    public RentalbookingEntity findById(int id) {
        return rentalBookingRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalBookingRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count() {
        return rentalBookingRepository.count();
    }
}