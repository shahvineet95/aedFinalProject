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
    
    public Extended addWorkRequestList() {
        Extended temp = new Extended();
        workRequestList.add(temp);
        return temp;
    }
    
    public void addCreatedWorkrequest(WorkRequest e){
        workRequestList.add(e);
    }
}