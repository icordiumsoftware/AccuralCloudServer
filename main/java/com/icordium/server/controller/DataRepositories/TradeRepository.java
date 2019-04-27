package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<TradeEntity, Integer> {
    List<TradeEntity> findByAccountno(Integer accountno);

    List<TradeEntity> findByTransactionIdtransaction(Integer transactionid);
}