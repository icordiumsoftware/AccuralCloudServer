package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "privilages", schema = "erp", catalog = "")
public class PrivilagesEntity {
    private int idprivilages;
    private Byte edit;
    private Byte update;
    private Byte delete;
    private Integer status;
    private int categoryofprivilagesIdcategoryofprivilages;
    private CategoryofprivilagesEntity categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages;
    private Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdprivilages;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprivilages", nullable = false)
    public int getIdprivilages() {
        return idprivilages;
    }

    public void setIdprivilages(int idprivilages) {
        this.idprivilages = idprivilages;
    }

    @Basic
    @Column(name = "edit", nullable = true)
    public Byte getEdit() {
        return edit;
    }

    public void setEdit(Byte edit) {
        this.edit = edit;
    }

    @Basic
    @Column(name = "update", nullable = true)
    public Byte getUpdate() {
        return update;
    }

    public void setUpdate(Byte update) {
        this.update = update;
    }

    @Basic
    @Column(name = "delete", nullable = true)
    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
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
    @Column(name = "categoryofprivilages_idcategoryofprivilages", nullable = false)
    public int getCategoryofprivilagesIdcategoryofprivilages() {
        return categoryofprivilagesIdcategoryofprivilages;
    }

    public void setCategoryofprivilagesIdcategoryofprivilages(int categoryofprivilagesIdcategoryofprivilages) {
        this.categoryofprivilagesIdcategoryofprivilages = categoryofprivilagesIdcategoryofprivilages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivilagesEntity that = (PrivilagesEntity) o;

        if (idprivilages != that.idprivilages) return false;
        if (categoryofprivilagesIdcategoryofprivilages != that.categoryofprivilagesIdcategoryofprivilages) return false;
        if (edit != null ? !edit.equals(that.edit) : that.edit != null) return false;
        if (update != null ? !update.equals(that.update) : that.update != null) return false;
        if (delete != null ? !delete.equals(that.delete) : that.delete != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = idprivilages;
        result = 31 * result + (edit != null ? edit.hashCode() : 0);
        result = 31 * result + (update != null ? update.hashCode() : 0);
        result = 31 * result + (delete != null ? delete.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + categoryofprivilagesIdcategoryofprivilages;
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoryofprivilages_idcategoryofprivilages", referencedColumnName = "idcategoryofprivilages", nullable = false, insertable = false, updatable = false)
    public CategoryofprivilagesEntity getCategoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages() {
        return categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages;
    }

    public void setCategoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages(CategoryofprivilagesEntity categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages) {
        this.categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages = categoryofprivilagesByCategoryofprivilagesIdcategoryofprivilages;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "privilagesByPrivilagesIdprivilages")
    public Collection<UsersHasPrivilagesEntity> getUsersHasPrivilagesByIdprivilages() {
        return usersHasPrivilagesByIdprivilages;
    }

    public void setUsersHasPrivilagesByIdprivilages(Collection<UsersHasPrivilagesEntity> usersHasPrivilagesByIdprivilages) {
        this.usersHasPrivilagesByIdprivilages = usersHasPrivilagesByIdprivilages;
    }
}