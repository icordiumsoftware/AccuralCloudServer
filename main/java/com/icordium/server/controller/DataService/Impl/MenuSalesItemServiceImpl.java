package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataRepositories.MenuSalesItemRepository;
import com.icordium.server.controller.DataService.MenuSalesInvoiceProductService;
import com.icordium.server.controller.DataService.MenuSalesItemService;
import com.icordium.server.controller.DataService.ProductHasMeniItemService;
import com.icordium.server.controller.DataService.ProductHistoryService;
import com.icordium.server.controller.datamodel.MenusalesinvoiceproductEntity;
import com.icordium.server.controller.datamodel.MenusalesitemsEntity;
import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import com.icordium.server.controller.datamodel.ProducthistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ISH on 2/18/2019.
 */
@Service
public class MenuSalesItemServiceImpl implements MenuSalesItemService {
    @Autowired
    private MenuSalesItemRepository menuSalesItemRepository;
    @Autowired
    private MenuSalesInvoiceProductService menuSalesInvoiceProductService;
    @Autowired
    private ProductHasMeniItemService productHasMeniItemService;
    @Autowired
    private ProductHistoryService productHistoryService;

    @Override
    public List<MenusalesitemsEntity> findAllMenusalesitems() {
        return menuSalesItemRepository.findAll();
    }

    @Override
    public List<MenusalesitemsEntity> findAllMenusalesitemsByMenuInvoiceID(int id) {
        return menuSalesItemRepository.findByMenusalesinvoiceIdmenusalesinvoice(id);
    }

    @Override
    public String saveMenusalesitems(MenusalesitemsEntity menusalesitemsEntity) {
        menuSalesItemRepository.save(menusalesitemsEntity);
        menuSalesItemRepository.flush();
        menusalesitemsEntity = menuSalesItemRepository.getOne(menusalesitemsEntity.getIdmenusalesitems());
        for (ProductHasMenuitemEntity entity :
                productHasMeniItemService.findByMenuIDProductHasMeniItem(menusalesitemsEntity.getMenuitemIdmenuitem())) {
            MenusalesinvoiceproductEntity menusalesinvoiceproductEntity = new MenusalesinvoiceproductEntity();
            menusalesinvoiceproductEntity.setMenusalesinvoiceIdmenusalesinvoice(menusalesitemsEntity.getMenusalesinvoiceIdmenusalesinvoice());
            menusalesinvoiceproductEntity.setMenuitemIdmenuitem(menusalesitemsEntity.getMenuitemIdmenuitem());
            menusalesinvoiceproductEntity.setProductIdproduct(entity.getProductIdproduct());
            menusalesinvoiceproductEntity.setQty(entity.getQty());
            int returnID = menuSalesInvoiceProductService.saveMenusalesinvoiceproductReturnID(menusalesinvoiceproductEntity);
            menusalesinvoiceproductEntity = menuSalesInvoiceProductService.findById(returnID);
            try {
                List<ProducthistoryEntity> historyStocks = productHistoryService.findByIDProductAndIDLocationProductHistoryStocks(menusalesitemsEntity.getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice().getLocationIdlocation(), entity.getProductIdproduct());
                for (ProducthistoryEntity producthistoryEntity :
                        historyStocks) {
                    if (producthistoryEntity.getQty() - producthistoryEntity.getSetoffqty() >= entity.getQty()) {
                        List<ProducthistoryEntity> stocksrows = productHistoryService.findByIDProductAndIDLocationProductHistoryStocksrows(producthistoryEntity.getIdlocation(), producthistoryEntity.getIdproduct(), producthistoryEntity.getCostprice(), producthistoryEntity.getRetailprice(), producthistoryEntity.getWholsaleprice());

                        menusalesinvoiceproductEntity.setCostamount(producthistoryEntity.getCostprice() * entity.getQty());
                        menusalesinvoiceproductEntity.setSalesamount(producthistoryEntity.getRetailprice() * entity.getQty());

                        double setoffbalanceqty = entity.getQty();

                        for (ProducthistoryEntity entitystockrows :
                                stocksrows) {
                            double stock = entitystockrows.getQty() - entitystockrows.getSetoffqty();
                            if (stock >= setoffbalanceqty) {
                                entitystockrows.setSetoffqty(entitystockrows.getSetoffqty() + setoffbalanceqty);
                                setoffbalanceqty = 0;
                                productHistoryService.updateProductHistory(entitystockrows);
                                break;
                            } else if (setoffbalanceqty > 0 & stock > 0) {
                                entitystockrows.setSetoffqty(entitystockrows.getSetoffqty() + stock);
                                setoffbalanceqty = setoffbalanceqty - stock;
                                productHistoryService.updateProductHistory(entitystockrows);
                            }
                        }

                        ProducthistoryEntity producthistoryEntityByMenuProduct = new ProducthistoryEntity();
                        producthistoryEntityByMenuProduct.setUsersIdusers(menusalesitemsEntity.getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice().getUsersIdusers());
                        producthistoryEntityByMenuProduct.setCostprice(producthistoryEntity.getCostprice());
                        producthistoryEntityByMenuProduct.setSoldprice(producthistoryEntity.getRetailprice());
                        producthistoryEntityByMenuProduct.setRetailprice(producthistoryEntity.getRetailprice());
                        producthistoryEntityByMenuProduct.setWholsaleprice(producthistoryEntity.getWholsaleprice());
                        producthistoryEntityByMenuProduct.setQty(DataGenerator.getMinusVal(entity.getQty()));
                        producthistoryEntityByMenuProduct.setSetoffqty(DataGenerator.getMinusVal(entity.getQty()));
                        producthistoryEntityByMenuProduct.setTransactionIdtransaction(menusalesitemsEntity
                                .getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice().getTransactionIdtransaction());
                        producthistoryEntityByMenuProduct.setDescription("Recipe Stock Balancing");
                        producthistoryEntityByMenuProduct.setDocno(40);
                        productHistoryService.saveProductHistory(producthistoryEntityByMenuProduct);
                        /// Fill
                        break;
                    }
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
                ProducthistoryEntity producthistoryEntityByMenuProduct = new ProducthistoryEntity();
                producthistoryEntityByMenuProduct.setUsersIdusers(menusalesitemsEntity.getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice().getUsersIdusers());
                producthistoryEntityByMenuProduct.setCostprice(0.00);
                producthistoryEntityByMenuProduct.setSoldprice(0.00);
                producthistoryEntityByMenuProduct.setRetailprice(0.00);
                producthistoryEntityByMenuProduct.setWholsaleprice(0.00);
                producthistoryEntityByMenuProduct.setQty(DataGenerator.getMinusVal(entity.getQty()));
                producthistoryEntityByMenuProduct.setSetoffqty(DataGenerator.getMinusVal(entity.getQty()));
                producthistoryEntityByMenuProduct.setTransactionIdtransaction(menusalesitemsEntity
                        .getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice().getTransactionIdtransaction());
                producthistoryEntityByMenuProduct.setDescription("Recipe Stock Balancing");
                producthistoryEntityByMenuProduct.setDocno(40);
                productHistoryService.saveProductHistory(producthistoryEntityByMenuProduct);
            }
            menuSalesInvoiceProductService.updateMenusalesinvoiceproduct(menusalesinvoiceproductEntity);
        }

        return "{\"status\":\"success\"\"id\":" + menusalesitemsEntity.getIdmenusalesitems() + "}";
    }

    @Override
    public String updateMenusalesitems(MenusalesitemsEntity menusalesitemsEntity) {
        if (menusalesitemsEntity.getIdmenusalesitems() != 0) {
            menuSalesItemRepository.save(menusalesitemsEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenusalesitemsEntity findById(int id) {
        return menuSalesItemRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        menuSalesItemRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}