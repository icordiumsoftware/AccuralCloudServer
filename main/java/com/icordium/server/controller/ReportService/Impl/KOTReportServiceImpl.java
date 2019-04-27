package com.icordium.server.controller.ReportService.Impl;

import com.icordium.server.controller.CustomResultDTO.KOTDTO;
import com.icordium.server.controller.CustomResultDTO.KOTItems;
import com.icordium.server.controller.DataService.TableHeadsOrderService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.ReportService.KOTReportService;
import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import com.icordium.server.controller.datamodel.TicketsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ISH on 3/27/2019.
 */
@Service
public class KOTReportServiceImpl implements KOTReportService {

    @Autowired
    private TableHeadsOrderService headsOrderService;

    @Override
    public KOTDTO getKotReportData(String orderid) {
        TableheadsorderEntity entity = headsOrderService.findById(DataTypeValidator.parseInt(orderid));
        KOTDTO kotdto = new KOTDTO();
        kotdto.setTableHeads(entity.getTableheadsByTableheadsIdtableheads().getTableheadsname());
        kotdto.setTable(entity.getTableheadsByTableheadsIdtableheads().getTablesByTablesIdtables().getTablesName());
        kotdto.setArea(entity.getTableheadsByTableheadsIdtableheads().getTablesByTablesIdtables().getAreasByAreasIdareas().getAreasname());
        ArrayList<KOTItems> kotItemss = new ArrayList<>();
        for (TicketsEntity ticketsEntity : entity.getTicketssByIdtableheadsorder()) {
            if (ticketsEntity.getMenuitemByMenuitemIdmenuitem().getOrdertype() == 1) {
                KOTItems items = new KOTItems();
                items.setId(ticketsEntity.getIdtickets());
                items.setItemName(ticketsEntity.getMenuitemByMenuitemIdmenuitem().getMenuitem());
                items.setQty(ticketsEntity.getQty() + ticketsEntity.getFreeqty());
                items.setOrderType(ticketsEntity.getTicketype());
                kotItemss.add(items);
            }
        }
        kotdto.setKotItemss(kotItemss);
        return kotdto;
    }
}