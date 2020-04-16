/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;
import Business.Role.CDCAdminRole;
import Business.Role.HospitalAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */

public class CdcOrganization extends Organization{
    public CdcOrganization() {
        super(Organization.Type.CDCAdminRole.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CDCAdminRole());
        return roles;
    }
}
