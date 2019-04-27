package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentoutedhedderEntity;

import java.util.List;

public interface DispatchRentOutedHedderService {
    List<RentoutedhedderEntity> findAllRentoutedhedders();

    List<RentoutedhedderEntity> findAllPendingRentoutedhedders(int status, int locationIdlocation);

    String saveRentoutedhedders(RentoutedhedderEntity rentoutedhedderEntity);

    String updateRentoutedhedders(RentoutedhedderEntity rentoutedhedderEntity);

    RentoutedhedderEntity findById(int id);

    long pendingRentalcount();

    String deleteById(int id);
}