package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.WorkPeriodRepository;
import com.icordium.server.controller.DataService.WorkPeriodService;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPeriodServiceImpl implements WorkPeriodService {
    @Autowired
    private WorkPeriodRepository workPeriodRepository;

    @Override
    public List<WorkshiftEntity> findAllLocation() {
        return workPeriodRepository.findAll();
    }

    @Override
    public List<WorkshiftEntity> findAllActiveWorkPeriods(int status) {
        return workPeriodRepository.findByEndIsNull();
    }

    @Override
    public List<WorkshiftEntity> findAllActiveWorkPeriodsAndUserId(int status, int locationid, int userid) {
        if (status == 0) {
            return workPeriodRepository.findByEndIsNullAndLocationIdlocationAndUsersIdusers(locationid, userid);
        } else {
            return workPeriodRepository.findByEndIsNotNullAndLocationIdlocationAndUsersIdusers(locationid, userid);
        }
    }

    @Override
    public List<WorkshiftEntity> findAllActiveWorkPeriodsAndUserIdWithEndNull(int locationid, int userid) {
        return workPeriodRepository.findByEndIsNullAndLocationIdlocationAndUsersIdusers(locationid, userid);
    }

    @Override
    public String saveWorkshift(WorkshiftEntity WorkshiftEntity) {
        workPeriodRepository.save(WorkshiftEntity);
        workPeriodRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + WorkshiftEntity.getIdworkshift() + "\"}";
    }

    @Override
    public int saveWorkshiftReturnID(WorkshiftEntity WorkshiftEntity) {
        workPeriodRepository.save(WorkshiftEntity);
        workPeriodRepository.flush();
        return WorkshiftEntity.getIdworkshift();
    }

    @Override
    public String updateWorkshift(WorkshiftEntity WorkshiftEntity) {
        if (WorkshiftEntity.getIdworkshift() != 0) {
            workPeriodRepository.save(WorkshiftEntity);
            return "{\"status\":\"error\"}";
        } else {
            return "{\"status\":\"success\"}";
        }
    }

    @Override
    public WorkshiftEntity findById(int id) {
        return workPeriodRepository.findById(id).get();
    }
}