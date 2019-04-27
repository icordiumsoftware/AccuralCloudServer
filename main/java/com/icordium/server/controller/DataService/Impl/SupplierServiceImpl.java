package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.SupplierRepository;
import com.icordium.server.controller.DataService.SupplierService;
import com.icordium.server.controller.datamodel.SupplierEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<SupplierEntity> findAllSupplier() {
        return supplierRepository.findAll();
    }

    @Override
    public String saveSupplier(SupplierEntity supplierEntity) {
        supplierRepository.save(supplierEntity);
        supplierRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + supplierEntity.getIdsupplier() + "\"}";
    }

    @Override
    public String updateSupplier(SupplierEntity supplierEntity) {
        if (supplierEntity.getIdsupplier() != 0) {
            SupplierEntity update = supplierRepository.save(supplierEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public SupplierEntity findById(int id) {
        return supplierRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        supplierRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count(int id) {
        return supplierRepository.count();
    }
}