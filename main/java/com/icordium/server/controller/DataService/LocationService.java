package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.LocationEntity;

import java.util.List;

public interface LocationService {
    List<LocationEntity> findAllLocation();

    List<LocationEntity> findAllActiveLocation(int status);

    String saveLocation(LocationEntity locationEntity);

    String updateLocation(LocationEntity locationEntity);

    LocationEntity findById(int id);

    String deleteById(int id);
}