package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {
}