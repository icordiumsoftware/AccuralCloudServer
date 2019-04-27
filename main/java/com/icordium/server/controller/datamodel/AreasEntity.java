package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "areas", schema = "erp", catalog = "")
public class AreasEntity {
    private int idareas;
    private String areasname;
    private Integer status;
    private LocationEntity locationByLocationIdlocation;
    private Collection<TablesEntity> tablesByIdareas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idareas", nullable = false)
    public int getIdareas() {
        return idareas;
    }

    public void setIdareas(int idareas) {
        this.idareas = idareas;
    }

    @Basic
    @Column(name = "areasname", nullable = true, length = 45)
    public String getAreasname() {
        return areasname;
    }

    public void setAreasname(String areasname) {
        this.areasname = areasname;
    }

    @Basic
    @Column(name = "status", nullable = true)
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

        AreasEntity that = (AreasEntity) o;

        if (idareas != that.idareas) return false;
        if (areasname != null ? !areasname.equals(that.areasname) : that.areasname != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idareas;
        result = 31 * result + (areasname != null ? areasname.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
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

    @OneToMany(mappedBy = "areasByAreasIdareas")
    public Collection<TablesEntity> getTablesByIdareas() {
        return tablesByIdareas;
    }

    public void setTablesByIdareas(Collection<TablesEntity> tablesByIdareas) {
        this.tablesByIdareas = tablesByIdareas;
    }
}