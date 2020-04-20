/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Batch.BatchDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class PharmaceuticalEnterprise extends Enterprise {
    
    private BatchDirectory batchDir;
    public PharmaceuticalEnterprise(String name){
        super(name,EnterpriseType.Pharmaceutical);
        batchDir = new BatchDirectory();
    }

    public BatchDirectory getBatchDir() {
        return batchDir;
    }

    public void setBatchDir(BatchDirectory batchDir) {
        this.batchDir = batchDir;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
