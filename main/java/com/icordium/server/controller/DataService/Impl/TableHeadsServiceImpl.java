package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.TableHeadsRepository;
import com.icordium.server.controller.DataService.TableHeadsService;
import com.icordium.server.controller.datamodel.TableheadsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableHeadsServiceImpl implements TableHeadsService {
    @Autowired
    private TableHeadsRepository tableHeadsRepository;

    @Override
    public List<TableheadsEntity> findAllTableHeads() {
        return tableHeadsRepository.findAll();
    }

    @Override
    public List<TableheadsEntity> findAllTableHeadsByTableId(int status, int tableid) {
        return tableHeadsRepository.findByTablesIdtablesAndStatus(tableid, status);
    }

    @Override
    public String saveTableHeads(TableheadsEntity tableheadsEntity) {
        tableHeadsRepository.save(tableheadsEntity);
        tableHeadsRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + tableheadsEntity.getIdtableheads() + "\"}";
    }

    @Override
    public String updateTableHeads(TableheadsEntity tableheadsEntity) {
        if (tableheadsEntity.getIdtableheads() != 0) {
            tableHeadsRepository.save(tableheadsEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TableheadsEntity findById(int id) {
        return tableHeadsRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        tableHeadsRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}