/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author imskr
 */
public class LogisticsOrganization extends Organization {

    public LogisticsOrganization() {
        super(Organization.Type.Delivery.getValue());
    }
    
    //LogisticsRole
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //LogisticsRole
        roles.add(new DoctorRole());
        return roles;
    }
    
}
