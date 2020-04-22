/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Batch.BatchDirectory;
import Business.Network.Network;
import Business.Organization.CdcOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private static Organization cdcOrganization;
    private VaccineDirectory vaccinedir;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
            cdcOrganization=new CdcOrganization();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
       
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
        vaccinedir = new VaccineDirectory();
        cdcOrganization=new CdcOrganization();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
//        for(Network network:networkList){
//            
//        }
        return true;
    }

    public VaccineDirectory getVaccinedir() {
        return vaccinedir;
    }

    public void setVaccinedir(VaccineDirectory vaccinedir) {
        this.vaccinedir = vaccinedir;
    }

    public Organization getCdcOrganization() {
        return cdcOrganization;
    }

    public void setCdcOrganization(Organization cdcOrganization) {
        this.cdcOrganization = cdcOrganization;
    }
    
    
}
