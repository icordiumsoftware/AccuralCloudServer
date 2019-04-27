package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.WorkshiftEntity;

import java.util.List;

public interface WorkPeriodService {
    List<WorkshiftEntity> findAllLocation();

    List<WorkshiftEntity> findAllActiveWorkPeriods(int status);

    List<WorkshiftEntity> findAllActiveWorkPeriodsAndUserId(int status, int locationid, int userid);

    List<WorkshiftEntity> findAllActiveWorkPeriodsAndUserIdWithEndNull(int locationid, int userid);

    String saveWorkshift(WorkshiftEntity WorkshiftEntity);

    int saveWorkshiftReturnID(WorkshiftEntity WorkshiftEntity);

    String updateWorkshift(WorkshiftEntity WorkshiftEntity);

    WorkshiftEntity findById(int id);
}