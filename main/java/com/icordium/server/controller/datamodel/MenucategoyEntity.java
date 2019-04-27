package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "menucategoy", schema = "erp", catalog = "")
public class MenucategoyEntity {
    private int idmenucategoy;
    private String menucategoy;
    private Integer status;
    private String icon;
    private Collection<MenutypeEntity> menutypesByIdmenucategoy;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenucategoy", nullable = false)
    public int getIdmenucategoy() {
        return idmenucategoy;
    }

    public void setIdmenucategoy(int idmenucategoy) {
        this.idmenucategoy = idmenucategoy;
    }

    @Basic
    @Column(name = "menucategoy", nullable = true, length = 45)
    public String getMenucategoy() {
        return menucategoy;
    }

    public void setMenucategoy(String menucategoy) {
        this.menucategoy = menucategoy;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenucategoyEntity that = (MenucategoyEntity) o;

        if (idmenucategoy != that.idmenucategoy) return false;
        if (menucategoy != null ? !menucategoy.equals(that.menucategoy) : that.menucategoy != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return icon != null ? icon.equals(that.icon) : that.icon == null;
    }

    @Override
    public int hashCode() {
        int result = idmenucategoy;
        result = 31 * result + (menucategoy != null ? menucategoy.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menucategoyByMenucategoyIdmenucategoy")
    public Collection<MenutypeEntity> getMenutypesByIdmenucategoy() {
        return menutypesByIdmenucategoy;
    }

    public void setMenutypesByIdmenucategoy(Collection<MenutypeEntity> menutypesByIdmenucategoy) {
        this.menutypesByIdmenucategoy = menutypesByIdmenucategoy;
    }
}