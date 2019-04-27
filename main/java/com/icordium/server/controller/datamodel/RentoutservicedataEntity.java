package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentoutservicedata", schema = "erp", catalog = "")
public class RentoutservicedataEntity {
    private int idrentoutservicedata;
    private Double costprice;
    private Double discount;
    private Double freeqty;
    private Integer isinvoiced;
    private Double price;
    private Double qty;
    private int rentoutedhedderIdrentoutedhedder;
    private int serviceIdservice;
    private RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    private ServiceEntity serviceByServiceIdservice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentoutservicedata", nullable = false)
    public int getIdrentoutservicedata() {
        return idrentoutservicedata;
    }

    public void setIdrentoutservicedata(int idrentoutservicedata) {
        this.idrentoutservicedata = idrentoutservicedata;
    }

    @Basic
    @Column(name = "costprice", nullable = true, precision = 0)
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
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
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
    }

    @Basic
    @Column(name = "isinvoiced", nullable = true)
    public Integer getIsinvoiced() {
        return isinvoiced;
    }

    public void setIsinvoiced(Integer isinvoiced) {
        this.isinvoiced = isinvoiced;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
    @Column(name = "rentoutedhedder_idrentoutedhedder", nullable = false)
    public int getRentoutedhedderIdrentoutedhedder() {
        return rentoutedhedderIdrentoutedhedder;
    }

    public void setRentoutedhedderIdrentoutedhedder(int rentoutedhedderIdrentoutedhedder) {
        this.rentoutedhedderIdrentoutedhedder = rentoutedhedderIdrentoutedhedder;
    }

    @Basic
    @Column(name = "service_idservice", nullable = false)
    public int getServiceIdservice() {
        return serviceIdservice;
    }

    public void setServiceIdservice(int serviceIdservice) {
        this.serviceIdservice = serviceIdservice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentoutservicedataEntity entity = (RentoutservicedataEntity) o;

        if (idrentoutservicedata != entity.idrentoutservicedata) return false;
        if (rentoutedhedderIdrentoutedhedder != entity.rentoutedhedderIdrentoutedhedder) return false;
        if (serviceIdservice != entity.serviceIdservice) return false;
        if (costprice != null ? !costprice.equals(entity.costprice) : entity.costprice != null) return false;
        if (discount != null ? !discount.equals(entity.discount) : entity.discount != null) return false;
        if (freeqty != null ? !freeqty.equals(entity.freeqty) : entity.freeqty != null) return false;
        if (isinvoiced != null ? !isinvoiced.equals(entity.isinvoiced) : entity.isinvoiced != null) return false;
        if (price != null ? !price.equals(entity.price) : entity.price != null) return false;
        return qty != null ? qty.equals(entity.qty) : entity.qty == null;
    }

    @Override
    public int hashCode() {
        int result = idrentoutservicedata;
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (isinvoiced != null ? isinvoiced.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + rentoutedhedderIdrentoutedhedder;
        result = 31 * result + serviceIdservice;
        return result;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "rentoutedhedder_idrentoutedhedder", referencedColumnName = "idrentoutedhedder", nullable = false, insertable = false, updatable = false)
    public RentoutedhedderEntity getRentoutedhedderByRentoutedhedderIdrentoutedhedder() {
        return rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    }

    public void setRentoutedhedderByRentoutedhedderIdrentoutedhedder(RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder) {
        this.rentoutedhedderByRentoutedhedderIdrentoutedhedder = rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "service_idservice", referencedColumnName = "idservice", nullable = false, insertable = false, updatable = false)
    public ServiceEntity getServiceByServiceIdservice() {
        return serviceByServiceIdservice;
    }

    public void setServiceByServiceIdservice(ServiceEntity serviceByServiceIdservice) {
        this.serviceByServiceIdservice = serviceByServiceIdservice;
    }
}