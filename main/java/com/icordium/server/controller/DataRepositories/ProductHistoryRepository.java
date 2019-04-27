package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.ProducthistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductHistoryRepository extends JpaRepository<ProducthistoryEntity, Integer> {
    List<ProducthistoryEntity> findByIdproductAndIdlocation(int idproduct, int idlocation);

    @Query(value = "select idproducthistory,datetime,idproduct,SUM(qty)as qty,SUM(freeqty)as freeqty,SUM(setoffqty)as setoffqty,description,docno,transaction_idtransaction,wholsaleprice,retailprice,costprice,soldprice,idlocation,users_idusers from producthistory  where idlocation=?1  and idproduct = ?2 and qty >0 and setoffqty<qty and costprice=?3 and wholsaleprice =?5 retailprice =?4  ORDER BY datetime", nativeQuery = true)
    List<ProducthistoryEntity> getByIdproductAndIdlocationAndCostpriceAndRetailpriceAndWholsalepriceOrderByDatetimeAsc(int idlocation, int idproduct, double costprice, double retailprice, double wholsaleprice);


    @Query(value = "select idproducthistory,datetime,idproduct,SUM(qty)as qty,SUM(freeqty)as freeqty,SUM(setoffqty)as setoffqty,description,docno,transaction_idtransaction,wholsaleprice,retailprice,costprice,soldprice,idlocation,users_idusers from producthistory  where idlocation=?1  and idproduct = ?2 and qty >0 and setoffqty<qty group by costprice,wholsaleprice,retailprice  ORDER BY datetime", nativeQuery = true)
    List<ProducthistoryEntity> getByIdproductAndIdlocationOrderByDatetimeAsc(int idlocation, int idproduct);
}