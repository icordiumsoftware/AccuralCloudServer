package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.TradeEntity;

import java.util.List;

public interface TradeService {
    List<TradeEntity> findAllTrade();

    List<TradeEntity> findAllTradeByAccountno(int accountno);

    List<TradeEntity> findAllTradeByTransaction(int TransactionID);

    String saveTrade(TradeEntity tradeEntity);

    String updateTrade(TradeEntity tradeEntity);

    TradeEntity findById(int id);

}