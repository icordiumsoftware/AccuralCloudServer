package com.icordium.server.controller.DataControllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icordium.server.controller.CustomResultDTO.MenuSalesInvoiceCreatingRequest;
import com.icordium.server.controller.DataService.MenuSalesInvoiceService;
import com.icordium.server.controller.DataService.TableHeadsOrderService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by ISH on 2/10/2019.
 */

@RestController
@RequestMapping("/tablesheadsorder")
public class TableHeadsOrderController {
    @Autowired
    private TableHeadsOrderService tableHeadsOrderService;
    @Autowired
    private MenuSalesInvoiceService menuSalesInvoiceService;

    @GetMapping("/all")
    public List<TableheadsorderEntity> allTablesHeadsOrders() {
        return tableHeadsOrderService.findAllTableHeadsOrders();
    }

    @GetMapping("/tablehead/{idtablehead}/status/{status}")
    public List<TableheadsorderEntity> allTablesHeadsOrderbyheadidandstatus(@PathVariable(value = "idtablehead") String idtablehead, @PathVariable(value = "status") String status) {
        return tableHeadsOrderService.findAllActiveTableHeadsOrders(DataTypeValidator.parseInt(idtablehead), DataTypeValidator.parseInt(status));
    }

    @PostMapping("/add")
    public String addTable(@RequestBody TableheadsorderEntity areasEntity) {
        return tableHeadsOrderService.saveTableHeadsOrders(areasEntity);
    }

    @PutMapping("/update")
    public String updateTable(@RequestBody TableheadsorderEntity locationEntity) {
        return tableHeadsOrderService.updateTableHeadsOrders(locationEntity);
    }

    @GetMapping("/pendingordersbytableid/{id}")
    public List<TableheadsorderEntity> pendingOrderTableList(@PathVariable String id) {

        return tableHeadsOrderService.findAllActiveTableHeadsOrders(DataTypeValidator.parseInt(id));
    }
    @GetMapping("/pendingorders/{locid}")
    public List<TableheadsorderEntity> pendingOrders(@PathVariable("locid") String locid) {

        return tableHeadsOrderService.findAllPendingTableHeadsOrders(locid);
    }

    @GetMapping("/changestatus/{id}")
    public String updateStatusTable(@PathVariable String id) {
        TableheadsorderEntity tablesEntity = tableHeadsOrderService.findById(DataTypeValidator.parseInt(id));
        tablesEntity.setOrderstatus((tablesEntity.getOrderstatus() == 1 ? 0 : 1));
        return tableHeadsOrderService.updateTableHeadsOrders(tablesEntity);
    }

    @PostMapping("/createMenuSalesInvoice")
    public String createMenuSalesInvoice(@RequestBody String json, HttpServletRequest httpServletRequest) throws JSONException, IOException {
        int workShiftID = DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID"));
        int UserID = DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("userid"));
        ObjectMapper objectMapper = new ObjectMapper();
        MenuSalesInvoiceCreatingRequest creatingRequest = objectMapper.readValue(json, MenuSalesInvoiceCreatingRequest.class);
        creatingRequest.setWorkPeriodID(workShiftID);
        System.out.println(workShiftID + "--");
        creatingRequest.setUserid(UserID);
        return menuSalesInvoiceService.TableHeadpendingallorderInvoiceByHeadId(creatingRequest);
    }

    @GetMapping("/find/{id}")
    public TableheadsorderEntity getTableById(@PathVariable String id) {
        return tableHeadsOrderService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteTablebyId(@PathVariable String id) {
        return tableHeadsOrderService.deleteById(DataTypeValidator.parseInt(id));
    }
}