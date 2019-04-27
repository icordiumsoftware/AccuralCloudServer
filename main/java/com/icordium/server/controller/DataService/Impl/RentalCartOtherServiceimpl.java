package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalCartOtherRepository;
import com.icordium.server.controller.DataService.RentalCartOtherService;
import com.icordium.server.controller.datamodel.RentcartotherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalCartOtherServiceimpl implements RentalCartOtherService {
    @Autowired
    private RentalCartOtherRepository rentalCartOtherRepository;

    @Override
    public List<RentcartotherEntity> findAllCartOthers() {
        return rentalCartOtherRepository.findAll();
    }

    @Override
    public List<RentcartotherEntity> findByCartCartOthers(int cartIdcart) {
        return rentalCartOtherRepository.findByCartIdcart(cartIdcart);
    }

    @Override
    public String saveCartOther(RentcartotherEntity rentcartotherEntity) {
        rentalCartOtherRepository.save(rentcartotherEntity);
        rentalCartOtherRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentcartotherEntity.getIdrentcartother() + "\"}";
    }

    @Override
    public String updateCartOther(RentcartotherEntity rentcartotherEntity) {
        if (rentcartotherEntity.getIdrentcartother() != 0) {
            RentcartotherEntity update = rentalCartOtherRepository.save(rentcartotherEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentcartotherEntity findById(int id) {
        return rentalCartOtherRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalCartOtherRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}