package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.TableheadsorderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ISH on 2/10/2019.
 */
@Repository
public interface TableHeadOrderRepository extends JpaRepository<TableheadsorderEntity, Integer> {
    List<TableheadsorderEntity> findByTableheadsIdtableheadsAndOrderstatus(int tableheadid, int status);
    List<TableheadsorderEntity> findByOrderstatusAndLocationIdlocation(int OrderStatus,int idLocation);

    List<TableheadsorderEntity> findByTableheadsIdtableheadsAndOrderstatusIsLessThan(int tableheadid, int status);
}