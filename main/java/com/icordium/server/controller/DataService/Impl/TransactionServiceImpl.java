package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.TransactionRepository;
import com.icordium.server.controller.DataService.TransactionService;
import com.icordium.server.controller.datamodel.TransactionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<TransactionEntity> findAllCartHedders() {
        return transactionRepository.findAll();
    }

    @Override
    public String saveSystemTransaction(TransactionEntity transactionEntity) {
        transactionRepository.save(transactionEntity);
        transactionRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + transactionEntity.getIdtransaction() + "\"}";
    }

    @Override
    public int saveSystemTransactionReturnid(TransactionEntity transactionEntity) {
        transactionRepository.save(transactionEntity);
        transactionRepository.flush();
        return transactionEntity.getIdtransaction();
    }

    @Override
    public String updateSystemTransaction(TransactionEntity transactionEntity) {
        if (transactionEntity.getIdtransaction() != 0) {
            TransactionEntity update = transactionRepository.save(transactionEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TransactionEntity findById(int id) {
        return transactionRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        transactionRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}