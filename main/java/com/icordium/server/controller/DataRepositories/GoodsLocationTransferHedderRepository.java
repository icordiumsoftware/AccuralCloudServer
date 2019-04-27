package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.LocationtranferhedderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ISH on 3/14/2019.
 */
@Repository
public interface GoodsLocationTransferHedderRepository extends JpaRepository<LocationtranferhedderEntity, Integer> {

    List<LocationtranferhedderEntity> findByStatus(int Status);
}
