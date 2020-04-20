/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManager.DeliveryManagerDashboard;
import userinterface.DeliveryRole.DeliveryPersonWorkAreaJPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author imskr
 */
public class DeliveryManager extends Role{
    
    //DeliveryWorkAreaJPanel
    //typecase organization
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network ,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryManagerDashboard(userProcessContainer, account, (DeliveryOrganization)organization, enterprise);
    }

    @Override
    public String toString() {
        return "Delivery Manager";
    }
    
    
    
    
}
