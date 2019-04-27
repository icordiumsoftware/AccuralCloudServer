package com.icordium.server.controller.datamodel;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ISH on 3/14/2019.
 */
@Entity
@Table(name = "locationtranferdataproduct", schema = "erp", catalog = "")
public class LocationtranferdataproductEntity {
    private int idlocationtranferdataproduct;
    private Timestamp regdatetime;
    private int productIdproduct;
    private Double qty;
    private Double freeqty;
    private Double settofffreeqty;
    private Double settoffqty;
    private Double retailprice;
    private Double costprice;
    private Double wholesaleprice;
    private int tolocation;
    private int locationIdlocation;
    private int locationtranferhedderIdlocationtranferhedder;
    private ProductEntity productByProductIdproduct;
    private LocationEntity locationByTolocation;
    private LocationEntity locationByLocationIdlocation;
    private LocationtranferhedderEntity locationtranferhedderByLocationtranferhedderIdlocationtranferhedder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlocationtranferdataproduct")
    public int getIdlocationtranferdataproduct() {
        return idlocationtranferdataproduct;
    }

    public void setIdlocationtranferdataproduct(int idlocationtranferdataproduct) {
        this.idlocationtranferdataproduct = idlocationtranferdataproduct;
    }

    @Basic
    @Column(name = "regdatetime")
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "product_idproduct")
    public int getProductIdproduct() {
        return productIdproduct;
    }

    public void setProductIdproduct(int productIdproduct) {
        this.productIdproduct = productIdproduct;
    }

    @Basic
    @Column(name = "qty")
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "freeqty")
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
    }

    @Basic
    @Column(name = "settofffreeqty")
    public Double getSettofffreeqty() {
        return settofffreeqty;
    }

    public void setSettofffreeqty(Double settofffreeqty) {
        this.settofffreeqty = settofffreeqty;
    }

    @Basic
    @Column(name = "settoffqty")
    public Double getSettoffqty() {
        return settoffqty;
    }

    public void setSettoffqty(Double settoffqty) {
        this.settoffqty = settoffqty;
    }

    @Basic
    @Column(name = "retailprice")
    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    @Basic
    @Column(name = "costprice")
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "wholesaleprice")
    public Double getWholesaleprice() {
        return wholesaleprice;
    }

    public void setWholesaleprice(Double wholesaleprice) {
        this.wholesaleprice = wholesaleprice;
    }

    @Basic
    @Column(name = "tolocation")
    public int getTolocation() {
        return tolocation;
    }

    public void setTolocation(int tolocation) {
        this.tolocation = tolocation;
    }

    @Basic
    @Column(name = "location_idlocation")
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "locationtranferhedder_idlocationtranferhedder")
    public int getLocationtranferhedderIdlocationtranferhedder() {
        return locationtranferhedderIdlocationtranferhedder;
    }

    public void setLocationtranferhedderIdlocationtranferhedder(int locationtranferhedderIdlocationtranferhedder) {
        this.locationtranferhedderIdlocationtranferhedder = locationtranferhedderIdlocationtranferhedder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationtranferdataproductEntity that = (LocationtranferdataproductEntity) o;

        if (idlocationtranferdataproduct != that.idlocationtranferdataproduct) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (tolocation != that.tolocation) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (locationtranferhedderIdlocationtranferhedder != that.locationtranferhedderIdlocationtranferhedder)
            return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (settofffreeqty != null ? !settofffreeqty.equals(that.settofffreeqty) : that.settofffreeqty != null)
            return false;
        if (settoffqty != null ? !settoffqty.equals(that.settoffqty) : that.settoffqty != null) return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        return wholesaleprice != null ? wholesaleprice.equals(that.wholesaleprice) : that.wholesaleprice == null;
    }

    @Override
    public int hashCode() {
        int result = idlocationtranferdataproduct;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + productIdproduct;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (settofffreeqty != null ? settofffreeqty.hashCode() : 0);
        result = 31 * result + (settoffqty != null ? settoffqty.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (wholesaleprice != null ? wholesaleprice.hashCode() : 0);
        result = 31 * result + tolocation;
        result = 31 * result + locationIdlocation;
        result = 31 * result + locationtranferhedderIdlocationtranferhedder;
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

    @ManyToOne
    @JoinColumn(name = "tolocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByTolocation() {
        return locationByTolocation;
    }

    public void setLocationByTolocation(LocationEntity locationByTolocation) {
        this.locationByTolocation = locationByTolocation;
    }

    @ManyToOne
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @ManyToOne
    @JoinColumn(name = "locationtranferhedder_idlocationtranferhedder", referencedColumnName = "idlocationtranferhedder", nullable = false, insertable = false, updatable = false)
    public LocationtranferhedderEntity getLocationtranferhedderByLocationtranferhedderIdlocationtranferhedder() {
        return locationtranferhedderByLocationtranferhedderIdlocationtranferhedder;
    }

    public void setLocationtranferhedderByLocationtranferhedderIdlocationtranferhedder(LocationtranferhedderEntity locationtranferhedderByLocationtranferhedderIdlocationtranferhedder) {
        this.locationtranferhedderByLocationtranferhedderIdlocationtranferhedder = locationtranferhedderByLocationtranferhedderIdlocationtranferhedder;
    }
}