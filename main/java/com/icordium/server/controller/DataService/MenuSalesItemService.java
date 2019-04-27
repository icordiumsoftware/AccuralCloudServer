package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.MenusalesitemsEntity;

import java.util.List;

public interface MenuSalesItemService {
    List<MenusalesitemsEntity> findAllMenusalesitems();

    List<MenusalesitemsEntity> findAllMenusalesitemsByMenuInvoiceID(int id);

    String saveMenusalesitems(MenusalesitemsEntity menusalesitemsEntity);

    String updateMenusalesitems(MenusalesitemsEntity menusalesitemsEntity);

    MenusalesitemsEntity findById(int id);

    String deleteById(int id);
}