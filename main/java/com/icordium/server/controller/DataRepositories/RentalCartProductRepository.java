package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentcartproductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalCartProductRepository extends JpaRepository<RentcartproductEntity, Integer> {
    List<RentcartproductEntity> findByCartIdcart(int cartIdcart);
}