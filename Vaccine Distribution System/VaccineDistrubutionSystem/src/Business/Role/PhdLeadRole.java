/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PHDOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PHDLead.PHDLeadWorkAreaJPanel;

/**
 *
 * @author imskr
 */
public class PhdLeadRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network ,UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PHDLeadWorkAreaJPanel(userProcessContainer, network, account, (PHDOrganization)organization, 
                enterprise, business);
    }

    @Override
    public String toString() {
        return "PHD Lead";
    }
    
    
}
