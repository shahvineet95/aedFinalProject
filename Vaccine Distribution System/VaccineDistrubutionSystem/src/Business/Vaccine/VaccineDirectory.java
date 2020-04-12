/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author dharm
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccDir; 
    
    public VaccineDirectory(){
        vaccDir = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccDir() {
        return vaccDir;
    }

    public void setVaccDir(ArrayList<Vaccine> vaccDir) {
        this.vaccDir = vaccDir;
    }
    
    public Vaccine addVaccDir() {
        Vaccine v = new Vaccine();
        vaccDir.add(v);
        return v;
    }
}
