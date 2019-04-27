package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "goodrevicehedder", schema = "erp", catalog = "")
public class GoodrevicehedderEntity {
    private int idgoodrevicehedder;
    private Timestamp regdatetime;
    private Double costamount;
    private Double retailamount;
    private Double wholesaleamount;
    private int supplierIdsupplier;
    private Integer transactionIdtransaction;
    private int usersIdusers;
    private int locationIdlocation;
    private Integer status;
    private Collection<GoodrecivedataproductEntity> goodrecivedataproductsByIdgoodrevicehedder;
    private SupplierEntity supplierBySupplierIdsupplier;
    private TransactionEntity transactionByTransactionIdtransaction;
    private UsersEntity usersByUsersIdusers;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgoodrevicehedder", nullable = false)
    public int getIdgoodrevicehedder() {
        return idgoodrevicehedder;
    }

    public void setIdgoodrevicehedder(int idgoodrevicehedder) {
        this.idgoodrevicehedder = idgoodrevicehedder;
    }

    @Basic
    @Column(name = "regdatetime", nullable = true)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "costamount", nullable = true, precision = 0)
    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    @Basic
    @Column(name = "retailamount", nullable = true, precision = 0)
    public Double getRetailamount() {
        return retailamount;
    }

    public void setRetailamount(Double retailamount) {
        this.retailamount = retailamount;
    }

    @Basic
    @Column(name = "wholesaleamount", nullable = true, precision = 0)
    public Double getWholesaleamount() {
        return wholesaleamount;
    }

    public void setWholesaleamount(Double wholesaleamount) {
        this.wholesaleamount = wholesaleamount;
    }

    @Basic
    @Column(name = "supplier_idsupplier", nullable = false)
    public int getSupplierIdsupplier() {
        return supplierIdsupplier;
    }

    public void setSupplierIdsupplier(int supplierIdsupplier) {
        this.supplierIdsupplier = supplierIdsupplier;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = true)
    public Integer getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(Integer transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
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
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodrevicehedderEntity that = (GoodrevicehedderEntity) o;

        if (idgoodrevicehedder != that.idgoodrevicehedder) return false;
        if (supplierIdsupplier != that.supplierIdsupplier) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (costamount != null ? !costamount.equals(that.costamount) : that.costamount != null) return false;
        if (retailamount != null ? !retailamount.equals(that.retailamount) : that.retailamount != null) return false;
        if (wholesaleamount != null ? !wholesaleamount.equals(that.wholesaleamount) : that.wholesaleamount != null)
            return false;
        if (transactionIdtransaction != null ? !transactionIdtransaction.equals(that.transactionIdtransaction) : that.transactionIdtransaction != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idgoodrevicehedder;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        result = 31 * result + (retailamount != null ? retailamount.hashCode() : 0);
        result = 31 * result + (wholesaleamount != null ? wholesaleamount.hashCode() : 0);
        result = 31 * result + supplierIdsupplier;
        result = 31 * result + (transactionIdtransaction != null ? transactionIdtransaction.hashCode() : 0);
        result = 31 * result + usersIdusers;
        result = 31 * result + locationIdlocation;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "goodrevicehedderByGoodrevicehedderIdgoodrevicehedder")
    public Collection<GoodrecivedataproductEntity> getGoodrecivedataproductsByIdgoodrevicehedder() {
        return goodrecivedataproductsByIdgoodrevicehedder;
    }

    public void setGoodrecivedataproductsByIdgoodrevicehedder(Collection<GoodrecivedataproductEntity> goodrecivedataproductsByIdgoodrevicehedder) {
        this.goodrecivedataproductsByIdgoodrevicehedder = goodrecivedataproductsByIdgoodrevicehedder;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supplier_idsupplier", referencedColumnName = "idsupplier", nullable = false, insertable = false, updatable = false)
    public SupplierEntity getSupplierBySupplierIdsupplier() {
        return supplierBySupplierIdsupplier;
    }

    public void setSupplierBySupplierIdsupplier(SupplierEntity supplierBySupplierIdsupplier) {
        this.supplierBySupplierIdsupplier = supplierBySupplierIdsupplier;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "transaction_idtransaction", referencedColumnName = "idtransaction", insertable = false, updatable = false)
    public TransactionEntity getTransactionByTransactionIdtransaction() {
        return transactionByTransactionIdtransaction;
    }

    public void setTransactionByTransactionIdtransaction(TransactionEntity transactionByTransactionIdtransaction) {
        this.transactionByTransactionIdtransaction = transactionByTransactionIdtransaction;
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
}