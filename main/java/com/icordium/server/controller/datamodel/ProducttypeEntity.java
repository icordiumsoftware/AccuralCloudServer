package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "producttype", schema = "erp", catalog = "")
public class ProducttypeEntity {
    private int idproducttype;
    private String producttype;
    private Integer status;
    private Collection<ProductEntity> productsByIdproducttype;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducttype", nullable = false)
    public int getIdproducttype() {
        return idproducttype;
    }

    public void setIdproducttype(int idproducttype) {
        this.idproducttype = idproducttype;
    }

    @Basic
    @Column(name = "producttype", nullable = true, length = 45)
    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProducttypeEntity that = (ProducttypeEntity) o;

        if (idproducttype != that.idproducttype) return false;
        if (producttype != null ? !producttype.equals(that.producttype) : that.producttype != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idproducttype;
        result = 31 * result + (producttype != null ? producttype.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "producttypeByProducttypeIdproducttype")
    public Collection<ProductEntity> getProductsByIdproducttype() {
        return productsByIdproducttype;
    }

    public void setProductsByIdproducttype(Collection<ProductEntity> productsByIdproducttype) {
        this.productsByIdproducttype = productsByIdproducttype;
    }
}