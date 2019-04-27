package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.MenuSalesInvoiceProductRepository;
import com.icordium.server.controller.DataService.MenuSalesInvoiceProductService;
import com.icordium.server.controller.datamodel.MenusalesinvoiceproductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuSalesInvoiceProductServiceImpl implements MenuSalesInvoiceProductService {
    @Autowired
    private MenuSalesInvoiceProductRepository menuSalesInvoiceProductRepository;

    @Override
    public List<MenusalesinvoiceproductEntity> findAllMenusalesinvoiceproduct() {
        return menuSalesInvoiceProductRepository.findAll();
    }

    @Override
    public List<MenusalesinvoiceproductEntity> findAllMenusalesinvoiceproductByMenuInvoiceID(int id) {
        return menuSalesInvoiceProductRepository.findByMenusalesinvoiceIdmenusalesinvoice(id);
    }

    @Override
    public String saveMenusalesinvoiceproduct(MenusalesinvoiceproductEntity menusalesitemsEntity) {
        menuSalesInvoiceProductRepository.save(menusalesitemsEntity);
        menuSalesInvoiceProductRepository.flush();
        return "{\"status\":\"success\"\"id\":\"" + menusalesitemsEntity.getIdmenusalesinvoiceproduct() + "\"}";
    }

    @Override
    public int saveMenusalesinvoiceproductReturnID(MenusalesinvoiceproductEntity menusalesitemsEntity) {
        menuSalesInvoiceProductRepository.save(menusalesitemsEntity);
        menuSalesInvoiceProductRepository.flush();
        return menusalesitemsEntity.getIdmenusalesinvoiceproduct();
    }

    @Override
    public String updateMenusalesinvoiceproduct(MenusalesinvoiceproductEntity menusalesitemsEntity) {
        if (menusalesitemsEntity.getIdmenusalesinvoiceproduct() != 0) {
            menuSalesInvoiceProductRepository.save(menusalesitemsEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenusalesinvoiceproductEntity findById(int id) {
        return menuSalesInvoiceProductRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        menuSalesInvoiceProductRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}