package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalInvoiceDataProductRepository;
import com.icordium.server.controller.DataService.RentalInnvoiceDataProductService;
import com.icordium.server.controller.datamodel.RentalinvoicedattaproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalInvoiceDataProductServiceImpl implements RentalInnvoiceDataProductService {
    @Autowired
    private RentalInvoiceDataProductRepository rentalInvoiceDataProductRepository;

    @Override
    public List<RentalinvoicedattaproductEntity> findAllRentalDataProduct() {
        return rentalInvoiceDataProductRepository.findAll();
    }

    @Override
    public String saveRentalDataProduct(RentalinvoicedattaproductEntity entity) {
        rentalInvoiceDataProductRepository.save(entity);
        rentalInvoiceDataProductRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + entity.getIdrentalinvoicedattaproduct() + "\"}";

    }

    @Override
    public String updateRentalDataProduct(RentalinvoicedattaproductEntity entity) {
        if (entity.getIdrentalinvoicedattaproduct() != 0) {
            rentalInvoiceDataProductRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public RentalinvoicedattaproductEntity findById(int id) {
        return rentalInvoiceDataProductRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        rentalInvoiceDataProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}