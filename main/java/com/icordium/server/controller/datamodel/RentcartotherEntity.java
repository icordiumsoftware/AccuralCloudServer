package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentcartother", schema = "erp", catalog = "")
public class RentcartotherEntity {
    private int idrentcartother;
    private String description;
    private Double price;
    private Double qty;
    private Double freeqty;
    private int cartIdcart;
    private BookingcartEntity bookingcartByCartIdcart;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentcartother", nullable = false)
    public int getIdrentcartother() {
        return idrentcartother;
    }

    public void setIdrentcartother(int idrentcartother) {
        this.idrentcartother = idrentcartother;
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
    @Column(name = "freeqty", nullable = true, precision = 0)
    public Double getFreeqty() {
        return freeqty;
    }

    public void setFreeqty(Double freeqty) {
        this.freeqty = freeqty;
    }

    @Basic
    @Column(name = "cart_idcart", nullable = false)
    public int getCartIdcart() {
        return cartIdcart;
    }

    public void setCartIdcart(int cartIdcart) {
        this.cartIdcart = cartIdcart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentcartotherEntity entity = (RentcartotherEntity) o;

        if (idrentcartother != entity.idrentcartother) return false;
        if (cartIdcart != entity.cartIdcart) return false;
        if (description != null ? !description.equals(entity.description) : entity.description != null) return false;
        if (price != null ? !price.equals(entity.price) : entity.price != null) return false;
        if (qty != null ? !qty.equals(entity.qty) : entity.qty != null) return false;
        return freeqty != null ? freeqty.equals(entity.freeqty) : entity.freeqty == null;
    }

    @Override
    public int hashCode() {
        int result = idrentcartother;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + cartIdcart;
        return result;
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