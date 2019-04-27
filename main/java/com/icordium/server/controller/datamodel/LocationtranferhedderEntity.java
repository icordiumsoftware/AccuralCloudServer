package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by ISH on 3/16/2019.
 */
@Entity
@Table(name = "locationtranferhedder", schema = "erp", catalog = "")
public class LocationtranferhedderEntity {
    private int idlocationtranferhedder;
    private Timestamp regdatetime;
    private Double costamount;
    private Double retailamount;
    private Double wholesaleamount;
    private int usersIdusers;
    private int fromlocation;
    private int tolocation;
    private Integer status;
    private Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocationtranferhedder;
    private UsersEntity usersByUsersIdusers;
    private LocationEntity locationByFromlocation;
    private LocationEntity locationByTolocation;

    @Id
    @Column(name = "idlocationtranferhedder")
    public int getIdlocationtranferhedder() {
        return idlocationtranferhedder;
    }

    public void setIdlocationtranferhedder(int idlocationtranferhedder) {
        this.idlocationtranferhedder = idlocationtranferhedder;
    }

    @Basic
    @Column(name = "regdatetime")
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "costamount")
    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    @Basic
    @Column(name = "retailamount")
    public Double getRetailamount() {
        return retailamount;
    }

    public void setRetailamount(Double retailamount) {
        this.retailamount = retailamount;
    }

    @Basic
    @Column(name = "wholesaleamount")
    public Double getWholesaleamount() {
        return wholesaleamount;
    }

    public void setWholesaleamount(Double wholesaleamount) {
        this.wholesaleamount = wholesaleamount;
    }

    @Basic
    @Column(name = "users_idusers")
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Basic
    @Column(name = "fromlocation")
    public int getFromlocation() {
        return fromlocation;
    }

    public void setFromlocation(int fromlocation) {
        this.fromlocation = fromlocation;
    }

    @Basic
    @Column(name = "tolocation")
    public int getTolocation() {
        return tolocation;
    }

    public void setTolocation(int tolocation) {
        this.tolocation = tolocation;
    }

    @Basic
    @Column(name = "status")
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

        LocationtranferhedderEntity that = (LocationtranferhedderEntity) o;

        if (idlocationtranferhedder != that.idlocationtranferhedder) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (fromlocation != that.fromlocation) return false;
        if (tolocation != that.tolocation) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (costamount != null ? !costamount.equals(that.costamount) : that.costamount != null) return false;
        if (retailamount != null ? !retailamount.equals(that.retailamount) : that.retailamount != null) return false;
        if (wholesaleamount != null ? !wholesaleamount.equals(that.wholesaleamount) : that.wholesaleamount != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idlocationtranferhedder;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        result = 31 * result + (retailamount != null ? retailamount.hashCode() : 0);
        result = 31 * result + (wholesaleamount != null ? wholesaleamount.hashCode() : 0);
        result = 31 * result + usersIdusers;
        result = 31 * result + fromlocation;
        result = 31 * result + tolocation;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationtranferhedderByLocationtranferhedderIdlocationtranferhedder")
    public Collection<LocationtranferdataproductEntity> getLocationtranferdataproductsByIdlocationtranferhedder() {
        return locationtranferdataproductsByIdlocationtranferhedder;
    }

    public void setLocationtranferdataproductsByIdlocationtranferhedder(Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocationtranferhedder) {
        this.locationtranferdataproductsByIdlocationtranferhedder = locationtranferdataproductsByIdlocationtranferhedder;
    }

    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }

    @ManyToOne
    @JoinColumn(name = "fromlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByFromlocation() {
        return locationByFromlocation;
    }

    public void setLocationByFromlocation(LocationEntity locationByFromlocation) {
        this.locationByFromlocation = locationByFromlocation;
    }

    @ManyToOne
    @JoinColumn(name = "tolocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByTolocation() {
        return locationByTolocation;
    }

    public void setLocationByTolocation(LocationEntity locationByTolocation) {
        this.locationByTolocation = locationByTolocation;
    }
}