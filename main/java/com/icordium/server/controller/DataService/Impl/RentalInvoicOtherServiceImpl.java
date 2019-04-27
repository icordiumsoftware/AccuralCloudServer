package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalInvoiceOtherRepository;
import com.icordium.server.controller.DataService.RentalInvoiceOtherService;
import com.icordium.server.controller.datamodel.RentalinvoiceotherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalInvoicOtherServiceImpl implements RentalInvoiceOtherService {
    @Autowired
    private RentalInvoiceOtherRepository rentalInvoiceOtherRepository;

    @Override
    public List<RentalinvoiceotherEntity> findAllRentalinvoice() {
        return rentalInvoiceOtherRepository.findAll();
    }

    @Override
    public String saveRentalinvoice(RentalinvoiceotherEntity entity) {
        rentalInvoiceOtherRepository.save(entity);
        rentalInvoiceOtherRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + entity.getIdrentalinvoiceother() + "\"}";
    }

    @Override
    public String updateRentalinvoice(RentalinvoiceotherEntity entity) {
        if (entity.getIdrentalinvoiceother() != 0) {
            rentalInvoiceOtherRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalinvoiceotherEntity findById(int id) {
        return rentalInvoiceOtherRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalInvoiceOtherRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}