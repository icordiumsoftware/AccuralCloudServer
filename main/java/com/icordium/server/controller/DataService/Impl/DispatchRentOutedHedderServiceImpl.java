package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.DispatchRentoutedHedderRepository;
import com.icordium.server.controller.DataService.DispatchRentOutedHedderService;
import com.icordium.server.controller.datamodel.RentoutedhedderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DispatchRentOutedHedderServiceImpl implements DispatchRentOutedHedderService {
    @Autowired
    private DispatchRentoutedHedderRepository dispatchRentoutedHedderRepository;

    @Override
    public List<RentoutedhedderEntity> findAllPendingRentoutedhedders(int status, int locationIdlocation) {
        List<RentoutedhedderEntity> lsit = dispatchRentoutedHedderRepository.findAllByStatusAndLocationIdlocationOrderByReturndatetimeAsc(status, locationIdlocation);

        ArrayList<RentoutedhedderEntity> returnlsit = new ArrayList<RentoutedhedderEntity>();

        for (RentoutedhedderEntity entity :
                lsit) {
            if (entity.getStatus() == 1) {
                returnlsit.add(entity);
            }
        }
        return returnlsit;
    }

    @Override
    public List<RentoutedhedderEntity> findAllRentoutedhedders() {
        return dispatchRentoutedHedderRepository.findAll();
    }

    @Override
    public String saveRentoutedhedders(RentoutedhedderEntity rentoutedhedderEntity) {
        dispatchRentoutedHedderRepository.save(rentoutedhedderEntity);
        dispatchRentoutedHedderRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + rentoutedhedderEntity.getIdrentoutedhedder() + "\"}";
    }

    @Override
    public String updateRentoutedhedders(RentoutedhedderEntity rentoutedhedderEntity) {
        if (rentoutedhedderEntity.getIdrentoutedhedder() != 0) {
            RentoutedhedderEntity update = dispatchRentoutedHedderRepository.save(rentoutedhedderEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public long pendingRentalcount() {
        return dispatchRentoutedHedderRepository.countByStatus(1);
    }

    @Override
    public RentoutedhedderEntity findById(int id) {
        return dispatchRentoutedHedderRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        dispatchRentoutedHedderRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}