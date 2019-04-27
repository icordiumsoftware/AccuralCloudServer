package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.PendingAlertListService;
import com.icordium.server.controller.datamodel.PendingalertlistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertsController {
    @Autowired
    private PendingAlertListService pendingAlertListService;

    @GetMapping("/all")
    public List<PendingalertlistEntity> findAll() {
        return pendingAlertListService.findAllPendingAlerts();
    }

    @GetMapping("/allAlerts")
    public List<PendingalertlistEntity> findAllPending() {
        return pendingAlertListService.findAllPendingAlerts();
    }

    @GetMapping("/alerts/{locationid}/sms")
    public List<PendingalertlistEntity> findLocationAllPending(@PathVariable("locationid") int locationid) {
        return pendingAlertListService.findPendingAlerts(1, locationid, 1);
    }

    @GetMapping("sendedAlertsDeactive/{alertid}")
    public String sendedAlertDeactive(@PathVariable("alertid") int AlertID) {
        PendingalertlistEntity entity = pendingAlertListService.findById(AlertID);
        entity.setStatus(2);
        entity.setUpdateddate(new Timestamp(new Date().getTime()));
        pendingAlertListService.updatePendingAlert(entity);
        return "{\"status\":\"success\"}";
    }
}