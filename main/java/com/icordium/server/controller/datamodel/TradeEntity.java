package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "trade", schema = "erp", catalog = "")
public class TradeEntity {
    private int idtrade;
    private Integer referencetrade;
    private String description;
    private Double amount;
    private Double paidamount;
    private Integer accountno;
    private Integer type;
    private String accountname;
    private Timestamp date;
    private Time time;
    private Timestamp regdatetime;
    private Date trandate;
    private int locationIdlocation;
    private int usersIdusers;
    private LocationEntity locationByLocationIdlocation;
    private UsersEntity usersByUsersIdusers;
    private int transactionIdtransaction;
    private TransactionEntity transactionByTransactionIdtransaction;
    private int workshiftIdworkshift;
    private WorkshiftEntity workshiftByWorkshiftIdworkshift;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtrade", nullable = false)
    public int getIdtrade() {
        return idtrade;
    }

    public void setIdtrade(int idtrade) {
        this.idtrade = idtrade;
    }

    @Basic
    @Column(name = "referencetrade", nullable = true)
    public Integer getReferencetrade() {
        return referencetrade;
    }

    public void setReferencetrade(Integer referencetrade) {
        this.referencetrade = referencetrade;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "paidamount", nullable = true, precision = 0)
    public Double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    @Basic
    @Column(name = "accountno", nullable = true)
    public Integer getAccountno() {
        return accountno;
    }

    public void setAccountno(Integer accountno) {
        this.accountno = accountno;
    }

    @Basic
    @Column(name = "accountname", nullable = true, length = 45)
    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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
    @Column(name = "trandate", nullable = true)
    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
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
    @Column(name = "users_idusers", nullable = false)
    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradeEntity that = (TradeEntity) o;

        if (idtrade != that.idtrade) return false;
        if (locationIdlocation != that.locationIdlocation) return false;
        if (usersIdusers != that.usersIdusers) return false;
        if (referencetrade != null ? !referencetrade.equals(that.referencetrade) : that.referencetrade != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (paidamount != null ? !paidamount.equals(that.paidamount) : that.paidamount != null) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null) return false;
        if (accountname != null ? !accountname.equals(that.accountname) : that.accountname != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (regdatetime != null ? !regdatetime.equals(that.regdatetime) : that.regdatetime != null) return false;
        return trandate != null ? trandate.equals(that.trandate) : that.trandate == null;
    }

    @Override
    public int hashCode() {
        int result = idtrade;
        result = 31 * result + (referencetrade != null ? referencetrade.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (paidamount != null ? paidamount.hashCode() : 0);
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + (accountname != null ? accountname.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (regdatetime != null ? regdatetime.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + locationIdlocation;
        result = 31 * result + usersIdusers;
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
    @ManyToOne
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers", nullable = false, insertable = false, updatable = false)
    public UsersEntity getUsersByUsersIdusers() {
        return usersByUsersIdusers;
    }

    public void setUsersByUsersIdusers(UsersEntity usersByUsersIdusers) {
        this.usersByUsersIdusers = usersByUsersIdusers;
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