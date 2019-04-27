package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.AreasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<AreasEntity, Integer> {
    List<AreasEntity> findByLocationByLocationIdlocation_Idlocation(int idlocation);

    List<AreasEntity> findByLocationByLocationIdlocation_IdlocationAndStatus(int idlocation, int status);
}