package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<StockEntity, Integer> {
    long countByQtyinhandEquals(double qtyinhand);

    StockEntity getByIdlocationAndIdproduct(int idlocation, int idproduct);

    List<StockEntity> findByIdlocation(int idlocation);
}