package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.PendingAlertListRepository;
import com.icordium.server.controller.DataService.PendingAlertListService;
import com.icordium.server.controller.datamodel.PendingalertlistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingAlertListServiceImpl implements PendingAlertListService {
    @Autowired
    private PendingAlertListRepository pendingAlertListRepository;

    @Override
    public List<PendingalertlistEntity> findAllPendingAlerts() {
        return pendingAlertListRepository.findAll();
    }

    @Override
    public List<PendingalertlistEntity> findAllActivePendingAlerts() {
        return pendingAlertListRepository.findByStatus(1);
    }

    @Override
    public List<PendingalertlistEntity> findPendingAlerts(int status, int locatioid, int type) {
        return pendingAlertListRepository.findByStatusAndLocationIdlocationAndType(status, locatioid, type);
    }

    @Override
    public String savePendingAlert(PendingalertlistEntity pendingalertlistEntity) {
        pendingAlertListRepository.save(pendingalertlistEntity);
        pendingAlertListRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + pendingalertlistEntity.getIdpendingalertlist() + "\"}";
    }

    @Override
    public String updatePendingAlert(PendingalertlistEntity pendingalertlistEntity) {
        if (pendingalertlistEntity.getIdpendingalertlist() != 0) {
            pendingAlertListRepository.save(pendingalertlistEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public PendingalertlistEntity findById(int id) {
        return pendingAlertListRepository.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        pendingAlertListRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}