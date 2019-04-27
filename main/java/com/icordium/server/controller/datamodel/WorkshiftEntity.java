package com.icordium.server.controller.datamodel;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by ISH on 2/22/2019.
 */
@Entity
@Table(name = "workshift", schema = "erp", catalog = "")
public class WorkshiftEntity {
    private int idworkshift;
    private Double cashin;
    private Double cashout;
    private Double discount;
    private Timestamp end;
    private Double paidout;
    private Double pidin;
    private Double returned;
    private Double salesamount;
    private Timestamp start;
    private int locationIdlocation;
    private int usersIdusers;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdworkshift;
    private Collection<RentalinvoiceEntity> rentalinvoicesByIdworkshift;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdworkshift;
    private Collection<SalaryadvanceEntity> salaryadvancesByIdworkshift;
    private Collection<TradeEntity> tradesByIdworkshift;
    private LocationEntity locationByLocationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private Collection<CashinandcashoutEntity> cashinandcashoutsByIdworkshift;
    private Double cashinhand;
    private Double floatval;

    @Id
    @Column(name = "idworkshift")
    public int getIdworkshift() {
        return idworkshift;
    }

    public void setIdworkshift(int idworkshift) {
        this.idworkshift = idworkshift;
    }

    @Basic
    @Column(name = "cashin", precision = 0)
    public Double getCashin() {
        return cashin;
    }

    public void setCashin(Double cashin) {
        this.cashin = cashin;
    }

    @Basic
    @Column(name = "cashout", precision = 0)
    public Double getCashout() {
        return cashout;
    }

    public void setCashout(Double cashout) {
        this.cashout = cashout;
    }

    @Basic
    @Column(name = "discount", precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "end")
    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    @Basic
    @Column(name = "paidout", precision = 0)
    public Double getPaidout() {
        return paidout;
    }

    public void setPaidout(Double paidout) {
        this.paidout = paidout;
    }

    @Basic
    @Column(name = "pidin", precision = 0)
    public Double getPidin() {
        return pidin;
    }

    public void setPidin(Double pidin) {
        this.pidin = pidin;
    }

    @Basic
    @Column(name = "returned", precision = 0)
    public Double getReturned() {
        return returned;
    }

    public void setReturned(Double returned) {
        this.returned = returned;
    }

    @Basic
    @Column(name = "salesamount", precision = 0)
    public Double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(Double salesamount) {
        this.salesamount = salesamount;
    }

    @Basic
    @Column(name = "start")
    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Basic
    @Column(name = "location_idlocation")
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "users_idusers")
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkshiftEntity that = (WorkshiftEntity) o;

        if (idworkshift != that.idworkshift) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (cashin != null ? !cashin.equals(that.cashin) : that.cashin != null) return false;
        if (cashout != null ? !cashout.equals(that.cashout) : that.cashout != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (paidout != null ? !paidout.equals(that.paidout) : that.paidout != null) return false;
        if (pidin != null ? !pidin.equals(that.pidin) : that.pidin != null) return false;
        if (returned != null ? !returned.equals(that.returned) : that.returned != null) return false;
        if (salesamount != null ? !salesamount.equals(that.salesamount) : that.salesamount != null) return false;
        return start != null ? start.equals(that.start) : that.start == null;
    }

    @Override
    public int hashCode() {
        int result = idworkshift;
        result = 31 * result + (cashin != null ? cashin.hashCode() : 0);
        result = 31 * result + (cashout != null ? cashout.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (paidout != null ? paidout.hashCode() : 0);
        result = 31 * result + (pidin != null ? pidin.hashCode() : 0);
        result = 31 * result + (returned != null ? returned.hashCode() : 0);
        result = 31 * result + (salesamount != null ? salesamount.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + usersIdusers;
        return result;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdworkshift() {
        return menusalesinvoicesByIdworkshift;
    }

    public void setMenusalesinvoicesByIdworkshift(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdworkshift) {
        this.menusalesinvoicesByIdworkshift = menusalesinvoicesByIdworkshift;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<RentalinvoiceEntity> getRentalinvoicesByIdworkshift() {
        return rentalinvoicesByIdworkshift;
    }

    public void setRentalinvoicesByIdworkshift(Collection<RentalinvoiceEntity> rentalinvoicesByIdworkshift) {
        this.rentalinvoicesByIdworkshift = rentalinvoicesByIdworkshift;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdworkshift() {
        return rentoutedheddersByIdworkshift;
    }

    public void setRentoutedheddersByIdworkshift(Collection<RentoutedhedderEntity> rentoutedheddersByIdworkshift) {
        this.rentoutedheddersByIdworkshift = rentoutedheddersByIdworkshift;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<SalaryadvanceEntity> getSalaryadvancesByIdworkshift() {
        return salaryadvancesByIdworkshift;
    }

    public void setSalaryadvancesByIdworkshift(Collection<SalaryadvanceEntity> salaryadvancesByIdworkshift) {
        this.salaryadvancesByIdworkshift = salaryadvancesByIdworkshift;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<TradeEntity> getTradesByIdworkshift() {
        return tradesByIdworkshift;
    }

    public void setTradesByIdworkshift(Collection<TradeEntity> tradesByIdworkshift) {
        this.tradesByIdworkshift = tradesByIdworkshift;
    }

    @ManyToOne
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }

    @OneToMany(mappedBy = "workshiftByWorkshiftIdworkshift")
    public Collection<CashinandcashoutEntity> getCashinandcashoutsByIdworkshift() {
        return cashinandcashoutsByIdworkshift;
    }

    public void setCashinandcashoutsByIdworkshift(Collection<CashinandcashoutEntity> cashinandcashoutsByIdworkshift) {
        this.cashinandcashoutsByIdworkshift = cashinandcashoutsByIdworkshift;
    }

    @Basic
    @Column(name = "cashinhand")
    public Double getCashinhand() {
        return cashinhand;
    }

    public void setCashinhand(Double cashinhand) {
        this.cashinhand = cashinhand;
    }

    @Basic
    @Column(name = "floatval")
    public Double getFloatval() {
        return floatval;
    }

    public void setFloatval(Double floatval) {
        this.floatval = floatval;
    }
}