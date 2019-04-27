package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "categoryofprivilages", schema = "erp", catalog = "")
public class CategoryofprivilagesEntity {
    private int idcategoryofprivilages;
    private String categoryofprivilages;
    private Integer status;
    private Collection<PrivilagesEntity> privilagesByIdcategoryofprivilages;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoryofprivilages", nullable = false)
    public int getIdcategoryofprivilages() {
        return idcategoryofprivilages;
    }

    public void setIdcategoryofprivilages(int idcategoryofprivilages) {
        this.idcategoryofprivilages = idcategoryofprivilages;
    }

    @Basic
    @Column(name = "categoryofprivilages", nullable = true, length = 45)
    public String getCategoryofprivilages() {
        return categoryofprivilages;
    }

    public void setCategoryofprivilages(String categoryofprivilages) {
        this.categoryofprivilages = categoryofprivilages;
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

        CategoryofprivilagesEntity that = (CategoryofprivilagesEntity) o;

        if (idcategoryofprivilages != that.idcategoryofprivilages) return false;
        if (categoryofprivilages != null ? !categoryofprivilages.equals(that.categoryofprivilages) : that.categoryofprivilages != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idcategoryofprivilages;
        result = 31 * result + (categoryofprivilages != null ? categoryofprivilages.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages")
    public Collection<PrivilagesEntity> getPrivilagesByIdcategoryofprivilages() {
        return privilagesByIdcategoryofprivilages;
    }

    public void setPrivilagesByIdcategoryofprivilages(Collection<PrivilagesEntity> privilagesByIdcategoryofprivilages) {
        this.privilagesByIdcategoryofprivilages = privilagesByIdcategoryofprivilages;
    }
}