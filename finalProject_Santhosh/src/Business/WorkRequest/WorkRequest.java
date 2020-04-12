/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.User.User;
import java.util.Date;

/**
 *
 * @author imskr
 */
public abstract class WorkRequest {
    
    private String vaccine;
    private User hospital;
    private String status;

//    private User receiver;
//    private Date requestDate;
//    private Date resolveDate;
    
//    public WorkRequest(){
//        requestDate = new Date();
//    }

    public String getVaccine() {
        return vaccine;
    }

    public User getHospital() {
        return hospital;
    }

    public String getStatus() {
        return status;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public void setHospital(User hospital) {
        this.hospital = hospital;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
