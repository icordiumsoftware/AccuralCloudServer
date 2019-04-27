package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductHasMenuItemRepository extends JpaRepository<ProductHasMenuitemEntity, Integer> {
    List<ProductHasMenuitemEntity> findByMenuitemIdmenuitem(int idmenuitem);

    List<ProductHasMenuitemEntity> findByProductIdproduct(int idproduct);
}