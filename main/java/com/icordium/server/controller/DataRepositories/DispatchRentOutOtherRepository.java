package com.icordium.server.controller.DataRepositories;


import com.icordium.server.controller.datamodel.RentoutedotherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchRentOutOtherRepository extends JpaRepository<RentoutedotherEntity, Integer> {
}