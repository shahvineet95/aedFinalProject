/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryManagerRole.InventoryManagerWorkAreaJPanel;

/**
 *
 * @author India
 */
public class InventoryManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,Network network, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InventoryManagerWorkAreaJPanel(userProcessContainer,network, account, (InventoryOrganization)organization, enterprise, business);
    }
    
     @Override
    public String toString() {
        return "Inventory Manager";
    }
}
