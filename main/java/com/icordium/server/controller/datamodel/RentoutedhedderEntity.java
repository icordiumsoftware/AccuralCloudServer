package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "rentoutedhedder", schema = "erp", catalog = "")
public class RentoutedhedderEntity implements Serializable {
    private int idrentoutedhedder;
    private String note;
    private Timestamp regdatetime;
    private Timestamp diliverydatetime;
    private Timestamp returndatetime;
    private int locationIdlocation;
    private Integer transactionIdtransaction;
    private int usersIdusers;
    private int customersIdcustomers;
    private int status;
    private String diliveryaddress;
    private int rentalpricecategoryIdrentalpricecategory;
    private LocationEntity locationByLocationIdlocation;
    private TransactionEntity transactionByTransactionIdtransaction;
    private UsersEntity usersByUsersIdusers;
    private CustomersEntity customersByCustomersIdcustomers;
    private RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    private Collection<RentoutedotherEntity> rentoutedothersByIdrentoutedhedder;
    private Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdrentoutedhedder;
    private Collection<RentoutservicedataEntity> rentoutservicedatasByIdrentoutedhedder;
    private Double advanceamount;
    private Collection<RentalinvoiceEntity> rentalinvoicesByIdrentoutedhedder;
    private int workshiftIdworkshift;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentoutedhedder", nullable = false)
    public int getIdrentoutedhedder() {
        return idrentoutedhedder;
    }

    public void setIdrentoutedhedder(int idrentoutedhedder) {
        this.idrentoutedhedder = idrentoutedhedder;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 45)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "diliverydatetime", nullable = true)
    public Timestamp getDiliverydatetime() {
        return diliverydatetime;
    }

    public void setDiliverydatetime(Timestamp diliverydatetime) {
        this.diliverydatetime = diliverydatetime;
    }

    @Basic
    @Column(name = "returndatetime", nullable = true)
    public Timestamp getReturndatetime() {
        return returndatetime;
    }

    public void setReturndatetime(Timestamp returndatetime) {
        this.returndatetime = returndatetime;
    }

    @Basic
    @Column(name = "location_idlocation", nullable = false)
    public int getLocationIdlocation() {
        return locationIdlocation;
    }

    public void setLocationIdlocation(int locationIdlocation) {
        this.locationIdlocation = locationIdlocation;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = true)
    public Integer getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(Integer transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
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
    @Column(name = "customers_idcustomers", nullable = false)
    public int getCustomersIdcustomers() {
        return customersIdcustomers;
    }

    public void setCustomersIdcustomers(int customersIdcustomers) {
        this.customersIdcustomers = customersIdcustomers;
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
    @Column(name = "diliveryaddress", nullable = true, length = 45)
    public String getDiliveryaddress() {
        return diliveryaddress;
    }

    public void setDiliveryaddress(String diliveryaddress) {
        this.diliveryaddress = diliveryaddress;
    }

    @Basic
    @Column(name = "rentalpricecategory_idrentalpricecategory", nullable = false)
    public int getRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryIdrentalpricecategory(int rentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryIdrentalpricecategory = rentalpricecategoryIdrentalpricecategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentoutedhedderEntity that = (RentoutedhedderEntity) o;

        if (idrentoutedhedder != that.idrentoutedhedder) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (customersIdcustomers != that.customersIdcustomers) return false;
        if (status != that.status) return false;
        if (rentalpricecategoryIdrentalpricecategory != that.rentalpricecategoryIdrentalpricecategory) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        if (diliverydatetime != null ? !diliverydatetime.equals(that.diliverydatetime) : that.diliverydatetime != null)
            return false;
        if (returndatetime != null ? !returndatetime.equals(that.returndatetime) : that.returndatetime != null)
            return false;
        if (transactionIdtransaction != null ? !transactionIdtransaction.equals(that.transactionIdtransaction) : that.transactionIdtransaction != null)
            return false;
        return diliveryaddress != null ? diliveryaddress.equals(that.diliveryaddress) : that.diliveryaddress == null;
    }

    @Override
    public int hashCode() {
        int result = idrentoutedhedder;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (diliverydatetime != null ? diliverydatetime.hashCode() : 0);
        result = 31 * result + (returndatetime != null ? returndatetime.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + (transactionIdtransaction != null ? transactionIdtransaction.hashCode() : 0);
        result = 31 * result + usersIdusers;
        result = 31 * result + customersIdcustomers;
        result = 31 * result + status;
        result = 31 * result + (diliveryaddress != null ? diliveryaddress.hashCode() : 0);
        result = 31 * result + rentalpricecategoryIdrentalpricecategory;
        return result;
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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_idtransaction", referencedColumnName = "idtransaction", nullable = true, insertable = false, updatable = false)
    public TransactionEntity getTransactionByTransactionIdtransaction() {
        return transactionByTransactionIdtransaction;
    }

    public void setTransactionByTransactionIdtransaction(TransactionEntity transactionByTransactionIdtransaction) {
        this.transactionByTransactionIdtransaction = transactionByTransactionIdtransaction;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customers_idcustomers", referencedColumnName = "idcustomers", nullable = false, insertable = false, updatable = false)
    public CustomersEntity getCustomersByCustomersIdcustomers() {
        return customersByCustomersIdcustomers;
    }

    public void setCustomersByCustomersIdcustomers(CustomersEntity customersByCustomersIdcustomers) {
        this.customersByCustomersIdcustomers = customersByCustomersIdcustomers;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentalpricecategory_idrentalpricecategory", referencedColumnName = "idrentalpricecategory", nullable = false, insertable = false, updatable = false)
    public RentalpricecategoryEntity getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory() {
        return rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    public void setRentalpricecategoryByRentalpricecategoryIdrentalpricecategory(RentalpricecategoryEntity rentalpricecategoryByRentalpricecategoryIdrentalpricecategory) {
        this.rentalpricecategoryByRentalpricecategoryIdrentalpricecategory = rentalpricecategoryByRentalpricecategoryIdrentalpricecategory;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentoutedhedderByRentoutedhedderIdrentoutedhedder", cascade = CascadeType.DETACH)
    public Collection<RentoutedotherEntity> getRentoutedothersByIdrentoutedhedder() {
        return rentoutedothersByIdrentoutedhedder;
    }

    public void setRentoutedothersByIdrentoutedhedder(Collection<RentoutedotherEntity> rentoutedothersByIdrentoutedhedder) {
        this.rentoutedothersByIdrentoutedhedder = rentoutedothersByIdrentoutedhedder;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentoutedhedderByHedderIdrentoutedhedder", cascade = CascadeType.DETACH)
    public Collection<RentoutedproductdataEntity> getRentoutedproductdatasByIdrentoutedhedder() {
        return rentoutedproductdatasByIdrentoutedhedder;
    }

    public void setRentoutedproductdatasByIdrentoutedhedder(Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdrentoutedhedder) {
        this.rentoutedproductdatasByIdrentoutedhedder = rentoutedproductdatasByIdrentoutedhedder;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentoutedhedderByRentoutedhedderIdrentoutedhedder", cascade = CascadeType.DETACH)
    public Collection<RentoutservicedataEntity> getRentoutservicedatasByIdrentoutedhedder() {
        return rentoutservicedatasByIdrentoutedhedder;
    }

    public void setRentoutservicedatasByIdrentoutedhedder(Collection<RentoutservicedataEntity> rentoutservicedatasByIdrentoutedhedder) {
        this.rentoutservicedatasByIdrentoutedhedder = rentoutservicedatasByIdrentoutedhedder;
    }

    @Basic
    @Column(name = "advanceamount", nullable = true, precision = 0)
    public Double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(Double advanceamount) {
        this.advanceamount = advanceamount;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentoutedhedderByRentoutedhedderIdrentoutedhedder")
    public Collection<RentalinvoiceEntity> getRentalinvoicesByIdrentoutedhedder() {
        return rentalinvoicesByIdrentoutedhedder;
    }

    public void setRentalinvoicesByIdrentoutedhedder(Collection<RentalinvoiceEntity> rentalinvoicesByIdrentoutedhedder) {
        this.rentalinvoicesByIdrentoutedhedder = rentalinvoicesByIdrentoutedhedder;
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