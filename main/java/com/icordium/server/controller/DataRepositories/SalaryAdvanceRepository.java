package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.SalaryadvanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ISH on 3/22/2019.
 */
public interface SalaryAdvanceRepository extends JpaRepository<SalaryadvanceEntity, Integer> {
    List<SalaryadvanceEntity> findAllByWorkshiftIdworkshift(int workshiftId);
}
