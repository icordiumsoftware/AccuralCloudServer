package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ISH on 2/23/2019.
 */
@Entity
@Table(name = "cashinandcashout", schema = "erp", catalog = "")
public class CashinandcashoutEntity {
    private int idcashinandcashout;
    private int workshiftIdworkshift;
    private Double amount;
    private String description;
    private Timestamp regdatetime;
    private int locationIdlocation;
    private int usersIdusers;
    private Integer type;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;
    private LocationEntity locationByLocationIdlocation;
    private UsersEntity usersByUsersIdusers;

    @Id
    @Column(name = "idcashinandcashout")
    public int getIdcashinandcashout() {
        return idcashinandcashout;
    }

    public void setIdcashinandcashout(int idcashinandcashout) {
        this.idcashinandcashout = idcashinandcashout;
    }

    @Basic
    @Column(name = "workshift_idworkshift")
    public int getWorkshiftIdworkshift() {
        return workshiftIdworkshift;
    }

    public void setWorkshiftIdworkshift(int workshiftIdworkshift) {
        this.workshiftIdworkshift = workshiftIdworkshift;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "location_idlocation")
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashinandcashoutEntity that = (CashinandcashoutEntity) o;

        if (idcashinandcashout != that.idcashinandcashout) return false;
        if (workshiftIdworkshift != that.workshiftIdworkshift) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = idcashinandcashout;
        result = 31 * result + workshiftIdworkshift;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + usersIdusers;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "workshift_idworkshift", referencedColumnName = "idworkshift", nullable = false, insertable = false, updatable = false)
    public WorkshiftEntity getWorkshiftByWorkshiftIdworkshift() {
        return workshiftByWorkshiftIdworkshift;
    }

    public void setWorkshiftByWorkshiftIdworkshift(WorkshiftEntity workshiftByWorkshiftIdworkshift) {
        this.workshiftByWorkshiftIdworkshift = workshiftByWorkshiftIdworkshift;
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
}