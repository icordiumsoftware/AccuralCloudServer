package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "employee", schema = "erp", catalog = "")
public class EmployeeEntity {
    private int idemployee;
    private String surname;
    private String suffix;
    private String fistname;
    private String lastname;
    private String fullname;
    private Date dateofbirth;
    private String idnumber;
    private String passportnumber;
    private Integer maritalstatus;
    private Integer gender;
    private String address;
    private String residentialaddress;
    private String telephonenumber;
    private String epfnumber;
    private String etfnumber;
    private String officenumber;
    private String email;
    private int status;
    private String icon;
    private Collection<UsersEntity> userssByIdemployee;
    private Collection<SalaryadvanceEntity> salaryadvancesByIdemployee;
    private Collection<TableheadsorderEntity> tableheadsordersByIdemployee;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdemployee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idemployee", nullable = false)
    public int getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(int idemployee) {
        this.idemployee = idemployee;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    @Column(name = "fistname", nullable = true, length = 45)
    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
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
    @Column(name = "fullname", nullable = true, length = -1)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "dateofbirth", nullable = true)
    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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
    @Column(name = "passportnumber", nullable = true, length = 45)
    public String getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    @Basic
    @Column(name = "maritalstatus", nullable = true)
    public Integer getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Integer maritalstatus) {
        this.maritalstatus = maritalstatus;
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
    @Column(name = "address", nullable = true, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "residentialaddress", nullable = true, length = 45)
    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    @Basic
    @Column(name = "telephonenumber", nullable = true, length = 45)
    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    @Basic
    @Column(name = "epfnumber", nullable = true, length = 45)
    public String getEpfnumber() {
        return epfnumber;
    }

    public void setEpfnumber(String epfnumber) {
        this.epfnumber = epfnumber;
    }

    @Basic
    @Column(name = "etfnumber", nullable = true, length = 45)
    public String getEtfnumber() {
        return etfnumber;
    }

    public void setEtfnumber(String etfnumber) {
        this.etfnumber = etfnumber;
    }

    @Basic
    @Column(name = "officenumber", nullable = true, length = 45)
    public String getOfficenumber() {
        return officenumber;
    }

    public void setOfficenumber(String officenumber) {
        this.officenumber = officenumber;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

        EmployeeEntity that = (EmployeeEntity) o;

        if (idemployee != that.idemployee) return false;
        if (status != that.status) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (fistname != null ? !fistname.equals(that.fistname) : that.fistname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (fullname != null ? !fullname.equals(that.fullname) : that.fullname != null) return false;
        if (dateofbirth != null ? !dateofbirth.equals(that.dateofbirth) : that.dateofbirth != null) return false;
        if (idnumber != null ? !idnumber.equals(that.idnumber) : that.idnumber != null) return false;
        if (passportnumber != null ? !passportnumber.equals(that.passportnumber) : that.passportnumber != null)
            return false;
        if (maritalstatus != null ? !maritalstatus.equals(that.maritalstatus) : that.maritalstatus != null)
            return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (residentialaddress != null ? !residentialaddress.equals(that.residentialaddress) : that.residentialaddress != null)
            return false;
        if (telephonenumber != null ? !telephonenumber.equals(that.telephonenumber) : that.telephonenumber != null)
            return false;
        if (epfnumber != null ? !epfnumber.equals(that.epfnumber) : that.epfnumber != null) return false;
        if (etfnumber != null ? !etfnumber.equals(that.etfnumber) : that.etfnumber != null) return false;
        if (officenumber != null ? !officenumber.equals(that.officenumber) : that.officenumber != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return icon != null ? icon.equals(that.icon) : that.icon == null;
    }

    @Override
    public int hashCode() {
        int result = idemployee;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (fistname != null ? fistname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (dateofbirth != null ? dateofbirth.hashCode() : 0);
        result = 31 * result + (idnumber != null ? idnumber.hashCode() : 0);
        result = 31 * result + (passportnumber != null ? passportnumber.hashCode() : 0);
        result = 31 * result + (maritalstatus != null ? maritalstatus.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (residentialaddress != null ? residentialaddress.hashCode() : 0);
        result = 31 * result + (telephonenumber != null ? telephonenumber.hashCode() : 0);
        result = 31 * result + (epfnumber != null ? epfnumber.hashCode() : 0);
        result = 31 * result + (etfnumber != null ? etfnumber.hashCode() : 0);
        result = 31 * result + (officenumber != null ? officenumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "employeeByEmployeeIdemployee")
    public Collection<UsersEntity> getUserssByIdemployee() {
        return userssByIdemployee;
    }

    public void setUserssByIdemployee(Collection<UsersEntity> userssByIdemployee) {
        this.userssByIdemployee = userssByIdemployee;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "employeeByEmployeeIdemployee")
    public Collection<SalaryadvanceEntity> getSalaryadvancesByIdemployee() {
        return salaryadvancesByIdemployee;
    }

    public void setSalaryadvancesByIdemployee(Collection<SalaryadvanceEntity> salaryadvancesByIdemployee) {
        this.salaryadvancesByIdemployee = salaryadvancesByIdemployee;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "employeeByEmployeeIdemployee")
    public Collection<TableheadsorderEntity> getTableheadsordersByIdemployee() {
        return tableheadsordersByIdemployee;
    }

    public void setTableheadsordersByIdemployee(Collection<TableheadsorderEntity> tableheadsordersByIdemployee) {
        this.tableheadsordersByIdemployee = tableheadsordersByIdemployee;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "employeeByEmployeeIdemployee")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdemployee() {
        return menusalesinvoicesByIdemployee;
    }

    public void setMenusalesinvoicesByIdemployee(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdemployee) {
        this.menusalesinvoicesByIdemployee = menusalesinvoicesByIdemployee;
    }
}