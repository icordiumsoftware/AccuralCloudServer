package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pendingalertlist", schema = "erp", catalog = "")
public class PendingalertlistEntity {
    private int idpendingalertlist;
    private Timestamp sheduledate;
    private String textmsg;
    private String revicer;
    private Integer type;
    private int locationIdlocation;
    private int status;
    private Timestamp updateddate;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @Column(name = "idpendingalertlist", nullable = false)
    public int getIdpendingalertlist() {
        return idpendingalertlist;
    }

    public void setIdpendingalertlist(int idpendingalertlist) {
        this.idpendingalertlist = idpendingalertlist;
    }

    @Basic
    @Column(name = "sheduledate", nullable = true)
    public Timestamp getSheduledate() {
        return sheduledate;
    }

    public void setSheduledate(Timestamp sheduledate) {
        this.sheduledate = sheduledate;
    }

    @Basic
    @Column(name = "textmsg", nullable = true, length = -1)
    public String getTextmsg() {
        return textmsg;
    }

    public void setTextmsg(String textmsg) {
        this.textmsg = textmsg;
    }

    @Basic
    @Column(name = "revicer", nullable = true, length = 45)
    public String getRevicer() {
        return revicer;
    }

    public void setRevicer(String revicer) {
        this.revicer = revicer;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "updateddate", nullable = true)
    public Timestamp getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Timestamp updateddate) {
        this.updateddate = updateddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingalertlistEntity that = (PendingalertlistEntity) o;

        if (idpendingalertlist != that.idpendingalertlist) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (status != that.status) return false;
        if (sheduledate != null ? !sheduledate.equals(that.sheduledate) : that.sheduledate != null) return false;
        if (textmsg != null ? !textmsg.equals(that.textmsg) : that.textmsg != null) return false;
        if (revicer != null ? !revicer.equals(that.revicer) : that.revicer != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return updateddate != null ? updateddate.equals(that.updateddate) : that.updateddate == null;
    }

    @Override
    public int hashCode() {
        int result = idpendingalertlist;
        result = 31 * result + (sheduledate != null ? sheduledate.hashCode() : 0);
        result = 31 * result + (textmsg != null ? textmsg.hashCode() : 0);
        result = 31 * result + (revicer != null ? revicer.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + status;
        result = 31 * result + (updateddate != null ? updateddate.hashCode() : 0);
        return result;
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