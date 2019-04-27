package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalbookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalBookingRepository extends JpaRepository<RentalbookingEntity, Integer> {
    List<RentalbookingEntity> findByStatusOrderByDiliveerydateAsc(int status);
}