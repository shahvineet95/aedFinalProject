/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Batch.BatchDirectory;
import Business.Payment.Payment;

/**
 *
 * @author dharm
 */
public class CallBackVaccine extends WorkRequest{
    private String network;
    private BatchDirectory batchDir;
    public String getNetwork() {
        return network;
    }
    
    CallBackVaccine(){
        this.batchDir = new BatchDirectory();
    }
    public void setNetwork(String network) {
        this.network = network;
    } 


    public BatchDirectory getBatchDir() {
        return batchDir;
    }

    public void setBatchDir(BatchDirectory batchDir) {
        this.batchDir = batchDir;
    }
    
    
}
