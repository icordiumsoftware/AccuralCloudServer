package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenusalesitemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuSalesItemRepository extends JpaRepository<MenusalesitemsEntity, Integer> {
    List<MenusalesitemsEntity> findByMenusalesinvoiceIdmenusalesinvoice(int Idmenusalesinvoice);
}