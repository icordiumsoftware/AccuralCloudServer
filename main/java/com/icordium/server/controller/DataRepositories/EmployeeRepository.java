package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    long count();
}