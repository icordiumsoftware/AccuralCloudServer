package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.TableHeadOrderRepository;
import com.icordium.server.controller.DataService.TableHeadsOrderService;
import com.icordium.server.controller.DataService.TableHeadsService;
import com.icordium.server.controller.DataService.TableService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.TableheadsEntity;
import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import com.icordium.server.controller.datamodel.TablesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by ISH on 2/10/2019.
 */
@Service
public class TableHeadsOrderServiceImpl implements TableHeadsOrderService {
    @Autowired
    private TableHeadOrderRepository headOrderRepository;
    @Autowired
    private TableHeadsService tableHeadsService;
    @Autowired
    private TableService tableService;

    @Override
    public List<TableheadsorderEntity> findAllTableHeadsOrders() {
        return headOrderRepository.findAll();
    }

    @Override
    public List<TableheadsorderEntity> findAllPendingTableHeadsOrders(String locid) {
        return headOrderRepository.findByOrderstatusAndLocationIdlocation(1, DataTypeValidator.parseInt(locid));
    }

    @Override
    public List<TableheadsorderEntity> findAllActiveTableHeadsOrders(int tableheadsid, int status) {
        return headOrderRepository.findByTableheadsIdtableheadsAndOrderstatus(tableheadsid, status);
    }

    @Override
    public List<TableheadsorderEntity> findAllActiveTableHeadsOrdersNotStatus(int tableheadsid, int status) {
        return headOrderRepository.findByTableheadsIdtableheadsAndOrderstatusIsLessThan(tableheadsid, status);
    }

    @Override
    public List<TableheadsorderEntity> findAllActiveTableHeadsOrders(int tableheadsid) {
        return headOrderRepository.findByTableheadsIdtableheadsAndOrderstatus(tableheadsid, 1);
    }

    @Override
    public String saveTableHeadsOrders(TableheadsorderEntity tableheadsorderEntity) {
        tableheadsorderEntity.setStarttime(new Timestamp(new Date().getTime()));
//        tableheadsorderEntity.setLocationIdlocation(tableHeadsService.findById(tableheadsorderEntity.getTableheadsIdtableheads()).getTablesByTablesIdtables().getAreasByAreasIdareas().getLocationByLocationIdlocation().getIdlocation());
        headOrderRepository.save(tableheadsorderEntity);
        headOrderRepository.flush();
        try {
            TableheadsEntity tableheadsEntity = tableHeadsService.findById(tableheadsorderEntity.getTableheadsIdtableheads());
            tableheadsEntity.setPending(1 + tableheadsEntity.getPending());
            tableHeadsService.updateTableHeads(tableheadsEntity);

            TablesEntity tablesEntity = tableService.findById(tableheadsEntity.getTablesIdtables());
            tablesEntity.setPending(1 + tablesEntity.getPending());
            tableService.updateTable(tablesEntity);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return "{\"status\":\"success\",\"id\":\"" + tableheadsorderEntity.getIdtableheadsorder() + "\"}";
    }

    @Override
    public String updateTableHeadsOrders(TableheadsorderEntity tableheadsorderEntity) {
        if (tableheadsorderEntity.getIdtableheadsorder() != 0) {
            headOrderRepository.save(tableheadsorderEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public String EndTableHeadsOrdersStatus(int tableheadsid, int status) {
        if (tableheadsid != 0) {
            TableheadsorderEntity tableheadsorderEntity = headOrderRepository.getOne(tableheadsid);
            tableheadsorderEntity.setEndtime(new Timestamp(new Date().getTime()));
            tableheadsorderEntity.setOrderstatus(status);
            headOrderRepository.save(tableheadsorderEntity);
            try {
                TableheadsEntity tableheadsEntity = tableHeadsService.findById(tableheadsorderEntity.getTableheadsIdtableheads());
                tableheadsEntity.setPending(-1 + tableheadsEntity.getPending());
                tableHeadsService.updateTableHeads(tableheadsEntity);

                TablesEntity tablesEntity = tableService.findById(tableheadsorderEntity.getTableheadsByTableheadsIdtableheads().getTablesIdtables());
                tablesEntity.setPending(-1 + tablesEntity.getPending());
                tableService.updateTable(tablesEntity);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TableheadsorderEntity findById(int id) {
        return headOrderRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        TableheadsorderEntity tableheadsorderEntity = headOrderRepository.getOne(id);
        try {
            TableheadsEntity tableheadsEntity = tableHeadsService.findById(tableheadsorderEntity.getTableheadsIdtableheads());
            tableheadsEntity.setPending(-1 + tableheadsEntity.getPending());
            tableHeadsService.updateTableHeads(tableheadsEntity);

            TablesEntity tablesEntity = tableService.findById(tableheadsorderEntity.getTableheadsByTableheadsIdtableheads().getTablesIdtables());
            tablesEntity.setPending(-1 + tablesEntity.getPending());
            tableService.updateTable(tablesEntity);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        headOrderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}