package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentoutservicedataEntity;

import java.util.List;

public interface DispatchRentoutedDataService {
    List<RentoutservicedataEntity> findAllRentoutedDataService();

    String saveRentoutedDataService(RentoutservicedataEntity rentoutservicedataEntity);

    String updateRentoutedDataService(RentoutservicedataEntity rentoutservicedataEntity);

    RentoutservicedataEntity findById(int id);

    String deleteById(int id);
}