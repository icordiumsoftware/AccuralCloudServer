package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.CustomersEntity;

import java.util.List;

public interface CustomerService {
    List<CustomersEntity> findAllCustomer();

    String saveCustomer(CustomersEntity customersEntity);

    String updateCustomer(CustomersEntity customersEntity);

    CustomersEntity findById(int id);

    String deleteById(int id);

    long count(int id);
}