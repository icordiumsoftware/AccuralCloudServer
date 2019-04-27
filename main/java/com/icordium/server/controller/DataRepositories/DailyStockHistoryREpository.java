package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.DailystockhistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyStockHistoryREpository extends JpaRepository<DailystockhistoryEntity, Integer> {

}