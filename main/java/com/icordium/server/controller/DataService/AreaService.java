package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.AreasEntity;

import java.util.List;

public interface AreaService {
    List<AreasEntity> findAllArea();

    String saveArea(AreasEntity areasEntity);

    String updateArea(AreasEntity areasEntity);

    AreasEntity findById(int id);

    String deleteById(int id);
}