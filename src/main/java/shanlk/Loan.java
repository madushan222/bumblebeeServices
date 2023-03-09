/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class Loan {
    String start_date, end_date, loan_amount, product_name, customer_name, status;
    int loan_id;
    
     public Loan() {
        this.start_date = "";
        this.end_date = "";
        this.loan_amount = "";
        this.product_name = "";
        this.customer_name = "";
        this.status = "";
        this.loan_id = 0;
    }
    
    public Loan(String start_date, String end_date, String loan_amount, String product_name, String customer_name, String status, int loan_id) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.loan_amount = loan_amount;
        this.product_name = product_name;
        this.customer_name = customer_name;
        this.status = status;
        this.loan_id = loan_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(String loan_amount) {
        this.loan_amount = loan_amount;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }
    
    
    
}
