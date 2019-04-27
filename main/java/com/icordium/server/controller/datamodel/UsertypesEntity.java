package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by ISH on 2/22/2019.
 */
@Entity
@Table(name = "usertypes", schema = "erp", catalog = "")
public class UsertypesEntity {
    private int idusertypes;
    private String usertype;
    private int status;
    private Collection<UsersEntity> userssByIdusertypes;

    @Id
    @Column(name = "idusertypes")
    public int getIdusertypes() {
        return idusertypes;
    }

    public void setIdusertypes(int idusertypes) {
        this.idusertypes = idusertypes;
    }

    @Basic
    @Column(name = "usertype")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsertypesEntity that = (UsertypesEntity) o;

        if (idusertypes != that.idusertypes) return false;
        if (status != that.status) return false;
        return usertype != null ? usertype.equals(that.usertype) : that.usertype == null;
    }

    @Override
    public int hashCode() {
        int result = idusertypes;
        result = 31 * result + (usertype != null ? usertype.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usertypesByUsertypesIdusertypes")
    public Collection<UsersEntity> getUserssByIdusertypes() {
        return userssByIdusertypes;
    }

    public void setUserssByIdusertypes(Collection<UsersEntity> userssByIdusertypes) {
        this.userssByIdusertypes = userssByIdusertypes;
    }
}