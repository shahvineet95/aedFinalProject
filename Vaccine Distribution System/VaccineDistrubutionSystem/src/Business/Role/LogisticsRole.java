/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LogisticsRole.LogisticsWorkAreaJPanel;

/**
 *
 * @author imskr
 */
public class LogisticsRole extends Role {

    //Replace DoctorWorkAreaJPanel with LogisticsWorkAreaJPanel
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LogisticsWorkAreaJPanel(userProcessContainer, account, (LogisticsOrganization)organization, enterprise);
    }

    @Override
    public String toString() {
        return "Logistics Person";
    }
    
    
    
}
