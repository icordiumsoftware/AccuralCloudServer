package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.MenusalesinvoiceproductEntity;

import java.util.List;

public interface MenuSalesInvoiceProductService {
    List<MenusalesinvoiceproductEntity> findAllMenusalesinvoiceproduct();

    List<MenusalesinvoiceproductEntity> findAllMenusalesinvoiceproductByMenuInvoiceID(int id);

    String saveMenusalesinvoiceproduct(MenusalesinvoiceproductEntity menusalesitemsEntity);

    int saveMenusalesinvoiceproductReturnID(MenusalesinvoiceproductEntity menusalesitemsEntity);

    String updateMenusalesinvoiceproduct(MenusalesinvoiceproductEntity menusalesitemsEntity);

    MenusalesinvoiceproductEntity findById(int id);

    String deleteById(int id);
}