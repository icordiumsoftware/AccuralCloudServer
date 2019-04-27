package com.icordium.server.controller.DataService;


import com.icordium.server.controller.CustomResultDTO.MenuSalesInvoiceCreatingRequest;
import com.icordium.server.controller.datamodel.MenusalesinvoiceEntity;

import java.util.List;

public interface MenuSalesInvoiceService {
    List<MenusalesinvoiceEntity> findAllMenuSalesInvoice();

    //    List<MenusalesinvoiceEntity> findAllMenuSalesInvoiceByDateToday() throws ParseException;
    List<MenusalesinvoiceEntity> findAllMenuSalesInvoiceByDatePeriod(int location, String StartingDate, String EndingDate);

    String saveMenuSalesInvoice(MenusalesinvoiceEntity menusalesinvoiceEntity);

    int saveMenuSalesInvoiceReturnID(MenusalesinvoiceEntity menusalesinvoiceEntity);

    String updateMenuSalesInvoice(MenusalesinvoiceEntity menusalesinvoiceEntity);

    MenusalesinvoiceEntity findById(int id);

    long count();

    String TableHeadpendingallorderInvoiceByHeadId(MenuSalesInvoiceCreatingRequest salesInvoiceCreatingRequest);

    String deleteById(int id);
}