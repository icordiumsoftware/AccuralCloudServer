package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalinvoiceEntity;

import java.util.List;

public interface RentalInvoiceHeddderService {
    List<RentalinvoiceEntity> findAllRentalinvoice();
    List<RentalinvoiceEntity> findAllRentalinvoiceByLocationAndDate(int idLocation,String stdate,String enDate);

    String saveRentalinvoice(RentalinvoiceEntity rentalinvoiceEntity);

    String updateRentalinvoice(RentalinvoiceEntity rentalinvoiceEntity);

    RentalinvoiceEntity findById(int id);

    String deleteById(int id);

    long count();
}