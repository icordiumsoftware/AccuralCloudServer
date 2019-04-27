package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.CashinandcashoutEntity;

import java.util.List;

/**
 * Created by ISH on 2/23/2019.
 */
public interface CashInOutService {
    List<CashinandcashoutEntity> findAllCashinandcashout();

    String saveCashinandcashout(CashinandcashoutEntity cashinandcashoutEntity);

    String updateCashinandcashout(CashinandcashoutEntity cashinandcashoutEntity);

    CashinandcashoutEntity findById(int id);

    String deleteById(int id);
}