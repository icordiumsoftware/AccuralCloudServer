package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "product_has_menuitem", schema = "erp", catalog = "")
public class ProductHasMenuitemEntity {
    private int idproductHasMenuitem;
    private int productIdproduct;
    private int menuitemIdmenuitem;
    private double qty;
    private ProductEntity productByProductIdproduct;
    private MenuitemEntity menuitemByMenuitemIdmenuitem;

    @Id
    @Column(name = "idproduct_has_menuitem", nullable = false)
    public int getIdproductHasMenuitem() {
        return idproductHasMenuitem;
    }

    public void setIdproductHasMenuitem(int idproductHasMenuitem) {
        this.idproductHasMenuitem = idproductHasMenuitem;
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
    @Column(name = "menuitem_idmenuitem", nullable = false)
    public int getMenuitemIdmenuitem() {
        return menuitemIdmenuitem;
    }

    public void setMenuitemIdmenuitem(int menuitemIdmenuitem) {
        this.menuitemIdmenuitem = menuitemIdmenuitem;
    }

    @Basic
    @Column(name = "qty", nullable = false, precision = 0)
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductHasMenuitemEntity that = (ProductHasMenuitemEntity) o;

        if (idproductHasMenuitem != that.idproductHasMenuitem) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        return Double.compare(that.qty, qty) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idproductHasMenuitem;
        result = 31 * result + productIdproduct;
        result = 31 * result + menuitemIdmenuitem;
        temp = Double.doubleToLongBits(qty);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByProductIdproduct() {
        return productByProductIdproduct;
    }

    public void setProductByProductIdproduct(ProductEntity productByProductIdproduct) {
        this.productByProductIdproduct = productByProductIdproduct;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "menuitem_idmenuitem", referencedColumnName = "idmenuitem", nullable = false, insertable = false, updatable = false)
    public MenuitemEntity getMenuitemByMenuitemIdmenuitem() {
        return menuitemByMenuitemIdmenuitem;
    }

    public void setMenuitemByMenuitemIdmenuitem(MenuitemEntity menuitemByMenuitemIdmenuitem) {
        this.menuitemByMenuitemIdmenuitem = menuitemByMenuitemIdmenuitem;
    }
}