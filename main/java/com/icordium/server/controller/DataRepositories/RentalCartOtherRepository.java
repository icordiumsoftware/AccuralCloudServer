package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentcartotherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalCartOtherRepository extends JpaRepository<RentcartotherEntity, Integer> {
    List<RentcartotherEntity> findByCartIdcart(int cartIdcart);
}