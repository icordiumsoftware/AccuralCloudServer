package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.CashinandcashoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ISH on 2/23/2019.
 */
@Repository
public interface CashInOutRepository extends JpaRepository<CashinandcashoutEntity, Integer> {
}