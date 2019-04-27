package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "rentalbooking", schema = "erp", catalog = "")
public class RentalbookingEntity {
    private int idrentalbooking;
    private Timestamp diliveerydate;
    private String deliveryaddress;
    private String note;
    private int customersIdcustomers;
    private Timestamp regdatetime;
    private int locationIdlocation;
    private Double advanceamount;
    private Collection<BookingproductEntity> bookingproductsByIdrentalbooking;
    private Collection<BookingserviceEntity> bookingservicesByIdrentalbooking;
    private CustomersEntity customersByCustomersIdcustomers;
    private LocationEntity locationByLocationIdlocation;
    private Collection<RentalotherEntity> rentalothersByIdrentalbooking;
    private Integer status;
    private Timestamp returndate;
    private int rentalpricecategoryIdrentalpricecategory;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalbooking", nullable = false)
    public int getIdrentalbooking() {
        return idrentalbooking;
    }

    public void setIdrentalbooking(int idrentalbooking) {
        this.idrentalbooking = idrentalbooking;
    }

    @Basic
    @Column(name = "diliveerydate", nullable = true)
    public Timestamp getDiliveerydate() {
        return diliveerydate;
    }

    public void setDiliveerydate(Timestamp diliveerydate) {
        this.diliveerydate = diliveerydate;
    }

    @Basic
    @Column(name = "deliveryaddress", nullable = true, length = 45)
    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    @Basic
    @Column(name = "note", nullable = true, length = -1)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "regdatetime", nullable = true)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
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
    @Column(name = "advanceamount", nullable = true, precision = 0)
    public Double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(Double advanceamount) {
        this.advanceamount = advanceamount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalbookingEntity that = (RentalbookingEntity) o;

        if (idrentalbooking != that.idrentalbooking) return false;
        if (customersIdcustomers != that.customersIdcustomers) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (diliveerydate != null ? !diliveerydate.equals(that.diliveerydate) : that.diliveerydate != null)
            return false;
        if (deliveryaddress != null ? !deliveryaddress.equals(that.deliveryaddress) : that.deliveryaddress != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        return advanceamount != null ? advanceamount.equals(that.advanceamount) : that.advanceamount == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalbooking;
        result = 31 * result + (diliveerydate != null ? diliveerydate.hashCode() : 0);
        result = 31 * result + (deliveryaddress != null ? deliveryaddress.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + customersIdcustomers;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + (advanceamount != null ? advanceamount.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalbookingByRentalbookingIdrentalbooking")
    public Collection<BookingproductEntity> getBookingproductsByIdrentalbooking() {
        return bookingproductsByIdrentalbooking;
    }

    public void setBookingproductsByIdrentalbooking(Collection<BookingproductEntity> bookingproductsByIdrentalbooking) {
        this.bookingproductsByIdrentalbooking = bookingproductsByIdrentalbooking;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalbookingByRentalbookingIdrentalbooking")
    public Collection<BookingserviceEntity> getBookingservicesByIdrentalbooking() {
        return bookingservicesByIdrentalbooking;
    }

    public void setBookingservicesByIdrentalbooking(Collection<BookingserviceEntity> bookingservicesByIdrentalbooking) {
        this.bookingservicesByIdrentalbooking = bookingservicesByIdrentalbooking;
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
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalbookingByRentalbookingIdrentalbooking")
    public Collection<RentalotherEntity> getRentalothersByIdrentalbooking() {
        return rentalothersByIdrentalbooking;
    }

    public void setRentalothersByIdrentalbooking(Collection<RentalotherEntity> rentalothersByIdrentalbooking) {
        this.rentalothersByIdrentalbooking = rentalothersByIdrentalbooking;
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
    @Column(name = "returndate", nullable = true)
    public Timestamp getReturndate() {
        return returndate;
    }

    public void setReturndate(Timestamp returndate) {
        this.returndate = returndate;
    }

    @Basic
    @Column(name = "rentalpricecategory_idrentalpricecategory", nullable = false)
    public int getRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryIdrentalpricecategory(int rentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryIdrentalpricecategory = rentalpricecategoryIdrentalpricecategory;
    }

    @ManyToOne
    @JoinColumn(name = "rentalpricecategory_idrentalpricecategory", referencedColumnName = "idrentalpricecategory", nullable = false, insertable = false, updatable = false)
    public RentalpricecategoryEntity getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryByRentalpricecategoryIdrentalpricecategory(RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryByRentalpricecategoryIdrentalpricecategory = rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }
}