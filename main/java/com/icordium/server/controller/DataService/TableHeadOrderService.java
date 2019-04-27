package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.TableheadsorderEntity;

import java.util.List;

/**
 * Created by ISH on 2/10/2019.
 */
public interface TableHeadOrderService {
    List<TableheadsorderEntity> findAllTableHeadOrder();

    List<TableheadsorderEntity> findAllTableHeadOrderByHeadsAndStatus();

    String saveTableHeadOrder(TableheadsorderEntity tableheadsorderEntity);

    String updateTableHeadOrder(TableheadsorderEntity tableheadsorderEntity);

    TableheadsorderEntity findById(int id);

    String deleteById(int id);
}