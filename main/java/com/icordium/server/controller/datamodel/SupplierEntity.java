package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "supplier", schema = "erp", catalog = "")
public class SupplierEntity {
    private int idsupplier;
    private String suppliername;
    private String contact;
    private String email;
    private Collection<GoodrevicehedderEntity> goodreviceheddersByIdsupplier;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsupplier", nullable = false)
    public int getIdsupplier() {
        return idsupplier;
    }

    public void setIdsupplier(int idsupplier) {
        this.idsupplier = idsupplier;
    }

    @Basic
    @Column(name = "suppliername", nullable = true, length = 45)
    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 45)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierEntity that = (SupplierEntity) o;

        if (idsupplier != that.idsupplier) return false;
        if (suppliername != null ? !suppliername.equals(that.suppliername) : that.suppliername != null) return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }

    @Override
    public int hashCode() {
        int result = idsupplier;
        result = 31 * result + (suppliername != null ? suppliername.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "supplierBySupplierIdsupplier")
    public Collection<GoodrevicehedderEntity> getGoodreviceheddersByIdsupplier() {
        return goodreviceheddersByIdsupplier;
    }

    public void setGoodreviceheddersByIdsupplier(Collection<GoodrevicehedderEntity> goodreviceheddersByIdsupplier) {
        this.goodreviceheddersByIdsupplier = goodreviceheddersByIdsupplier;
    }
}