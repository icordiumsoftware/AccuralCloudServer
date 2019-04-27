package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalinvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalInvoiceHedderRepository extends JpaRepository<RentalinvoiceEntity, Integer> {

}