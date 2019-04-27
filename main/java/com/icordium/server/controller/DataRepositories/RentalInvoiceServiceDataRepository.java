package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalservicedataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalInvoiceServiceDataRepository extends JpaRepository<RentalservicedataEntity, Integer> {
}