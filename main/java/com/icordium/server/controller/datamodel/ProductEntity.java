package com.icordium.server.controller.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "product", schema = "erp", catalog = "")
public class ProductEntity {
    private int idproduct;
    private String productcode;
    private String description;
    private String icon;
    private String tilecolor;
    private int producttypeIdproducttype;
    private Integer rentingstatus;
    private String barcode;
    private Collection<BookingproductEntity> bookingproductsByIdproduct;
    private Collection<DailystockbookEntity> dailystockbooksByIdproduct;
    private Collection<DailystockhistoryEntity> dailystockhistoriesByIdproduct;
    private Collection<GoodrecivedataproductEntity> goodrecivedataproductsByIdproduct;
    private Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdproduct;
    private ProducttypeEntity producttypeByProducttypeIdproducttype;
    private Collection<ProducthistoryEntity> producthistoriesByIdproduct;
    private Collection<RentalinvoicedattaproductEntity> rentalinvoicedattaproductsByIdproduct;
    private Collection<RentalpricelistEntity> rentalpricelistsByIdproduct;
    private Collection<RentcartproductEntity> rentcartproductsByIdproduct;
    private Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdproduct;
    private Collection<SaledataproductEntity> saledataproductsByIdproduct;
    private Collection<StockEntity> stocksByIdproduct;
    private Collection<StockadjestmentEntity> stockadjestmentsByIdproduct;
    private Collection<ProductHasMenuitemEntity> productHasMenuitemsByIdproduct;
    private Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdproduct;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduct", nullable = false)
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Basic
    @Column(name = "productcode", nullable = true, length = 45)
    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = -1)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "tilecolor", nullable = true, length = 45)
    public String getTilecolor() {
        return tilecolor;
    }

    public void setTilecolor(String tilecolor) {
        this.tilecolor = tilecolor;
    }

    @Basic
    @Column(name = "producttype_idproducttype", nullable = false)
    public int getProducttypeIdproducttype() {
        return producttypeIdproducttype;
    }

    public void setProducttypeIdproducttype(int producttypeIdproducttype) {
        this.producttypeIdproducttype = producttypeIdproducttype;
    }

    @Basic
    @Column(name = "rentingstatus", nullable = true)
    public Integer getRentingstatus() {
        return rentingstatus;
    }

    public void setRentingstatus(Integer rentingstatus) {
        this.rentingstatus = rentingstatus;
    }

    @Basic
    @Column(name = "barcode", nullable = true, length = 45)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (idproduct != that.idproduct) return false;
        if (producttypeIdproducttype != that.producttypeIdproducttype) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (tilecolor != null ? !tilecolor.equals(that.tilecolor) : that.tilecolor != null) return false;
        if (rentingstatus != null ? !rentingstatus.equals(that.rentingstatus) : that.rentingstatus != null)
            return false;
        return barcode != null ? barcode.equals(that.barcode) : that.barcode == null;
    }

    @Override
    public int hashCode() {
        int result = idproduct;
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (tilecolor != null ? tilecolor.hashCode() : 0);
        result = 31 * result + producttypeIdproducttype;
        result = 31 * result + (rentingstatus != null ? rentingstatus.hashCode() : 0);
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<BookingproductEntity> getBookingproductsByIdproduct() {
        return bookingproductsByIdproduct;
    }

    public void setBookingproductsByIdproduct(Collection<BookingproductEntity> bookingproductsByIdproduct) {
        this.bookingproductsByIdproduct = bookingproductsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<DailystockbookEntity> getDailystockbooksByIdproduct() {
        return dailystockbooksByIdproduct;
    }

    public void setDailystockbooksByIdproduct(Collection<DailystockbookEntity> dailystockbooksByIdproduct) {
        this.dailystockbooksByIdproduct = dailystockbooksByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<DailystockhistoryEntity> getDailystockhistoriesByIdproduct() {
        return dailystockhistoriesByIdproduct;
    }

    public void setDailystockhistoriesByIdproduct(Collection<DailystockhistoryEntity> dailystockhistoriesByIdproduct) {
        this.dailystockhistoriesByIdproduct = dailystockhistoriesByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<GoodrecivedataproductEntity> getGoodrecivedataproductsByIdproduct() {
        return goodrecivedataproductsByIdproduct;
    }

    public void setGoodrecivedataproductsByIdproduct(Collection<GoodrecivedataproductEntity> goodrecivedataproductsByIdproduct) {
        this.goodrecivedataproductsByIdproduct = goodrecivedataproductsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<LocationtranferdataproductEntity> getLocationtranferdataproductsByIdproduct() {
        return locationtranferdataproductsByIdproduct;
    }

    public void setLocationtranferdataproductsByIdproduct(Collection<LocationtranferdataproductEntity> locationtranferdataproductsByIdproduct) {
        this.locationtranferdataproductsByIdproduct = locationtranferdataproductsByIdproduct;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "producttype_idproducttype", referencedColumnName = "idproducttype", nullable = false, insertable = false, updatable = false)
    public ProducttypeEntity getProducttypeByProducttypeIdproducttype() {
        return producttypeByProducttypeIdproducttype;
    }

    public void setProducttypeByProducttypeIdproducttype(ProducttypeEntity producttypeByProducttypeIdproducttype) {
        this.producttypeByProducttypeIdproducttype = producttypeByProducttypeIdproducttype;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByIdproduct")
    public Collection<ProducthistoryEntity> getProducthistoriesByIdproduct() {
        return producthistoriesByIdproduct;
    }

    public void setProducthistoriesByIdproduct(Collection<ProducthistoryEntity> producthistoriesByIdproduct) {
        this.producthistoriesByIdproduct = producthistoriesByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<RentalinvoicedattaproductEntity> getRentalinvoicedattaproductsByIdproduct() {
        return rentalinvoicedattaproductsByIdproduct;
    }

    public void setRentalinvoicedattaproductsByIdproduct(Collection<RentalinvoicedattaproductEntity> rentalinvoicedattaproductsByIdproduct) {
        this.rentalinvoicedattaproductsByIdproduct = rentalinvoicedattaproductsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<RentalpricelistEntity> getRentalpricelistsByIdproduct() {
        return rentalpricelistsByIdproduct;
    }

    public void setRentalpricelistsByIdproduct(Collection<RentalpricelistEntity> rentalpricelistsByIdproduct) {
        this.rentalpricelistsByIdproduct = rentalpricelistsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<RentcartproductEntity> getRentcartproductsByIdproduct() {
        return rentcartproductsByIdproduct;
    }

    public void setRentcartproductsByIdproduct(Collection<RentcartproductEntity> rentcartproductsByIdproduct) {
        this.rentcartproductsByIdproduct = rentcartproductsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductidproduct")
    public Collection<RentoutedproductdataEntity> getRentoutedproductdatasByIdproduct() {
        return rentoutedproductdatasByIdproduct;
    }

    @JsonIgnore
    public void setRentoutedproductdatasByIdproduct(Collection<RentoutedproductdataEntity> rentoutedproductdatasByIdproduct) {
        this.rentoutedproductdatasByIdproduct = rentoutedproductdatasByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<SaledataproductEntity> getSaledataproductsByIdproduct() {
        return saledataproductsByIdproduct;
    }

    public void setSaledataproductsByIdproduct(Collection<SaledataproductEntity> saledataproductsByIdproduct) {
        this.saledataproductsByIdproduct = saledataproductsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByIdproduct")
    public Collection<StockEntity> getStocksByIdproduct() {
        return stocksByIdproduct;
    }

    public void setStocksByIdproduct(Collection<StockEntity> stocksByIdproduct) {
        this.stocksByIdproduct = stocksByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<StockadjestmentEntity> getStockadjestmentsByIdproduct() {
        return stockadjestmentsByIdproduct;
    }

    public void setStockadjestmentsByIdproduct(Collection<StockadjestmentEntity> stockadjestmentsByIdproduct) {
        this.stockadjestmentsByIdproduct = stockadjestmentsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<ProductHasMenuitemEntity> getProductHasMenuitemsByIdproduct() {
        return productHasMenuitemsByIdproduct;
    }

    public void setProductHasMenuitemsByIdproduct(Collection<ProductHasMenuitemEntity> productHasMenuitemsByIdproduct) {
        this.productHasMenuitemsByIdproduct = productHasMenuitemsByIdproduct;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "productByProductIdproduct")
    public Collection<MenusalesinvoiceproductEntity> getMenusalesinvoiceproductsByIdproduct() {
        return menusalesinvoiceproductsByIdproduct;
    }

    public void setMenusalesinvoiceproductsByIdproduct(Collection<MenusalesinvoiceproductEntity> menusalesinvoiceproductsByIdproduct) {
        this.menusalesinvoiceproductsByIdproduct = menusalesinvoiceproductsByIdproduct;
    }
}