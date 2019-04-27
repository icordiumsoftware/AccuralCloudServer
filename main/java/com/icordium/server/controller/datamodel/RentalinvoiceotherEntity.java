package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rentalinvoiceother", schema = "erp", catalog = "")
public class RentalinvoiceotherEntity {
    private int idrentalinvoiceother;
    private String description;
    private Double qty;
    private Double freeqty;
    private Double price;
    private Double amount;
    private Double discount;
    private int rentalinvoiceIdrentalinvoice;
    private RentalinvoiceEntity rentalinvoiceByRentalinvoiceIdrentalinvoice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalinvoiceother", nullable = false)
    public int getIdrentalinvoiceother() {
        return idrentalinvoiceother;
    }

    public void setIdrentalinvoiceother(int idrentalinvoiceother) {
        this.idrentalinvoiceother = idrentalinvoiceother;
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
    @Column(name = "rentalinvoice_idrentalinvoice", nullable = false)
    public int getRentalinvoiceIdrentalinvoice() {
        return rentalinvoiceIdrentalinvoice;
    }

    public void setRentalinvoiceIdrentalinvoice(int rentalinvoiceIdrentalinvoice) {
        this.rentalinvoiceIdrentalinvoice = rentalinvoiceIdrentalinvoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalinvoiceotherEntity that = (RentalinvoiceotherEntity) o;

        if (idrentalinvoiceother != that.idrentalinvoiceother) return false;
        if (rentalinvoiceIdrentalinvoice != that.rentalinvoiceIdrentalinvoice) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        return discount != null ? discount.equals(that.discount) : that.discount == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalinvoiceother;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + rentalinvoiceIdrentalinvoice;
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
}