package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentaCartServiceRepository;
import com.icordium.server.controller.DataService.RentalCartServiceService;
import com.icordium.server.controller.datamodel.RentcartserviceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalCartServiceServiceimpl implements RentalCartServiceService {
    @Autowired
    private RentaCartServiceRepository rentaCartServiceRepository;

    @Override
    public List<RentcartserviceEntity> findAllCartService() {
        return rentaCartServiceRepository.findAll();
    }

    @Override
    public List<RentcartserviceEntity> findByCartIdCartService(int cartIdcart) {
        return rentaCartServiceRepository.findByCartIdcart(cartIdcart);
    }

    @Override
    public String saveCartService(RentcartserviceEntity entity) {
        rentaCartServiceRepository.save(entity);
        rentaCartServiceRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + entity.getIdrentcartservice() + "\"}";
    }

    @Override
    public String updateCartService(RentcartserviceEntity entity) {
        if (entity.getIdrentcartservice() != 0) {
            rentaCartServiceRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentcartserviceEntity findById(int id) {
        return rentaCartServiceRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentaCartServiceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}