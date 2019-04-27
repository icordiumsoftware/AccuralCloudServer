package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ISH on 2/14/2019.
 */
public class KOTItems {
    @JsonProperty("id")
    int id;
    @JsonProperty("ItemName")
    String ItemName;
    @JsonProperty("qty")
    double qty;
    @JsonProperty("ordertype")
    private
    int OrderType;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return this.ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }


    public double getQty() {
        return this.qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public int getOrderType() {
        return OrderType;
    }

    public void setOrderType(int orderType) {
        OrderType = orderType;
    }
}