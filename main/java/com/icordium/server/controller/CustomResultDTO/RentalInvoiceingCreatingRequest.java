package com.icordium.server.controller.CustomResultDTO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RentalInvoiceingCreatingRequest implements Serializable {
    @JsonProperty("rentalrentoutedInvoice")
    private String rentalrentoutedInvoice;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("discount")
    private double discount;
    @JsonProperty("cashAmount")
    private double cashAmount;
    @JsonProperty("checkAmount")
    private double checkAmount;
    @JsonProperty("cardAmount")
    private double cardAmount;
    @JsonProperty("creditAmount")
    private double creditAmount;
    @JsonProperty("cardno")
    private String cardno;
    @JsonProperty("checkNo")
    private String checkNo;
    @JsonProperty("checkBankDate")
    private Date checkBankDate;
    @JsonProperty("bankId")
    private int bankId;
    @JsonProperty("rentOutedProductItems")
    private List<RentOutedProductItem> rentOutedProductItems;

    //    @JsonCreator
//    public RentalInvoiceingCreatingRequest(@JsonProperty("rentalrentoutedInvoice")String rentalrentoutedInvoice, @JsonProperty("startDate")Date startDate,@JsonProperty("endDate") Date endDate,@JsonProperty("amount") double amount, @JsonProperty("discount")double discount,@JsonProperty("cashAmount") double cashAmount,@JsonProperty("checkAmount") double checkAmount,@JsonProperty("cardAmount") double cardAmount,@JsonProperty("creditAmount") double creditAmount,@JsonProperty("cardno") String cardno,@JsonProperty("checkNo") String checkNo,@JsonProperty("checkBankDate") Date checkBankDate, @JsonProperty("bankId")int bankId, @JsonProperty("rentOutedProductItems")List<RentOutedProductItem> rentOutedProductItems) throws JSONException {
////        JSONObject myResponse = new JSONObject(result);
////        System.out.println("jsonrpc- "+myResponse.getString("jsonrpc"));
//
//        this.rentalrentoutedInvoice = rentalrentoutedInvoice;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.amount = amount;
//        this.discount = discount;
//        this.cashAmount = cashAmount;
//        this.checkAmount = checkAmount;
//        this.cardAmount = cardAmount;
//        this.creditAmount = creditAmount;
//        this.cardno = cardno;
//        this.checkNo = checkNo;
//        this.checkBankDate = checkBankDate;
//        this.bankId = bankId;
//        this.rentOutedProductItems = rentOutedProductItems;
//    }
    @JsonAnyGetter
    public String getRentalRentoutedInvoice() {
        return rentalrentoutedInvoice;
    }

    @JsonAnySetter
    public void setRentalRentoutedInvoice(String rentalrentoutedInvoice) {
        this.rentalrentoutedInvoice = rentalrentoutedInvoice;
    }

    @JsonAnyGetter
    public Date getStartDate() {
        return startDate;
    }

    @JsonAnySetter
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonAnyGetter
    public Date getEndDate() {
        return endDate;
    }

    @JsonAnySetter
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
    public double getCashAmount() {
        return cashAmount;
    }

    @JsonAnySetter
    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    @JsonAnyGetter
    public double getCheckAmount() {
        return checkAmount;
    }

    @JsonAnySetter
    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }

    @JsonAnyGetter
    public double getCardAmount() {
        return cardAmount;
    }

    @JsonAnySetter
    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    @JsonAnyGetter
    public double getCreditAmount() {
        return creditAmount;
    }

    @JsonAnySetter
    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    @JsonAnyGetter
    public String getCardno() {
        return cardno;
    }

    @JsonAnySetter
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @JsonAnyGetter
    public String getCheckNo() {
        return checkNo;
    }

    @JsonAnySetter
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    @JsonAnyGetter
    public Date getCheckBankDate() {
        return checkBankDate;
    }

    @JsonAnySetter
    public void setCheckBankDate(Date checkBankDate) {
        this.checkBankDate = checkBankDate;
    }

    @JsonAnyGetter
    public int getBankId() {
        return bankId;
    }

    @JsonAnySetter
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @JsonAnyGetter
    public List<RentOutedProductItem> getRentOutedProductItems() {
        return rentOutedProductItems;
    }

    @JsonAnySetter
    public void setRentOutedProductItems(List<RentOutedProductItem> rentOutedProductItems) {
        this.rentOutedProductItems = rentOutedProductItems;
    }

    @JsonAnyGetter
    public double getAmount() {
        return amount;
    }

    @JsonAnySetter
    public void setAmount(double amount) {
        this.amount = amount;
    }
}