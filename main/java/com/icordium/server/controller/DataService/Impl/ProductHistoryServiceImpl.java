package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.ProductHistoryRepository;
import com.icordium.server.controller.DataService.ProductHistoryService;
import com.icordium.server.controller.DataService.StockService;
import com.icordium.server.controller.datamodel.ProducthistoryEntity;
import com.icordium.server.controller.datamodel.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ISH on 2/8/2019.
 */
@Service
public class ProductHistoryServiceImpl implements ProductHistoryService {
    @Autowired
    private StockService stockService;
    @Autowired
    private ProductHistoryRepository productHistoryRepository;

    @Override
    public List<ProducthistoryEntity> findAllProductHistory() {
        return productHistoryRepository.findAll();
    }

    @Override
    public List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistory(int idproductId, int idlocation) {
        return productHistoryRepository.findByIdproductAndIdlocation(idproductId, idlocation);
    }

    @Override
    public List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistoryStocks(int idproductId, int idlocation) {
        return productHistoryRepository.getByIdproductAndIdlocationOrderByDatetimeAsc(idlocation, idproductId);
    }

    @Override
    public List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistoryStocksrows(int idlocation, int idproduct, double costprice, double retailprice, double wholsaleprice) {
        return productHistoryRepository.getByIdproductAndIdlocationAndCostpriceAndRetailpriceAndWholsalepriceOrderByDatetimeAsc(idlocation, idproduct, costprice, retailprice, wholsaleprice);
    }


    @Override
    public String saveProductHistory(ProducthistoryEntity productHasMenuitemEntity) {
        productHistoryRepository.save(productHasMenuitemEntity);
        productHistoryRepository.flush();
        try {
            StockEntity stockServiceByLocationAndProduct = stockService.findByLocationAndProduct(productHasMenuitemEntity.getIdlocation(), productHasMenuitemEntity.getIdproduct());
            stockServiceByLocationAndProduct.setQtyinhand(stockServiceByLocationAndProduct.getQtyinhand() + productHasMenuitemEntity.getQty());
            stockService.updateStock(stockServiceByLocationAndProduct);
        } catch (org.hibernate.LazyInitializationException e) {
            StockEntity stockEntity = new StockEntity();
            stockEntity.setIdlocation(productHasMenuitemEntity.getIdlocation());
            stockEntity.setIdproduct(productHasMenuitemEntity.getIdproduct());
            stockEntity.setQtyinhand(productHasMenuitemEntity.getQty());
            stockService.saveStock(stockEntity);
        }
        return "{\"status\":\"success\",\"id\":\"" + productHasMenuitemEntity.getIdproducthistory() + "\"}";
    }

    @Override
    public String updateProductHistory(ProducthistoryEntity producthistoryEntity) {
        if (producthistoryEntity.getIdproducthistory() != 0) {
            productHistoryRepository.save(producthistoryEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public ProducthistoryEntity findById(int id) {
        return productHistoryRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        productHistoryRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}