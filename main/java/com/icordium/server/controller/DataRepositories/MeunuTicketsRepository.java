package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.TicketsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeunuTicketsRepository extends JpaRepository<TicketsEntity, Integer> {
    List<TicketsEntity> findByTableheadsorderIdtableheadsorderAndStatus(int tableheadorderid, int status);

    @Query(value = "SELECT t.idtickets,t.ticketype as ticketype,tableheadsorder_idtableheadsorder,t.menuitem_idmenuitem as menuitem_idmenuitem ,SUM(t.qty) as qty,SUM(t.freeqty) as freeqty,t.`status` as `status`,t.regdatetime as regdatetime FROM tickets as t LEFT JOIN tableheadsorder as tod on t.tableheadsorder_idtableheadsorder=tod.idtableheadsorder WHERE tod.tableheads_idtableheads=?1 GROUP BY t.menuitem_idmenuitem", nativeQuery = true)
    List<TicketsEntity> findByTableheadsorderIdtableheadsorder(int tableheadorderid);

    @Query(value = "SELECT t.idtickets,t.ticketype as ticketype,tableheadsorder_idtableheadsorder,t.menuitem_idmenuitem as menuitem_idmenuitem ,SUM(t.qty) as qty,SUM(t.freeqty) as freeqty,t.`status` as `status`,t.regdatetime as regdatetime FROM tickets as t LEFT JOIN tableheadsorder as tod on t.tableheadsorder_idtableheadsorder=tod.idtableheadsorder WHERE tod.tableheads_idtableheads=?1 AND t.status=?2 GROUP BY t.menuitem_idmenuitem", nativeQuery = true)
    List<TicketsEntity> findByTableheadsorderIdtableheadsorder(int tableheadorderid, int status);
}