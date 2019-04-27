package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.PendingalertlistEntity;

import java.util.List;

public interface PendingAlertListService {
    List<PendingalertlistEntity> findAllPendingAlerts();

    List<PendingalertlistEntity> findAllActivePendingAlerts();

    List<PendingalertlistEntity> findPendingAlerts(int status, int locatioid, int type);

    String savePendingAlert(PendingalertlistEntity pendingalertlistEntity);

    String updatePendingAlert(PendingalertlistEntity pendingalertlistEntity);

    PendingalertlistEntity findById(int id);

    String deleteById(int id);
}