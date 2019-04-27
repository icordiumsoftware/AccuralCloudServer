package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentoutedother", schema = "erp", catalog = "")
public class RentoutedotherEntity {
    private int idrentoutedother;
    private int rentoutedhedderIdrentoutedhedder;
    private String description;
    private Double qty;
    private Double freeqty;
    private Double rate;
    private Integer isinvoiced;
    private RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentoutedother", nullable = false)
    public int getIdrentoutedother() {
        return idrentoutedother;
    }

    public void setIdrentoutedother(int idrentoutedother) {
        this.idrentoutedother = idrentoutedother;
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
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "rate", nullable = true, precision = 0)
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "isinvoiced", nullable = true)
    public Integer getIsinvoiced() {
        return isinvoiced;
    }

    public void setIsinvoiced(Integer isinvoiced) {
        this.isinvoiced = isinvoiced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentoutedotherEntity entity = (RentoutedotherEntity) o;

        if (idrentoutedother != entity.idrentoutedother) return false;
        if (rentoutedhedderIdrentoutedhedder != entity.rentoutedhedderIdrentoutedhedder) return false;
        if (description != null ? !description.equals(entity.description) : entity.description != null) return false;
        if (qty != null ? !qty.equals(entity.qty) : entity.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(entity.freeqty) : entity.freeqty != null) return false;
        if (rate != null ? !rate.equals(entity.rate) : entity.rate != null) return false;
        return isinvoiced != null ? isinvoiced.equals(entity.isinvoiced) : entity.isinvoiced == null;
    }

    @Override
    public int hashCode() {
        int result = idrentoutedother;
        result = 31 * result + rentoutedhedderIdrentoutedhedder;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (isinvoiced != null ? isinvoiced.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rentoutedhedder_idrentoutedhedder", referencedColumnName = "idrentoutedhedder", nullable = false, insertable = false, updatable = false)
    public RentoutedhedderEntity getRentoutedhedderByRentoutedhedderIdrentoutedhedder() {
        return rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    }

    public void setRentoutedhedderByRentoutedhedderIdrentoutedhedder(RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder) {
        this.rentoutedhedderByRentoutedhedderIdrentoutedhedder = rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    }
}