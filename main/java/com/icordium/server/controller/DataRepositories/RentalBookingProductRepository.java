package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.BookingproductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalBookingProductRepository extends JpaRepository<BookingproductEntity, Integer> {
}