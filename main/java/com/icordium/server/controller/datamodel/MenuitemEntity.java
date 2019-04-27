package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "menuitem", schema = "erp", catalog = "")
public class MenuitemEntity {
    private int idmenuitem;
    private String menuitem;
    private Integer status;
    private String icon;
    private int menutypeIdmenutype;
    private MenutypeEntity menutypeByMenutypeIdmenutype;
    private Collection<MenuitemHasLocationEntity> menuitemHasLocationsByIdmenuitem;
    private Collection<ProductHasMenuitemEntity> productHasMenuitemsByIdmenuitem;
    private Integer ordertype;
    private Double costprice;
    private Double selligprice;
    private Collection<TicketsEntity> ticketssByIdmenuitem;
    private Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdmenuitem;
    private Collection<MenusalesitemsEntity> menusalesitemssByIdmenuitem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenuitem", nullable = false)
    public int getIdmenuitem() {
        return idmenuitem;
    }

    public void setIdmenuitem(int idmenuitem) {
        this.idmenuitem = idmenuitem;
    }

    @Basic
    @Column(name = "menuitem", nullable = true, length = 45)
    public String getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(String menuitem) {
        this.menuitem = menuitem;
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
    @Column(name = "icon", nullable = true, length = -1)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "menutype_idmenutype", nullable = false)
    public int getMenutypeIdmenutype() {
        return menutypeIdmenutype;
    }

    public void setMenutypeIdmenutype(int menutypeIdmenutype) {
        this.menutypeIdmenutype = menutypeIdmenutype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuitemEntity that = (MenuitemEntity) o;

        if (idmenuitem != that.idmenuitem) return false;
        if (menutypeIdmenutype != that.menutypeIdmenutype) return false;
        if (menuitem != null ? !menuitem.equals(that.menuitem) : that.menuitem != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return icon != null ? icon.equals(that.icon) : that.icon == null;
    }

    @Override
    public int hashCode() {
        int result = idmenuitem;
        result = 31 * result + (menuitem != null ? menuitem.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + menutypeIdmenutype;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "menutype_idmenutype", referencedColumnName = "idmenutype", nullable = false, insertable = false, updatable = false)
    public MenutypeEntity getMenutypeByMenutypeIdmenutype() {
        return menutypeByMenutypeIdmenutype;
    }

    public void setMenutypeByMenutypeIdmenutype(MenutypeEntity menutypeByMenutypeIdmenutype) {
        this.menutypeByMenutypeIdmenutype = menutypeByMenutypeIdmenutype;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menuitemByMenuitemIdmenuitem")
    public Collection<MenuitemHasLocationEntity> getMenuitemHasLocationsByIdmenuitem() {
        return menuitemHasLocationsByIdmenuitem;
    }

    public void setMenuitemHasLocationsByIdmenuitem(Collection<MenuitemHasLocationEntity> menuitemHasLocationsByIdmenuitem) {
        this.menuitemHasLocationsByIdmenuitem = menuitemHasLocationsByIdmenuitem;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menuitemByMenuitemIdmenuitem")
    public Collection<ProductHasMenuitemEntity> getProductHasMenuitemsByIdmenuitem() {
        return productHasMenuitemsByIdmenuitem;
    }

    public void setProductHasMenuitemsByIdmenuitem(Collection<ProductHasMenuitemEntity> productHasMenuitemsByIdmenuitem) {
        this.productHasMenuitemsByIdmenuitem = productHasMenuitemsByIdmenuitem;
    }

    @Basic
    @Column(name = "ordertype", nullable = false)
    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    @Basic
    @Column(name = "costprice", nullable = true, precision = 0)
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "selligprice", nullable = true, precision = 0)
    public Double getSelligprice() {
        return selligprice;
    }

    public void setSelligprice(Double selligprice) {
        this.selligprice = selligprice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menuitemByMenuitemIdmenuitem")
    public Collection<TicketsEntity> getTicketssByIdmenuitem() {
        return ticketssByIdmenuitem;
    }

    public void setTicketssByIdmenuitem(Collection<TicketsEntity> ticketssByIdmenuitem) {
        this.ticketssByIdmenuitem = ticketssByIdmenuitem;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menuitemByMenuitemIdmenuitem")
    public Collection<MenusalesinvoiceproductEntity> getMenusalesinvoiceproductsByIdmenuitem() {
        return menusalesinvoiceproductsByIdmenuitem;
    }

    public void setMenusalesinvoiceproductsByIdmenuitem(Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdmenuitem) {
        this.menusalesinvoiceproductsByIdmenuitem = menusalesinvoiceproductsByIdmenuitem;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menuitemByMenuitemIdmenuitem")
    public Collection<MenusalesitemsEntity> getMenusalesitemssByIdmenuitem() {
        return menusalesitemssByIdmenuitem;
    }

    public void setMenusalesitemssByIdmenuitem(Collection<MenusalesitemsEntity> menusalesitemssByIdmenuitem) {
        this.menusalesitemssByIdmenuitem = menusalesitemssByIdmenuitem;
    }
}