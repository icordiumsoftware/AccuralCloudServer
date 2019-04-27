package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "bookingcart", schema = "erp", catalog = "")
public class BookingcartEntity {
    private int bookingcart;
    private Integer cartstatus;
    private int customersIdcustomers;
    private int locationIdlocation;
    private int usersIdusers;
    private int rentalpricecategoryIdrentalpricecategory;
    private String diliveryAddress;
    private Timestamp startDate;
    private Timestamp endDate;
    private Double advanceamount;
    private CustomersEntity customersByCustomersIdcustomers;
    private LocationEntity locationByLocationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    private Collection<RentcartotherEntity> rentcartothersByBookingcart;
    private Collection<RentcartproductEntity> rentcartproductsByBookingcart;
    private Collection<RentcartserviceEntity> rentcartservicesByBookingcart;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingcart", nullable = false)
    public int getBookingcart() {
        return bookingcart;
    }

    public void setBookingcart(int bookingcart) {
        this.bookingcart = bookingcart;
    }

    @Basic
    @Column(name = "cartstatus", nullable = true)
    public Integer getCartstatus() {
        return cartstatus;
    }

    public void setCartstatus(Integer cartstatus) {
        this.cartstatus = cartstatus;
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
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
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
    @Column(name = "rentalpricecategory_idrentalpricecategory", nullable = false)
    public int getRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryIdrentalpricecategory(int rentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryIdrentalpricecategory = rentalpricecategoryIdrentalpricecategory;
    }

    @Basic
    @Column(name = "dilivery_address", nullable = true, length = 45)
    public String getDiliveryAddress() {
        return diliveryAddress;
    }

    public void setDiliveryAddress(String diliveryAddress) {
        this.diliveryAddress = diliveryAddress;
    }

    @Basic
    @Column(name = "start_date", nullable = false)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = false)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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

        BookingcartEntity that = (BookingcartEntity) o;

        if (bookingcart != that.bookingcart) return false;
        if (customersIdcustomers != that.customersIdcustomers) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (rentalpricecategoryIdrentalpricecategory != that.rentalpricecategoryIdrentalpricecategory) return false;
        if (cartstatus != null ? !cartstatus.equals(that.cartstatus) : that.cartstatus != null) return false;
        if (diliveryAddress != null ? !diliveryAddress.equals(that.diliveryAddress) : that.diliveryAddress != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        return advanceamount != null ? advanceamount.equals(that.advanceamount) : that.advanceamount == null;
    }

    @Override
    public int hashCode() {
        int result = bookingcart;
        result = 31 * result + (cartstatus != null ? cartstatus.hashCode() : 0);
        result = 31 * result + customersIdcustomers;
        result = 31 * result + locationIdlocation;
        result = 31 * result + usersIdusers;
        result = 31 * result + rentalpricecategoryIdrentalpricecategory;
        result = 31 * result + (diliveryAddress != null ? diliveryAddress.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (advanceamount != null ? advanceamount.hashCode() : 0);
        return result;
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
    @JoinColumn(name = "rentalpricecategory_idrentalpricecategory", referencedColumnName = "idrentalpricecategory", nullable = false, insertable = false, updatable = false)
    public RentalpricecategoryEntity getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryByRentalpricecategoryIdrentalpricecategory(RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryByRentalpricecategoryIdrentalpricecategory = rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bookingcartByCartIdcart")
    public Collection<RentcartotherEntity> getRentcartothersByBookingcart() {
        return rentcartothersByBookingcart;
    }

    public void setRentcartothersByBookingcart(Collection<RentcartotherEntity> rentcartothersByBookingcart) {
        this.rentcartothersByBookingcart = rentcartothersByBookingcart;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bookingcartByCartIdcart")
    public Collection<RentcartproductEntity> getRentcartproductsByBookingcart() {
        return rentcartproductsByBookingcart;
    }

    public void setRentcartproductsByBookingcart(Collection<RentcartproductEntity> rentcartproductsByBookingcart) {
        this.rentcartproductsByBookingcart = rentcartproductsByBookingcart;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bookingcartByCartIdcart")
    public Collection<RentcartserviceEntity> getRentcartservicesByBookingcart() {
        return rentcartservicesByBookingcart;
    }

    public void setRentcartservicesByBookingcart(Collection<RentcartserviceEntity> rentcartservicesByBookingcart) {
        this.rentcartservicesByBookingcart = rentcartservicesByBookingcart;
    }
}