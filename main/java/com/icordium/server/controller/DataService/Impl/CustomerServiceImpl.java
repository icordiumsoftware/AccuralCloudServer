package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.CustomerRepository;
import com.icordium.server.controller.DataService.CustomerService;
import com.icordium.server.controller.datamodel.CustomersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomersEntity> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public String saveCustomer(CustomersEntity customersEntity) {
        customerRepository.save(customersEntity);
        customerRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + customersEntity.getIdcustomers() + "\"}";
    }

    @Override
    public String updateCustomer(CustomersEntity customersEntity) {
        if (customersEntity.getIdcustomers() != 0) {
            CustomersEntity update = customerRepository.save(customersEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public CustomersEntity findById(int id) {
        return customerRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        customerRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count(int id) {
        return customerRepository.count();
    }
}