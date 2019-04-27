package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "dailystockhistory", schema = "erp", catalog = "")
public class DailystockhistoryEntity {
    private int iddailystockhistory;
    private int productIdproduct;
    private Timestamp regdatetime;
    private Double reviceqty;
    private Double orderqty;
    private Double stockqty;
    private Date date;
    private String description;
    private String type;
    private Integer id;
    private int locationIdlocation;
    private Date actualdate;
    private ProductEntity productByProductIdproduct;
    private LocationEntity locationByLocationIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddailystockhistory", nullable = false)
    public int getIddailystockhistory() {
        return iddailystockhistory;
    }

    public void setIddailystockhistory(int iddailystockhistory) {
        this.iddailystockhistory = iddailystockhistory;
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
    @Column(name = "regdatetime", nullable = true)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "reviceqty", nullable = true, precision = 0)
    public Double getReviceqty() {
        return reviceqty;
    }

    public void setReviceqty(Double reviceqty) {
        this.reviceqty = reviceqty;
    }

    @Basic
    @Column(name = "orderqty", nullable = true, precision = 0)
    public Double getOrderqty() {
        return orderqty;
    }

    public void setOrderqty(Double orderqty) {
        this.orderqty = orderqty;
    }

    @Basic
    @Column(name = "stockqty", nullable = true, precision = 0)
    public Double getStockqty() {
        return stockqty;
    }

    public void setStockqty(Double stockqty) {
        this.stockqty = stockqty;
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
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "actualdate", nullable = true)
    public Date getActualdate() {
        return actualdate;
    }

    public void setActualdate(Date actualdate) {
        this.actualdate = actualdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailystockhistoryEntity that = (DailystockhistoryEntity) o;

        if (iddailystockhistory != that.iddailystockhistory) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (reviceqty != null ? !reviceqty.equals(that.reviceqty) : that.reviceqty != null) return false;
        if (orderqty != null ? !orderqty.equals(that.orderqty) : that.orderqty != null) return false;
        if (stockqty != null ? !stockqty.equals(that.stockqty) : that.stockqty != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return actualdate != null ? actualdate.equals(that.actualdate) : that.actualdate == null;
    }

    @Override
    public int hashCode() {
        int result = iddailystockhistory;
        result = 31 * result + productIdproduct;
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (reviceqty != null ? reviceqty.hashCode() : 0);
        result = 31 * result + (orderqty != null ? orderqty.hashCode() : 0);
        result = 31 * result + (stockqty != null ? stockqty.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + (actualdate != null ? actualdate.hashCode() : 0);
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