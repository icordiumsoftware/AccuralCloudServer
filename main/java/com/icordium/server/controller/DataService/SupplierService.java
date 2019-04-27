package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.SupplierEntity;

import java.util.List;

public interface SupplierService {
    List<SupplierEntity> findAllSupplier();

    String saveSupplier(SupplierEntity supplierEntity);

    String updateSupplier(SupplierEntity supplierEntity);

    SupplierEntity findById(int id);

    String deleteById(int id);

    long count(int id);
}