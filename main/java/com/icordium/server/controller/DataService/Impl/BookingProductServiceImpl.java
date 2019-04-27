package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.RentalBookingProductRepository;
import com.icordium.server.controller.DataService.BookingProductService;
import com.icordium.server.controller.datamodel.BookingproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingProductServiceImpl implements BookingProductService {
    @Autowired
    private RentalBookingProductRepository bookingProductRepository;

    @Override
    public List<BookingproductEntity> findAllBookingProduct() {
        return bookingProductRepository.findAll();
    }

    @Override
    public String saveBookingProduct(BookingproductEntity bookingproductEntity) {
        bookingProductRepository.save(bookingproductEntity);
        bookingProductRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + bookingproductEntity.getIdbookingproduct() + "\"}";
    }

    @Override
    public String updateBookingProduct(BookingproductEntity bookingproductEntity) {
        if (bookingproductEntity.getIdbookingproduct() != 0) {
            BookingproductEntity update = bookingProductRepository.save(bookingproductEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public BookingproductEntity findById(int id) {
        return bookingProductRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        bookingProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}