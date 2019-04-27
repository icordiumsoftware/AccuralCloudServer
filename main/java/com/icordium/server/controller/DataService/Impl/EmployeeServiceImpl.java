package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.EmployeeRepository;
import com.icordium.server.controller.DataService.EmployeeService;
import com.icordium.server.controller.datamodel.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public String saveEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
        employeeRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + employeeEntity.getIdemployee() + "\"}";
    }

    @Override
    public String updateEmployee(EmployeeEntity employeeEntity) {
        if (employeeEntity.getIdemployee() != 0) {
            EmployeeEntity update = employeeRepository.save(employeeEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public EmployeeEntity findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long employeeCount() {
        return employeeRepository.count();
    }
}