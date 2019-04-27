package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "menusalesinvoice", schema = "erp", catalog = "")
public class MenusalesinvoiceEntity {
    private int idmenusalesinvoice;
    private double costamount;
    private double grossamount;
    private double discount;
    private double salesamount;
    private Timestamp datetime;
    private int usersIdusers;
    private int employeeIdemployee;
    private int tableheadsIdtableheads;
    private double tender;
    private int locationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private EmployeeEntity employeeByEmployeeIdemployee;
    private TableheadsEntity tableheadsByTableheadsIdtableheads;
    private LocationEntity locationByLocationIdlocation;
    private Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdmenusalesinvoice;
    private Collection<MenusalesitemsEntity> menusalesitemssByIdmenusalesinvoice;
    private int transactionIdtransaction;
    private TransactionEntity transactionByTransactionIdtransaction;
    private int workshiftIdworkshift;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;
    private CustomersEntity customersByCustomersIdcustomers;
    private Integer customersIdcustomers;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenusalesinvoice", nullable = false)
    public int getIdmenusalesinvoice() {
        return idmenusalesinvoice;
    }

    public void setIdmenusalesinvoice(int idmenusalesinvoice) {
        this.idmenusalesinvoice = idmenusalesinvoice;
    }

    @Basic
    @Column(name = "costamount", nullable = true, precision = 0)
    public double getCostamount() {
        return costamount;
    }

    public void setCostamount(double costamount) {
        this.costamount = costamount;
    }

    @Basic
    @Column(name = "grossamount", nullable = true, precision = 0)
    public double getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(double grossamount) {
        this.grossamount = grossamount;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "salesamount", nullable = true, precision = 0)
    public double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }

    @Basic
    @Column(name = "datetime", nullable = true)
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Basic
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Basic
    @Column(name = "employee_idemployee", nullable = true)
    public int getEmployeeIdemployee() {
        return employeeIdemployee;
    }

    public void setEmployeeIdemployee(int employeeIdemployee) {
        this.employeeIdemployee = employeeIdemployee;
    }

    @Basic
    @Column(name = "tableheads_idtableheads", nullable = true)
    public int getTableheadsIdtableheads() {
        return tableheadsIdtableheads;
    }

    public void setTableheadsIdtableheads(int tableheadsIdtableheads) {
        this.tableheadsIdtableheads = tableheadsIdtableheads;
    }

    @Basic
    @Column(name = "tender", nullable = true, precision = 0)
    public double getTender() {
        return tender;
    }

    public void setTender(double tender) {
        this.tender = tender;
    }

    @Basic
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenusalesinvoiceEntity that = (MenusalesinvoiceEntity) o;

        if (idmenusalesinvoice != that.idmenusalesinvoice) return false;
        if (Double.compare(that.costamount, costamount) != 0) return false;
        if (Double.compare(that.grossamount, grossamount) != 0) return false;
        if (Double.compare(that.discount, discount) != 0) return false;
        if (Double.compare(that.salesamount, salesamount) != 0) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (employeeIdemployee != that.employeeIdemployee) return false;
        if (tableheadsIdtableheads != that.tableheadsIdtableheads) return false;
        if (Double.compare(that.tender, tender) != 0) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (transactionIdtransaction != that.transactionIdtransaction) return false;
        if (workshiftIdworkshift != that.workshiftIdworkshift) return false;
        if (datetime != null ? !datetime.equals(that.datetime) : that.datetime != null) return false;
        if (usersByUsersIdusers != null ? !usersByUsersIdusers.equals(that.usersByUsersIdusers) : that.usersByUsersIdusers != null)
            return false;
        if (employeeByEmployeeIdemployee != null ? !employeeByEmployeeIdemployee.equals(that.employeeByEmployeeIdemployee) : that.employeeByEmployeeIdemployee != null)
            return false;
        if (tableheadsByTableheadsIdtableheads != null ? !tableheadsByTableheadsIdtableheads.equals(that.tableheadsByTableheadsIdtableheads) : that.tableheadsByTableheadsIdtableheads != null)
            return false;
        if (locationByLocationIdlocation != null ? !locationByLocationIdlocation.equals(that.locationByLocationIdlocation) : that.locationByLocationIdlocation != null)
            return false;
        if (menusalesinvoiceproductsByIdmenusalesinvoice != null ? !menusalesinvoiceproductsByIdmenusalesinvoice.equals(that.menusalesinvoiceproductsByIdmenusalesinvoice) : that.menusalesinvoiceproductsByIdmenusalesinvoice != null)
            return false;
        if (menusalesitemssByIdmenusalesinvoice != null ? !menusalesitemssByIdmenusalesinvoice.equals(that.menusalesitemssByIdmenusalesinvoice) : that.menusalesitemssByIdmenusalesinvoice != null)
            return false;
        if (transactionByTransactionIdtransaction != null ? !transactionByTransactionIdtransaction.equals(that.transactionByTransactionIdtransaction) : that.transactionByTransactionIdtransaction != null)
            return false;
        if (workshiftByWorkshiftIdworkshift != null ? !workshiftByWorkshiftIdworkshift.equals(that.workshiftByWorkshiftIdworkshift) : that.workshiftByWorkshiftIdworkshift != null)
            return false;
        if (customersByCustomersIdcustomers != null ? !customersByCustomersIdcustomers.equals(that.customersByCustomersIdcustomers) : that.customersByCustomersIdcustomers != null)
            return false;
        return customersIdcustomers != null ? customersIdcustomers.equals(that.customersIdcustomers) : that.customersIdcustomers == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idmenusalesinvoice;
        temp = Double.doubleToLongBits(costamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(grossamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(salesamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        result = 31 * result + usersIdusers;
        result = 31 * result + employeeIdemployee;
        result = 31 * result + tableheadsIdtableheads;
        temp = Double.doubleToLongBits(tender);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + locationIdlocation;
        result = 31 * result + (usersByUsersIdusers != null ? usersByUsersIdusers.hashCode() : 0);
        result = 31 * result + (employeeByEmployeeIdemployee != null ? employeeByEmployeeIdemployee.hashCode() : 0);
        result = 31 * result + (tableheadsByTableheadsIdtableheads != null ? tableheadsByTableheadsIdtableheads.hashCode() : 0);
        result = 31 * result + (locationByLocationIdlocation != null ? locationByLocationIdlocation.hashCode() : 0);
        result = 31 * result + (menusalesinvoiceproductsByIdmenusalesinvoice != null ? menusalesinvoiceproductsByIdmenusalesinvoice.hashCode() : 0);
        result = 31 * result + (menusalesitemssByIdmenusalesinvoice != null ? menusalesitemssByIdmenusalesinvoice.hashCode() : 0);
        result = 31 * result + transactionIdtransaction;
        result = 31 * result + (transactionByTransactionIdtransaction != null ? transactionByTransactionIdtransaction.hashCode() : 0);
        result = 31 * result + workshiftIdworkshift;
        result = 31 * result + (workshiftByWorkshiftIdworkshift != null ? workshiftByWorkshiftIdworkshift.hashCode() : 0);
        result = 31 * result + (customersByCustomersIdcustomers != null ? customersByCustomersIdcustomers.hashCode() : 0);
        result = 31 * result + (customersIdcustomers != null ? customersIdcustomers.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }

    @ManyToOne
    @JoinColumn(name = "employee_idemployee", referencedColumnName = "idemployee", nullable = true, insertable = false, updatable = false)
    public EmployeeEntity getEmployeeByEmployeeIdemployee() {
        return employeeByEmployeeIdemployee;
    }

    public void setEmployeeByEmployeeIdemployee(EmployeeEntity employeeByEmployeeIdemployee) {
        this.employeeByEmployeeIdemployee = employeeByEmployeeIdemployee;
    }

    @ManyToOne
    @JoinColumn(name = "tableheads_idtableheads", referencedColumnName = "idtableheads", nullable = true, insertable = false, updatable = false)
    public TableheadsEntity getTableheadsByTableheadsIdtableheads() {
        return tableheadsByTableheadsIdtableheads;
    }

    public void setTableheadsByTableheadsIdtableheads(TableheadsEntity tableheadsByTableheadsIdtableheads) {
        this.tableheadsByTableheadsIdtableheads = tableheadsByTableheadsIdtableheads;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice")
    public Collection<MenusalesinvoiceproductEntity> getMenusalesinvoiceproductsByIdmenusalesinvoice() {
        return menusalesinvoiceproductsByIdmenusalesinvoice;
    }

    public void setMenusalesinvoiceproductsByIdmenusalesinvoice(Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdmenusalesinvoice) {
        this.menusalesinvoiceproductsByIdmenusalesinvoice = menusalesinvoiceproductsByIdmenusalesinvoice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "menusalesinvoiceByMenusalesinvoiceIdmenusalesinvoice")
    public Collection<MenusalesitemsEntity> getMenusalesitemssByIdmenusalesinvoice() {
        return menusalesitemssByIdmenusalesinvoice;
    }

    public void setMenusalesitemssByIdmenusalesinvoice(Collection<MenusalesitemsEntity> menusalesitemssByIdmenusalesinvoice) {
        this.menusalesitemssByIdmenusalesinvoice = menusalesitemssByIdmenusalesinvoice;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = false)
    public int getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(int transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "transaction_idtransaction", referencedColumnName = "idtransaction", nullable = false, insertable = false, updatable = false)
    public TransactionEntity getTransactionByTransactionIdtransaction() {
        return transactionByTransactionIdtransaction;
    }

    public void setTransactionByTransactionIdtransaction(TransactionEntity transactionByTransactionIdtransaction) {
        this.transactionByTransactionIdtransaction = transactionByTransactionIdtransaction;
    }

    @JsonIgnore
    @Basic
    @Column(name = "workshift_idworkshift")
    public int getWorkshiftIdworkshift() {
        return workshiftIdworkshift;
    }

    public void setWorkshiftIdworkshift(int workshiftIdworkshift) {
        this.workshiftIdworkshift = workshiftIdworkshift;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "workshift_idworkshift", referencedColumnName = "idworkshift", nullable = false, insertable = false, updatable = false)
    public WorkshiftEntity getWorkshiftByWorkshiftIdworkshift() {
        return workshiftByWorkshiftIdworkshift;
    }

    public void setWorkshiftByWorkshiftIdworkshift(WorkshiftEntity workshiftByWorkshiftIdworkshift) {
        this.workshiftByWorkshiftIdworkshift = workshiftByWorkshiftIdworkshift;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customers_idcustomers", referencedColumnName = "idcustomers", nullable = true, insertable = false, updatable = false)
    public CustomersEntity getCustomersByCustomersIdcustomers() {
        return customersByCustomersIdcustomers;
    }

    public void setCustomersByCustomersIdcustomers(CustomersEntity customersByCustomersIdcustomers) {
        this.customersByCustomersIdcustomers = customersByCustomersIdcustomers;
    }

    @Basic
    @Column(name = "customers_idcustomers", nullable = true)
    public Integer getCustomersIdcustomers() {
        return customersIdcustomers;
    }

    public void setCustomersIdcustomers(Integer customersIdcustomers) {
        this.customersIdcustomers = customersIdcustomers;
    }
}