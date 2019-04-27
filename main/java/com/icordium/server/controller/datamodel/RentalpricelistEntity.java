package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentalpricelist", schema = "erp", catalog = "")
public class RentalpricelistEntity {
    private int idrentalpricelist;
    private int productIdproduct;
    private Double startpoint;
    private Double endpoint;
    private Double rentalprice;
    private int rentalpricecategoryIdrentalpricecategory;
    private ProductEntity productByProductIdproduct;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalpricelist", nullable = false)
    public int getIdrentalpricelist() {
        return idrentalpricelist;
    }

    public void setIdrentalpricelist(int idrentalpricelist) {
        this.idrentalpricelist = idrentalpricelist;
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
    @Column(name = "startpoint", nullable = true, precision = 0)
    public Double getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(Double startpoint) {
        this.startpoint = startpoint;
    }

    @Basic
    @Column(name = "endpoint", nullable = true, precision = 0)
    public Double getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Double endpoint) {
        this.endpoint = endpoint;
    }

    @Basic
    @Column(name = "rentalprice", nullable = true, precision = 0)
    public Double getRentalprice() {
        return rentalprice;
    }

    public void setRentalprice(Double rentalprice) {
        this.rentalprice = rentalprice;
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

        RentalpricelistEntity that = (RentalpricelistEntity) o;

        if (idrentalpricelist != that.idrentalpricelist) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (rentalpricecategoryIdrentalpricecategory != that.rentalpricecategoryIdrentalpricecategory) return false;
        if (startpoint != null ? !startpoint.equals(that.startpoint) : that.startpoint != null) return false;
        if (endpoint != null ? !endpoint.equals(that.endpoint) : that.endpoint != null) return false;
        return rentalprice != null ? rentalprice.equals(that.rentalprice) : that.rentalprice == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalpricelist;
        result = 31 * result + productIdproduct;
        result = 31 * result + (startpoint != null ? startpoint.hashCode() : 0);
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        result = 31 * result + (rentalprice != null ? rentalprice.hashCode() : 0);
        result = 31 * result + rentalpricecategoryIdrentalpricecategory;
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
    @JoinColumn(name = "rentalpricecategory_idrentalpricecategory", referencedColumnName = "idrentalpricecategory", nullable = false, insertable = false, updatable = false)
    public RentalpricecategoryEntity getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryByRentalpricecategoryIdrentalpricecategory(RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryByRentalpricecategoryIdrentalpricecategory = rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }
}