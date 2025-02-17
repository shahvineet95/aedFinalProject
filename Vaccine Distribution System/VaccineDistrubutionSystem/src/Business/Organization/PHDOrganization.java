/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PhdLeadRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author imskr
 */
public class PHDOrganization extends Organization {

    //PHD Lead Type
    public PHDOrganization() {
        super(Organization.Type.PhdLead.getValue());
    }
    
    //PHD Role
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhdLeadRole());
        return roles;
    }
    
}
