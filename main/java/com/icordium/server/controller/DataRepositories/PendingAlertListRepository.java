package com.icordium.server.controller.DataRepositories;

//import com.icordium.server.controller.datamodel.PendingalertlistEntity;

import com.icordium.server.controller.datamodel.PendingalertlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PendingAlertListRepository extends JpaRepository<PendingalertlistEntity, Integer> {
    List<PendingalertlistEntity> findByStatusAndLocationIdlocationAndType(int status, int locationIdlocation, Integer type);

    List<PendingalertlistEntity> findByStatus(int status);
}