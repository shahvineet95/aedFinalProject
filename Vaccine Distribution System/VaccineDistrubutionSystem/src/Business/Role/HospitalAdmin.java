/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.HospitalAdminRole.HosAdminDashboardJPanel;
import userinterface.HospitalAdminRole.ManageHospitalJPanle;

/**
 *
 * @author raunak
 */
public class HospitalAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HosAdminDashboardJPanel(userProcessContainer,network, account, organization, business);
    }
    
    @Override
    public String toString() {
        return "Hospital Admin";
    }
}
