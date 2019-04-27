package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.BookingcartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalCartRepository extends JpaRepository<BookingcartEntity, Integer> {
    List<BookingcartEntity> findByCartstatus(int cartstatus);

}