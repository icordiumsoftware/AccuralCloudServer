package com.icordium.server.controller.ReportService.Impl;

import com.icordium.server.controller.CustomResultDTO.MenuInvoice;
import com.icordium.server.controller.CustomResultDTO.MenuInvoiceItems;
import com.icordium.server.controller.DataService.TableHeadsOrderService;
import com.icordium.server.controller.DataService.TicketsService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.ReportService.TableHeadOrderReportService;
import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import com.icordium.server.controller.datamodel.TicketsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ISH on 3/27/2019.
 */
@Service
public class MenuInvoiceReportImpl implements TableHeadOrderReportService {
    @Autowired
    private TableHeadsOrderService headsOrderService;
    @Autowired
    private TicketsService ticketsService;

    @Override
    public MenuInvoice getMenuInvoiceData(String tableheadid) {
        MenuInvoice menuInvoice = new MenuInvoice();
        List<TableheadsorderEntity> allActiveTableHeadsOrders = headsOrderService.findAllActiveTableHeadsOrders(DataTypeValidator.parseInt(tableheadid));
        if (allActiveTableHeadsOrders.size() > 0) {
            TableheadsorderEntity tableheadsorderEntity = allActiveTableHeadsOrders.get(0);
            List<TicketsEntity> ticketsEntityList = ticketsService.findAllTicketsEntityBytableheadid(DataTypeValidator.parseInt(tableheadid), 1);
            ArrayList<MenuInvoiceItems> MenuInvoiceItemsList = new ArrayList<>();
            for (TicketsEntity ticketsEntity :
                    ticketsEntityList) {
                MenuInvoiceItems menuInvoiceItems = new MenuInvoiceItems();
                menuInvoiceItems.setId(ticketsEntity.getMenuitemIdmenuitem());
                menuInvoiceItems.setItemName(ticketsEntity.getMenuitemByMenuitemIdmenuitem().getMenuitem());
                menuInvoiceItems.setQty(ticketsEntity.getQty());
                double rowtotal = ticketsEntity.getMenuitemByMenuitemIdmenuitem().getSelligprice() * ticketsEntity.getQty();
                menuInvoiceItems.setRowtotal(rowtotal);
                MenuInvoiceItemsList.add(menuInvoiceItems);
                menuInvoice.setSubTotal(menuInvoice.getSubTotal() + rowtotal);
                menuInvoice.setTotal(menuInvoice.getTotal() + rowtotal);
            }
            menuInvoice.setInvoiceItemsList(MenuInvoiceItemsList);
            menuInvoice.setEmployee((tableheadsorderEntity.getEmployeeByEmployeeIdemployee() != null ? tableheadsorderEntity.getEmployeeByEmployeeIdemployee().getFistname() : null));
            menuInvoice.setCashier((tableheadsorderEntity.getUsersByUsersIdusers() != null ? tableheadsorderEntity.getUsersByUsersIdusers().getEmployeeByEmployeeIdemployee().getFistname() : null));
            menuInvoice.setHeadID(tableheadsorderEntity.getTableheadsByTableheadsIdtableheads().getTableheadsname());
            menuInvoice.setTableID(tableheadsorderEntity.getTableheadsByTableheadsIdtableheads().getTablesByTablesIdtables().getTablesName());
            menuInvoice.setLogo(tableheadsorderEntity.getLocationByLocationIdlocation().getLogo());
            menuInvoice.setLogoStatus("1");
            menuInvoice.setAddress(tableheadsorderEntity.getLocationByLocationIdlocation().getAdress());
            menuInvoice.setTPLINE(tableheadsorderEntity.getLocationByLocationIdlocation().getTpno());
            menuInvoice.setCurrencyType(tableheadsorderEntity.getLocationByLocationIdlocation().getCurrencytype());
            menuInvoice.setInvoiceTypeName("----* Order Summery *----");
        } else {
            throw new NullPointerException("Tickets List Data IS NUll !!!");
        }
        return menuInvoice;
    }
}