/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InventoryManager.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Hospitaladmin.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
        
        //DeliveryEnterprise..
        else if (type.getValue().equals(Type.Delivery.getValue())) {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PhdLead.getValue())) {
            organization = new PHDOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Provider.getValue())) {
            organization = new ProviderOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Logistics.getValue())) {
            organization = new LogisticsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}