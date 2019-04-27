package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "stock", schema = "erp", catalog = "")
public class StockEntity {
    private int idstock;
    private int idproduct;
    private int idlocation;
    private Double qtyinhand;
    private ProductEntity productByIdproduct;
    private LocationEntity locationByIdlocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstock", nullable = false)
    public int getIdstock() {
        return idstock;
    }

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    @Basic
    @Column(name = "idproduct", nullable = false)
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Basic
    @Column(name = "idlocation", nullable = false)
    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
    }

    @Basic
    @Column(name = "qtyinhand", nullable = true, precision = 0)
    public Double getQtyinhand() {
        return qtyinhand;
    }

    public void setQtyinhand(Double qtyinhand) {
        this.qtyinhand = qtyinhand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockEntity that = (StockEntity) o;

        if (idstock != that.idstock) return false;
        if (idproduct != that.idproduct) return false;
        if (idlocation != that.idlocation) return false;
        return qtyinhand != null ? qtyinhand.equals(that.qtyinhand) : that.qtyinhand == null;
    }

    @Override
    public int hashCode() {
        int result = idstock;
        result = 31 * result + idproduct;
        result = 31 * result + idlocation;
        result = 31 * result + (qtyinhand != null ? qtyinhand.hashCode() : 0);
        return result;
    }

    //     @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByIdproduct() {
        return productByIdproduct;
    }

    public void setProductByIdproduct(ProductEntity productByIdproduct) {
        this.productByIdproduct = productByIdproduct;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByIdlocation() {
        return locationByIdlocation;
    }

    public void setLocationByIdlocation(LocationEntity locationByIdlocation) {
        this.locationByIdlocation = locationByIdlocation;
    }
}