package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalinvoiceotherEntity;

import java.util.List;

public interface RentalInvoiceOtherService {
    List<RentalinvoiceotherEntity> findAllRentalinvoice();

    String saveRentalinvoice(RentalinvoiceotherEntity entity);

    String updateRentalinvoice(RentalinvoiceotherEntity entity);

    RentalinvoiceotherEntity findById(int id);

    String deleteById(int id);

}