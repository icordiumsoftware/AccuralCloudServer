package com.icordium.server.controller.ReportService.Impl;

import com.icordium.server.controller.CustomResultDTO.MenuInvoice;
import com.icordium.server.controller.CustomResultDTO.MenuInvoiceItems;
import com.icordium.server.controller.DataService.MenuSalesInvoiceService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.ReportService.MenuSalesReportService;
import com.icordium.server.controller.datamodel.MenusalesinvoiceEntity;
import com.icordium.server.controller.datamodel.MenusalesitemsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ISH on 3/27/2019.
 */
@Service
public class MenuSalesReportServiceImpl implements MenuSalesReportService {
    @Autowired
    private MenuSalesInvoiceService menuSalesInvoiceService;

    @Override
    public MenuInvoice getMenuInvoiceData(String tableheadid) {
        MenuInvoice menuInvoice = new MenuInvoice();
        MenusalesinvoiceEntity menusalesinvoiceEntity = menuSalesInvoiceService.findById(DataTypeValidator.parseInt(tableheadid));

        ArrayList<MenuInvoiceItems> MenuInvoiceItemsList = new ArrayList<>();
        for (MenusalesitemsEntity menusalesitemsEntity :
                menusalesinvoiceEntity.getMenusalesitemssByIdmenusalesinvoice()) {
            MenuInvoiceItems menuInvoiceItems = new MenuInvoiceItems();
            menuInvoiceItems.setId(menusalesitemsEntity.getMenuitemIdmenuitem());
            menuInvoiceItems.setItemName(menusalesitemsEntity.getMenuitemByMenuitemIdmenuitem().getMenuitem());
            menuInvoiceItems.setQty(menusalesitemsEntity.getQty());
            menuInvoiceItems.setRowtotal(menusalesitemsEntity.getSaleamount());
            MenuInvoiceItemsList.add(menuInvoiceItems);
            menuInvoice.setTotal(menusalesinvoiceEntity.getGrossamount() + menuInvoiceItems.getRowtotal());
        }
        menuInvoice.setInvoiceItemsList(MenuInvoiceItemsList);
        menuInvoice.setSubTotal(menusalesinvoiceEntity.getGrossamount());
//        menuInvoice.setTotal(menusalesinvoiceEntity.getGrossamount());
        menuInvoice.setTendered(menusalesinvoiceEntity.getTender());
        menuInvoice.setEmployee((menusalesinvoiceEntity.getEmployeeByEmployeeIdemployee() != null ? menusalesinvoiceEntity.getEmployeeByEmployeeIdemployee().getFistname() : null));
        menuInvoice.setCashier((menusalesinvoiceEntity.getUsersByUsersIdusers() != null ? menusalesinvoiceEntity.getUsersByUsersIdusers().getEmployeeByEmployeeIdemployee().getFistname() : null));
        menuInvoice.setHeadID(menusalesinvoiceEntity.getTableheadsByTableheadsIdtableheads().getTableheadsname());
        menuInvoice.setTableID(menusalesinvoiceEntity.getTableheadsByTableheadsIdtableheads().getTablesByTablesIdtables().getTablesName());
        menuInvoice.setLogo(menusalesinvoiceEntity.getLocationByLocationIdlocation().getLogo());
        menuInvoice.setLogoStatus("1");
        menuInvoice.setAddress(menusalesinvoiceEntity.getLocationByLocationIdlocation().getAdress());
        menuInvoice.setTPLINE(menusalesinvoiceEntity.getLocationByLocationIdlocation().getTpno());
        menuInvoice.setCurrencyType(menusalesinvoiceEntity.getLocationByLocationIdlocation().getCurrencytype());
        menuInvoice.setInvoiceTypeName("----* Sale Invoice *----");

        return menuInvoice;
    }
}