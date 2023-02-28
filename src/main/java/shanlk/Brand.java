/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class Brand {
    String name,status,cat_name;
    Integer brand_id,cat_id;
    
    public Brand() {
        this.name = "";
        this.status = "";
        this.cat_name = "";
        this.brand_id = 0;
        this.cat_id = 0;
    }
    
    public Brand(String name, String status, String cat_name, Integer brand_id, Integer cat_id) {
        this.name = name;
        this.status = status;
        this.cat_name = cat_name;
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

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
    
    
    
    
    
}
