package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.TableRepository;
import com.icordium.server.controller.DataService.TableService;
import com.icordium.server.controller.datamodel.TablesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TableRepository tableRepository;

    @Override
    public List<TablesEntity> findAllTable() {
        return tableRepository.findAll();
    }

    @Override
    public List<TablesEntity> findAllTableByArea(int areaid, int status) {
        return tableRepository.findByAreasIdareasAndStatus(areaid, status);
    }

    @Override
    public String saveTable(TablesEntity tablesEntity) {
        tableRepository.save(tablesEntity);
        tableRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + tablesEntity.getIdtables() + "\"}";
    }

    @Override
    public String updateTable(TablesEntity tablesEntity) {
        if (tablesEntity.getIdtables() != 0) {
            tableRepository.save(tablesEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TablesEntity findById(int id) {
        return tableRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        tableRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}