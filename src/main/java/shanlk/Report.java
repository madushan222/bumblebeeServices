/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class Report {
    String cus_name, pay_date;
    float loan_amount, pay_amount;

    public Report() {
        this.cus_name = "";
        this.pay_date = "";
        this.loan_amount = 0;
        this.pay_amount = 0;
    }
    
    
    public Report(String cus_name, String pay_date, float loan_amount, float pay_amount) {
        this.cus_name = cus_name;
        this.pay_date = pay_date;
        this.loan_amount = loan_amount;
        this.pay_amount = pay_amount;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public float getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(float loan_amount) {
        this.loan_amount = loan_amount;
    }

    public float getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(float pay_amount) {
        this.pay_amount = pay_amount;
    }
    
    
}
