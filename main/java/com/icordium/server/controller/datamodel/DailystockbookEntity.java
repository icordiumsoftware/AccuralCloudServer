package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "dailystockbook", schema = "erp", catalog = "")
public class DailystockbookEntity {
    private int iddailystockbook;
    private Double actualstockqty;
    private Double targetreciveqty;
    private Double bookedorderqty;
    private Date date;
    private int productIdproduct;
    private int locationIdlocation;
    private ProductEntity productByProductIdproduct;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddailystockbook", nullable = false)
    public int getIddailystockbook() {
        return iddailystockbook;
    }

    public void setIddailystockbook(int iddailystockbook) {
        this.iddailystockbook = iddailystockbook;
    }

    @Basic
    @Column(name = "actualstockqty", nullable = true, precision = 0)
    public Double getActualstockqty() {
        return actualstockqty;
    }

    public void setActualstockqty(Double actualstockqty) {
        this.actualstockqty = actualstockqty;
    }

    @Basic
    @Column(name = "targetreciveqty", nullable = true, precision = 0)
    public Double getTargetreciveqty() {
        return targetreciveqty;
    }

    public void setTargetreciveqty(Double targetreciveqty) {
        this.targetreciveqty = targetreciveqty;
    }

    @Basic
    @Column(name = "bookedorderqty", nullable = true, precision = 0)
    public Double getBookedorderqty() {
        return bookedorderqty;
    }

    public void setBookedorderqty(Double bookedorderqty) {
        this.bookedorderqty = bookedorderqty;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

        DailystockbookEntity that = (DailystockbookEntity) o;

        if (iddailystockbook != that.iddailystockbook) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (actualstockqty != null ? !actualstockqty.equals(that.actualstockqty) : that.actualstockqty != null)
            return false;
        if (targetreciveqty != null ? !targetreciveqty.equals(that.targetreciveqty) : that.targetreciveqty != null)
            return false;
        if (bookedorderqty != null ? !bookedorderqty.equals(that.bookedorderqty) : that.bookedorderqty != null)
            return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = iddailystockbook;
        result = 31 * result + (actualstockqty != null ? actualstockqty.hashCode() : 0);
        result = 31 * result + (targetreciveqty != null ? targetreciveqty.hashCode() : 0);
        result = 31 * result + (bookedorderqty != null ? bookedorderqty.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + productIdproduct;
        result = 31 * result + locationIdlocation;
        return result;
    }

    @JsonIgnore
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
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }
}