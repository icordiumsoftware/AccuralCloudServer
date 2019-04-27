package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentoutedotherEntity;

import java.util.List;

public interface DispatchRentOutOtherService {
    List<RentoutedotherEntity> findAllRentoutedother();

    String saveRentoutedother(RentoutedotherEntity rentoutedotherEntity);

    String updateRentoutedother(RentoutedotherEntity rentoutedotherEntity);

    RentoutedotherEntity findById(int id);

    String deleteById(int id);
}