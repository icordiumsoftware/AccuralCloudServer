package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.ServiceEntity;

import java.util.List;

public interface ServiceService {
    List<ServiceEntity> findAllServices();

    String saveService(ServiceEntity serviceEntity);

    String updateService(ServiceEntity serviceEntity);

    ServiceEntity findById(int id);

    String deleteById(int id);

    long count();
}