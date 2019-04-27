package com.icordium.server.controller.DataService;


import com.icordium.server.controller.datamodel.TicketsEntity;

import java.util.List;

public interface TicketsService {
    List<TicketsEntity> findAllTicketsEntity();

    List<TicketsEntity> findAllTicketsEntityBytableheadid(int tableid, int status);

    List<TicketsEntity> findAllTicketsEntityByOrderid(int orderid);

    String saveTickets(TicketsEntity ticketsEntity);

    String updateTickets(TicketsEntity ticketsEntity);

    TicketsEntity findById(int id);

    String deleteById(int id);
}