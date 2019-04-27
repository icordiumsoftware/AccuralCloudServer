package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bookingservice", schema = "erp", catalog = "")
public class BookingserviceEntity {
    private int idbookingservice;
    private int rentalbookingIdrentalbooking;
    private int serviceIdservice;
    private Double qty;
    private Double freeqty;
    private int locationIdlocation;
    private Double discount;
    private RentalbookingEntity rentalbookingByRentalbookingIdrentalbooking;
    private ServiceEntity serviceByServiceIdservice;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbookingservice", nullable = false)
    public int getIdbookingservice() {
        return idbookingservice;
    }

    public void setIdbookingservice(int idbookingservice) {
        this.idbookingservice = idbookingservice;
    }

    @Basic
    @Column(name = "rentalbooking_idrentalbooking", nullable = false)
    public int getRentalbookingIdrentalbooking() {
        return rentalbookingIdrentalbooking;
    }

    public void setRentalbookingIdrentalbooking(int rentalbookingIdrentalbooking) {
        this.rentalbookingIdrentalbooking = rentalbookingIdrentalbooking;
    }

    @Basic
    @Column(name = "service_idservice", nullable = false)
    public int getServiceIdservice() {
        return serviceIdservice;
    }

    public void setServiceIdservice(int serviceIdservice) {
        this.serviceIdservice = serviceIdservice;
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
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookingserviceEntity that = (BookingserviceEntity) o;

        if (idbookingservice != that.idbookingservice) return false;
        if (rentalbookingIdrentalbooking != that.rentalbookingIdrentalbooking) return false;
        if (serviceIdservice != that.serviceIdservice) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        return discount != null ? discount.equals(that.discount) : that.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idbookingservice;
        result = 31 * result + rentalbookingIdrentalbooking;
        result = 31 * result + serviceIdservice;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rentalbooking_idrentalbooking", referencedColumnName = "idrentalbooking", nullable = false, insertable = false, updatable = false)
    public RentalbookingEntity getRentalbookingByRentalbookingIdrentalbooking() {
        return rentalbookingByRentalbookingIdrentalbooking;
    }

    public void setRentalbookingByRentalbookingIdrentalbooking(RentalbookingEntity rentalbookingByRentalbookingIdrentalbooking) {
        this.rentalbookingByRentalbookingIdrentalbooking = rentalbookingByRentalbookingIdrentalbooking;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "service_idservice", referencedColumnName = "idservice", nullable = false, insertable = false, updatable = false)
    public ServiceEntity getServiceByServiceIdservice() {
        return serviceByServiceIdservice;
    }

    public void setServiceByServiceIdservice(ServiceEntity serviceByServiceIdservice) {
        this.serviceByServiceIdservice = serviceByServiceIdservice;
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