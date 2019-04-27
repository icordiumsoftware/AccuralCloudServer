package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.BookingserviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalBookingServiceRepository extends JpaRepository<BookingserviceEntity, Integer> {
    List<BookingserviceEntity> findByRentalbookingIdrentalbooking(int idbookingservice);
}