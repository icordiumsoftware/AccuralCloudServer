package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenutypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenutypeRepository extends JpaRepository<MenutypeEntity, Integer> {
    List<MenutypeEntity> findByStatus(int status);

    List<MenutypeEntity> findByStatusAndMenucategoyIdmenucategoy(int status, int idTypes);
}