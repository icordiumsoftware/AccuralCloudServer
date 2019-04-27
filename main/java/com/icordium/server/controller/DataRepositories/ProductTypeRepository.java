package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.ProducttypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ISH on 8/30/2018.
 */
@Repository
public interface ProductTypeRepository extends JpaRepository<ProducttypeEntity, Integer> {
    List<ProducttypeEntity> findByStatus(int status);
}
