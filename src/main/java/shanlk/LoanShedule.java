/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class LoanShedule {
    String due_date, status, pay_date;
    float ins_amount, paid_amount;

    public LoanShedule() {
        this.due_date = "";
        this.status = "";
        this.pay_date = "";
        this.ins_amount = 0;
        this.paid_amount = 0;
    }

    public LoanShedule(String due_date, String status, String pay_date, float ins_amount, float paid_amount) {
        this.due_date = due_date;
        this.status = status;
        this.pay_date = pay_date;
        this.ins_amount = ins_amount;
        this.paid_amount = paid_amount;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public float getIns_amount() {
        return ins_amount;
    }

    public void setIns_amount(float ins_amount) {
        this.ins_amount = ins_amount;
    }

    public float getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(float paid_amount) {
        this.paid_amount = paid_amount;
    }
    
    
}
