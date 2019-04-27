package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentalinvoicedattaproductEntity;

import java.util.List;

public interface RentalInnvoiceDataProductService {
    List<RentalinvoicedattaproductEntity> findAllRentalDataProduct();

    String saveRentalDataProduct(RentalinvoicedattaproductEntity entity);

    String updateRentalDataProduct(RentalinvoicedattaproductEntity entity);

    RentalinvoicedattaproductEntity findById(int id);

    String deleteById(int id);
}