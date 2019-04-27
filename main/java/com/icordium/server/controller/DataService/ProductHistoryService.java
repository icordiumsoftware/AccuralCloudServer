package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.ProducthistoryEntity;

import java.util.List;

/**
 * Created by ISH on 2/8/2019.
 */
public interface ProductHistoryService {
    List<ProducthistoryEntity> findAllProductHistory();

    List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistory(int idproductId, int idlocation);

    List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistoryStocks(int idproductId, int idlocation);

    List<ProducthistoryEntity> findByIDProductAndIDLocationProductHistoryStocksrows(int idlocation, int idproduct, double costprice, double retailprice, double wholsaleprice);

    String saveProductHistory(ProducthistoryEntity productHasMenuitemEntity);

    String updateProductHistory(ProducthistoryEntity productHasMenuitemEntity);

    ProducthistoryEntity findById(int id);

    String deleteById(int id);
}