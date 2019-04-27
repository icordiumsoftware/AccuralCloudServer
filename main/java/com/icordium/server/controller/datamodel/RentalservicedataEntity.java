package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rentalservicedata", schema = "erp", catalog = "")
public class RentalservicedataEntity {
    private int idrentalservicedata;
    private int rentalinvoiceIdrentalinvoice;
    private Double qty;
    private Double freeqty;
    private Double price;
    private Double amount;
    private Double discount;
    private Timestamp rentaldate;
    private Timestamp returndate;
    private int serviceIdservice;
    private Double costtotal;
    private RentalinvoiceEntity rentalinvoiceByRentalinvoiceIdrentalinvoice;
    private ServiceEntity serviceByServiceIdservice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalservicedata", nullable = false)
    public int getIdrentalservicedata() {
        return idrentalservicedata;
    }

    public void setIdrentalservicedata(int idrentalservicedata) {
        this.idrentalservicedata = idrentalservicedata;
    }

    @Basic
    @Column(name = "rentalinvoice_idrentalinvoice", nullable = false)
    public int getRentalinvoiceIdrentalinvoice() {
        return rentalinvoiceIdrentalinvoice;
    }

    public void setRentalinvoiceIdrentalinvoice(int rentalinvoiceIdrentalinvoice) {
        this.rentalinvoiceIdrentalinvoice = rentalinvoiceIdrentalinvoice;
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
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
    @Column(name = "rentaldate", nullable = true)
    public Timestamp getRentaldate() {
        return rentaldate;
    }

    public void setRentaldate(Timestamp rentaldate) {
        this.rentaldate = rentaldate;
    }

    @Basic
    @Column(name = "returndate", nullable = true)
    public Timestamp getReturndate() {
        return returndate;
    }

    public void setReturndate(Timestamp returndate) {
        this.returndate = returndate;
    }

    @Basic
    @Column(name = "service_idservice", nullable = false)
    public int getServiceIdservice() {
        return serviceIdservice;
    }

    public void setServiceIdservice(int serviceIdservice) {
        this.serviceIdservice = serviceIdservice;
    }

    @Basic
    @Column(name = "costtotal", nullable = true, precision = 0)
    public Double getCosttotal() {
        return costtotal;
    }

    public void setCosttotal(Double costtotal) {
        this.costtotal = costtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalservicedataEntity that = (RentalservicedataEntity) o;

        if (idrentalservicedata != that.idrentalservicedata) return false;
        if (rentalinvoiceIdrentalinvoice != that.rentalinvoiceIdrentalinvoice) return false;
        if (serviceIdservice != that.serviceIdservice) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (rentaldate != null ? !rentaldate.equals(that.rentaldate) : that.rentaldate != null) return false;
        if (returndate != null ? !returndate.equals(that.returndate) : that.returndate != null) return false;
        return costtotal != null ? costtotal.equals(that.costtotal) : that.costtotal == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalservicedata;
        result = 31 * result + rentalinvoiceIdrentalinvoice;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (rentaldate != null ? rentaldate.hashCode() : 0);
        result = 31 * result + (returndate != null ? returndate.hashCode() : 0);
        result = 31 * result + serviceIdservice;
        result = 31 * result + (costtotal != null ? costtotal.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rentalinvoice_idrentalinvoice", referencedColumnName = "idrentalinvoice", nullable = false, insertable = false, updatable = false)
    public RentalinvoiceEntity getRentalinvoiceByRentalinvoiceIdrentalinvoice() {
        return rentalinvoiceByRentalinvoiceIdrentalinvoice;
    }

    public void setRentalinvoiceByRentalinvoiceIdrentalinvoice(RentalinvoiceEntity rentalinvoiceByRentalinvoiceIdrentalinvoice) {
        this.rentalinvoiceByRentalinvoiceIdrentalinvoice = rentalinvoiceByRentalinvoiceIdrentalinvoice;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "service_idservice", referencedColumnName = "idservice", nullable = false, insertable = false, updatable = false)
    public ServiceEntity getServiceByServiceIdservice() {
        return serviceByServiceIdservice;
    }

    public void setServiceByServiceIdservice(ServiceEntity serviceByServiceIdservice) {
        this.serviceByServiceIdservice = serviceByServiceIdservice;
    }
}