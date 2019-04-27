package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tickets", schema = "erp", catalog = "")
public class TicketsEntity {
    private int idtickets;
    private Integer ticketype;
    private Integer tableheadsorderIdtableheadsorder;
    private int menuitemIdmenuitem;
    private Double qty;
    private Double freeqty;
    private Integer status;
    private Timestamp regdatetime;
    private TableheadsorderEntity tableheadsorderByTableheadsorderIdtableheadsorder;
    private MenuitemEntity menuitemByMenuitemIdmenuitem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtickets", nullable = false)
    public int getIdtickets() {
        return idtickets;
    }

    public void setIdtickets(int idtickets) {
        this.idtickets = idtickets;
    }

    @Basic
    @Column(name = "ticketype", nullable = true)
    public Integer getTicketype() {
        return ticketype;
    }

    public void setTicketype(Integer ticketype) {
        this.ticketype = ticketype;
    }

    @Basic
    @Column(name = "tableheadsorder_idtableheadsorder", nullable = true)
    public Integer getTableheadsorderIdtableheadsorder() {
        return tableheadsorderIdtableheadsorder;
    }

    public void setTableheadsorderIdtableheadsorder(Integer tableheadsorderIdtableheadsorder) {
        this.tableheadsorderIdtableheadsorder = tableheadsorderIdtableheadsorder;
    }

    @Basic
    @Column(name = "menuitem_idmenuitem", nullable = false)
    public int getMenuitemIdmenuitem() {
        return menuitemIdmenuitem;
    }

    public void setMenuitemIdmenuitem(int menuitemIdmenuitem) {
        this.menuitemIdmenuitem = menuitemIdmenuitem;
    }

    @Basic
    @Column(name = "qty", nullable = true, precision = 0)
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
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
    @Column(name = "regdatetime", nullable = true)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketsEntity that = (TicketsEntity) o;

        if (idtickets != that.idtickets) return false;
        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        if (ticketype != null ? !ticketype.equals(that.ticketype) : that.ticketype != null) return false;
        if (tableheadsorderIdtableheadsorder != null ? !tableheadsorderIdtableheadsorder.equals(that.tableheadsorderIdtableheadsorder) : that.tableheadsorderIdtableheadsorder != null)
            return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return regdatetime != null ? regdatetime.equals(that.regdatetime) : that.regdatetime == null;
    }

    @Override
    public int hashCode() {
        int result = idtickets;
        result = 31 * result + (ticketype != null ? ticketype.hashCode() : 0);
        result = 31 * result + (tableheadsorderIdtableheadsorder != null ? tableheadsorderIdtableheadsorder.hashCode() : 0);
        result = 31 * result + menuitemIdmenuitem;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tableheadsorder_idtableheadsorder", referencedColumnName = "idtableheadsorder", insertable = false, updatable = false)
    public TableheadsorderEntity getTableheadsorderByTableheadsorderIdtableheadsorder() {
        return tableheadsorderByTableheadsorderIdtableheadsorder;
    }

    public void setTableheadsorderByTableheadsorderIdtableheadsorder(TableheadsorderEntity tableheadsorderByTableheadsorderIdtableheadsorder) {
        this.tableheadsorderByTableheadsorderIdtableheadsorder = tableheadsorderByTableheadsorderIdtableheadsorder;
    }

    @ManyToOne
    @JoinColumn(name = "menuitem_idmenuitem", referencedColumnName = "idmenuitem", nullable = false, insertable = false, updatable = false)
    public MenuitemEntity getMenuitemByMenuitemIdmenuitem() {
        return menuitemByMenuitemIdmenuitem;
    }

    public void setMenuitemByMenuitemIdmenuitem(MenuitemEntity menuitemByMenuitemIdmenuitem) {
        this.menuitemByMenuitemIdmenuitem = menuitemByMenuitemIdmenuitem;
    }
}