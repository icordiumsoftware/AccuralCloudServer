package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.CustomResultDTO.MenuSalesInvoiceCreatingRequest;
import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataRepositories.MenuSalesInvoiceRepository;
import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.datamodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MenuSalesInvoiceServiceImpl implements MenuSalesInvoiceService {
    @Autowired
    private MenuSalesInvoiceRepository menuSalesInvoiceRepository;
    @Autowired
    private MenuSalesInvoiceService menuSalesInvoiceService;
    @Autowired
    private MenuSalesItemService menuSalesItemService;
    @Autowired
    private TicketsService ticketsService;
    @Autowired
    private TableHeadsOrderService headsOrderService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private WorkPeriodService workPeriodService;
    @Autowired
    private TradeService tradeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TableHeadsService tableHeadsService;
    @Autowired
    private TableService tableService;

    @Override
    public List<MenusalesinvoiceEntity> findAllMenuSalesInvoice() {
        return menuSalesInvoiceRepository.findAll();
    }

//    @Override
//    public List<MenusalesinvoiceEntity> findAllMenuSalesInvoiceByDateToday() throws ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        String format = dateFormat.format(new Date());
//        Date parse = dateFormat.parse(format);
//        return menuSalesInvoiceRepository.findByDatetimeBefore(parse);
//    }

    @Override
    public List<MenusalesinvoiceEntity> findAllMenuSalesInvoiceByDatePeriod(int Location, String StartingDate, String EndingDate) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date from = format.parse(StartingDate);
            Date to = DataGenerator.addHoursToJavaUtilDate(format.parse(EndingDate), 24);
//            return menuSalesInvoiceRepository.findByLocationiAndDatetimeBetween(Location,from,to);
            return menuSalesInvoiceRepository.findByLocationIdlocationAndDatetimeBetweenOrderByDatetimeAsc(Location, from, to);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String saveMenuSalesInvoice(MenusalesinvoiceEntity menusalesinvoiceEntity) {
        menuSalesInvoiceRepository.save(menusalesinvoiceEntity);
        menuSalesInvoiceRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + menusalesinvoiceEntity.getIdmenusalesinvoice() + "\"}";
    }

    @Override
    public int saveMenuSalesInvoiceReturnID(MenusalesinvoiceEntity menusalesinvoiceEntity) {
        menuSalesInvoiceRepository.save(menusalesinvoiceEntity);
        menuSalesInvoiceRepository.flush();
        return menusalesinvoiceEntity.getIdmenusalesinvoice();
    }

    @Override
    public String updateMenuSalesInvoice(MenusalesinvoiceEntity menusalesinvoiceEntity) {
        if (menusalesinvoiceEntity.getIdmenusalesinvoice() != 0) {
            menuSalesInvoiceRepository.save(menusalesinvoiceEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenusalesinvoiceEntity findById(int id) {
        return menuSalesInvoiceRepository.getOne(id);
    }

    @Override
    public long count() {
        return menuSalesInvoiceRepository.count();
    }

    @Override
    public String TableHeadpendingallorderInvoiceByHeadId(MenuSalesInvoiceCreatingRequest salesInvoiceCreatingRequest) {

        MenusalesinvoiceEntity menusalesinvoiceEntity = new MenusalesinvoiceEntity();
        List<TableheadsorderEntity> allActiveTableHeadsOrders = headsOrderService.findAllActiveTableHeadsOrdersNotStatus(salesInvoiceCreatingRequest.getHeadid(), 2);

        List<TicketsEntity> ticketsEntityList = ticketsService.findAllTicketsEntityBytableheadid(salesInvoiceCreatingRequest.getHeadid(), 1);
        if (allActiveTableHeadsOrders.size() > 0 & ticketsEntityList.size() > 0) {
            if (salesInvoiceCreatingRequest.getCredit() > 0.00) {
                if (customerService.findById(salesInvoiceCreatingRequest.getCustomer()).getCreditallow() == 0) {

                    return "{\"status\":\"Not Credit Allowed Customer\"}";

                }
            }
            WorkshiftEntity workshiftEntity = workPeriodService.findById(salesInvoiceCreatingRequest.getWorkPeriodID());

            TableheadsorderEntity tableheadsorderEntity = allActiveTableHeadsOrders.get(0);
            /// SAVE MENU SALES INVOICE HEDDER
            menusalesinvoiceEntity.setUsersIdusers(salesInvoiceCreatingRequest.getUserid());
            if (tableheadsorderEntity.getEmployeeIdemployee() > 0) {
                menusalesinvoiceEntity.setEmployeeIdemployee(tableheadsorderEntity.getEmployeeIdemployee());
            }

            menusalesinvoiceEntity.setLocationIdlocation(tableheadsorderEntity.getLocationIdlocation());
            if (salesInvoiceCreatingRequest.getHeadid() > 0) {
                menusalesinvoiceEntity.setTableheadsIdtableheads(salesInvoiceCreatingRequest.getHeadid());
            }

            menusalesinvoiceEntity.setTender(salesInvoiceCreatingRequest.getTender());
            menusalesinvoiceEntity.setDatetime(new Timestamp(new Date().getTime()));
            menusalesinvoiceEntity.setDiscount(salesInvoiceCreatingRequest.getDiscount());
            menusalesinvoiceEntity.setWorkshiftIdworkshift(salesInvoiceCreatingRequest.getWorkPeriodID());
            if (salesInvoiceCreatingRequest.getCustomer() > 0) {
                menusalesinvoiceEntity.setCustomersIdcustomers(salesInvoiceCreatingRequest.getCustomer());
            }
            /// TRANSACTIOBN SAVE
            TransactionEntity transactionEntity = new TransactionEntity();
            transactionEntity.setLocationIdlocation(tableheadsorderEntity.getLocationIdlocation());
            transactionEntity.setTransactiontype("40");
            transactionEntity.setTransactiondescription("Menu Sales Inoice");
            transactionEntity.setRegdatetime(new Timestamp(new Date().getTime()));
            int transactionReturnid = transactionService.saveSystemTransactionReturnid(transactionEntity);
            menusalesinvoiceEntity.setTransactionIdtransaction(transactionReturnid);
            /// TRANSACTIOBN SAVE
            int saveMenuSalesInvoiceReturnID = menuSalesInvoiceService.saveMenuSalesInvoiceReturnID(menusalesinvoiceEntity);
            menusalesinvoiceEntity = menuSalesInvoiceService.findById(saveMenuSalesInvoiceReturnID);
            /// SAVE MENU SALES INVOICE HEDDER
            for (TicketsEntity ticketsEntity :
                    ticketsEntityList) {

                MenusalesitemsEntity menusalesitemsEntity = new MenusalesitemsEntity();
                menusalesitemsEntity.setMenusalesinvoiceIdmenusalesinvoice(menusalesinvoiceEntity.getIdmenusalesinvoice());
                menusalesitemsEntity.setMenuitemIdmenuitem(ticketsEntity.getMenuitemIdmenuitem());
                menusalesitemsEntity.setDiscount(0.00);
                double rowcosttotal = ticketsEntity.getMenuitemByMenuitemIdmenuitem().getCostprice() * ticketsEntity.getQty();
                menusalesitemsEntity.setCostamount(rowcosttotal);
                menusalesitemsEntity.setQty(ticketsEntity.getQty());
                double rowseltotal = ticketsEntity.getMenuitemByMenuitemIdmenuitem().getSelligprice() * ticketsEntity.getQty();
                menusalesitemsEntity.setSaleamount(rowseltotal);
                menuSalesItemService.saveMenusalesitems(menusalesitemsEntity);
                //Menu Sales Product HIstory AND Product Table Data AutoFilled

                menusalesinvoiceEntity.setGrossamount(menusalesinvoiceEntity.getGrossamount() + rowseltotal);
                menusalesinvoiceEntity.setSalesamount(menusalesinvoiceEntity.getSalesamount() + rowseltotal);
                menusalesinvoiceEntity.setCostamount(menusalesinvoiceEntity.getCostamount() + rowcosttotal);

            }
            menuSalesInvoiceService.updateMenuSalesInvoice(menusalesinvoiceEntity);
            workshiftEntity.setSalesamount(workshiftEntity.getSalesamount() + menusalesinvoiceEntity.getSalesamount());
            workshiftEntity.setDiscount(workshiftEntity.getDiscount() + menusalesinvoiceEntity.getDiscount());
// Trade Save
            TradeEntity tradeEntity = new TradeEntity();
            tradeEntity.setUsersIdusers(salesInvoiceCreatingRequest.getUserid());
            tradeEntity.setLocationIdlocation(menusalesinvoiceEntity.getLocationIdlocation());
            tradeEntity.setWorkshiftIdworkshift(workshiftEntity.getIdworkshift());
            tradeEntity.setTransactionIdtransaction(transactionReturnid);
            if (menusalesinvoiceEntity.getTableheadsByTableheadsIdtableheads() != null) {
                tradeEntity.setDescription("MINV " + menusalesinvoiceEntity.getIdmenusalesinvoice() + "TBL " + menusalesinvoiceEntity.getTableheadsByTableheadsIdtableheads().getTablesIdtables() + " THD " + menusalesinvoiceEntity.getTableheadsIdtableheads());
            }
            tradeEntity.setRegdatetime(new Timestamp(new Date().getTime()));
            tradeEntity.setReferencetrade(transactionReturnid);
            tradeEntity.setAmount(menusalesinvoiceEntity.getSalesamount());
            tradeEntity.setPaidamount(menusalesinvoiceEntity.getSalesamount() - salesInvoiceCreatingRequest.getCredit());
            if (salesInvoiceCreatingRequest.getCustomer() > 0) {
                tradeEntity.setAccountno(salesInvoiceCreatingRequest.getCustomer());
            }
            tradeEntity.setType(40);
            tradeService.saveTrade(tradeEntity);
            Timestamp timestamp = new Timestamp(new Date().getTime());
            for (TableheadsorderEntity entity :
                    allActiveTableHeadsOrders) {
                for (TicketsEntity ticketsEntity :
                        entity.getTicketssByIdtableheadsorder()) {
                    ticketsEntity.setStatus(2);
                    ticketsService.updateTickets(ticketsEntity);
                }
                entity.setEndtime(timestamp);
                entity.setOrderstatus(2);
                headsOrderService.updateTableHeadsOrders(entity);

                TablesEntity tablesEntity = tableService.findById(tableheadsorderEntity.getTableheadsByTableheadsIdtableheads().getTablesIdtables());
                tablesEntity.setPending(-1 + tablesEntity.getPending());
                tableService.updateTable(tablesEntity);
            }
            workPeriodService.updateWorkshift(workshiftEntity);
            TableheadsEntity tableheadsEntity = tableHeadsService.findById(tableheadsorderEntity.getTableheadsIdtableheads());
            tableheadsEntity.setPending(0);
            tableHeadsService.updateTableHeads(tableheadsEntity);


        } else {
            return "{\"status\":\"warring\"}";
        }
        return "{\"status\":\"success\",\"id\":" + menusalesinvoiceEntity.getIdmenusalesinvoice() + "}";
    }

    @Override
    public String deleteById(int id) {
        menuSalesInvoiceRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}