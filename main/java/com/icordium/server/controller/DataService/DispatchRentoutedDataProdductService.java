package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.RentoutedproductdataEntity;

import java.util.List;

public interface DispatchRentoutedDataProdductService {
    List<RentoutedproductdataEntity> findAllRentoutedproductdata();

    List<RentoutedproductdataEntity> findAllRentoutedproductdataByHedderID(int hedderIdrentoutedhedder);

    String saveRentoutedproductdata(RentoutedproductdataEntity rentoutedproductdataEntity);

    String updateRentoutedproductdata(RentoutedproductdataEntity rentoutedproductdataEntity);

    RentoutedproductdataEntity findById(int id);

    String deleteById(int id);
}