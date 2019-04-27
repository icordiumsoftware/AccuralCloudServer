package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users_has_privilages", schema = "erp", catalog = "")
public class UsersHasPrivilagesEntity {
    private int usersIdusers;
    private int privilagesIdprivilages;
    private int idUsersHasPrivilages;
    private int locationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private PrivilagesEntity privilagesByPrivilagesIdprivilages;
    private LocationEntity locationByLocationIdlocation;

    @Basic
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Basic
    @Column(name = "privilages_idprivilages", nullable = false)
    public int getPrivilagesIdprivilages() {
        return privilagesIdprivilages;
    }

    public void setPrivilagesIdprivilages(int privilagesIdprivilages) {
        this.privilagesIdprivilages = privilagesIdprivilages;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users_has_privilages", nullable = false)
    public int getIdUsersHasPrivilages() {
        return idUsersHasPrivilages;
    }

    public void setIdUsersHasPrivilages(int idUsersHasPrivilages) {
        this.idUsersHasPrivilages = idUsersHasPrivilages;
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

        UsersHasPrivilagesEntity that = (UsersHasPrivilagesEntity) o;

        if (usersIdusers != that.usersIdusers) return false;
        if (privilagesIdprivilages != that.privilagesIdprivilages) return false;
        if (idUsersHasPrivilages != that.idUsersHasPrivilages) return false;
        return locationIdlocation == that.locationIdlocation;
    }

    @Override
    public int hashCode() {
        int result = usersIdusers;
        result = 31 * result + privilagesIdprivilages;
        result = 31 * result + idUsersHasPrivilages;
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
    @JoinColumn(name = "privilages_idprivilages", referencedColumnName = "idprivilages", nullable = false, insertable = false, updatable = false)
    public PrivilagesEntity getPrivilagesByPrivilagesIdprivilages() {
        return privilagesByPrivilagesIdprivilages;
    }

    public void setPrivilagesByPrivilagesIdprivilages(PrivilagesEntity privilagesByPrivilagesIdprivilages) {
        this.privilagesByPrivilagesIdprivilages = privilagesByPrivilagesIdprivilages;
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