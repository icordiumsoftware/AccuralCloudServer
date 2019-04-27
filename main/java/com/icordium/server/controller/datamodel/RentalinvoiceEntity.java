package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "rentalinvoice", schema = "erp", catalog = "")
public class RentalinvoiceEntity {
    private int idrentalinvoice;
    private int transactionIdtransaction;
    private int customersIdcustomers;
    private Double grossamount;
    private Double amount;
    private Double discount;
    private Timestamp regdatetime;
    private Double advanceamount;
    private Double costtotal;
    private TransactionEntity transactionByTransactionIdtransaction;
    private CustomersEntity customersByCustomersIdcustomers;
    private Collection<RentalinvoicedattaproductEntity> rentalinvoicedattaproductsByIdrentalinvoice;
    private Collection<RentalinvoiceotherEntity> rentalinvoiceothersByIdrentalinvoice;
    private Collection<RentalservicedataEntity> rentalservicedatasByIdrentalinvoice;
    private Date startdate;
    private Date enddate;
    private LocationEntity locationByLocationIdlocation;
    private int rentoutedhedderIdrentoutedhedder;
    private RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    private int locationIdlocation;
    private int workshiftIdworkshift;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;

    @JsonIgnore
    @OneToMany(mappedBy = "rentalinvoiceByRentalinvoiceIdrentalinvoice")
    public Collection<RentalservicedataEntity> getRentalservicedatasByIdrentalinvoice() {
        return rentalservicedatasByIdrentalinvoice;
    }

    public void setRentalservicedatasByIdrentalinvoice(Collection<RentalservicedataEntity> rentalservicedatasByIdrentalinvoice) {
        this.rentalservicedatasByIdrentalinvoice = rentalservicedatasByIdrentalinvoice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrentalinvoice", nullable = false)
    public int getIdrentalinvoice() {
        return idrentalinvoice;
    }

    public void setIdrentalinvoice(int idrentalinvoice) {
        this.idrentalinvoice = idrentalinvoice;
    }

    @Basic
    @Column(name = "transaction_idtransaction", nullable = false)
    public int getTransactionIdtransaction() {
        return transactionIdtransaction;
    }

    public void setTransactionIdtransaction(int transactionIdtransaction) {
        this.transactionIdtransaction = transactionIdtransaction;
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
    @Column(name = "grossamount", nullable = true, precision = 0)
    public Double getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(Double grossamount) {
        this.grossamount = grossamount;
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
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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
    @Column(name = "costtotal", nullable = true, precision = 0)
    public Double getCosttotal() {
        return costtotal;
    }

    public void setCosttotal(Double costtotal) {
        this.costtotal = costtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalinvoiceEntity that = (RentalinvoiceEntity) o;

        if (idrentalinvoice != that.idrentalinvoice) return false;
        if (transactionIdtransaction != that.transactionIdtransaction) return false;
        if (customersIdcustomers != that.customersIdcustomers) return false;
        if (grossamount != null ? !grossamount.equals(that.grossamount) : that.grossamount != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        return costtotal != null ? costtotal.equals(that.costtotal) : that.costtotal == null;
    }

    @Override
    public int hashCode() {
        int result = idrentalinvoice;
        result = 31 * result + transactionIdtransaction;
        result = 31 * result + customersIdcustomers;
        result = 31 * result + (grossamount != null ? grossamount.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (costtotal != null ? costtotal.hashCode() : 0);
        return result;
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
    @ManyToOne
    @JoinColumn(name = "customers_idcustomers", referencedColumnName = "idcustomers", nullable = false, insertable = false, updatable = false)
    public CustomersEntity getCustomersByCustomersIdcustomers() {
        return customersByCustomersIdcustomers;
    }

    public void setCustomersByCustomersIdcustomers(CustomersEntity customersByCustomersIdcustomers) {
        this.customersByCustomersIdcustomers = customersByCustomersIdcustomers;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalinvoiceByRentalinvoiceIdrentalinvoice")
    public Collection<RentalinvoicedattaproductEntity> getRentalinvoicedattaproductsByIdrentalinvoice() {
        return rentalinvoicedattaproductsByIdrentalinvoice;
    }

    public void setRentalinvoicedattaproductsByIdrentalinvoice(Collection<RentalinvoicedattaproductEntity> rentalinvoicedattaproductsByIdrentalinvoice) {
        this.rentalinvoicedattaproductsByIdrentalinvoice = rentalinvoicedattaproductsByIdrentalinvoice;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rentalinvoiceByRentalinvoiceIdrentalinvoice")
    public Collection<RentalinvoiceotherEntity> getRentalinvoiceothersByIdrentalinvoice() {
        return rentalinvoiceothersByIdrentalinvoice;
    }

    public void setRentalinvoiceothersByIdrentalinvoice(Collection<RentalinvoiceotherEntity> rentalinvoiceothersByIdrentalinvoice) {
        this.rentalinvoiceothersByIdrentalinvoice = rentalinvoiceothersByIdrentalinvoice;
    }

    @Basic
    @Column(name = "advanceamount", nullable = true, precision = 0)
    public Double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(Double advanceamount) {
        this.advanceamount = advanceamount;
    }

    @Basic
    @Column(name = "startdate", nullable = true)
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate", nullable = true)
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_idlocation", referencedColumnName = "idlocation", nullable = false, insertable = false, updatable = false)
    public LocationEntity getLocationByLocationIdlocation() {
        return locationByLocationIdlocation;
    }

    public void setLocationByLocationIdlocation(LocationEntity locationByLocationIdlocation) {
        this.locationByLocationIdlocation = locationByLocationIdlocation;
    }

    @Basic
    @Column(name = "rentoutedhedder_idrentoutedhedder", nullable = false)
    public int getRentoutedhedderIdrentoutedhedder() {
        return rentoutedhedderIdrentoutedhedder;
    }

    public void setRentoutedhedderIdrentoutedhedder(int rentoutedhedderIdrentoutedhedder) {
        this.rentoutedhedderIdrentoutedhedder = rentoutedhedderIdrentoutedhedder;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rentoutedhedder_idrentoutedhedder", referencedColumnName = "idrentoutedhedder", nullable = false, insertable = false, updatable = false)
    public RentoutedhedderEntity getRentoutedhedderByRentoutedhedderIdrentoutedhedder() {
        return rentoutedhedderByRentoutedhedderIdrentoutedhedder;
    }

    public void setRentoutedhedderByRentoutedhedderIdrentoutedhedder(RentoutedhedderEntity rentoutedhedderByRentoutedhedderIdrentoutedhedder) {
        this.rentoutedhedderByRentoutedhedderIdrentoutedhedder = rentoutedhedderByRentoutedhedderIdrentoutedhedder;
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