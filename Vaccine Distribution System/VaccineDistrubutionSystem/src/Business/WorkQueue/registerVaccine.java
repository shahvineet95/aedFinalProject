/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author India
 */
public class registerVaccine {
    private String vaccineName;
    private String vaccineDesc;
    private int batch;
    private float cost;
    private double totalCost;
    private Date bestUse;

    public Date getBestUse() {
        return bestUse;
    }

    public void setBestUse(Date bestUse) {
        this.bestUse = bestUse;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineDesc() {
        return vaccineDesc;
    }

    public void setVaccineDesc(String vaccineDesc) {
        this.vaccineDesc = vaccineDesc;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    
}
