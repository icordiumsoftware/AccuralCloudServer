package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.TableheadsorderEntity;

import java.util.List;

public interface TableHeadsOrderService {
    List<TableheadsorderEntity> findAllTableHeadsOrders();
    List<TableheadsorderEntity> findAllPendingTableHeadsOrders(String locaid);

    List<TableheadsorderEntity> findAllActiveTableHeadsOrders(int tableheadsid, int status);

    List<TableheadsorderEntity> findAllActiveTableHeadsOrdersNotStatus(int tableheadsid, int status);

    List<TableheadsorderEntity> findAllActiveTableHeadsOrders(int tableheadsid);

    String saveTableHeadsOrders(TableheadsorderEntity tableheadsorderEntity);

    String updateTableHeadsOrders(TableheadsorderEntity tableheadsorderEntity);

    String EndTableHeadsOrdersStatus(int tableheadsid, int status);

    TableheadsorderEntity findById(int id);

    String deleteById(int id);
}