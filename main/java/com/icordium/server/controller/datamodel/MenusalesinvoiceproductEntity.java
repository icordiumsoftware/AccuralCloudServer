package com.icordium.server.controller.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "menusalesinvoiceproduct", schema = "erp", catalog = "")
public class MenusalesinvoiceproductEntity {
    private int idmenusalesinvoiceproduct;
    private int menusalesinvoiceIdmenusalesinvoice;
    private int menuitemIdmenuitem;
    private int productIdproduct;
    private Double qty;
    private Double costamount;
    private Double salesamount;
    private MenusalesinvoiceEntity menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice;
    private MenuitemEntity menuitemByMenuitemIdmenuitem;
    private ProductEntity productByProductIdproduct;

    @Id
    @Column(name = "idmenusalesinvoiceproduct", nullable = false)
    public int getIdmenusalesinvoiceproduct() {
        return idmenusalesinvoiceproduct;
    }

    public void setIdmenusalesinvoiceproduct(int idmenusalesinvoiceproduct) {
        this.idmenusalesinvoiceproduct = idmenusalesinvoiceproduct;
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
    @Column(name = "product_idproduct", nullable = false)
    public int getProductIdproduct() {
        return productIdproduct;
    }

    public void setProductIdproduct(int productIdproduct) {
        this.productIdproduct = productIdproduct;
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
    @Column(name = "costamount", nullable = true, precision = 0)
    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    @Basic
    @Column(name = "salesamount", nullable = true, precision = 0)
    public Double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(Double salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenusalesinvoiceproductEntity that = (MenusalesinvoiceproductEntity) o;

        if (idmenusalesinvoiceproduct != that.idmenusalesinvoiceproduct) return false;
        if (menusalesinvoiceIdmenusalesinvoice != that.menusalesinvoiceIdmenusalesinvoice) return false;
        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (costamount != null ? !costamount.equals(that.costamount) : that.costamount != null) return false;
        return salesamount != null ? salesamount.equals(that.salesamount) : that.salesamount == null;
    }

    @Override
    public int hashCode() {
        int result = idmenusalesinvoiceproduct;
        result = 31 * result + menusalesinvoiceIdmenusalesinvoice;
        result = 31 * result + menuitemIdmenuitem;
        result = 31 * result + productIdproduct;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        result = 31 * result + (salesamount != null ? salesamount.hashCode() : 0);
        return result;
    }

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

    @ManyToOne
    @JoinColumn(name = "product_idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByProductIdproduct() {
        return productByProductIdproduct;
    }

    public void setProductByProductIdproduct(ProductEntity productByProductIdproduct) {
        this.productByProductIdproduct = productByProductIdproduct;
    }
}