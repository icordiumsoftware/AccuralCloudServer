package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "customers", schema = "erp", catalog = "")
public class CustomersEntity {
    private int idcustomers;
    private Integer status;
    private String suffix;
    private String firstname;
    private String lastname;
    private String email;
    private Integer gender;
    private String contactpersonname;
    private String mobile;
    private Date dob;
    private String address;
    private String identiftyproofimage;
    private String customerimage;
    private String idnumber;
    private String phone;
    private Collection<BookingcartEntity> bookingcartsByIdcustomers;
    private Collection<RentalbookingEntity> rentalbookingsByIdcustomers;
    private Collection<RentalinvoiceEntity> rentalinvoicesByIdcustomers;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdcustomers;
    private Collection<SaleshedderEntity> salesheddersByIdcustomers;
    private Integer creditallow;
    private Collection<TableheadsorderEntity> tableheadsordersByIdcustomers;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdcustomers;

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdcustomers() {
        return menusalesinvoicesByIdcustomers;
    }

    public void setMenusalesinvoicesByIdcustomers(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdcustomers) {
        this.menusalesinvoicesByIdcustomers = menusalesinvoicesByIdcustomers;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcustomers", nullable = false)
    public int getIdcustomers() {
        return idcustomers;
    }

    public void setIdcustomers(int idcustomers) {
        this.idcustomers = idcustomers;
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
    @Column(name = "suffix", nullable = true, length = 45)
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 45)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 45)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "gender", nullable = true)
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "contactpersonname", nullable = true, length = 45)
    public String getContactpersonname() {
        return contactpersonname;
    }

    public void setContactpersonname(String contactpersonname) {
        this.contactpersonname = contactpersonname;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 45)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "dob", nullable = true)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "address", nullable = true, length = -1)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "identiftyproofimage", nullable = true, length = -1)
    public String getIdentiftyproofimage() {
        return identiftyproofimage;
    }

    public void setIdentiftyproofimage(String identiftyproofimage) {
        this.identiftyproofimage = identiftyproofimage;
    }

    @Basic
    @Column(name = "customerimage", nullable = true, length = -1)
    public String getCustomerimage() {
        return customerimage;
    }

    public void setCustomerimage(String customerimage) {
        this.customerimage = customerimage;
    }

    @Basic
    @Column(name = "idnumber", nullable = true, length = 45)
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersEntity that = (CustomersEntity) o;

        if (idcustomers != that.idcustomers) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (contactpersonname != null ? !contactpersonname.equals(that.contactpersonname) : that.contactpersonname != null)
            return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (identiftyproofimage != null ? !identiftyproofimage.equals(that.identiftyproofimage) : that.identiftyproofimage != null)
            return false;
        if (customerimage != null ? !customerimage.equals(that.customerimage) : that.customerimage != null)
            return false;
        if (idnumber != null ? !idnumber.equals(that.idnumber) : that.idnumber != null) return false;
        return phone != null ? phone.equals(that.phone) : that.phone == null;
    }

    @Override
    public int hashCode() {
        int result = idcustomers;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (contactpersonname != null ? contactpersonname.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (identiftyproofimage != null ? identiftyproofimage.hashCode() : 0);
        result = 31 * result + (customerimage != null ? customerimage.hashCode() : 0);
        result = 31 * result + (idnumber != null ? idnumber.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<BookingcartEntity> getBookingcartsByIdcustomers() {
        return bookingcartsByIdcustomers;
    }

    public void setBookingcartsByIdcustomers(Collection<BookingcartEntity> bookingcartsByIdcustomers) {
        this.bookingcartsByIdcustomers = bookingcartsByIdcustomers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<RentalbookingEntity> getRentalbookingsByIdcustomers() {
        return rentalbookingsByIdcustomers;
    }

    public void setRentalbookingsByIdcustomers(Collection<RentalbookingEntity> rentalbookingsByIdcustomers) {
        this.rentalbookingsByIdcustomers = rentalbookingsByIdcustomers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<RentalinvoiceEntity> getRentalinvoicesByIdcustomers() {
        return rentalinvoicesByIdcustomers;
    }

    public void setRentalinvoicesByIdcustomers(Collection<RentalinvoiceEntity> rentalinvoicesByIdcustomers) {
        this.rentalinvoicesByIdcustomers = rentalinvoicesByIdcustomers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdcustomers() {
        return rentoutedheddersByIdcustomers;
    }

    public void setRentoutedheddersByIdcustomers(Collection<RentoutedhedderEntity> rentoutedheddersByIdcustomers) {
        this.rentoutedheddersByIdcustomers = rentoutedheddersByIdcustomers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<SaleshedderEntity> getSalesheddersByIdcustomers() {
        return salesheddersByIdcustomers;
    }

    public void setSalesheddersByIdcustomers(Collection<SaleshedderEntity> salesheddersByIdcustomers) {
        this.salesheddersByIdcustomers = salesheddersByIdcustomers;
    }

    @Basic
    @Column(name = "creditallow", nullable = true)
    public Integer getCreditallow() {
        return creditallow;
    }

    public void setCreditallow(Integer creditallow) {
        this.creditallow = creditallow;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "customersByCustomersIdcustomers")
    public Collection<TableheadsorderEntity> getTableheadsordersByIdcustomers() {
        return tableheadsordersByIdcustomers;
    }

    public void setTableheadsordersByIdcustomers(Collection<TableheadsorderEntity> tableheadsordersByIdcustomers) {
        this.tableheadsordersByIdcustomers = tableheadsordersByIdcustomers;
    }


}