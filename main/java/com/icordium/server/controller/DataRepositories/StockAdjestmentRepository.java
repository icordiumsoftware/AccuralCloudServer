package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.StockadjestmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockAdjestmentRepository extends JpaRepository<StockadjestmentEntity, Integer> {
}