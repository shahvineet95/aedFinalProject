/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.DoctorRole;
import Business.Role.ProviderRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author imskr
 */
public class ProviderOrganization extends Organization {
    
    public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
    }

    //Provider Role
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProviderRole());
        return roles;
    }
    
    
  
    
}
