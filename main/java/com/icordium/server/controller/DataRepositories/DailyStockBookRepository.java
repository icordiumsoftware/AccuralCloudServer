package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.DailystockbookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DailyStockBookRepository extends JpaRepository<DailystockbookEntity, Integer> {
    List<DailystockbookEntity> findByProductIdproductAndLocationIdlocationAndDateBetweenOrderByBookedorderqtyDesc(int productIdproduct, int locationIdlocation, Date fromdate, Date todate);
}