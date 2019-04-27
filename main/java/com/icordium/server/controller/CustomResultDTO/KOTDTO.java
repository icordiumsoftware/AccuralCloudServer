package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by ISH on 2/14/2019.
 */
public class KOTDTO {
    @JsonProperty("OrderNo")
    int OrderNo;
    @JsonProperty("Area")
    String Area;
    @JsonProperty("Cashier")
    String Employee;
    @JsonProperty("Employee")
    String Cashier;
    @JsonProperty("Table")
    String Table;
    @JsonProperty("TableHeads")
    String TableHeads;
    @JsonProperty("KOTItems")
    List<KOTItems> kotItemss;

    public String getEmployee() {
        return this.Employee;
    }

    public void setEmployee(String employee) {
        this.Employee = employee;
    }

    public String getCashier() {
        return this.Cashier;
    }

    public void setCashier(String cashier) {
        this.Cashier = cashier;
    }


    public String getArea() {
        return this.Area;
    }

    public void setArea(String area) {
        this.Area = area;
    }

    public String getTable() {
        return this.Table;
    }

    public void setTable(String table) {
        this.Table = table;
    }

    public String getTableHeads() {
        return this.TableHeads;
    }

    public void setTableHeads(String tableHeads) {
        this.TableHeads = tableHeads;
    }

    public List<KOTItems> getKotItemss() {
        return this.kotItemss;
    }

    public void setKotItemss(List<KOTItems> kotItemss) {
        this.kotItemss = kotItemss;
    }

    public int getOrderNo() {
        return this.OrderNo;
    }

    public void setOrderNo(int orderNo) {
        this.OrderNo = orderNo;
    }
}