package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalInvoiceServiceDataRepository;
import com.icordium.server.controller.DataService.RentalInvoiceServiceDataService;
import com.icordium.server.controller.datamodel.RentalservicedataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalInvoiceServiceDataServiceImpl implements RentalInvoiceServiceDataService {
    @Autowired
    private RentalInvoiceServiceDataRepository rentalInvoiceServiceDataRepository;

    @Override
    public List<RentalservicedataEntity> findAllRentalinvoice() {
        return rentalInvoiceServiceDataRepository.findAll();
    }

    @Override
    public String saveRentalinvoice(RentalservicedataEntity entity) {
        rentalInvoiceServiceDataRepository.save(entity);
        rentalInvoiceServiceDataRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + entity.getIdrentalservicedata() + "\"}";
    }

    @Override
    public String updateRentalinvoice(RentalservicedataEntity entity) {
        if (entity.getIdrentalservicedata() != 0) {
            rentalInvoiceServiceDataRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalservicedataEntity findById(int id) {
        return rentalInvoiceServiceDataRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        rentalInvoiceServiceDataRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}