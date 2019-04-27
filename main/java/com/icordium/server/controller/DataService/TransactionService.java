package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.TransactionEntity;

import java.util.List;

public interface TransactionService {
    List<TransactionEntity> findAllCartHedders();

    String saveSystemTransaction(TransactionEntity transactionEntity);

    int saveSystemTransactionReturnid(TransactionEntity transactionEntity);

    String updateSystemTransaction(TransactionEntity transactionEntity);

    TransactionEntity findById(int id);

    String deleteById(int id);
}