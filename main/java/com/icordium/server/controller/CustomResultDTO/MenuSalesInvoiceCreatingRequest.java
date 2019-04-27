package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ISH on 2/18/2019.
 */
public class MenuSalesInvoiceCreatingRequest {
    @JsonProperty("tender")
    double tender;
    @JsonProperty("credit")
    double credit;
    @JsonProperty("userid")
    int userid;
    @JsonProperty("customer")
    int customer;
    @JsonProperty("headid")
    int headid;
    @JsonProperty("discount")
    double discount;
    @JsonProperty("employeeid")
    int employeeid;
    @JsonProperty("workPeriodID")
    int workPeriodID;

    public int getWorkPeriodID() {
        return workPeriodID;
    }

    public void setWorkPeriodID(int workPeriodID) {
        this.workPeriodID = workPeriodID;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getTender() {
        return tender;
    }

    public void setTender(double tender) {
        this.tender = tender;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHeadid() {
        return headid;
    }

    public void setHeadid(int headid) {
        this.headid = headid;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
}