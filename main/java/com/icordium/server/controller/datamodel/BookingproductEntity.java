package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bookingproduct", schema = "erp", catalog = "")
public class BookingproductEntity {
    private int idbookingproduct;
    private int productIdproduct;
    private Timestamp start;
    private Timestamp end;
    private Double qty;
    private Double freeqty;
    private int rentalbookingIdrentalbooking;
    private int locationIdlocation;
    private Double discount;
    private ProductEntity productByProductIdproduct;
    private RentalbookingEntity rentalbookingByRentalbookingIdrentalbooking;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbookingproduct", nullable = false)
    public int getIdbookingproduct() {
        return idbookingproduct;
    }

    public void setIdbookingproduct(int idbookingproduct) {
        this.idbookingproduct = idbookingproduct;
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
    @Column(name = "start", nullable = false)
    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Basic
    @Column(name = "end", nullable = false)
    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
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
    @Column(name = "rentalbooking_idrentalbooking", nullable = false)
    public int getRentalbookingIdrentalbooking() {
        return rentalbookingIdrentalbooking;
    }

    public void setRentalbookingIdrentalbooking(int rentalbookingIdrentalbooking) {
        this.rentalbookingIdrentalbooking = rentalbookingIdrentalbooking;
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

        BookingproductEntity that = (BookingproductEntity) o;

        if (idbookingproduct != that.idbookingproduct) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (rentalbookingIdrentalbooking != that.rentalbookingIdrentalbooking) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        return discount != null ? discount.equals(that.discount) : that.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idbookingproduct;
        result = 31 * result + productIdproduct;
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + rentalbookingIdrentalbooking;
        result = 31 * result + locationIdlocation;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
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