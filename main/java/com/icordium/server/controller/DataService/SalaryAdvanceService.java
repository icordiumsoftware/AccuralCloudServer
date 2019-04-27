package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.SalaryadvanceEntity;

import java.util.List;

/**
 * Created by ISH on 3/22/2019.
 */
public interface SalaryAdvanceService {
    List<SalaryadvanceEntity> findAllSalaryAdvance();

    List<SalaryadvanceEntity> findAllSalaryAdvanceByWorkPeriod(int workperiodid);

    String saveSalaryAdvance(SalaryadvanceEntity salaryadvanceEntity);

    String updateSalaryAdvance(SalaryadvanceEntity salaryadvanceEntity);

    SalaryadvanceEntity findById(int id);

    String deleteById(int id);
}