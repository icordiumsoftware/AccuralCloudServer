package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.TablesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<TablesEntity, Integer> {
    List<TablesEntity> findByAreasIdareas(int Idareas);

    @Query(value = "SELECT * FROM `tables` WHERE areas_idareas=?1 AND `status` =?2", nativeQuery = true)
    List<TablesEntity> findByAreasIdareasAndStatus(int Idareas, int Status);
}