package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "saledataservice", schema = "erp", catalog = "")
public class SaledataserviceEntity {
    private int idsaledataservice;
    private int saleshedderIdsaleshedder;
    private int serviceIdservice;
    private Double qty;
    private Double freeqty;
    private Double retailprice;
    private Double wholesaleprice;
    private Double costprice;
    private Double unitprice;
    private Double amount;
    private Double discount;
    private Double profit;
    private SaleshedderEntity saleshedderBySaleshedderIdsaleshedder;
    private ServiceEntity serviceByServiceIdservice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsaledataservice", nullable = false)
    public int getIdsaledataservice() {
        return idsaledataservice;
    }

    public void setIdsaledataservice(int idsaledataservice) {
        this.idsaledataservice = idsaledataservice;
    }

    @Basic
    @Column(name = "saleshedder_idsaleshedder", nullable = false)
    public int getSaleshedderIdsaleshedder() {
        return saleshedderIdsaleshedder;
    }

    public void setSaleshedderIdsaleshedder(int saleshedderIdsaleshedder) {
        this.saleshedderIdsaleshedder = saleshedderIdsaleshedder;
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
    @Column(name = "costprice", nullable = true, precision = 0)
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "unitprice", nullable = true, precision = 0)
    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
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
    @Column(name = "profit", nullable = true, precision = 0)
    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaledataserviceEntity that = (SaledataserviceEntity) o;

        if (idsaledataservice != that.idsaledataservice) return false;
        if (saleshedderIdsaleshedder != that.saleshedderIdsaleshedder) return false;
        if (serviceIdservice != that.serviceIdservice) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (freeqty != null ? !freeqty.equals(that.freeqty) : that.freeqty != null) return false;
        if (retailprice != null ? !retailprice.equals(that.retailprice) : that.retailprice != null) return false;
        if (wholesaleprice != null ? !wholesaleprice.equals(that.wholesaleprice) : that.wholesaleprice != null)
            return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        if (unitprice != null ? !unitprice.equals(that.unitprice) : that.unitprice != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        return profit != null ? profit.equals(that.profit) : that.profit == null;
    }

    @Override
    public int hashCode() {
        int result = idsaledataservice;
        result = 31 * result + saleshedderIdsaleshedder;
        result = 31 * result + serviceIdservice;
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (freeqty != null ? freeqty.hashCode() : 0);
        result = 31 * result + (retailprice != null ? retailprice.hashCode() : 0);
        result = 31 * result + (wholesaleprice != null ? wholesaleprice.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (unitprice != null ? unitprice.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (profit != null ? profit.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "saleshedder_idsaleshedder", referencedColumnName = "idsaleshedder", nullable = false, insertable = false, updatable = false)
    public SaleshedderEntity getSaleshedderBySaleshedderIdsaleshedder() {
        return saleshedderBySaleshedderIdsaleshedder;
    }

    public void setSaleshedderBySaleshedderIdsaleshedder(SaleshedderEntity saleshedderBySaleshedderIdsaleshedder) {
        this.saleshedderBySaleshedderIdsaleshedder = saleshedderBySaleshedderIdsaleshedder;
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