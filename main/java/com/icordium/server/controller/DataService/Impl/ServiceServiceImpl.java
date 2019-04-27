package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ServiceRepository;
import com.icordium.server.controller.DataService.ServiceService;
import com.icordium.server.controller.datamodel.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<ServiceEntity> findAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public String saveService(ServiceEntity serviceEntity) {
        serviceRepository.save(serviceEntity);
        serviceRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + serviceEntity.getIdservice() + "\"}";
    }

    @Override
    public String updateService(ServiceEntity serviceEntity) {
        if (serviceEntity.getIdservice() != 0) {
            ServiceEntity update = serviceRepository.save(serviceEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public ServiceEntity findById(int id) {
        return serviceRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        serviceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count() {
        return serviceRepository.count();
    }
}