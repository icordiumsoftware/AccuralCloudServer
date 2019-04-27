package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenusalesinvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MenuSalesInvoiceRepository extends JpaRepository<MenusalesinvoiceEntity, Integer> {
    List<MenusalesinvoiceEntity> findByLocationIdlocationAndDatetimeBetweenOrderByDatetimeAsc(int idLocation, Date StartingDate, Date EndingDate);
//    List<MenusalesinvoiceEntity> findByDatetimeBefore(Date dDate);
}