package com.nest.productbackend_application.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private int pdcode;
    private String pdname;
    private String manfdate;
    private String expdate;
    private String brand;
    private String price;
    private String selname;
    private String distname;

    public Product() {
    }

    public Product(int id, int pdcode, String pdname, String manfdate, String expdate, String brand, String price, String selname, String distname) {
        this.id = id;
        this.pdcode = pdcode;
        this.pdname = pdname;
        this.manfdate = manfdate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.selname = selname;
        this.distname = distname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPdcode() {
        return pdcode;
    }

    public void setPdcode(int pdcode) {
        this.pdcode = pdcode;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public String getManfdate() {
        return manfdate;
    }

    public void setManfdate(String manfdate) {
        this.manfdate = manfdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSelname() {
        return selname;
    }

    public void setSelname(String selname) {
        this.selname = selname;
    }

    public String getDistname() {
        return distname;
    }

    public void setDistname(String distname) {
        this.distname = distname;
    }
}
