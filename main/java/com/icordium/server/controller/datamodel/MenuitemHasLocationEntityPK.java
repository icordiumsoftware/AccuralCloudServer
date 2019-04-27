package com.icordium.server.controller.datamodel;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MenuitemHasLocationEntityPK implements Serializable {
    private int menuitemIdmenuitem;
    private int locationIdlocation;

    @Column(name = "menuitem_idmenuitem", nullable = false)
    @Id
    public int getMenuitemIdmenuitem() {
        return menuitemIdmenuitem;
    }

    public void setMenuitemIdmenuitem(int menuitemIdmenuitem) {
        this.menuitemIdmenuitem = menuitemIdmenuitem;
    }

    @Column(name = "location_idlocation", nullable = false)
    @Id
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

        MenuitemHasLocationEntityPK that = (MenuitemHasLocationEntityPK) o;

        if (menuitemIdmenuitem != that.menuitemIdmenuitem) return false;
        return locationIdlocation == that.locationIdlocation;
    }

    @Override
    public int hashCode() {
        int result = menuitemIdmenuitem;
        result = 31 * result + locationIdlocation;
        return result;
    }
}