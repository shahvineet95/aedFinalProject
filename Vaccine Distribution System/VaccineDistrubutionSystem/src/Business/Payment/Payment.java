/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

/**
 *
 * @author dharm
 */
public class Payment {
        private String id;
    private boolean completed;
    private String end4digits;
    private String HospitalName;
    private double amount;

    public Payment() {
        
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getEnd4digits() {
        return end4digits;
    }

    public void setEnd4digits(String end4digits) {
        this.end4digits = end4digits;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
