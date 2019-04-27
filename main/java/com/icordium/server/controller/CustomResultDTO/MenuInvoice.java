package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by ISH on 2/16/2019.
 */
public class MenuInvoice {
    @JsonProperty("TPLINE")
    String TPLINE;
    @JsonProperty("TableID")
    String TableID;
    @JsonProperty("HeadID")
    String HeadID;
    @JsonProperty("Cashier")
    String Cashier;
    @JsonProperty("Employee")
    String Employee;
    @JsonProperty("Address")
    String Address;
    @JsonProperty("CurrencyType")
    String CurrencyType;
    @JsonProperty("SubTotal")
    double SubTotal;
    @JsonProperty("Total")
    double Total;
    @JsonProperty("Tendered")
    double Tendered;
    @JsonProperty("Paid")
    double Paid;
    @JsonProperty("Due")
    double Due;
    @JsonProperty("logo")
    String logo;
    @JsonProperty("InvoiceTypeName")
    String InvoiceTypeName;
    @JsonProperty("LogoStatus")
    String LogoStatus;
    @JsonProperty("invoiceItemsList")
    List<MenuInvoiceItems> invoiceItemsList;

    public String getTPLINE() {
        return TPLINE;
    }

    public void setTPLINE(String TPLINE) {
        this.TPLINE = TPLINE;
    }

    public String getTableID() {
        return TableID;
    }

    public void setTableID(String tableID) {
        TableID = tableID;
    }

    public String getHeadID() {
        return HeadID;
    }

    public void setHeadID(String headID) {
        HeadID = headID;
    }

    public String getCashier() {
        return Cashier;
    }

    public void setCashier(String cashier) {
        Cashier = cashier;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCurrencyType() {
        return CurrencyType;
    }

    public void setCurrencyType(String currencyType) {
        CurrencyType = currencyType;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double subTotal) {
        SubTotal = subTotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double getTendered() {
        return Tendered;
    }

    public void setTendered(double tendered) {
        Tendered = tendered;
    }

    public double getPaid() {
        return Paid;
    }

    public void setPaid(double paid) {
        Paid = paid;
    }

    public double getDue() {
        return Due;
    }

    public void setDue(double due) {
        Due = due;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInvoiceTypeName() {
        return InvoiceTypeName;
    }

    public void setInvoiceTypeName(String invoiceTypeName) {
        InvoiceTypeName = invoiceTypeName;
    }

    public String getLogoStatus() {
        return LogoStatus;
    }

    public void setLogoStatus(String logoStatus) {
        LogoStatus = logoStatus;
    }

    public List<MenuInvoiceItems> getInvoiceItemsList() {
        return invoiceItemsList;
    }

    public void setInvoiceItemsList(List<MenuInvoiceItems> invoiceItemsList) {
        this.invoiceItemsList = invoiceItemsList;
    }
}