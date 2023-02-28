/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class Product {
    String name,status,cat_name,brand_name;
    Integer product_id, brand_id, cat_id;
    
    public Product() {
        this.name = "";
        this.status = "";
        this.cat_name = "";
         this.brand_name = "";
        this.product_id = 0;
        this.brand_id = 0;
        this.cat_id = 0;
    }
        
    public Product(String name, String status, String cat_name, String brand_name, Integer product_id, Integer brand_id, Integer cat_id) {
        this.name = name;
        this.status = status;
        this.cat_name = cat_name;
        this.product_id = product_id;
        this.brand_id = brand_id;
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }
    
    
}
