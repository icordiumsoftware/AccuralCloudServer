package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentoutservicedataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchRentoutDataServiceRepository extends JpaRepository<RentoutservicedataEntity, Integer> {
}