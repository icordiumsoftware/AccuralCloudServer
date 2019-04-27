package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentcartserviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentaCartServiceRepository extends JpaRepository<RentcartserviceEntity, Integer> {
    List<RentcartserviceEntity> findByCartIdcart(int cartIdcart);
}