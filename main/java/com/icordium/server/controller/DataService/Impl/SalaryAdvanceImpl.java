package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataRepositories.SalaryAdvanceRepository;
import com.icordium.server.controller.DataService.SalaryAdvanceService;
import com.icordium.server.controller.DataService.WorkPeriodService;
import com.icordium.server.controller.datamodel.SalaryadvanceEntity;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by ISH on 3/22/2019.
 */
@Service
public class SalaryAdvanceImpl implements SalaryAdvanceService {
    @Autowired
    private SalaryAdvanceRepository salaryAdvanceRepository;
    @Autowired
    private WorkPeriodService workPeriodService;

    @Override
    public List<SalaryadvanceEntity> findAllSalaryAdvance() {
        return salaryAdvanceRepository.findAll();
    }

    @Override
    public List<SalaryadvanceEntity> findAllSalaryAdvanceByWorkPeriod(int workperiodID) {
        return salaryAdvanceRepository.findAllByWorkshiftIdworkshift(workperiodID);
    }

    @Override
    public String saveSalaryAdvance(SalaryadvanceEntity salaryadvanceEntity) {
        salaryadvanceEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        salaryAdvanceRepository.save(salaryadvanceEntity);
        salaryAdvanceRepository.flush();
        WorkshiftEntity workshiftEntity = workPeriodService.findById(salaryadvanceEntity.getWorkshiftIdworkshift());
        if (salaryadvanceEntity.getAmount() > 0) {
            workshiftEntity.setPaidout(workshiftEntity.getPaidout() + salaryadvanceEntity.getAmount());
        } else {
            workshiftEntity.setPaidout(workshiftEntity.getPaidout() + salaryadvanceEntity.getAmount());
        }
        workPeriodService.updateWorkshift(workshiftEntity);
        return "{\"status\":\"success\",\"id\":\"" + salaryadvanceEntity.getIdsalaryadvance() + "\"}";
    }

    @Override
    public String updateSalaryAdvance(SalaryadvanceEntity salaryadvanceEntity) {
        return null;
    }

    @Override
    public SalaryadvanceEntity findById(int id) {
        return null;
    }

    @Override
    public String deleteById(int id) {
        SalaryadvanceEntity entity = salaryAdvanceRepository.getOne(id);

        WorkshiftEntity workshiftEntity = workPeriodService.findById(entity.getWorkshiftIdworkshift());
        if (entity.getAmount() > 0) {
            workshiftEntity.setPaidout(workshiftEntity.getPaidout() - entity.getAmount());
        } else {
            workshiftEntity.setPaidout(workshiftEntity.getPaidout() + DataGenerator.getPlusVal(entity.getAmount()));
        }
        workPeriodService.updateWorkshift(workshiftEntity);
        salaryAdvanceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}