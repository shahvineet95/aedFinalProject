/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Batch;

import java.util.ArrayList;

/**
 *
 * @author India
 */
public class BatchDirectory {
    private int batchId = 1;
    ArrayList<Batch> batchStorage;

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public ArrayList<Batch> getBatchStorage() {
        return batchStorage;
    }

    public void setBatchStorage(ArrayList<Batch> batchStorage) {
        this.batchStorage = batchStorage;
    }

    public BatchDirectory() {
        this.batchStorage = new ArrayList<Batch>();
    }
    public void addBatchStorage(Batch b){
        this.batchStorage.add(b); 
    }
    public void removeBatchStorage(Batch b){
        this.batchStorage.remove(b);
    }
    
}
