package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkPeriodRepository extends JpaRepository<WorkshiftEntity, Integer> {
    List<WorkshiftEntity> findByEndIsNull();

    List<WorkshiftEntity> findByEndIsNullAndLocationIdlocation(int locationid);

    List<WorkshiftEntity> findByEndIsNullAndLocationIdlocationAndUsersIdusers(int locationidlocation, int usersiduser);

    List<WorkshiftEntity> findByEndIsNotNullAndLocationIdlocationAndUsersIdusers(int locationidlocation, int usersiduser);
}