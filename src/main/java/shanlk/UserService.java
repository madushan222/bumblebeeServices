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
@WebService(serviceName = "UserService")
public class UserService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "user") User user){
        DBUtil util = new DBUtil();
        return util.addUser(user);
    }
    
    @WebMethod(operationName = "getAdmins")
    public List<User> getAdmins(){
        DBUtil util = new DBUtil();
        return util.getAdmins();
    }
    
    @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "userId") int userId){
        DBUtil util = new DBUtil();
        return util.deleteUser(userId);
    }
    
    @WebMethod(operationName = "getAdmin")
    public User getAdmin(@WebParam(name = "userId") int userId){
        DBUtil util = new DBUtil();
        return util.getAdmin(userId);
    }
    
    @WebMethod(operationName = "updateAdmin")
    public boolean updateAdmin(@WebParam(name = "admin") User admin){
        DBUtil util = new DBUtil();
        return util.updateAdmin(admin);
    }
    
    @WebMethod(operationName = "getCustomers")
    public List<User> getCustomers(){
        DBUtil util = new DBUtil();
        return util.getCustomers();
    }
}
