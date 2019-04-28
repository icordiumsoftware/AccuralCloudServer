package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tableheads", schema = "erp", catalog = "")
public class TableheadsEntity {
    private int idtableheads;
    private String tableheadsname;
    private Integer status;
    private int tablesIdtables;
    private TablesEntity tablesByTablesIdtables;
    private Collection<TableheadsorderEntity> tableheadsordersByIdtableheads;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdtableheads;
    private Integer pending;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtableheads", nullable = false)
    public int getIdtableheads() {
        return idtableheads;
    }

    public void setIdtableheads(int idtableheads) {
        this.idtableheads = idtableheads;
    }

    @Basic
    @Column(name = "tableheadsname", nullable = true, length = 45)
    public String getTableheadsname() {
        return tableheadsname;
    }

    public void setTableheadsname(String tableheadsname) {
        this.tableheadsname = tableheadsname;
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
    @Column(name = "tables_idtables", nullable = false)
    public int getTablesIdtables() {
        return tablesIdtables;
    }

    public void setTablesIdtables(int tablesIdtables) {
        this.tablesIdtables = tablesIdtables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableheadsEntity that = (TableheadsEntity) o;

        if (idtableheads != that.idtableheads) return false;
        if (tablesIdtables != that.tablesIdtables) return false;
        if (tableheadsname != null ? !tableheadsname.equals(that.tableheadsname) : that.tableheadsname != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idtableheads;
        result = 31 * result + (tableheadsname != null ? tableheadsname.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + tablesIdtables;
        return result;
    }

//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tables_idtables", referencedColumnName = "idtables", nullable = false, insertable = false, updatable = false)
    public TablesEntity getTablesByTablesIdtables() {
        return tablesByTablesIdtables;
    }

    public void setTablesByTablesIdtables(TablesEntity tablesByTablesIdtables) {
        this.tablesByTablesIdtables = tablesByTablesIdtables;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "tableheadsByTableheadsIdtableheads")
    public Collection<TableheadsorderEntity> getTableheadsordersByIdtableheads() {
        return tableheadsordersByIdtableheads;
    }

    public void setTableheadsordersByIdtableheads(Collection<TableheadsorderEntity> tableheadsordersByIdtableheads) {
        this.tableheadsordersByIdtableheads = tableheadsordersByIdtableheads;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "tableheadsByTableheadsIdtableheads")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdtableheads() {
        return menusalesinvoicesByIdtableheads;
    }

    public void setMenusalesinvoicesByIdtableheads(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdtableheads) {
        this.menusalesinvoicesByIdtableheads = menusalesinvoicesByIdtableheads;
    }

    @Basic
    @Column(name = "pending")
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }
}