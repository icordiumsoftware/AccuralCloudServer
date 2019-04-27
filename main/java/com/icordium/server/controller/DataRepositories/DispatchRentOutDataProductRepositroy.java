package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentoutedproductdataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DispatchRentOutDataProductRepositroy extends JpaRepository<RentoutedproductdataEntity, Integer> {
    List<RentoutedproductdataEntity> findByHedderIdrentoutedhedder(int hedderIdrentoutedhedder);
}