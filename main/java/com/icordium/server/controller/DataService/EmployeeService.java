package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();

    String saveEmployee(EmployeeEntity employeeEntity);

    String updateEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity findById(int id);

    String deleteById(int id);

    long employeeCount();
}