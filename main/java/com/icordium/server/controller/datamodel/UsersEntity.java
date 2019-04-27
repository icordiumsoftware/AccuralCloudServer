package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "users", schema = "erp", catalog = "")
public class UsersEntity {
    private int idusers;
    private String usersname;
    private String password;
    private Integer status;
    private int employeeIdemployee;
    private Timestamp regdate;
    private Collection<BookingcartEntity> bookingcartsByIdusers;
    private Collection<GoodrevicehedderEntity> goodreviceheddersByIdusers;
    private Collection<LocationtranferhedderEntity> locationtranferheddersByIdusers;
    private Collection<ProducthistoryEntity> producthistoriesByIdusers;
    private Collection<RentoutedhedderEntity> rentoutedheddersByIdusers;
    private Collection<SaleshedderEntity> salesheddersByIdusers;
    private Collection<StockadjestmentEntity> stockadjestmentsByIdusers;
    private Collection<TradeEntity> tradesByIdusers;
    private Collection<UserHasLocationEntity> userHasLocationsByIdusers;
    private EmployeeEntity employeeByEmployeeIdemployee;
    private Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdusers;
    private Collection<SalaryadvanceEntity> salaryadvancesByIdusers;
    private Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdusers;
    private Collection<TableheadsorderEntity> tableheadsordersByIdusers;
    private Collection<WorkshiftEntity> workshiftsByIdusers;
    private int usertypesIdusertypes;
    private UsertypesEntity usertypesByUsertypesIdusertypes;
    private Collection<CashinandcashoutEntity> cashinandcashoutsByIdusers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusers", nullable = false)
    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    @Basic
    @Column(name = "usersname", nullable = true, length = 45)
    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    @JsonIgnore
    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "employee_idemployee", nullable = false)
    public int getEmployeeIdemployee() {
        return employeeIdemployee;
    }

    public void setEmployeeIdemployee(int employeeIdemployee) {
        this.employeeIdemployee = employeeIdemployee;
    }

    @Basic
    @Column(name = "regdate", nullable = true)
    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (idusers != that.idusers) return false;
        if (employeeIdemployee != that.employeeIdemployee) return false;
        if (usersname != null ? !usersname.equals(that.usersname) : that.usersname != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return regdate != null ? regdate.equals(that.regdate) : that.regdate == null;
    }

    @Override
    public int hashCode() {
        int result = idusers;
        result = 31 * result + (usersname != null ? usersname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + employeeIdemployee;
        result = 31 * result + (regdate != null ? regdate.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<BookingcartEntity> getBookingcartsByIdusers() {
        return bookingcartsByIdusers;
    }

    public void setBookingcartsByIdusers(Collection<BookingcartEntity> bookingcartsByIdusers) {
        this.bookingcartsByIdusers = bookingcartsByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<GoodrevicehedderEntity> getGoodreviceheddersByIdusers() {
        return goodreviceheddersByIdusers;
    }

    public void setGoodreviceheddersByIdusers(Collection<GoodrevicehedderEntity> goodreviceheddersByIdusers) {
        this.goodreviceheddersByIdusers = goodreviceheddersByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<LocationtranferhedderEntity> getLocationtranferheddersByIdusers() {
        return locationtranferheddersByIdusers;
    }

    public void setLocationtranferheddersByIdusers(Collection<LocationtranferhedderEntity> locationtranferheddersByIdusers) {
        this.locationtranferheddersByIdusers = locationtranferheddersByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<ProducthistoryEntity> getProducthistoriesByIdusers() {
        return producthistoriesByIdusers;
    }

    public void setProducthistoriesByIdusers(Collection<ProducthistoryEntity> producthistoriesByIdusers) {
        this.producthistoriesByIdusers = producthistoriesByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<RentoutedhedderEntity> getRentoutedheddersByIdusers() {
        return rentoutedheddersByIdusers;
    }

    public void setRentoutedheddersByIdusers(Collection<RentoutedhedderEntity> rentoutedheddersByIdusers) {
        this.rentoutedheddersByIdusers = rentoutedheddersByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<SaleshedderEntity> getSalesheddersByIdusers() {
        return salesheddersByIdusers;
    }

    public void setSalesheddersByIdusers(Collection<SaleshedderEntity> salesheddersByIdusers) {
        this.salesheddersByIdusers = salesheddersByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<StockadjestmentEntity> getStockadjestmentsByIdusers() {
        return stockadjestmentsByIdusers;
    }

    public void setStockadjestmentsByIdusers(Collection<StockadjestmentEntity> stockadjestmentsByIdusers) {
        this.stockadjestmentsByIdusers = stockadjestmentsByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<TradeEntity> getTradesByIdusers() {
        return tradesByIdusers;
    }

    public void setTradesByIdusers(Collection<TradeEntity> tradesByIdusers) {
        this.tradesByIdusers = tradesByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<UserHasLocationEntity> getUserHasLocationsByIdusers() {
        return userHasLocationsByIdusers;
    }

    public void setUserHasLocationsByIdusers(Collection<UserHasLocationEntity> userHasLocationsByIdusers) {
        this.userHasLocationsByIdusers = userHasLocationsByIdusers;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employee_idemployee", referencedColumnName = "idemployee", nullable = false, insertable = false, updatable = false)
    public EmployeeEntity getEmployeeByEmployeeIdemployee() {
        return employeeByEmployeeIdemployee;
    }

    public void setEmployeeByEmployeeIdemployee(EmployeeEntity employeeByEmployeeIdemployee) {
        this.employeeByEmployeeIdemployee = employeeByEmployeeIdemployee;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<UsersHasPrivilagesEntity> getUsersHasPrivilagesByIdusers() {
        return usersHasPrivilagesByIdusers;
    }

    public void setUsersHasPrivilagesByIdusers(Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdusers) {
        this.usersHasPrivilagesByIdusers = usersHasPrivilagesByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<SalaryadvanceEntity> getSalaryadvancesByIdusers() {
        return salaryadvancesByIdusers;
    }

    public void setSalaryadvancesByIdusers(Collection<SalaryadvanceEntity> salaryadvancesByIdusers) {
        this.salaryadvancesByIdusers = salaryadvancesByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<MenusalesinvoiceEntity> getMenusalesinvoicesByIdusers() {
        return menusalesinvoicesByIdusers;
    }

    public void setMenusalesinvoicesByIdusers(Collection<MenusalesinvoiceEntity> menusalesinvoicesByIdusers) {
        this.menusalesinvoicesByIdusers = menusalesinvoicesByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<TableheadsorderEntity> getTableheadsordersByIdusers() {
        return tableheadsordersByIdusers;
    }

    public void setTableheadsordersByIdusers(Collection<TableheadsorderEntity> tableheadsordersByIdusers) {
        this.tableheadsordersByIdusers = tableheadsordersByIdusers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<WorkshiftEntity> getWorkshiftsByIdusers() {
        return workshiftsByIdusers;
    }

    public void setWorkshiftsByIdusers(Collection<WorkshiftEntity> workshiftsByIdusers) {
        this.workshiftsByIdusers = workshiftsByIdusers;
    }

    @Basic
    @Column(name = "usertypes_idusertypes")
    public int getUsertypesIdusertypes() {
        return usertypesIdusertypes;
    }

    public void setUsertypesIdusertypes(int usertypesIdusertypes) {
        this.usertypesIdusertypes = usertypesIdusertypes;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usertypes_idusertypes", referencedColumnName = "idusertypes", nullable = false, insertable = false, updatable = false)
    public UsertypesEntity getUsertypesByUsertypesIdusertypes() {
        return usertypesByUsertypesIdusertypes;
    }

    public void setUsertypesByUsertypesIdusertypes(UsertypesEntity usertypesByUsertypesIdusertypes) {
        this.usertypesByUsertypesIdusertypes = usertypesByUsertypesIdusertypes;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByUsersIdusers")
    public Collection<CashinandcashoutEntity> getCashinandcashoutsByIdusers() {
        return cashinandcashoutsByIdusers;
    }

    public void setCashinandcashoutsByIdusers(Collection<CashinandcashoutEntity> cashinandcashoutsByIdusers) {
        this.cashinandcashoutsByIdusers = cashinandcashoutsByIdusers;
    }
}