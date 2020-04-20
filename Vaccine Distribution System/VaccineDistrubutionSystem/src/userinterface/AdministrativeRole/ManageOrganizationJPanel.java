/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import java.util.*;
import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {
    
    private final Enterprise enterprise;
    private final OrganizationDirectory directory;
    private final JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     * @param userProcessContainer
     * @param directory
     * @param enterprise
     * @param system
     */
    
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory,
            Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
    }
    private void populateCombo(){
        
        organizationJComboBox.removeAllItems();
        
        if (this.enterprise.getEnterpriseType().getValue().equals("Distributor")) {
            for (Type type: EnumSet.range(Organization.Type.PhdLead, Organization.Type.Logistics)) {
                if (!type.getValue().equals(Type.Admin.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
        } else {
            System.out.println("False Condition was executed!");
            System.out.println("In Enterprise :: " + this.enterprise.getEnterpriseType().getValue());
                   
            for (Type type : EnumSet.range(Organization.Type.Admin, Organization.Type.Hospitaladmin)){
                if (!type.getValue().equals(Type.Admin.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
        }
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 470, 130));

        organizationJComboBox.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 278, -1));

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setText("Manage Organization.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 30));

        kButton1.setText("Add Organization");
        kButton1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        kButton1.setkBorderRadius(40);
        kButton1.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 480, -1));

        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setText("Organization Type ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_organization_50px.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel1.setBackground(Color.green);
    }//GEN-LAST:event_jLabel4MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
