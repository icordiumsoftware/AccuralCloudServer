package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.GoodrecivedataproductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodReciveDataProductRepository extends JpaRepository<GoodrecivedataproductEntity, Integer> {
    List<GoodrecivedataproductEntity> findByGoodrevicehedderIdgoodrevicehedder(int goodrevicehedderIdgoodrevicehedder);
}