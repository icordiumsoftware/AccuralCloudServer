package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user_has_location", schema = "erp", catalog = "")
public class UserHasLocationEntity {
    private int iduserHasLocation;
    private int usersIdusers;
    private int locationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser_has_location", nullable = false)
    public int getIduserHasLocation() {
        return iduserHasLocation;
    }

    public void setIduserHasLocation(int iduserHasLocation) {
        this.iduserHasLocation = iduserHasLocation;
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

        UserHasLocationEntity that = (UserHasLocationEntity) o;

        if (iduserHasLocation != that.iduserHasLocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        return locationIdlocation == that.locationIdlocation;
    }

    @Override
    public int hashCode() {
        int result = iduserHasLocation;
        result = 31 * result + usersIdusers;
        result = 31 * result + locationIdlocation;
        return result;
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
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }
}