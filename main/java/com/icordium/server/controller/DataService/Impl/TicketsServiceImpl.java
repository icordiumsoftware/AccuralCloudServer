package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.MeunuTicketsRepository;
import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import com.icordium.server.controller.datamodel.TicketsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsServiceImpl implements TicketsService {
    @Autowired
    TableHeadsOrderService tableHeadsOrderService;
    @Autowired
    private MeunuTicketsRepository meunuTicketsRepository;
    @Autowired
    private MenuItemService menuItemService;
    @Autowired
    private TableHeadsService tableHeadsService;
    @Autowired
    private TableService tableService;

    @Override
    public List<TicketsEntity> findAllTicketsEntity() {
        return meunuTicketsRepository.findAll();
    }

    @Override
    public List<TicketsEntity> findAllTicketsEntityBytableheadid(int tableheadid, int status) {
//        List<TableheadsorderEntity> allActiveTableHeadsOrders = tableHeadsOrderService.findAllActiveTableHeadsOrders(tableid);
//        List<TicketsEntity> ticketsEntities=new ArrayList<>();
//        for (TableheadsorderEntity tableheadsorderEntity :
//                allActiveTableHeadsOrders) {
//            for (TicketsEntity ticketsEntity:tableheadsorderEntity.getTicketssByIdtableheadsorder()
//                 ) {
//
//            ticketsEntities.add(ticketsEntity);
//            }
//        }
//        return ticketsEntities;
        return meunuTicketsRepository.findByTableheadsorderIdtableheadsorder(tableheadid, status);
    }

    @Override
    public List<TicketsEntity> findAllTicketsEntityByOrderid(int orderid) {
        return (List<TicketsEntity>) tableHeadsOrderService.findById(orderid).getTicketssByIdtableheadsorder();
    }

    @Override
    public String saveTickets(TicketsEntity ticketsEntity) {
        Integer ordertype = menuItemService.findById(ticketsEntity.getMenuitemIdmenuitem()).getOrdertype();
        ticketsEntity.setTicketype(ordertype);
        meunuTicketsRepository.save(ticketsEntity);
        meunuTicketsRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + ticketsEntity.getIdtickets() + "\"}";
    }

    @Override
    public String updateTickets(TicketsEntity ticketsEntity) {
        if (ticketsEntity.getIdtickets() != 0) {
            meunuTicketsRepository.save(ticketsEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public TicketsEntity findById(int id) {
        return meunuTicketsRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        TableheadsorderEntity idtableheadsorder = meunuTicketsRepository.getOne(id).getTableheadsorderByTableheadsorderIdtableheadsorder();
        meunuTicketsRepository.deleteById(id);
        int size = idtableheadsorder.getTicketssByIdtableheadsorder().size();
        if (size == 0) {
            tableHeadsOrderService.deleteById(idtableheadsorder.getIdtableheadsorder());
        }
        return "{\"status\":\"success\"}";
    }
}