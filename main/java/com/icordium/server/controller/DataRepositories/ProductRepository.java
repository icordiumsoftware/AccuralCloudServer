package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    long count();

    long countByRentingstatus(int rentingstatus);
}
