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
@WebService(serviceName = "LoanService")
public class LoanService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getLoans")
    public List<Loan> getLoans(int user_id){
        DBUtil util = new DBUtil();
        return util.getLoans(user_id);
    }
    
    @WebMethod(operationName = "getLoanShedule")
    public List<LoanShedule> getLoanShedule(int loan_id){
        DBUtil util = new DBUtil();
        return util.getLoanShedule(loan_id);
    }
}
