package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "tableheadsorder", schema = "erp", catalog = "")
public class TableheadsorderEntity {
    private int idtableheadsorder;
    private int employeeIdemployee;
    private Timestamp starttime;
    private Timestamp endtime;
    private int tableheadsIdtableheads;
    private int locationIdlocation;
    private EmployeeEntity employeeByEmployeeIdemployee;
    private TableheadsEntity tableheadsByTableheadsIdtableheads;
    private LocationEntity locationByLocationIdlocation;
    private Collection<TicketsEntity> ticketssByIdtableheadsorder;
    private int orderstatus;
    private Integer customersIdcustomers;
    private CustomersEntity customersByCustomersIdcustomers;
    private int usersIdusers;
    private UsersEntity usersByUsersIdusers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtableheadsorder", nullable = false)
    public int getIdtableheadsorder() {
        return idtableheadsorder;
    }

    public void setIdtableheadsorder(int idtableheadsorder) {
        this.idtableheadsorder = idtableheadsorder;
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
    @Column(name = "starttime", nullable = true)
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime", nullable = true)
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
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

        TableheadsorderEntity that = (TableheadsorderEntity) o;

        if (idtableheadsorder != that.idtableheadsorder) return false;
        if (employeeIdemployee != that.employeeIdemployee) return false;
        if (tableheadsIdtableheads != that.tableheadsIdtableheads) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (starttime != null ? !starttime.equals(that.starttime) : that.starttime != null) return false;
        return endtime != null ? endtime.equals(that.endtime) : that.endtime == null;
    }

    @Override
    public int hashCode() {
        int result = idtableheadsorder;
        result = 31 * result + employeeIdemployee;
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + tableheadsIdtableheads;
        result = 31 * result + locationIdlocation;
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employee_idemployee", referencedColumnName = "idemployee", nullable = true, insertable = false, updatable = false)
    public EmployeeEntity getEmployeeByEmployeeIdemployee() {
        return employeeByEmployeeIdemployee;
    }

    public void setEmployeeByEmployeeIdemployee(EmployeeEntity employeeByEmployeeIdemployee) {
        this.employeeByEmployeeIdemployee = employeeByEmployeeIdemployee;
    }

//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tableheads_idtableheads", referencedColumnName = "idtableheads", nullable = true, updatable = false, insertable = false)
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

    @OneToMany(mappedBy = "tableheadsorderByTableheadsorderIdtableheadsorder")
    public Collection<TicketsEntity> getTicketssByIdtableheadsorder() {
        return ticketssByIdtableheadsorder;
    }

    public void setTicketssByIdtableheadsorder(Collection<TicketsEntity> ticketssByIdtableheadsorder) {
        this.ticketssByIdtableheadsorder = ticketssByIdtableheadsorder;
    }

    @Basic
    @Column(name = "orderstatus", nullable = false)
    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Basic
    @Column(name = "customers_idcustomers", nullable = true)
    public Integer getCustomersIdcustomers() {
        return customersIdcustomers;
    }

    public void setCustomersIdcustomers(Integer customersIdcustomers) {
        this.customersIdcustomers = customersIdcustomers;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customers_idcustomers", referencedColumnName = "idcustomers", insertable = false, updatable = false)
    public CustomersEntity getCustomersByCustomersIdcustomers() {
        return customersByCustomersIdcustomers;
    }

    public void setCustomersByCustomersIdcustomers(CustomersEntity customersByCustomersIdcustomers) {
        this.customersByCustomersIdcustomers = customersByCustomersIdcustomers;
    }

    @Basic
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }
}