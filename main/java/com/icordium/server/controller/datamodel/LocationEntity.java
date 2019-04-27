package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "location", schema = "erp", catalog = "")
public class LocationEntity {
    private int idlocation;
    private String description;
    private String adress;
    private int status;
    private String locationname;
    private Collection<BookingcartEntity> bookingcartsByIdlocation;
    private Collection<BookingproductEntity> bookingproductsByIdlocation;
    private Collection<BookingserviceEntity> bookingservicesByIdlocation;
    private Collection<DailystockbookEntity> dailystockbooksByIdlocation;
    private Collection<DailystockhistoryEntity> dailystockhistoriesByIdlocation;
    private Collection<GoodrevicehedderEntity> goodreviceheddersByIdlocation;
    private Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocation;
    private Collection<LocationtranferhedderEntity> locationtranferheddersByIdlocation;
    private Collection<LocationtranferhedderEntity> locationtranferheddersByIdlocation_0;
    private Collection<ProducthistoryEntity> producthistoriesByIdlocation;
    private Collection<RentalbookingEntity> rentalbookingsByIdlocation;
    private Collection<RentalotherEntity> rentalothersByIdlocation;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdlocation;
    private Collection<SaleshedderEntity> salesheddersByIdlocation;
    private Collection<StockEntity> stocksByIdlocation;
    private Collection<StockadjestmentEntity> stockadjestmentsByIdlocation;
    private Collection<TradeEntity> tradesByIdlocation;
    private Collection<TransactionEntity> transactionsByIdlocation;
    private Collection<UserHasLocationEntity> userHasLocationsByIdlocation;
    private Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdlocation;
    private String logo;
    private String companytittle;
    private Collection<RentalinvoiceEntity> rentalinvoicesByIdlocation;
    private Collection<PendingalertlistEntity> pendingalertlistsByIdlocation;
    private String reporthedder;
    private String reportfooter;
    private Collection<AreasEntity> areassByIdlocation;
    private Collection<TableheadsorderEntity> tableheadsordersByIdlocation;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdlocation;
    private String tpno;
    private String currencytype;
    private Collection<WorkshiftEntity> workshiftsByIdlocation;
    private Collection<CashinandcashoutEntity> cashinandcashoutsByIdlocation;
    private Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocation_0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlocation", nullable = false)
    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
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
    @Column(name = "adress", nullable = true, length = 45)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "locationname", nullable = true, length = 45)
    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (idlocation != that.idlocation) return false;
        if (status != that.status) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        return locationname != null ? locationname.equals(that.locationname) : that.locationname == null;
    }

    @Override
    public int hashCode() {
        int result = idlocation;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (locationname != null ? locationname.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<BookingcartEntity> getBookingcartsByIdlocation() {
        return bookingcartsByIdlocation;
    }

    public void setBookingcartsByIdlocation(Collection<BookingcartEntity> bookingcartsByIdlocation) {
        this.bookingcartsByIdlocation = bookingcartsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<BookingproductEntity> getBookingproductsByIdlocation() {
        return bookingproductsByIdlocation;
    }

    public void setBookingproductsByIdlocation(Collection<BookingproductEntity> bookingproductsByIdlocation) {
        this.bookingproductsByIdlocation = bookingproductsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<BookingserviceEntity> getBookingservicesByIdlocation() {
        return bookingservicesByIdlocation;
    }

    public void setBookingservicesByIdlocation(Collection<BookingserviceEntity> bookingservicesByIdlocation) {
        this.bookingservicesByIdlocation = bookingservicesByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<DailystockbookEntity> getDailystockbooksByIdlocation() {
        return dailystockbooksByIdlocation;
    }

    public void setDailystockbooksByIdlocation(Collection<DailystockbookEntity> dailystockbooksByIdlocation) {
        this.dailystockbooksByIdlocation = dailystockbooksByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<DailystockhistoryEntity> getDailystockhistoriesByIdlocation() {
        return dailystockhistoriesByIdlocation;
    }

    public void setDailystockhistoriesByIdlocation(Collection<DailystockhistoryEntity> dailystockhistoriesByIdlocation) {
        this.dailystockhistoriesByIdlocation = dailystockhistoriesByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<GoodrevicehedderEntity> getGoodreviceheddersByIdlocation() {
        return goodreviceheddersByIdlocation;
    }

    public void setGoodreviceheddersByIdlocation(Collection<GoodrevicehedderEntity> goodreviceheddersByIdlocation) {
        this.goodreviceheddersByIdlocation = goodreviceheddersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByTolocation")
    public Collection<LocationtranferdataproductEntity> getLocationtranferdataproductsByIdlocation() {
        return locationtranferdataproductsByIdlocation;
    }

    public void setLocationtranferdataproductsByIdlocation(Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocation) {
        this.locationtranferdataproductsByIdlocation = locationtranferdataproductsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByFromlocation")
    public Collection<LocationtranferhedderEntity> getLocationtranferheddersByIdlocation() {
        return locationtranferheddersByIdlocation;
    }

    public void setLocationtranferheddersByIdlocation(Collection<LocationtranferhedderEntity> locationtranferheddersByIdlocation) {
        this.locationtranferheddersByIdlocation = locationtranferheddersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByTolocation")
    public Collection<LocationtranferhedderEntity> getLocationtranferheddersByIdlocation_0() {
        return locationtranferheddersByIdlocation_0;
    }

    public void setLocationtranferheddersByIdlocation_0(Collection<LocationtranferhedderEntity> locationtranferheddersByIdlocation_0) {
        this.locationtranferheddersByIdlocation_0 = locationtranferheddersByIdlocation_0;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByIdlocation")
    public Collection<ProducthistoryEntity> getProducthistoriesByIdlocation() {
        return producthistoriesByIdlocation;
    }

    public void setProducthistoriesByIdlocation(Collection<ProducthistoryEntity> producthistoriesByIdlocation) {
        this.producthistoriesByIdlocation = producthistoriesByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<RentalbookingEntity> getRentalbookingsByIdlocation() {
        return rentalbookingsByIdlocation;
    }

    public void setRentalbookingsByIdlocation(Collection<RentalbookingEntity> rentalbookingsByIdlocation) {
        this.rentalbookingsByIdlocation = rentalbookingsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<RentalotherEntity> getRentalothersByIdlocation() {
        return rentalothersByIdlocation;
    }

    public void setRentalothersByIdlocation(Collection<RentalotherEntity> rentalothersByIdlocation) {
        this.rentalothersByIdlocation = rentalothersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation", fetch = FetchType.LAZY)
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdlocation() {
        return rentoutedheddersByIdlocation;
    }

    public void setRentoutedheddersByIdlocation(Collection<RentoutedhedderEntity> rentoutedheddersByIdlocation) {
        this.rentoutedheddersByIdlocation = rentoutedheddersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<SaleshedderEntity> getSalesheddersByIdlocation() {
        return salesheddersByIdlocation;
    }

    public void setSalesheddersByIdlocation(Collection<SaleshedderEntity> salesheddersByIdlocation) {
        this.salesheddersByIdlocation = salesheddersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByIdlocation")
    public Collection<StockEntity> getStocksByIdlocation() {
        return stocksByIdlocation;
    }

    public void setStocksByIdlocation(Collection<StockEntity> stocksByIdlocation) {
        this.stocksByIdlocation = stocksByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<StockadjestmentEntity> getStockadjestmentsByIdlocation() {
        return stockadjestmentsByIdlocation;
    }

    public void setStockadjestmentsByIdlocation(Collection<StockadjestmentEntity> stockadjestmentsByIdlocation) {
        this.stockadjestmentsByIdlocation = stockadjestmentsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<TradeEntity> getTradesByIdlocation() {
        return tradesByIdlocation;
    }

    public void setTradesByIdlocation(Collection<TradeEntity> tradesByIdlocation) {
        this.tradesByIdlocation = tradesByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<TransactionEntity> getTransactionsByIdlocation() {
        return transactionsByIdlocation;
    }

    public void setTransactionsByIdlocation(Collection<TransactionEntity> transactionsByIdlocation) {
        this.transactionsByIdlocation = transactionsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<UserHasLocationEntity> getUserHasLocationsByIdlocation() {
        return userHasLocationsByIdlocation;
    }

    public void setUserHasLocationsByIdlocation(Collection<UserHasLocationEntity> userHasLocationsByIdlocation) {
        this.userHasLocationsByIdlocation = userHasLocationsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<UsersHasPrivilagesEntity> getUsersHasPrivilagesByIdlocation() {
        return usersHasPrivilagesByIdlocation;
    }

    public void setUsersHasPrivilagesByIdlocation(Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdlocation) {
        this.usersHasPrivilagesByIdlocation = usersHasPrivilagesByIdlocation;
    }

    @Basic
    @Column(name = "logo", nullable = true, length = -1)
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "companytittle", nullable = true, length = -1)
    public String getCompanytittle() {
        return companytittle;
    }

    public void setCompanytittle(String companytittle) {
        this.companytittle = companytittle;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<RentalinvoiceEntity> getRentalinvoicesByIdlocation() {
        return rentalinvoicesByIdlocation;
    }

    public void setRentalinvoicesByIdlocation(Collection<RentalinvoiceEntity> rentalinvoicesByIdlocation) {
        this.rentalinvoicesByIdlocation = rentalinvoicesByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<PendingalertlistEntity> getPendingalertlistsByIdlocation() {
        return pendingalertlistsByIdlocation;
    }

    public void setPendingalertlistsByIdlocation(Collection<PendingalertlistEntity> pendingalertlistsByIdlocation) {
        this.pendingalertlistsByIdlocation = pendingalertlistsByIdlocation;
    }

    @Basic
    @Column(name = "reporthedder", nullable = true, length = -1)
    public String getReporthedder() {
        return reporthedder;
    }

    public void setReporthedder(String reporthedder) {
        this.reporthedder = reporthedder;
    }

    @Basic
    @Column(name = "reportfooter", nullable = true, length = -1)
    public String getReportfooter() {
        return reportfooter;
    }

    public void setReportfooter(String reportfooter) {
        this.reportfooter = reportfooter;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<AreasEntity> getAreassByIdlocation() {
        return areassByIdlocation;
    }

    public void setAreassByIdlocation(Collection<AreasEntity> areassByIdlocation) {
        this.areassByIdlocation = areassByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<TableheadsorderEntity> getTableheadsordersByIdlocation() {
        return tableheadsordersByIdlocation;
    }

    public void setTableheadsordersByIdlocation(Collection<TableheadsorderEntity> tableheadsordersByIdlocation) {
        this.tableheadsordersByIdlocation = tableheadsordersByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdlocation() {
        return menusalesinvoicesByIdlocation;
    }

    public void setMenusalesinvoicesByIdlocation(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdlocation) {
        this.menusalesinvoicesByIdlocation = menusalesinvoicesByIdlocation;
    }

    @Basic
    @Column(name = "tpno", nullable = true, length = 45)
    public String getTpno() {
        return tpno;
    }

    public void setTpno(String tpno) {
        this.tpno = tpno;
    }

    @Basic
    @Column(name = "currencytype", nullable = true, length = 45)
    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<WorkshiftEntity> getWorkshiftsByIdlocation() {
        return workshiftsByIdlocation;
    }

    public void setWorkshiftsByIdlocation(Collection<WorkshiftEntity> workshiftsByIdlocation) {
        this.workshiftsByIdlocation = workshiftsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<CashinandcashoutEntity> getCashinandcashoutsByIdlocation() {
        return cashinandcashoutsByIdlocation;
    }

    public void setCashinandcashoutsByIdlocation(Collection<CashinandcashoutEntity> cashinandcashoutsByIdlocation) {
        this.cashinandcashoutsByIdlocation = cashinandcashoutsByIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "locationByLocationIdlocation")
    public Collection<LocationtranferdataproductEntity> getLocationtranferdataproductsByIdlocation_0() {
        return locationtranferdataproductsByIdlocation_0;
    }

    public void setLocationtranferdataproductsByIdlocation_0(Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdlocation_0) {
        this.locationtranferdataproductsByIdlocation_0 = locationtranferdataproductsByIdlocation_0;
    }
}