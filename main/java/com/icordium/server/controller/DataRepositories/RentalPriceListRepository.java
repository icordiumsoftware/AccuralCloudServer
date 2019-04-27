package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.RentalpricelistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalPriceListRepository extends JpaRepository<RentalpricelistEntity, Integer> {
    List<RentalpricelistEntity> findByProductIdproduct(int productIdproduct);

    List<RentalpricelistEntity> findByProductIdproductAndRentalpricecategoryIdrentalpricecategory(int productIdproduct, int rentalpricecategoryIdrentalpricecategory);

    List<RentalpricelistEntity> findByProductIdproductAndRentalpricecategoryIdrentalpricecategoryAndEndpointGreaterThanEqualAndStartpointIsLessThanEqual(int productIdproduct, int rentalpricecategoryIdrentalpricecategory, double startpoint, double endpoint);


    List<RentalpricelistEntity> findByRentalpricecategoryIdrentalpricecategory(int idrentalpricecategory);
}