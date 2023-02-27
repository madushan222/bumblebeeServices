/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package shanlk;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author shanr
 */
@WebService(serviceName = "InventoryService")
public class InventoryService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //Category Manipulate Functions
    @WebMethod(operationName = "addCategory")
    public boolean addCategory(@WebParam(name = "category") Category category){
        DBUtil util = new DBUtil();
        return util.addCategory(category);
    }
    
    @WebMethod(operationName = "getCategories")
    public List<Category> getCategories(){
        DBUtil util = new DBUtil();
        return util.getCategories();
    }
    
    @WebMethod(operationName = "deleteCategory")
    public boolean deleteCategory(@WebParam(name = "cat_id") int cat_id){
        DBUtil util = new DBUtil();
        return util.deleteCategory(cat_id);
    }
    
    @WebMethod(operationName = "getCategory")
    public Category getCategory(@WebParam(name = "cat_id") int cat_id){
        DBUtil util = new DBUtil();
        return util.getCategory(cat_id);
    }
    
    @WebMethod(operationName = "updateCategory")
    public boolean updateCategory(@WebParam(name = "category") Category category){
        DBUtil util = new DBUtil();
        return util.updateCategory(category);
    }
    
    //Brand Manipulate Functions
    @WebMethod(operationName = "addBrand")
    public boolean addBrand(@WebParam(name = "brand") Brand brand){
        DBUtil util = new DBUtil();
        return util.addBrand(brand);
    }
    
    @WebMethod(operationName = "getBrands")
    public List<Brand> getBrands(){
        DBUtil util = new DBUtil();
        return util.getBrands();
    }
    
    @WebMethod(operationName = "deleteBrand")
    public boolean deleteBrand(@WebParam(name = "brand_id") int brand_id){
        DBUtil util = new DBUtil();
        return util.deleteBrand(brand_id);
    }
    
    @WebMethod(operationName = "getBrand")
    public Brand getBrand(@WebParam(name = "brand_id") int brand_id){
        DBUtil util = new DBUtil();
        return util.getBrand(brand_id);
    }
    
    @WebMethod(operationName = "updateBrand")
    public boolean updateBrand(@WebParam(name = "brand") Brand brand){
        DBUtil util = new DBUtil();
        return util.updateBrand(brand);
    }
    
    
    @WebMethod(operationName = "updateStatus")
    public boolean updateStatus(@WebParam() Integer id, String status, String table, String field){
        DBUtil util = new DBUtil();
        return util.updateStatus(id, status, table, field);
    }
    
}
