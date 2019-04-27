package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "salaryadvance", schema = "erp", catalog = "")
public class SalaryadvanceEntity {
    private int idsalaryadvance;
    private String description;
    private Timestamp regdatetime;
    private Double amount;
    private Date sallrydate;
    private int employeeIdemployee;
    private int usersIdusers;
    private int locationIdlocation;
    private EmployeeEntity employeeByEmployeeIdemployee;
    private UsersEntity usersByUsersIdusers;
    private LocationEntity locationByLocationIdlocation;
    private int workshiftIdworkshift;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;

    @Id
    @Column(name = "idsalaryadvance", nullable = false)
    public int getIdsalaryadvance() {
        return idsalaryadvance;
    }

    public void setIdsalaryadvance(int idsalaryadvance) {
        this.idsalaryadvance = idsalaryadvance;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "regdatetime", nullable = true)
    public Timestamp getRegdatetime() {
        return regdatetime;
    }

    public void setRegdatetime(Timestamp regdatetime) {
        this.regdatetime = regdatetime;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "sallrydate", nullable = true)
    public Date getSallrydate() {
        return sallrydate;
    }

    public void setSallrydate(Date sallrydate) {
        this.sallrydate = sallrydate;
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
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
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

        SalaryadvanceEntity that = (SalaryadvanceEntity) o;

        if (idsalaryadvance != that.idsalaryadvance) return false;
        if (employeeIdemployee != that.employeeIdemployee) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        return sallrydate != null ? sallrydate.equals(that.sallrydate) : that.sallrydate == null;
    }

    @Override
    public int hashCode() {
        int result = idsalaryadvance;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (sallrydate != null ? sallrydate.hashCode() : 0);
        result = 31 * result + employeeIdemployee;
        result = 31 * result + usersIdusers;
        result = 31 * result + locationIdlocation;
        return result;
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
    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
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

    @Basic
    @Column(name = "workshift_idworkshift")
    public int getWorkshiftIdworkshift() {
        return workshiftIdworkshift;
    }

    public void setWorkshiftIdworkshift(int workshiftIdworkshift) {
        this.workshiftIdworkshift = workshiftIdworkshift;
    }

    @ManyToOne
    @JoinColumn(name = "workshift_idworkshift", referencedColumnName = "idworkshift", nullable = false, insertable = false, updatable = false)
    public WorkshiftEntity getWorkshiftByWorkshiftIdworkshift() {
        return workshiftByWorkshiftIdworkshift;
    }

    public void setWorkshiftByWorkshiftIdworkshift(WorkshiftEntity workshiftByWorkshiftIdworkshift) {
        this.workshiftByWorkshiftIdworkshift = workshiftByWorkshiftIdworkshift;
    }
}