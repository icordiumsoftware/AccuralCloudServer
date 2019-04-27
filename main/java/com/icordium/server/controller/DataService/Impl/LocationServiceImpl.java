package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.LocationRepository;
import com.icordium.server.controller.DataService.LocationService;
import com.icordium.server.controller.datamodel.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<LocationEntity> findAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public List<LocationEntity> findAllActiveLocation(int status) {
        return locationRepository.findByStatus(status);
    }

    @Override
    public String saveLocation(LocationEntity locationEntity) {
        locationRepository.save(locationEntity);
        locationRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + locationEntity.getIdlocation() + "\"}";
    }

    @Override
    public String updateLocation(LocationEntity LocationEntity) {
        if (LocationEntity.getIdlocation() != 0) {
            LocationEntity update = locationRepository.save(LocationEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public LocationEntity findById(int id) {
        return locationRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        locationRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}