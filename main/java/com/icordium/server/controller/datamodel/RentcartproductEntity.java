package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "rentcartproduct", schema = "erp", catalog = "")
public class RentcartproductEntity {
    private int idrentcartrentcartproduct;
    private int productIdproduct;
    private Double qty;
    private Double freeqty;
    private Timestamp startdate;
    private Date enddate;
    private int cartIdcart;
    private Double discount;
    private ProductEntity productByProductIdproduct;
    private BookingcartEntity bookingcartByCartIdcart;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentcartrentcartproduct", nullable = false)
    public int getIdrentcartrentcartproduct() {
        return idrentcartrentcartproduct;
    }

    public void setIdrentcartrentcartproduct(int idrentcartrentcartproduct) {
        this.idrentcartrentcartproduct = idrentcartrentcartproduct;
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
    @Column(name = "startdate", nullable = true)
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate", nullable = true)
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

        RentcartproductEntity entity = (RentcartproductEntity) o;

        if (idrentcartrentcartproduct != entity.idrentcartrentcartproduct) return false;
        if (productIdproduct != entity.productIdproduct) return false;
        if (cartIdcart != entity.cartIdcart) return false;
        if (qty != null ? !qty.equals(entity.qty) : entity.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(entity.freeqty) : entity.freeqty != null) return false;
        if (startdate != null ? !startdate.equals(entity.startdate) : entity.startdate != null) return false;
        if (enddate != null ? !enddate.equals(entity.enddate) : entity.enddate != null) return false;
        return discount != null ? discount.equals(entity.discount) : entity.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idrentcartrentcartproduct;
        result = 31 * result + productIdproduct;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + cartIdcart;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
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
    @JoinColumn(name = "cart_idcart", referencedColumnName = "bookingcart", nullable = false, insertable = false, updatable = false)
    public BookingcartEntity getBookingcartByCartIdcart() {
        return bookingcartByCartIdcart;
    }

    public void setBookingcartByCartIdcart(BookingcartEntity bookingcartByCartIdcart) {
        this.bookingcartByCartIdcart = bookingcartByCartIdcart;
    }
}