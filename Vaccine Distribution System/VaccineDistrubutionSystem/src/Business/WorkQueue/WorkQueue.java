/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public Order addWorkRequestList() {
        Order temp = new Order();
        workRequestList.add(temp);
        return temp;
    }
    
    public CallBackVaccine addWorkRequestList3() {
        CallBackVaccine temp = new CallBackVaccine();
        workRequestList.add(temp);
        return temp;
    }
    public RegisterVaccine addWorkRequestList2(){
        RegisterVaccine temp = new RegisterVaccine();
        workRequestList.add(temp);
        return temp;
    }
    
    public void addCreatedWorkrequest(WorkRequest e){
        workRequestList.add(e);
    }
    
     public void addCreatedWorkrequest3(CallBackVaccine e){
        workRequestList.add(e);
    }
}