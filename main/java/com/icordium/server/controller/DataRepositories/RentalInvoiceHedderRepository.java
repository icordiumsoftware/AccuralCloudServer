package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalinvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RentalInvoiceHedderRepository extends JpaRepository<RentalinvoiceEntity, Integer> {
    List<RentalinvoiceEntity> findByLocationIdlocationAndEnddateBetweenOrderByEnddateDesc(int idLocation, Date SDate,Date EDate);
}