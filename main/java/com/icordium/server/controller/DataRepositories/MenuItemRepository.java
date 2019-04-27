package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenuitemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuitemEntity, Integer> {
    List<MenuitemEntity> findByStatus(int status);

    List<MenuitemEntity> findByStatusAndMenutypeIdmenutype(int status, int Idmenutype);
}