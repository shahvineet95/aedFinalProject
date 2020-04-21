/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Batch;

import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author India
 */
public class Batch {
    private String batchId; 
    private Vaccine vaccine;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    @Override
    public String toString() {
        return "" + this.batchId ;
    }
    

    
    
}
