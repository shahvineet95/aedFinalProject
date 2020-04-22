/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.RequestLabTestJPanel;

/**
 *
 * @author India
 */
public class InventoryManagerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private InventoryOrganization inventoryOrganization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    private Network network;
    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    public InventoryManagerWorkAreaJPanel(JPanel userProcessContainer, Network network, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.inventoryOrganization = (InventoryOrganization)organization;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        this.system = system;
        //valueLabel.setText(enterprise.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageVaccineBtn = new javax.swing.JButton();
        createVaccineBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 495, -1, -1));

        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_in_inventory_50px.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, 60));

        manageVaccineBtn.setBackground(new java.awt.Color(0, 51, 51));
        manageVaccineBtn.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        manageVaccineBtn.setForeground(new java.awt.Color(153, 255, 153));
        manageVaccineBtn.setText("Manage Vaccines Orders");
        manageVaccineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineBtnActionPerformed(evt);
            }
        });
        add(manageVaccineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 340, 60));

        createVaccineBtn.setBackground(new java.awt.Color(0, 51, 51));
        createVaccineBtn.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        createVaccineBtn.setForeground(new java.awt.Color(153, 255, 153));
        createVaccineBtn.setText("Create Vaccine");
        createVaccineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVaccineBtnActionPerformed(evt);
            }
        });
        add(createVaccineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 340, 60));

        jLabel7.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inventory Manager Work Area");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineBtnActionPerformed
        // TODO add your handling code here:
        ManageVaccineOrdersJPanel manageNetworkJPanel=new ManageVaccineOrdersJPanel(userProcessContainer,network, system, inventoryOrganization, account, enterprise);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVaccineBtnActionPerformed

    private void createVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVaccineBtnActionPerformed
        // TODO add your handling code here:
        CreateVaccineJPanel manageNetworkJPanel=new CreateVaccineJPanel(userProcessContainer, network, account, inventoryOrganization, system, enterprise);
        userProcessContainer.add("manageOrders",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createVaccineBtnActionPerformed

//    public void populateRequestTable(){
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        
//        model.setRowCount(0);
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request.getMessage();
//            row[1] = request.getReceiver();
//            row[2] = request.getStatus();
//            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[3] = result == null ? "Waiting" : result;
//            
//            model.addRow(row);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createVaccineBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageVaccineBtn;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
