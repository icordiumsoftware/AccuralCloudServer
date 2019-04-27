package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DispatchRentOutOtherRepository;
import com.icordium.server.controller.DataService.DispatchRentOutOtherService;
import com.icordium.server.controller.datamodel.RentoutedotherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchRentOutOtherServiceImpl implements DispatchRentOutOtherService {
    @Autowired
    private DispatchRentOutOtherRepository dispatchRentOutOtherRepository;

    @Override
    public List<RentoutedotherEntity> findAllRentoutedother() {
        return dispatchRentOutOtherRepository.findAll();
    }

    @Override
    public String saveRentoutedother(RentoutedotherEntity rentoutedotherEntity) {
        dispatchRentOutOtherRepository.save(rentoutedotherEntity);
        return "{\"status\":\"success\",\"id\":\"" + rentoutedotherEntity.getIdrentoutedother() + "\"}";
    }

    @Override
    public String updateRentoutedother(RentoutedotherEntity rentoutedotherEntity) {
        if (rentoutedotherEntity.getIdrentoutedother() != 0) {
            dispatchRentOutOtherRepository.save(rentoutedotherEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentoutedotherEntity findById(int id) {
        return dispatchRentOutOtherRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        dispatchRentOutOtherRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}