package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "stockadjestment", schema = "erp", catalog = "")
public class StockadjestmentEntity {
    private Double costprice;
    private Double wholesaleprice;
    private Double retailprice;
    private Double stockinhand;
    private Double adjestmentqty;
    private Double varieance;
    private int productIdproduct;
    private int usersIdusers;
    private int locationIdlocation;
    private Timestamp regdatetime;
    private int transactionIdtransaction;
    private int idStockAdjestment;
    private ProductEntity productByProductIdproduct;
    private UsersEntity usersByUsersIdusers;
    private LocationEntity locationByLocationIdlocation;
    private TransactionEntity transactionByTransactionIdtransaction;

    @Basic
    @Column(name = "costprice", nullable = true, precision = 0)
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "wholesaleprice", nullable = true, precision = 0)
    public Double getWholesaleprice() {
        return wholesaleprice;
    }

    public void setWholesaleprice(Double wholesaleprice) {
        this.wholesaleprice = wholesaleprice;
    }

    @Basic
    @Column(name = "retailprice", nullable = true, precision = 0)
    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    @Basic
    @Column(name = "stockinhand", nullable = true, precision = 0)
    public Double getStockinhand() {
        return stockinhand;
    }

    public void setStockinhand(Double stockinhand) {
        this.stockinhand = stockinhand;
    }

    @Basic
    @Column(name = "adjestmentqty", nullable = true, precision = 0)
    public Double getAdjestmentqty() {
        return adjestmentqty;
    }

    public void setAdjestmentqty(Double adjestmentqty) {
        this.adjestmentqty = adjestmentqty;
    }

    @Basic
    @Column(name = "varieance", nullable = true, precision = 0)
    public Double getVarieance() {
        return varieance;
    }

    public void setVarieance(Double varieance) {
        this.varieance = varieance;
    }

    @Basic
    @Column(name = "product_idproduct", nullable = false)
    public int getProductIdproduct() {
        return productIdproduct;
    }

    public void setProductIdproduct(int productIdproduct) {
        this.productIdproduct = productIdproduct;
    }

    @Basic
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Basic
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "regdatetime", nullable = false)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = false)
    public int getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(int transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stock_adjestment", nullable = false)
    public int getIdStockAdjestment() {
        return idStockAdjestment;
    }

    public void setIdStockAdjestment(int idStockAdjestment) {
        this.idStockAdjestment = idStockAdjestment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockadjestmentEntity that = (StockadjestmentEntity) o;

        if (productIdproduct != that.productIdproduct) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (transactionIdtransaction != that.transactionIdtransaction) return false;
        if (idStockAdjestment != that.idStockAdjestment) return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        if (wholesaleprice != null ? !wholesaleprice.equals(that.wholesaleprice) : that.wholesaleprice != null)
            return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (stockinhand != null ? !stockinhand.equals(that.stockinhand) : that.stockinhand != null) return false;
        if (adjestmentqty != null ? !adjestmentqty.equals(that.adjestmentqty) : that.adjestmentqty != null)
            return false;
        if (varieance != null ? !varieance.equals(that.varieance) : that.varieance != null) return false;
        return regdatetime != null ? regdatetime.equals(that.regdatetime) : that.regdatetime == null;
    }

    @Override
    public int hashCode() {
        int result = costprice != null ? costprice.hashCode() : 0;
        result = 31 * result + (wholesaleprice != null ? wholesaleprice.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (stockinhand != null ? stockinhand.hashCode() : 0);
        result = 31 * result + (adjestmentqty != null ? adjestmentqty.hashCode() : 0);
        result = 31 * result + (varieance != null ? varieance.hashCode() : 0);
        result = 31 * result + productIdproduct;
        result = 31 * result + usersIdusers;
        result = 31 * result + locationIdlocation;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + transactionIdtransaction;
        result = 31 * result + idStockAdjestment;
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByProductIdproduct() {
        return productByProductIdproduct;
    }

    public void setProductByProductIdproduct(ProductEntity productByProductIdproduct) {
        this.productByProductIdproduct = productByProductIdproduct;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "transaction_idtransaction", referencedColumnName = "idtransaction", nullable = false, insertable = false, updatable = false)
    public TransactionEntity getTransactionByTransactionIdtransaction() {
        return transactionByTransactionIdtransaction;
    }

    public void setTransactionByTransactionIdtransaction(TransactionEntity transactionByTransactionIdtransaction) {
        this.transactionByTransactionIdtransaction = transactionByTransactionIdtransaction;
    }
}