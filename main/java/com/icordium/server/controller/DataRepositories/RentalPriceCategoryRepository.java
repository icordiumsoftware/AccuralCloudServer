package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalpricecategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalPriceCategoryRepository extends JpaRepository<RentalpricecategoryEntity, Integer> {
}