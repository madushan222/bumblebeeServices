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
@WebService(serviceName = "ReportService")
public class ReportService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getAllLoans")
    public List<Loan> getAllLoans(){
        DBUtil util = new DBUtil();
        return util.getAllLoans();
    }
    
    
    @WebMethod(operationName = "getCollectionDateRange")
    public Report getCollectionDateRange(int loanId,String fromDate, String toDate){
        DBUtil util = new DBUtil();
        return util.getCollectionDateRange(loanId,fromDate,toDate);
    }
    
    @WebMethod(operationName = "getTotalProducts")
    public int getTotalProducts(){
        DBUtil util = new DBUtil();
        return util.getTotalProducts();
    }
    
    @WebMethod(operationName = "getTotalCustomers")
    public int getTotalCustomers(){
        DBUtil util = new DBUtil();
        return util.getTotalCustomers();
    }
    
    @WebMethod(operationName = "getTotalLoans")
    public int getTotalLoans(){
        DBUtil util = new DBUtil();
        return util.getTotalLoans();
    }
    
    @WebMethod(operationName = "getDayCollection")
    public float getDayCollection(String date){
        DBUtil util = new DBUtil();
        return util.getDayCollection(date);
    }
}
