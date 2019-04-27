package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentcartservice", schema = "erp", catalog = "")
public class RentcartserviceEntity {
    private int idrentcartservice;
    private int serviceIdservice;
    private Double freeqty;
    private Double qty;
    private int cartIdcart;
    private Double discount;
    private ServiceEntity serviceByServiceIdservice;
    private BookingcartEntity bookingcartByCartIdcart;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentcartservice", nullable = false)
    public int getIdrentcartservice() {
        return idrentcartservice;
    }

    public void setIdrentcartservice(int idrentcartservice) {
        this.idrentcartservice = idrentcartservice;
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
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
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
    @Column(name = "cart_idcart", nullable = false)
    public int getCartIdcart() {
        return cartIdcart;
    }

    public void setCartIdcart(int cartIdcart) {
        this.cartIdcart = cartIdcart;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentcartserviceEntity entity = (RentcartserviceEntity) o;

        if (idrentcartservice != entity.idrentcartservice) return false;
        if (serviceIdservice != entity.serviceIdservice) return false;
        if (cartIdcart != entity.cartIdcart) return false;
        if (freeqty != null ? !freeqty.equals(entity.freeqty) : entity.freeqty != null) return false;
        if (qty != null ? !qty.equals(entity.qty) : entity.qty != null) return false;
        return discount != null ? discount.equals(entity.discount) : entity.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idrentcartservice;
        result = 31 * result + serviceIdservice;
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + cartIdcart;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cart_idcart", referencedColumnName = "bookingcart", nullable = false, insertable = false, updatable = false)
    public BookingcartEntity getBookingcartByCartIdcart() {
        return bookingcartByCartIdcart;
    }

    public void setBookingcartByCartIdcart(BookingcartEntity bookingcartByCartIdcart) {
        this.bookingcartByCartIdcart = bookingcartByCartIdcart;
    }
}