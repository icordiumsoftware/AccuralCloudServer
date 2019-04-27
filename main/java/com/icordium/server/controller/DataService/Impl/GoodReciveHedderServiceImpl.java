package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.GoodReciveHedderRepository;
import com.icordium.server.controller.DataService.GoodReciveDataProductService;
import com.icordium.server.controller.DataService.GoodReciveHedderService;
import com.icordium.server.controller.DataService.ProductHistoryService;
import com.icordium.server.controller.DataService.TransactionService;
import com.icordium.server.controller.datamodel.GoodrecivedataproductEntity;
import com.icordium.server.controller.datamodel.GoodrevicehedderEntity;
import com.icordium.server.controller.datamodel.ProducthistoryEntity;
import com.icordium.server.controller.datamodel.TransactionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class GoodReciveHedderServiceImpl implements GoodReciveHedderService {
    @Autowired
    private GoodReciveHedderRepository goodReciveHedderRepository;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private ProductHistoryService productHistoryService;
    @Autowired
    private GoodReciveDataProductService goodReciveDataProductService;

    @Override
    public List<GoodrevicehedderEntity> findAllGoodReciveHedder() {
        return goodReciveHedderRepository.findAll();
    }

    @Override
    public List<GoodrevicehedderEntity> findAllActiveGoodReciveHedder(int status) {
        return goodReciveHedderRepository.findByStatus(status);
    }

    @Override
    public String saveGoodReciveHedder(GoodrevicehedderEntity goodrevicehedderEntity) {
        goodReciveHedderRepository.save(goodrevicehedderEntity);
        goodReciveHedderRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + goodrevicehedderEntity.getIdgoodrevicehedder() + "\"}";
    }

    @Override
    public String updateGoodReciveHedder(GoodrevicehedderEntity goodrevicehedderEntity) {
        if (goodrevicehedderEntity.getIdgoodrevicehedder() != 0) {
            goodReciveHedderRepository.save(goodrevicehedderEntity);
            goodReciveHedderRepository.flush();
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public GoodrevicehedderEntity findById(int id) {
        return goodReciveHedderRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        GoodrevicehedderEntity entity = goodReciveHedderRepository.getOne(id);
        for (GoodrecivedataproductEntity goodrecivedataproductEntity : entity.getGoodrecivedataproductsByIdgoodrevicehedder()) {
            goodReciveDataProductService.deleteById(goodrecivedataproductEntity.getIdgoodrecivedataproduct());
        }
        goodReciveHedderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @Override
    public String GenarateById(int id) {
        GoodrevicehedderEntity goodrevicehedderEntity = goodReciveHedderRepository.getOne(id);
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        transactionEntity.setLocationIdlocation(goodrevicehedderEntity.getLocationIdlocation());
        transactionEntity.setTransactiondescription("Good Recive Note");
        transactionEntity.setTransactiontype("130");
        int systemTransactionReturnid = transactionService.saveSystemTransactionReturnid(transactionEntity);
        for (GoodrecivedataproductEntity goodrecivedataproductEntity : goodrevicehedderEntity.getGoodrecivedataproductsByIdgoodrevicehedder()) {
            ProducthistoryEntity producthistoryEntity = new ProducthistoryEntity();
            producthistoryEntity.setDatetime(new Timestamp(new Date().getTime()));
            producthistoryEntity.setDescription("Good Recive Note ");
            producthistoryEntity.setIdlocation(goodrevicehedderEntity.getLocationIdlocation());
            producthistoryEntity.setUsersIdusers(goodrevicehedderEntity.getUsersIdusers());
            producthistoryEntity.setDocno(130);
            producthistoryEntity.setTransactionIdtransaction(systemTransactionReturnid);
            producthistoryEntity.setSetoffqty(0.00);
            producthistoryEntity.setFreeqty(goodrecivedataproductEntity.getFreeqty());
            producthistoryEntity.setQty(goodrecivedataproductEntity.getQty());
            producthistoryEntity.setFreeqty(goodrecivedataproductEntity.getFreeqty());
            producthistoryEntity.setCostprice(goodrecivedataproductEntity.getCostpriice());
            producthistoryEntity.setRetailprice(goodrecivedataproductEntity.getCostamount());
            producthistoryEntity.setSoldprice(goodrecivedataproductEntity.getRetailprice());
            producthistoryEntity.setWholsaleprice(goodrecivedataproductEntity.getWholesaleprice());
            producthistoryEntity.setIdproduct(goodrecivedataproductEntity.getProductIdproduct());
            productHistoryService.saveProductHistory(producthistoryEntity);
        }
        goodrevicehedderEntity.setTransactionIdtransaction(systemTransactionReturnid);
        goodrevicehedderEntity.setStatus(2);
//        goodrevicehedderEntity.set
        updateGoodReciveHedder(goodrevicehedderEntity);
        return "{\"status\":\"success\"}";
    }
}