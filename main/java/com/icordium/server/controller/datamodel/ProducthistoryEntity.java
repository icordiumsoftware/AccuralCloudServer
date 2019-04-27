package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "producthistory", schema = "erp", catalog = "")
public class ProducthistoryEntity {
    private int idproducthistory;
    private Timestamp datetime;
    private int idproduct;
    private Double qty;
    private Double freeqty;
    private Double setoffqty;
    private String description;
    private Integer docno;
    private int transactionIdtransaction;
    private Double wholsaleprice;
    private Double retailprice;
    private Double costprice;
    private Double soldprice;
    private int idlocation;
    private int usersIdusers;
    private ProductEntity productByIdproduct;
    private TransactionEntity transactionByTransactionIdtransaction;
    private LocationEntity locationByIdlocation;
    private UsersEntity usersByUsersIdusers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducthistory", nullable = false)
    public int getIdproducthistory() {
        return idproducthistory;
    }

    public void setIdproducthistory(int idproducthistory) {
        this.idproducthistory = idproducthistory;
    }

    @Basic
    @Column(name = "datetime", nullable = true)
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Basic
    @Column(name = "idproduct", nullable = false)
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Basic
    @Column(name = "qty", nullable = true, precision = 0)
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
    }

    @Basic
    @Column(name = "setoffqty", nullable = true, precision = 0)
    public Double getSetoffqty() {
        return setoffqty;
    }

    public void setSetoffqty(Double setoffqty) {
        this.setoffqty = setoffqty;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "docno", nullable = true)
    public Integer getDocno() {
        return docno;
    }

    public void setDocno(Integer docno) {
        this.docno = docno;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = false)
    public int getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(int transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
    }

    @Basic
    @Column(name = "wholsaleprice", nullable = true, precision = 0)
    public Double getWholsaleprice() {
        return wholsaleprice;
    }

    public void setWholsaleprice(Double wholsaleprice) {
        this.wholsaleprice = wholsaleprice;
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
    @Column(name = "costprice", nullable = true, precision = 0)
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "soldprice", nullable = true, precision = 0)
    public Double getSoldprice() {
        return soldprice;
    }

    public void setSoldprice(Double soldprice) {
        this.soldprice = soldprice;
    }

    @Basic
    @Column(name = "idlocation", nullable = false)
    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
    }

    @Basic
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProducthistoryEntity that = (ProducthistoryEntity) o;

        if (idproducthistory != that.idproducthistory) return false;
        if (idproduct != that.idproduct) return false;
        if (transactionIdtransaction != that.transactionIdtransaction) return false;
        if (idlocation != that.idlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (datetime != null ? !datetime.equals(that.datetime) : that.datetime != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (setoffqty != null ? !setoffqty.equals(that.setoffqty) : that.setoffqty != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (docno != null ? !docno.equals(that.docno) : that.docno != null) return false;
        if (wholsaleprice != null ? !wholsaleprice.equals(that.wholsaleprice) : that.wholsaleprice != null)
            return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        return soldprice != null ? soldprice.equals(that.soldprice) : that.soldprice == null;
    }

    @Override
    public int hashCode() {
        int result = idproducthistory;
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        result = 31 * result + idproduct;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (setoffqty != null ? setoffqty.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (docno != null ? docno.hashCode() : 0);
        result = 31 * result + transactionIdtransaction;
        result = 31 * result + (wholsaleprice != null ? wholsaleprice.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (soldprice != null ? soldprice.hashCode() : 0);
        result = 31 * result + idlocation;
        result = 31 * result + usersIdusers;
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByIdproduct() {
        return productByIdproduct;
    }

    public void setProductByIdproduct(ProductEntity productByIdproduct) {
        this.productByIdproduct = productByIdproduct;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByIdlocation() {
        return locationByIdlocation;
    }

    public void setLocationByIdlocation(LocationEntity locationByIdlocation) {
        this.locationByIdlocation = locationByIdlocation;
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
}