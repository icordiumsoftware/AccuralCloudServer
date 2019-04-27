package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "service", schema = "erp", catalog = "")
public class ServiceEntity {
    private int idservice;
    private String servicename;
    private Double costprice;
    private Double retailprice;
    private Double wholesaleprice;
    private Integer status;
    private String icon;
    private Collection<BookingserviceEntity> bookingservicesByIdservice;
    private Collection<RentalservicedataEntity> rentalservicedatasByIdservice;
    private Collection<RentcartserviceEntity> rentcartservicesByIdservice;
    private Collection<RentoutservicedataEntity> rentoutservicedatasByIdservice;
    private Collection<SaledataserviceEntity> saledataservicesByIdservice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idservice", nullable = false)
    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    @Basic
    @Column(name = "servicename", nullable = true, length = 45)
    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
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
    @Column(name = "retailprice", nullable = true, precision = 0)
    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
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
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = -1)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        if (idservice != that.idservice) return false;
        if (servicename != null ? !servicename.equals(that.servicename) : that.servicename != null) return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (wholesaleprice != null ? !wholesaleprice.equals(that.wholesaleprice) : that.wholesaleprice != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return icon != null ? icon.equals(that.icon) : that.icon == null;
    }

    @Override
    public int hashCode() {
        int result = idservice;
        result = 31 * result + (servicename != null ? servicename.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (wholesaleprice != null ? wholesaleprice.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "serviceByServiceIdservice")
    public Collection<BookingserviceEntity> getBookingservicesByIdservice() {
        return bookingservicesByIdservice;
    }

    public void setBookingservicesByIdservice(Collection<BookingserviceEntity> bookingservicesByIdservice) {
        this.bookingservicesByIdservice = bookingservicesByIdservice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "serviceByServiceIdservice")
    public Collection<RentalservicedataEntity> getRentalservicedatasByIdservice() {
        return rentalservicedatasByIdservice;
    }

    public void setRentalservicedatasByIdservice(Collection<RentalservicedataEntity> rentalservicedatasByIdservice) {
        this.rentalservicedatasByIdservice = rentalservicedatasByIdservice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "serviceByServiceIdservice")
    public Collection<RentcartserviceEntity> getRentcartservicesByIdservice() {
        return rentcartservicesByIdservice;
    }

    public void setRentcartservicesByIdservice(Collection<RentcartserviceEntity> rentcartservicesByIdservice) {
        this.rentcartservicesByIdservice = rentcartservicesByIdservice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "serviceByServiceIdservice")
    public Collection<RentoutservicedataEntity> getRentoutservicedatasByIdservice() {
        return rentoutservicedatasByIdservice;
    }

    public void setRentoutservicedatasByIdservice(Collection<RentoutservicedataEntity> rentoutservicedatasByIdservice) {
        this.rentoutservicedatasByIdservice = rentoutservicedatasByIdservice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "serviceByServiceIdservice")
    public Collection<SaledataserviceEntity> getSaledataservicesByIdservice() {
        return saledataservicesByIdservice;
    }

    public void setSaledataservicesByIdservice(Collection<SaledataserviceEntity> saledataservicesByIdservice) {
        this.saledataservicesByIdservice = saledataservicesByIdservice;
    }
}