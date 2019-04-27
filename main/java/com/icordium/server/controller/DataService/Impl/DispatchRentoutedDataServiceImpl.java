package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DispatchRentoutDataServiceRepository;
import com.icordium.server.controller.DataService.DispatchRentoutedDataService;
import com.icordium.server.controller.datamodel.RentoutservicedataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchRentoutedDataServiceImpl implements DispatchRentoutedDataService {
    @Autowired
    private DispatchRentoutDataServiceRepository dispatchRentoutDataServiceRepository;

    @Override
    public List<RentoutservicedataEntity> findAllRentoutedDataService() {
        return dispatchRentoutDataServiceRepository.findAll();
    }

    @Override
    public String saveRentoutedDataService(RentoutservicedataEntity rentoutservicedataEntity) {
        dispatchRentoutDataServiceRepository.saveAndFlush(rentoutservicedataEntity);

        return "{\"status\":\"success\",\"id\":\"" + rentoutservicedataEntity.getIdrentoutservicedata() + "\"}";
    }

    @Override
    public String updateRentoutedDataService(RentoutservicedataEntity rentoutservicedataEntity) {
        if (rentoutservicedataEntity.getIdrentoutservicedata() != 0) {
            RentoutservicedataEntity update = dispatchRentoutDataServiceRepository.save(rentoutservicedataEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentoutservicedataEntity findById(int id) {
        return dispatchRentoutDataServiceRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        dispatchRentoutDataServiceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}