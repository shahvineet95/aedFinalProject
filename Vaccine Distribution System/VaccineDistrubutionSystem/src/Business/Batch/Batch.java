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
    private int batchId = 1; 
    ArrayList<Vaccine> vaccineStorage;

    public ArrayList<Vaccine> getVaccineStorage() {
        return vaccineStorage;
    }

    public void setVaccineStorage(ArrayList<Vaccine> vaccineStorage) {
        this.vaccineStorage = vaccineStorage;
    }

    public Batch(int n) {
        this.vaccineStorage = new ArrayList<Vaccine>();
        
    }
}
