package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentoutedhedderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DispatchRentoutedHedderRepository extends JpaRepository<RentoutedhedderEntity, Integer> {
    //    @Query(value = "SELECT * FROM Rentoutedhedder s WHERE s.location_idlocation=?2 AND s.status =?1 ORDER BY s.returndatetime ASC", nativeQuery = true)
    List<RentoutedhedderEntity> findAllByStatusAndLocationIdlocationOrderByReturndatetimeAsc(int status, int locationIdlocation);

    long countByStatus(int status);
}