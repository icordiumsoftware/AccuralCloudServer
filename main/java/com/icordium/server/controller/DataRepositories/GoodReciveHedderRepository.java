package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.GoodrevicehedderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodReciveHedderRepository extends JpaRepository<GoodrevicehedderEntity, Integer> {
    List<GoodrevicehedderEntity> findByTransactionIdtransactionIsNull();

    List<GoodrevicehedderEntity> findByStatus(int status);
}