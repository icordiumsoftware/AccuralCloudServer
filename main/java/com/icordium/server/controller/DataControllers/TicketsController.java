package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.TicketsService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.TicketsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ISH on 2/14/2019.
 */

@RestController
@RequestMapping("/tickets")
public class TicketsController {
    @Autowired
    private TicketsService ticketsService;

    @GetMapping("/all")
    public List<TicketsEntity> allTablesHeadsOrders() {
        return ticketsService.findAllTicketsEntity();
    }

    @GetMapping("/ticketsbyorder/{orderid}")
    public List<TicketsEntity> allTablesHeadsOrderbyheadidandstatus(@PathVariable(value = "orderid") String orderid) {
        return ticketsService.findAllTicketsEntityByOrderid(DataTypeValidator.parseInt(orderid));
    }

    @GetMapping("/ticketsbyHead/{headid}")
    public List<TicketsEntity> TablesHeadByTickets(@PathVariable(value = "headid") String headid) {
        return ticketsService.findAllTicketsEntityByOrderid(DataTypeValidator.parseInt(headid));
    }

    @PostMapping("/add")
    public String addTable(@RequestBody TicketsEntity areasEntity) {
        return ticketsService.saveTickets(areasEntity);
    }

    @PutMapping("/update")
    public String updateTable(@RequestBody TicketsEntity locationEntity) {
        return ticketsService.updateTickets(locationEntity);
    }

    @PutMapping("/update/{id}/qty/{qty}")
    public String updateQtyTickets(@PathVariable("id") String id, @PathVariable("qty") String qty) {
        TicketsEntity ticketsEntity = ticketsService.findById(DataTypeValidator.parseInt(id));
        ticketsEntity.setQty(DataTypeValidator.parseDouble(qty));
        return ticketsService.updateTickets(ticketsEntity);
    }

    @GetMapping("/changestatus/{id}")
    public String updateStatusTable(@PathVariable String id) {
        TicketsEntity tablesEntity = ticketsService.findById(DataTypeValidator.parseInt(id));
        tablesEntity.setStatus((tablesEntity.getStatus() == 1 ? 0 : 1));
        return ticketsService.updateTickets(tablesEntity);
    }

    @GetMapping("/find/{id}")
    public TicketsEntity getTableById(@PathVariable String id) {
        return ticketsService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteTablebyId(@PathVariable String id) {
        return ticketsService.deleteById(DataTypeValidator.parseInt(id));
    }
}