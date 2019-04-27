package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.TradeRepository;
import com.icordium.server.controller.DataService.TradeService;
import com.icordium.server.controller.datamodel.TradeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    TradeRepository tradeRepository;

    @Override
    public List<TradeEntity> findAllTrade() {
        return tradeRepository.findAll();
    }

    @Override
    public List<TradeEntity> findAllTradeByAccountno(int accountno) {
        return tradeRepository.findByAccountno(accountno);
    }

    @Override
    public List<TradeEntity> findAllTradeByTransaction(int TransactionID) {
        return tradeRepository.findByTransactionIdtransaction(TransactionID);
    }

    @Override
    public String saveTrade(TradeEntity tradeEntity) {
        tradeRepository.save(tradeEntity);
        tradeRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + tradeEntity.getIdtrade() + "\"}";
    }

    @Override
    public String updateTrade(TradeEntity tradeEntity) {
        if (tradeEntity.getIdtrade() != 0) {
            tradeRepository.save(tradeEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TradeEntity findById(int id) {
        return tradeRepository.getOne(id);
    }
}