package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "rentalpricecategory", schema = "erp", catalog = "")
public class RentalpricecategoryEntity {
    private int idrentalpricecategory;
    private String rentalpricecategoryname;
    private Integer status;
    private Collection<BookingcartEntity> bookingcartsByIdrentalpricecategory;
    private Collection<RentalpricelistEntity> rentalpricelistsByIdrentalpricecategory;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdrentalpricecategory;
    private Collection<RentoutpricelistEntity> rentoutpricelistsByIdrentalpricecategory;
    private Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdrentalpricecategory;
    private Collection<RentalbookingEntity> rentalbookingsByIdrentalpricecategory;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalpricecategory", nullable = false)
    public int getIdrentalpricecategory() {
        return idrentalpricecategory;
    }

    public void setIdrentalpricecategory(int idrentalpricecategory) {
        this.idrentalpricecategory = idrentalpricecategory;
    }

    @Basic
    @Column(name = "rentalpricecategoryname", nullable = true, length = 45)
    public String getRentalpricecategoryname() {
        return rentalpricecategoryname;
    }

    public void setRentalpricecategoryname(String rentalpricecategoryname) {
        this.rentalpricecategoryname = rentalpricecategoryname;
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

        RentalpricecategoryEntity that = (RentalpricecategoryEntity) o;

        if (idrentalpricecategory != that.idrentalpricecategory) return false;
        if (rentalpricecategoryname != null ? !rentalpricecategoryname.equals(that.rentalpricecategoryname) : that.rentalpricecategoryname != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalpricecategory;
        result = 31 * result + (rentalpricecategoryname != null ? rentalpricecategoryname.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<BookingcartEntity> getBookingcartsByIdrentalpricecategory() {
        return bookingcartsByIdrentalpricecategory;
    }

    public void setBookingcartsByIdrentalpricecategory(Collection<BookingcartEntity> bookingcartsByIdrentalpricecategory) {
        this.bookingcartsByIdrentalpricecategory = bookingcartsByIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<RentalpricelistEntity> getRentalpricelistsByIdrentalpricecategory() {
        return rentalpricelistsByIdrentalpricecategory;
    }

    public void setRentalpricelistsByIdrentalpricecategory(Collection<RentalpricelistEntity> rentalpricelistsByIdrentalpricecategory) {
        this.rentalpricelistsByIdrentalpricecategory = rentalpricelistsByIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdrentalpricecategory() {
        return rentoutedheddersByIdrentalpricecategory;
    }

    public void setRentoutedheddersByIdrentalpricecategory(Collection<RentoutedhedderEntity> rentoutedheddersByIdrentalpricecategory) {
        this.rentoutedheddersByIdrentalpricecategory = rentoutedheddersByIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<RentoutpricelistEntity> getRentoutpricelistsByIdrentalpricecategory() {
        return rentoutpricelistsByIdrentalpricecategory;
    }

    public void setRentoutpricelistsByIdrentalpricecategory(Collection<RentoutpricelistEntity> rentoutpricelistsByIdrentalpricecategory) {
        this.rentoutpricelistsByIdrentalpricecategory = rentoutpricelistsByIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<RentoutedproductdataEntity> getRentoutedproductdatasByIdrentalpricecategory() {
        return rentoutedproductdatasByIdrentalpricecategory;
    }

    public void setRentoutedproductdatasByIdrentalpricecategory(Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdrentalpricecategory) {
        this.rentoutedproductdatasByIdrentalpricecategory = rentoutedproductdatasByIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalpricecategoryByRentalpricecategoryIdrentalpricecategory")
    public Collection<RentalbookingEntity> getRentalbookingsByIdrentalpricecategory() {
        return rentalbookingsByIdrentalpricecategory;
    }

    public void setRentalbookingsByIdrentalpricecategory(Collection<RentalbookingEntity> rentalbookingsByIdrentalpricecategory) {
        this.rentalbookingsByIdrentalpricecategory = rentalbookingsByIdrentalpricecategory;
    }
}