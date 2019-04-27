package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.TableheadsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableHeadsRepository extends JpaRepository<TableheadsEntity, Integer> {
    List<TableheadsEntity> findByTablesIdtables(int tableid);

    List<TableheadsEntity> findByTablesIdtablesAndStatus(int tableid, int Status);
}