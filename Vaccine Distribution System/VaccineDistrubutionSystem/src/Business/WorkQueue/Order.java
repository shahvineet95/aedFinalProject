/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Payment.Payment;

/**
 *
 * @author dharm
 */
public class Order extends WorkRequest{
    private String network;
    private Payment hosPayment;
    private Payment cdcPayment;

    public String getNetwork() {
        return network;
    }
    
    Order(){
        this.hosPayment=new Payment();
        this.cdcPayment=new Payment();
    }
    public void setNetwork(String network) {
        this.network = network;
    } 

    public Payment getHosPayment() {
        return hosPayment;
    }

    public void setHosPayment(Payment hosPayment) {
        this.hosPayment = hosPayment;
    }

    public Payment getCdcPayment() {
        return cdcPayment;
    }

    public void setCdcPayment(Payment cdcPayment) {
        this.cdcPayment = cdcPayment;
    }
    
    
}
