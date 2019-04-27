package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalservicedataEntity;

import java.util.List;

public interface RentalInvoiceServiceDataService {
    List<RentalservicedataEntity> findAllRentalinvoice();

    String saveRentalinvoice(RentalservicedataEntity entity);

    String updateRentalinvoice(RentalservicedataEntity entity);

    RentalservicedataEntity findById(int id);

    String deleteById(int id);

}