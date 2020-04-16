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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.CDCAdmin.CDCadminDashboard;

/**
 *
 * @author raunak
 */
public class CDCAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network ,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CDCadminDashboard(userProcessContainer, system);
    }
    
}
