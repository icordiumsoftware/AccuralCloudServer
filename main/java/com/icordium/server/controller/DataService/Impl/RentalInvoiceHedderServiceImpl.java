package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataRepositories.RentalInvoiceHedderRepository;
import com.icordium.server.controller.DataService.RentalInvoiceHeddderService;
import com.icordium.server.controller.datamodel.RentalinvoiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RentalInvoiceHedderServiceImpl implements RentalInvoiceHeddderService {
    @Autowired
    private RentalInvoiceHedderRepository rentalInvoiceHedderRepository;

    @Override
    public List<RentalinvoiceEntity> findAllRentalinvoiceByLocationAndDate(int idLocation, String stdate, String enDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date from = format.parse(stdate);
            Date to = DataGenerator.addHoursToJavaUtilDate(format.parse(enDate), 24);
            return rentalInvoiceHedderRepository.findByLocationIdlocationAndEnddateBetweenOrderByEnddateDesc(idLocation, from, to);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<RentalinvoiceEntity> findAllRentalinvoice() {
        return rentalInvoiceHedderRepository.findAll();
    }

    @Override
    public String saveRentalinvoice(RentalinvoiceEntity rentalinvoiceEntity) {
        rentalInvoiceHedderRepository.save(rentalinvoiceEntity);
        rentalInvoiceHedderRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentalinvoiceEntity.getIdrentalinvoice() + "\"}";
    }

    @Override
    public String updateRentalinvoice(RentalinvoiceEntity rentalinvoiceEntity) {
        if (rentalinvoiceEntity.getIdrentalinvoice() != 0) {
            rentalInvoiceHedderRepository.save(rentalinvoiceEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalinvoiceEntity findById(int id) {
        return rentalInvoiceHedderRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        rentalInvoiceHedderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public long count() {
        return rentalInvoiceHedderRepository.count();
    }
}