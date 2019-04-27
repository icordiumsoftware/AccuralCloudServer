package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "goodrecivedataproduct", schema = "erp", catalog = "")
public class GoodrecivedataproductEntity {
    private int idgoodrecivedataproduct;
    private int goodrevicehedderIdgoodrevicehedder;
    private int productIdproduct;
    private Double qty;
    private Double freeqty;
    private Double costpriice;
    private Double retailprice;
    private Double wholesaleprice;
    private Double discountval;
    private Double costamount;
    private GoodrevicehedderEntity goodrevicehedderByGoodrevicehedderIdgoodrevicehedder;
    private ProductEntity productByProductIdproduct;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgoodrecivedataproduct", nullable = false)
    public int getIdgoodrecivedataproduct() {
        return idgoodrecivedataproduct;
    }

    public void setIdgoodrecivedataproduct(int idgoodrecivedataproduct) {
        this.idgoodrecivedataproduct = idgoodrecivedataproduct;
    }

    @Basic
    @Column(name = "goodrevicehedder_idgoodrevicehedder", nullable = false)
    public int getGoodrevicehedderIdgoodrevicehedder() {
        return goodrevicehedderIdgoodrevicehedder;
    }

    public void setGoodrevicehedderIdgoodrevicehedder(int goodrevicehedderIdgoodrevicehedder) {
        this.goodrevicehedderIdgoodrevicehedder = goodrevicehedderIdgoodrevicehedder;
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
    @Column(name = "costpriice", nullable = true, precision = 0)
    public Double getCostpriice() {
        return costpriice;
    }

    public void setCostpriice(Double costpriice) {
        this.costpriice = costpriice;
    }

    @Basic
    @Column(name = "retailprice", nullable = true, precision = 0)
    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    @Basic
    @Column(name = "wholesaleprice", nullable = true, precision = 0)
    public Double getWholesaleprice() {
        return wholesaleprice;
    }

    public void setWholesaleprice(Double wholesaleprice) {
        this.wholesaleprice = wholesaleprice;
    }

    @Basic
    @Column(name = "discountval", nullable = true, precision = 0)
    public Double getDiscountval() {
        return discountval;
    }

    public void setDiscountval(Double discountval) {
        this.discountval = discountval;
    }

    @Basic
    @Column(name = "costamount", nullable = true, precision = 0)
    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodrecivedataproductEntity that = (GoodrecivedataproductEntity) o;

        if (idgoodrecivedataproduct != that.idgoodrecivedataproduct) return false;
        if (goodrevicehedderIdgoodrevicehedder != that.goodrevicehedderIdgoodrevicehedder) return false;
        if (productIdproduct != that.productIdproduct) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (costpriice != null ? !costpriice.equals(that.costpriice) : that.costpriice != null) return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (wholesaleprice != null ? !wholesaleprice.equals(that.wholesaleprice) : that.wholesaleprice != null)
            return false;
        if (discountval != null ? !discountval.equals(that.discountval) : that.discountval != null) return false;
        return costamount != null ? costamount.equals(that.costamount) : that.costamount == null;
    }

    @Override
    public int hashCode() {
        int result = idgoodrecivedataproduct;
        result = 31 * result + goodrevicehedderIdgoodrevicehedder;
        result = 31 * result + productIdproduct;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (costpriice != null ? costpriice.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (wholesaleprice != null ? wholesaleprice.hashCode() : 0);
        result = 31 * result + (discountval != null ? discountval.hashCode() : 0);
        result = 31 * result + (costamount != null ? costamount.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "goodrevicehedder_idgoodrevicehedder", referencedColumnName = "idgoodrevicehedder", nullable = false, insertable = false, updatable = false)
    public GoodrevicehedderEntity getGoodrevicehedderByGoodrevicehedderIdgoodrevicehedder() {
        return goodrevicehedderByGoodrevicehedderIdgoodrevicehedder;
    }

    public void setGoodrevicehedderByGoodrevicehedderIdgoodrevicehedder(GoodrevicehedderEntity goodrevicehedderByGoodrevicehedderIdgoodrevicehedder) {
        this.goodrevicehedderByGoodrevicehedderIdgoodrevicehedder = goodrevicehedderByGoodrevicehedderIdgoodrevicehedder;
    }


    @ManyToOne
    @JoinColumn(name = "product_idproduct", referencedColumnName = "idproduct", nullable = false, insertable = false, updatable = false)
    public ProductEntity getProductByProductIdproduct() {
        return productByProductIdproduct;
    }

    public void setProductByProductIdproduct(ProductEntity productByProductIdproduct) {
        this.productByProductIdproduct = productByProductIdproduct;
    }
}