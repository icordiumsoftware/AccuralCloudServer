package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomersEntity, Integer> {
}