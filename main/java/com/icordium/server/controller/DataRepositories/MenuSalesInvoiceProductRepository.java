package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenusalesinvoiceproductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuSalesInvoiceProductRepository extends JpaRepository<MenusalesinvoiceproductEntity, Integer> {
    List<MenusalesinvoiceproductEntity> findByMenusalesinvoiceIdmenusalesinvoice(int Idmenusalesinvoice);
}