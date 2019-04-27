package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.TablesEntity;

import java.util.List;

public interface TableService {
    List<TablesEntity> findAllTable();

    List<TablesEntity> findAllTableByArea(int areaid, int status);

    String saveTable(TablesEntity tablesEntity);

    String updateTable(TablesEntity tablesEntity);

    TablesEntity findById(int id);

    String deleteById(int id);
}