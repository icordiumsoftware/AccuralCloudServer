package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "rentoutedproductdata", schema = "erp", catalog = "")
public class RentoutedproductdataEntity {
    private int idrentoutedproductdata;
    private Timestamp dilivereddatetime;
    private Timestamp returndatetime;
    private Timestamp regdatetime;
    private Double qty;
    private Double freeqty;
    private int hedderIdrentoutedhedder;
    private Double setoffqty;
    private Double setofffreeqty;
    private int productidproduct;
    private Double discount;
    private ProductEntity productByProductidproduct;
    private RentoutedhedderEntity rentoutedhedderByHedderIdrentoutedhedder;
    private Collection<RentoutpricelistEntity> rentoutpricelistsByIdrentoutedproductdata;
    private int rentalpricecategoryIdrentalpricecategory;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    private Integer isinvoiced;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentoutedproductdata", nullable = false)
    public int getIdrentoutedproductdata() {
        return idrentoutedproductdata;
    }

    public void setIdrentoutedproductdata(int idrentoutedproductdata) {
        this.idrentoutedproductdata = idrentoutedproductdata;
    }

    @Basic
    @Column(name = "dilivereddatetime", nullable = true)
    public Timestamp getDilivereddatetime() {
        return dilivereddatetime;
    }

    public void setDilivereddatetime(Timestamp dilivereddatetime) {
        this.dilivereddatetime = dilivereddatetime;
    }

    @Basic
    @Column(name = "returndatetime", nullable = true)
    public Timestamp getReturndatetime() {
        return returndatetime;
    }

    public void setReturndatetime(Timestamp returndatetime) {
        this.returndatetime = returndatetime;
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
    @Column(name = "qty", nullable = true, precision = 0)
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
    }

    @Basic
    @Column(name = "hedder_idrentoutedhedder", nullable = false)
    public int getHedderIdrentoutedhedder() {
        return hedderIdrentoutedhedder;
    }

    public void setHedderIdrentoutedhedder(int hedderIdrentoutedhedder) {
        this.hedderIdrentoutedhedder = hedderIdrentoutedhedder;
    }

    @Basic
    @Column(name = "setoffqty", nullable = true, precision = 0)
    public Double getSetoffqty() {
        return setoffqty;
    }

    public void setSetoffqty(Double setoffqty) {
        this.setoffqty = setoffqty;
    }

    @Basic
    @Column(name = "setofffreeqty", nullable = true, precision = 0)
    public Double getSetofffreeqty() {
        return setofffreeqty;
    }

    public void setSetofffreeqty(Double setofffreeqty) {
        this.setofffreeqty = setofffreeqty;
    }

    @Basic
    @Column(name = "productidproduct", nullable = false)
    public int getProductidproduct() {
        return productidproduct;
    }

    public void setProductidproduct(int productidproduct) {
        this.productidproduct = productidproduct;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "rentalpricecategory_idrentalpricecategory", nullable = false)
    public int getRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryIdrentalpricecategory(int rentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryIdrentalpricecategory = rentalpricecategoryIdrentalpricecategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentoutedproductdataEntity entity = (RentoutedproductdataEntity) o;

        if (idrentoutedproductdata != entity.idrentoutedproductdata) return false;
        if (hedderIdrentoutedhedder != entity.hedderIdrentoutedhedder) return false;
        if (productidproduct != entity.productidproduct) return false;
        if (dilivereddatetime != null ? !dilivereddatetime.equals(entity.dilivereddatetime) : entity.dilivereddatetime != null)
            return false;
        if (returndatetime != null ? !returndatetime.equals(entity.returndatetime) : entity.returndatetime != null)
            return false;
        if (regdatetime != null ? !regdatetime.equals(entity.regdatetime) : entity.regdatetime != null) return false;
        if (qty != null ? !qty.equals(entity.qty) : entity.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(entity.freeqty) : entity.freeqty != null) return false;
        if (setoffqty != null ? !setoffqty.equals(entity.setoffqty) : entity.setoffqty != null) return false;
        if (setofffreeqty != null ? !setofffreeqty.equals(entity.setofffreeqty) : entity.setofffreeqty != null)
            return false;
        return discount != null ? discount.equals(entity.discount) : entity.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idrentoutedproductdata;
        result = 31 * result + (dilivereddatetime != null ? dilivereddatetime.hashCode() : 0);
        result = 31 * result + (returndatetime != null ? returndatetime.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + hedderIdrentoutedhedder;
        result = 31 * result + (setoffqty != null ? setoffqty.hashCode() : 0);
        result = 31 * result + (setofffreeqty != null ? setofffreeqty.hashCode() : 0);
        result = 31 * result + productidproduct;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "productidproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByProductidproduct() {
        return productByProductidproduct;
    }

    public void setProductByProductidproduct(ProductEntity productByProductidproduct) {
        this.productByProductidproduct = productByProductidproduct;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "hedder_idrentoutedhedder", referencedColumnName = "idrentoutedhedder", nullable = false, insertable = false, updatable = false)
    public RentoutedhedderEntity getRentoutedhedderByHedderIdrentoutedhedder() {
        return rentoutedhedderByHedderIdrentoutedhedder;
    }

    public void setRentoutedhedderByHedderIdrentoutedhedder(RentoutedhedderEntity rentoutedhedderByHedderIdrentoutedhedder) {
        this.rentoutedhedderByHedderIdrentoutedhedder = rentoutedhedderByHedderIdrentoutedhedder;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata")
    public Collection<RentoutpricelistEntity> getRentoutpricelistsByIdrentoutedproductdata() {
        return rentoutpricelistsByIdrentoutedproductdata;
    }

    public void setRentoutpricelistsByIdrentoutedproductdata(Collection<RentoutpricelistEntity> rentoutpricelistsByIdrentoutedproductdata) {
        this.rentoutpricelistsByIdrentoutedproductdata = rentoutpricelistsByIdrentoutedproductdata;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rentalpricecategory_idrentalpricecategory", referencedColumnName = "idrentalpricecategory", nullable = false, insertable = false, updatable = false)
    public RentalpricecategoryEntity getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryByRentalpricecategoryIdrentalpricecategory(RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryByRentalpricecategoryIdrentalpricecategory = rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    @Basic
    @Column(name = "isinvoiced", nullable = true)
    public Integer getIsinvoiced() {
        return isinvoiced;
    }

    public void setIsinvoiced(Integer isinvoiced) {
        this.isinvoiced = isinvoiced;
    }
}