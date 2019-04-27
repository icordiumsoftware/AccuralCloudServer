package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataRepositories.CashInOutRepository;
import com.icordium.server.controller.DataService.CashInOutService;
import com.icordium.server.controller.DataService.WorkPeriodService;
import com.icordium.server.controller.datamodel.CashinandcashoutEntity;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by ISH on 2/23/2019.
 */
@Service
public class CashInOutServiceImpl implements CashInOutService {
    @Autowired
    private CashInOutRepository cashInOutRepository;
    @Autowired
    private WorkPeriodService workPeriodService;

    @Override
    public List<CashinandcashoutEntity> findAllCashinandcashout() {
        return cashInOutRepository.findAll();
    }

    @Override
    public String saveCashinandcashout(CashinandcashoutEntity cashinandcashoutEntity) {
        cashinandcashoutEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        cashInOutRepository.save(cashinandcashoutEntity);
        cashInOutRepository.flush();
        WorkshiftEntity workshiftEntity = workPeriodService.findById(cashinandcashoutEntity.getWorkshiftIdworkshift());
        if (cashinandcashoutEntity.getAmount() > 0) {
            workshiftEntity.setCashin(workshiftEntity.getCashin() + cashinandcashoutEntity.getAmount());
        } else {
            workshiftEntity.setCashout(workshiftEntity.getCashout() + cashinandcashoutEntity.getAmount());
        }
        workPeriodService.updateWorkshift(workshiftEntity);

        return "{\"status\":\"success\",\"id\":\"" + cashinandcashoutEntity.getIdcashinandcashout() + "\"}";
    }

    @Override
    public String updateCashinandcashout(CashinandcashoutEntity cashinandcashoutEntity) {
        if (cashinandcashoutEntity.getIdcashinandcashout() != 0) {
            CashinandcashoutEntity update = cashInOutRepository.save(cashinandcashoutEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public CashinandcashoutEntity findById(int id) {
        return cashInOutRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        CashinandcashoutEntity entity = cashInOutRepository.getOne(id);

        WorkshiftEntity workshiftEntity = workPeriodService.findById(entity.getWorkshiftIdworkshift());
        if (entity.getAmount() > 0) {
            workshiftEntity.setCashin(workshiftEntity.getCashin() - entity.getAmount());
        } else {
            workshiftEntity.setCashout(workshiftEntity.getCashout() + DataGenerator.getPlusVal(entity.getAmount()));
        }
        workPeriodService.updateWorkshift(workshiftEntity);
        cashInOutRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}