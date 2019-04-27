package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "saleshedder", schema = "erp", catalog = "")
public class SaleshedderEntity {
    private int idsaleshedder;
    private Timestamp regdatetime;
    private Double amount;
    private Double grossamount;
    private Double adjestment;
    private Double discount;
    private Double taxamount;
    private Double costamount;
    private Double profitamount;
    private String description;
    private int locationIdlocation;
    private int customersIdcustomers;
    private int usersIdusers;
    private Collection<SaledataproductEntity> saledataproductsByIdsaleshedder;
    private Collection<SaledataserviceEntity> saledataservicesByIdsaleshedder;
    private LocationEntity locationByLocationIdlocation;
    private CustomersEntity customersByCustomersIdcustomers;
    private UsersEntity usersByUsersIdusers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsaleshedder", nullable = false)
    public int getIdsaleshedder() {
        return idsaleshedder;
    }

    public void setIdsaleshedder(int idsaleshedder) {
        this.idsaleshedder = idsaleshedder;
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
    @Column(name = "amount", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "grossamount", nullable = true, precision = 0)
    public Double getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(Double grossamount) {
        this.grossamount = grossamount;
    }

    @Basic
    @Column(name = "adjestment", nullable = true, precision = 0)
    public Double getAdjestment() {
        return adjestment;
    }

    public void setAdjestment(Double adjestment) {
        this.adjestment = adjestment;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "taxamount", nullable = true, precision = 0)
    public Double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Double taxamount) {
        this.taxamount = taxamount;
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
    @Column(name = "profitamount", nullable = true, precision = 0)
    public Double getProfitamount() {
        return profitamount;
    }

    public void setProfitamount(Double profitamount) {
        this.profitamount = profitamount;
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
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "customers_idcustomers", nullable = false)
    public int getCustomersIdcustomers() {
        return customersIdcustomers;
    }

    public void setCustomersIdcustomers(int customersIdcustomers) {
        this.customersIdcustomers = customersIdcustomers;
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

        SaleshedderEntity that = (SaleshedderEntity) o;

        if (idsaleshedder != that.idsaleshedder) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (customersIdcustomers != that.customersIdcustomers) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (grossamount != null ? !grossamount.equals(that.grossamount) : that.grossamount != null) return false;
        if (adjestment != null ? !adjestment.equals(that.adjestment) : that.adjestment != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (taxamount != null ? !taxamount.equals(that.taxamount) : that.taxamount != null) return false;
        if (costamount != null ? !costamount.equals(that.costamount) : that.costamount != null) return false;
        if (profitamount != null ? !profitamount.equals(that.profitamount) : that.profitamount != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = idsaleshedder;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (grossamount != null ? grossamount.hashCode() : 0);
        result = 31 * result + (adjestment != null ? adjestment.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (taxamount != null ? taxamount.hashCode() : 0);
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        result = 31 * result + (profitamount != null ? profitamount.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + customersIdcustomers;
        result = 31 * result + usersIdusers;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "saleshedderBySaleshedderIdsaleshedder")
    public Collection<SaledataproductEntity> getSaledataproductsByIdsaleshedder() {
        return saledataproductsByIdsaleshedder;
    }

    public void setSaledataproductsByIdsaleshedder(Collection<SaledataproductEntity> saledataproductsByIdsaleshedder) {
        this.saledataproductsByIdsaleshedder = saledataproductsByIdsaleshedder;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "saleshedderBySaleshedderIdsaleshedder")
    public Collection<SaledataserviceEntity> getSaledataservicesByIdsaleshedder() {
        return saledataservicesByIdsaleshedder;
    }

    public void setSaledataservicesByIdsaleshedder(Collection<SaledataserviceEntity> saledataservicesByIdsaleshedder) {
        this.saledataservicesByIdsaleshedder = saledataservicesByIdsaleshedder;
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
    @JoinColumn(name = "customers_idcustomers", referencedColumnName = "idcustomers", nullable = false, insertable = false, updatable = false)
    public CustomersEntity getCustomersByCustomersIdcustomers() {
        return customersByCustomersIdcustomers;
    }

    public void setCustomersByCustomersIdcustomers(CustomersEntity customersByCustomersIdcustomers) {
        this.customersByCustomersIdcustomers = customersByCustomersIdcustomers;
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