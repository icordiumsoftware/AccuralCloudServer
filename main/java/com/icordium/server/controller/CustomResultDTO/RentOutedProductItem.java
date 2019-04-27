package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RentOutedProductItem implements Serializable {

    @JsonProperty("id")
    private int id;
    @JsonProperty("Productid")
    private int Productid;
    @JsonProperty("discount")
    private double discount;
    @JsonProperty("qty")
    private double qty;
    @JsonProperty("freeqty")
    private double freeqty;

    //    @JsonCreator
//    public RentOutedProductItem(@JsonProperty("id")int id,@JsonProperty("productid") int productid,@JsonProperty("discount") double discount,@JsonProperty("qty") double qty,@JsonProperty("freeqty") double freeqty) {
//        this.id = id;
//        Productid = productid;
//        this.discount = discount;
//        this.qty = qty;
//        this.freeqty = freeqty;
//    }
    @JsonAnyGetter
    public int getId() {
        return id;
    }

    @JsonAnySetter
    public void setId(int id) {
        this.id = id;
    }

    @JsonAnyGetter
    public int getProductid() {
        return Productid;
    }

    @JsonAnySetter
    public void setProductid(int productid) {
        Productid = productid;
    }

    @JsonAnyGetter
    public double getDiscount() {
        return discount;
    }

    @JsonAnySetter
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @JsonAnyGetter
    public double getQty() {
        return qty;
    }

    @JsonAnySetter
    public void setQty(double qty) {
        this.qty = qty;
    }

    @JsonAnyGetter
    public double getFreeqty() {
        return freeqty;
    }

    @JsonAnySetter
    public void setFreeqty(double freeqty) {
        this.freeqty = freeqty;
    }
}