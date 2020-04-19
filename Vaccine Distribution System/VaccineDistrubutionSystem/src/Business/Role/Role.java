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
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        InventoryManager("Inventory Manager"),
        LabAssistant("Lab Assistant"),
        
        //DeliveryEnterprise
        PHDLead("PHD Lead"),
        DeliveryPerson("Delivery Person"),
        Provider("Provider"),
        Logistics("Logistics"),
        DeliveryManger("Delivery Manager");
        
        private final String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,Network network, UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

}