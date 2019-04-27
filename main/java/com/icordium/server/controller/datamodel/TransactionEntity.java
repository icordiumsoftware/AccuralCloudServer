package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "transaction", schema = "erp", catalog = "")
public class TransactionEntity {
    private int idtransaction;
    private String transactiondescription;
    private Timestamp regdatetime;
    private String transactiontype;
    private int locationIdlocation;
    private Collection<GoodrevicehedderEntity> goodreviceheddersByIdtransaction;
    private Collection<ProducthistoryEntity> producthistoriesByIdtransaction;
    private Collection<RentalinvoiceEntity> rentalinvoicesByIdtransaction;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdtransaction;
    private Collection<StockadjestmentEntity> stockadjestmentsByIdtransaction;
    private LocationEntity locationByLocationIdlocation;
    private Collection<TradeEntity> tradesByIdtransaction;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdtransaction;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransaction", nullable = false)
    public int getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(int idtransaction) {
        this.idtransaction = idtransaction;
    }

    @Basic
    @Column(name = "transactiondescription", nullable = true, length = 45)
    public String getTransactiondescription() {
        return transactiondescription;
    }

    public void setTransactiondescription(String transactiondescription) {
        this.transactiondescription = transactiondescription;
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
    @Column(name = "transactiontype", nullable = true, length = 45)
    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    @Basic
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionEntity that = (TransactionEntity) o;

        if (idtransaction != that.idtransaction) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (transactiondescription != null ? !transactiondescription.equals(that.transactiondescription) : that.transactiondescription != null)
            return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        return transactiontype != null ? transactiontype.equals(that.transactiontype) : that.transactiontype == null;
    }

    @Override
    public int hashCode() {
        int result = idtransaction;
        result = 31 * result + (transactiondescription != null ? transactiondescription.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (transactiontype != null ? transactiontype.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<GoodrevicehedderEntity> getGoodreviceheddersByIdtransaction() {
        return goodreviceheddersByIdtransaction;
    }

    public void setGoodreviceheddersByIdtransaction(Collection<GoodrevicehedderEntity> goodreviceheddersByIdtransaction) {
        this.goodreviceheddersByIdtransaction = goodreviceheddersByIdtransaction;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<ProducthistoryEntity> getProducthistoriesByIdtransaction() {
        return producthistoriesByIdtransaction;
    }

    public void setProducthistoriesByIdtransaction(Collection<ProducthistoryEntity> producthistoriesByIdtransaction) {
        this.producthistoriesByIdtransaction = producthistoriesByIdtransaction;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<RentalinvoiceEntity> getRentalinvoicesByIdtransaction() {
        return rentalinvoicesByIdtransaction;
    }

    public void setRentalinvoicesByIdtransaction(Collection<RentalinvoiceEntity> rentalinvoicesByIdtransaction) {
        this.rentalinvoicesByIdtransaction = rentalinvoicesByIdtransaction;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdtransaction() {
        return rentoutedheddersByIdtransaction;
    }

    public void setRentoutedheddersByIdtransaction(Collection<RentoutedhedderEntity> rentoutedheddersByIdtransaction) {
        this.rentoutedheddersByIdtransaction = rentoutedheddersByIdtransaction;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<StockadjestmentEntity> getStockadjestmentsByIdtransaction() {
        return stockadjestmentsByIdtransaction;
    }

    public void setStockadjestmentsByIdtransaction(Collection<StockadjestmentEntity> stockadjestmentsByIdtransaction) {
        this.stockadjestmentsByIdtransaction = stockadjestmentsByIdtransaction;
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

    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<TradeEntity> getTradesByIdtransaction() {
        return tradesByIdtransaction;
    }

    public void setTradesByIdtransaction(Collection<TradeEntity> tradesByIdtransaction) {
        this.tradesByIdtransaction = tradesByIdtransaction;
    }

    @OneToMany(mappedBy = "transactionByTransactionIdtransaction")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdtransaction() {
        return menusalesinvoicesByIdtransaction;
    }

    public void setMenusalesinvoicesByIdtransaction(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdtransaction) {
        this.menusalesinvoicesByIdtransaction = menusalesinvoicesByIdtransaction;
    }
}