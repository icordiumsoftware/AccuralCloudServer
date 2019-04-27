package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "menusalesitems", schema = "erp", catalog = "")
public class MenusalesitemsEntity {
    private int idmenusalesitems;
    private int menusalesinvoiceIdmenusalesinvoice;
    private int menuitemIdmenuitem;
    private Double costamount;
    private Double saleamount;
    private Double qty;
    private Double discount;
    private MenusalesinvoiceEntity menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice;
    private MenuitemEntity menuitemByMenuitemIdmenuitem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenusalesitems", nullable = false)
    public int getIdmenusalesitems() {
        return idmenusalesitems;
    }

    public void setIdmenusalesitems(int idmenusalesitems) {
        this.idmenusalesitems = idmenusalesitems;
    }

    @Basic
    @Column(name = "menusalesinvoice_idmenusalesinvoice", nullable = false)
    public int getMenusalesinvoiceIdmenusalesinvoice() {
        return menusalesinvoiceIdmenusalesinvoice;
    }

    public void setMenusalesinvoiceIdmenusalesinvoice(int menusalesinvoiceIdmenusalesinvoice) {
        this.menusalesinvoiceIdmenusalesinvoice = menusalesinvoiceIdmenusalesinvoice;
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
    @Column(name = "costamount", nullable = true, precision = 0)
    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    @Basic
    @Column(name = "saleamount", nullable = true, precision = 0)
    public Double getSaleamount() {
        return saleamount;
    }

    public void setSaleamount(Double saleamount) {
        this.saleamount = saleamount;
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
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenusalesitemsEntity that = (MenusalesitemsEntity) o;

        if (idmenusalesitems != that.idmenusalesitems) return false;
        if (menusalesinvoiceIdmenusalesinvoice != that.menusalesinvoiceIdmenusalesinvoice) return false;
        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        if (costamount != null ? !costamount.equals(that.costamount) : that.costamount != null) return false;
        if (saleamount != null ? !saleamount.equals(that.saleamount) : that.saleamount != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        return discount != null ? discount.equals(that.discount) : that.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idmenusalesitems;
        result = 31 * result + menusalesinvoiceIdmenusalesinvoice;
        result = 31 * result + menuitemIdmenuitem;
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        result = 31 * result + (saleamount != null ? saleamount.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "menusalesinvoice_idmenusalesinvoice", referencedColumnName = "idmenusalesinvoice", nullable = false, insertable = false, updatable = false)
    public MenusalesinvoiceEntity getMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice() {
        return menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice;
    }

    public void setMenusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice(MenusalesinvoiceEntity menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice) {
        this.menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice = menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice;
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