package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalinvoiceotherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalInvoiceOtherRepository extends JpaRepository<RentalinvoiceotherEntity, Integer> {
}