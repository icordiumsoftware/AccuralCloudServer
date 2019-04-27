package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentoutpricelist", schema = "erp", catalog = "")
public class RentoutpricelistEntity {
    private int idrentoutpricelist;
    private Double startpoint;
    private Double endpoint;
    private Double rentalprice;
    private int rentalpricecategoryIdrentalpricecategory;
    private int rentoutedproductdataIdrentoutedproductdata;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    private RentoutedproductdataEntity rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentoutpricelist", nullable = false)
    public int getIdrentoutpricelist() {
        return idrentoutpricelist;
    }

    public void setIdrentoutpricelist(int idrentoutpricelist) {
        this.idrentoutpricelist = idrentoutpricelist;
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

    @Basic
    @Column(name = "rentoutedproductdata_idrentoutedproductdata", nullable = false)
    public int getRentoutedproductdataIdrentoutedproductdata() {
        return rentoutedproductdataIdrentoutedproductdata;
    }

    public void setRentoutedproductdataIdrentoutedproductdata(int rentoutedproductdataIdrentoutedproductdata) {
        this.rentoutedproductdataIdrentoutedproductdata = rentoutedproductdataIdrentoutedproductdata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentoutpricelistEntity that = (RentoutpricelistEntity) o;

        if (idrentoutpricelist != that.idrentoutpricelist) return false;
        if (rentalpricecategoryIdrentalpricecategory != that.rentalpricecategoryIdrentalpricecategory) return false;
        if (rentoutedproductdataIdrentoutedproductdata != that.rentoutedproductdataIdrentoutedproductdata) return false;
        if (startpoint != null ? !startpoint.equals(that.startpoint) : that.startpoint != null) return false;
        if (endpoint != null ? !endpoint.equals(that.endpoint) : that.endpoint != null) return false;
        return rentalprice != null ? rentalprice.equals(that.rentalprice) : that.rentalprice == null;
    }

    @Override
    public int hashCode() {
        int result = idrentoutpricelist;
        result = 31 * result + (startpoint != null ? startpoint.hashCode() : 0);
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        result = 31 * result + (rentalprice != null ? rentalprice.hashCode() : 0);
        result = 31 * result + rentalpricecategoryIdrentalpricecategory;
        result = 31 * result + rentoutedproductdataIdrentoutedproductdata;
        return result;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rentoutedproductdata_idrentoutedproductdata", referencedColumnName = "idrentoutedproductdata", nullable = false, insertable = false, updatable = false)
    public RentoutedproductdataEntity getRentoutedproductdataByRentoutedproductdataIdrentoutedproductdata() {
        return rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata;
    }

    public void setRentoutedproductdataByRentoutedproductdataIdrentoutedproductdata(RentoutedproductdataEntity rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata) {
        this.rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata = rentoutedproductdataByRentoutedproductdataIdrentoutedproductdata;
    }
}