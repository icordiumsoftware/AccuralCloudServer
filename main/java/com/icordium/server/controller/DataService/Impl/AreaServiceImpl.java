package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.AreaRepository;
import com.icordium.server.controller.DataService.AreaService;
import com.icordium.server.controller.datamodel.AreasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<AreasEntity> findAllArea() {
        return areaRepository.findAll();
    }

    @Override
    public String saveArea(AreasEntity areasEntity) {
        areaRepository.save(areasEntity);
        areaRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + areasEntity.getIdareas() + "\"}";
    }

    @Override
    public String updateArea(AreasEntity areasEntity) {
        if (areasEntity.getIdareas() != 0) {
            areaRepository.save(areasEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public AreasEntity findById(int id) {
        return areaRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        areaRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}