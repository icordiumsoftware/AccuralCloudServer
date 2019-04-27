package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ISH on 2/16/2019.
 */
public class MenuInvoiceItems {
    @JsonProperty("id")
    int id;
    @JsonProperty("ItemName")
    String ItemName;
    @JsonProperty("qty")
    double qty;
    @JsonProperty("rowtotal")
    double rowtotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }


    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getRowtotal() {
        return rowtotal;
    }

    public void setRowtotal(double rowtotal) {
        this.rowtotal = rowtotal;
    }
}