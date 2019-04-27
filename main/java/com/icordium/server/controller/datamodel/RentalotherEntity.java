package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentalother", schema = "erp", catalog = "")
public class RentalotherEntity {
    private int idrentalother;
    private int rentalbookingIdrentalbooking;
    private String otherdescription;
    private Double qty;
    private Double price;
    private Double freeqty;
    private int locationIdlocation;
    private RentalbookingEntity rentalbookingByRentalbookingIdrentalbooking;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalother", nullable = false)
    public int getIdrentalother() {
        return idrentalother;
    }

    public void setIdrentalother(int idrentalother) {
        this.idrentalother = idrentalother;
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
    @Column(name = "otherdescription", nullable = false, length = 45)
    public String getOtherdescription() {
        return otherdescription;
    }

    public void setOtherdescription(String otherdescription) {
        this.otherdescription = otherdescription;
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
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalotherEntity that = (RentalotherEntity) o;

        if (idrentalother != that.idrentalother) return false;
        if (rentalbookingIdrentalbooking != that.rentalbookingIdrentalbooking) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (otherdescription != null ? !otherdescription.equals(that.otherdescription) : that.otherdescription != null)
            return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        return freeqty != null ? freeqty.equals(that.freeqty) : that.freeqty == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalother;
        result = 31 * result + rentalbookingIdrentalbooking;
        result = 31 * result + (otherdescription != null ? otherdescription.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + locationIdlocation;
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
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }
}