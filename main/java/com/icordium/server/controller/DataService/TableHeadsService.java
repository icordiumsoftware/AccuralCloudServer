package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.TableheadsEntity;

import java.util.List;

public interface TableHeadsService {
    List<TableheadsEntity> findAllTableHeads();

    List<TableheadsEntity> findAllTableHeadsByTableId(int status, int tableid);

    String saveTableHeads(TableheadsEntity tableheadsEntity);

    String updateTableHeads(TableheadsEntity tableheadsEntity);

    TableheadsEntity findById(int id);

    String deleteById(int id);
}