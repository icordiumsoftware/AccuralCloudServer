package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "menuitem_has_location", schema = "erp", catalog = "")
@IdClass(MenuitemHasLocationEntityPK.class)
public class MenuitemHasLocationEntity {
    private int menuitemIdmenuitem;
    private int locationIdlocation;
    private MenuitemEntity menuitemByMenuitemIdmenuitem;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuitem_idmenuitem", nullable = false)
    public int getMenuitemIdmenuitem() {
        return menuitemIdmenuitem;
    }

    public void setMenuitemIdmenuitem(int menuitemIdmenuitem) {
        this.menuitemIdmenuitem = menuitemIdmenuitem;
    }

    @Id
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuitemHasLocationEntity that = (MenuitemHasLocationEntity) o;

        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        return locationIdlocation == that.locationIdlocation;
    }

    @Override
    public int hashCode() {
        int result = menuitemIdmenuitem;
        result = 31 * result + locationIdlocation;
        return result;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }
}