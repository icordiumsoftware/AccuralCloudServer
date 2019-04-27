package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DispatchRentOutDataProductRepositroy;
import com.icordium.server.controller.DataService.DispatchRentoutedDataProdductService;
import com.icordium.server.controller.datamodel.RentoutedproductdataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchRentoutedDataProdductServiceImpl implements DispatchRentoutedDataProdductService {
    @Autowired
    private DispatchRentOutDataProductRepositroy dispatchRentOutDataProductRepositroy;

    @Override
    public List<RentoutedproductdataEntity> findAllRentoutedproductdataByHedderID(int hedderIdrentoutedhedder) {
        return dispatchRentOutDataProductRepositroy.findByHedderIdrentoutedhedder(hedderIdrentoutedhedder);
    }

    @Override
    public List<RentoutedproductdataEntity> findAllRentoutedproductdata() {
        return dispatchRentOutDataProductRepositroy.findAll();
    }

    @Override
    public String saveRentoutedproductdata(RentoutedproductdataEntity rentoutedproductdataEntity) {
        dispatchRentOutDataProductRepositroy.save(rentoutedproductdataEntity);
        dispatchRentOutDataProductRepositroy.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentoutedproductdataEntity.getIdrentoutedproductdata() + "\"}";
    }

    @Override
    public String updateRentoutedproductdata(RentoutedproductdataEntity rentoutedproductdataEntity) {
        if (rentoutedproductdataEntity.getIdrentoutedproductdata() != 0) {
            RentoutedproductdataEntity update = dispatchRentOutDataProductRepositroy.save(rentoutedproductdataEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentoutedproductdataEntity findById(int id) {
        return dispatchRentOutDataProductRepositroy.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        dispatchRentOutDataProductRepositroy.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}