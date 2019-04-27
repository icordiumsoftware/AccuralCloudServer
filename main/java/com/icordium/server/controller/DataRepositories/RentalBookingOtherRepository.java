package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalotherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalBookingOtherRepository extends JpaRepository<RentalotherEntity, Integer> {
    List<RentalotherEntity> findByRentalbookingIdrentalbooking(int Idrentalbooking);
}