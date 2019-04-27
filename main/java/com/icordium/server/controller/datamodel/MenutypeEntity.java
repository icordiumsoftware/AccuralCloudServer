package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "menutype", schema = "erp", catalog = "")
public class MenutypeEntity {
    private int idmenutype;
    private String menutype;
    private Integer status;
    private String icon;
    private int menucategoyIdmenucategoy;
    private Collection<MenuitemEntity> menuitemsByIdmenutype;
    private MenucategoyEntity menucategoyByMenucategoyIdmenucategoy;

    @Id
    @Column(name = "idmenutype", nullable = false)
    public int getIdmenutype() {
        return idmenutype;
    }

    public void setIdmenutype(int idmenutype) {
        this.idmenutype = idmenutype;
    }

    @Basic
    @Column(name = "menutype", nullable = true, length = 45)
    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
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
    @Column(name = "menucategoy_idmenucategoy", nullable = false)
    public int getMenucategoyIdmenucategoy() {
        return menucategoyIdmenucategoy;
    }

    public void setMenucategoyIdmenucategoy(int menucategoyIdmenucategoy) {
        this.menucategoyIdmenucategoy = menucategoyIdmenucategoy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenutypeEntity that = (MenutypeEntity) o;

        if (idmenutype != that.idmenutype) return false;
        if (menucategoyIdmenucategoy != that.menucategoyIdmenucategoy) return false;
        if (menutype != null ? !menutype.equals(that.menutype) : that.menutype != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return icon != null ? icon.equals(that.icon) : that.icon == null;
    }

    @Override
    public int hashCode() {
        int result = idmenutype;
        result = 31 * result + (menutype != null ? menutype.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + menucategoyIdmenucategoy;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menutypeByMenutypeIdmenutype")
    public Collection<MenuitemEntity> getMenuitemsByIdmenutype() {
        return menuitemsByIdmenutype;
    }

    public void setMenuitemsByIdmenutype(Collection<MenuitemEntity> menuitemsByIdmenutype) {
        this.menuitemsByIdmenutype = menuitemsByIdmenutype;
    }

    @ManyToOne
    @JoinColumn(name = "menucategoy_idmenucategoy", referencedColumnName = "idmenucategoy", nullable = false, insertable = false, updatable = false)
    public MenucategoyEntity getMenucategoyByMenucategoyIdmenucategoy() {
        return menucategoyByMenucategoyIdmenucategoy;
    }

    public void setMenucategoyByMenucategoyIdmenucategoy(MenucategoyEntity menucategoyByMenucategoyIdmenucategoy) {
        this.menucategoyByMenucategoyIdmenucategoy = menucategoyByMenucategoyIdmenucategoy;
    }
}