


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManager;
import Business.Role.DeliveryRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author imskr
 */
public class DeliveryOrganization extends Organization {

    public DeliveryOrganization() {
        super(Organization.Type.Delivery.getValue());
    }
    
    //DeliveryRole
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //DeliveryRole
        roles.add(new DeliveryRole());
        roles.add(new DeliveryManager());
        return roles;
    }
}
