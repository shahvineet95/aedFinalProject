/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.Date;

/**
 *
 * @author dharm
 */

//class Vaccine
public class Vaccine {
    private String name;
    private Float cost;
    private String desc;
    private Date bestUse;
    private int batch;
    private String vaccineId;
    private String manufact;
    private String code;
    public String getVaccineId() {
        return vaccineId;
    }

    public Vaccine(String name, Float cost, String desc, Date bestUse, int batch, String vaccineId) {
        this.name = name;
        this.cost = cost;
        this.desc = desc;
        this.bestUse = bestUse;
        this.batch = batch;
        this.vaccineId = vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getBestUse() {
        return bestUse;
    }

    public void setBestUse(Date bestUse) {
        this.bestUse = bestUse;
    }
    
    public Vaccine(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getDesc() {
        return desc;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
  
    @Override 
    public String toString(){
        return this.getName();
    }
    

}
