package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tables", schema = "erp", catalog = "")
public class TablesEntity {
    private int idtables;
    private String tablesName;
    private String description;
    private String status;
    private int areasIdareas;
    private Collection<TableheadsEntity> tableheadssByIdtables;
    private AreasEntity areasByAreasIdareas;
    private int pending;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtables", nullable = false)
    public int getIdtables() {
        return idtables;
    }

    public void setIdtables(int idtables) {
        this.idtables = idtables;
    }

    @Basic
    @Column(name = "tablesName", nullable = true, length = 45)
    public String getTablesName() {
        return tablesName;
    }

    public void setTablesName(String tablesName) {
        this.tablesName = tablesName;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "areas_idareas", nullable = false)
    public int getAreasIdareas() {
        return areasIdareas;
    }

    public void setAreasIdareas(int areasIdareas) {
        this.areasIdareas = areasIdareas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablesEntity that = (TablesEntity) o;

        if (idtables != that.idtables) return false;
        if (areasIdareas != that.areasIdareas) return false;
        if (tablesName != null ? !tablesName.equals(that.tablesName) : that.tablesName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idtables;
        result = 31 * result + (tablesName != null ? tablesName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + areasIdareas;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "tablesByTablesIdtables")
    public Collection<TableheadsEntity> getTableheadssByIdtables() {
        return tableheadssByIdtables;
    }

    public void setTableheadssByIdtables(Collection<TableheadsEntity> tableheadssByIdtables) {
        this.tableheadssByIdtables = tableheadssByIdtables;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "areas_idareas", referencedColumnName = "idareas", nullable = false, insertable = false, updatable = false)
    public AreasEntity getAreasByAreasIdareas() {
        return areasByAreasIdareas;
    }

    public void setAreasByAreasIdareas(AreasEntity areasByAreasIdareas) {
        this.areasByAreasIdareas = areasByAreasIdareas;
    }

    @Basic
    @Column(name = "pending")
    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }
}