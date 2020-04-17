/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Distributor;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Provider;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.Extended;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ManageEnterpriseAdminJPanel;

/**
 *
 * @author dharm
 */
public class ManageHospitalJPanle extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanle
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private HospitalOrganization hosOrganization;
    private Network network;

    public ManageHospitalJPanle(JPanel userProcessContainer,Network network, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.hosOrganization = (HospitalOrganization)organization;
        this.network=network;
        populateTable();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();

        jLabel1.setText("Dashboard");

        VaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Cost"
            }
        ));
        jScrollPane1.setViewportView(VaccineTable);

        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VIew Order History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     void populateTable(){
         DefaultTableModel model = (DefaultTableModel) VaccineTable.getModel();

        model.setRowCount(0);
        for (Vaccine v : business.getVaccinedir().getVaccDir()) {
                    Object[] row = new Object[3];
                    row[0] = v;
                    row[1] = v.getCost();
                    row[2] = v.getDesc();
                    model.addRow(row);
         }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = VaccineTable.getSelectedRow();
        if(selectedRow >= 0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
       
            Vaccine v = (Vaccine)VaccineTable.getValueAt(selectedRow, 0);
            Extended w = hosOrganization.getWorkQueue().addWorkRequestList();
            w.setSender(userAccount);
            w.setStatus("Order placed");
            w.setMessage(str1);
            w.setVaccine(v);
            w.setQuantity(Integer.parseInt(quantity.getText()));
            w.setNetwork(network.getName());
            business.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(w);
           
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
               System.out.println("AAAA"+e);
               if(e.getEnterpriseType().equals(Distributor)) {
                    System.out.println("AAAA1"+e);
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println("A11111AAA1"+o);
                        if(o.toString().equals("Provider Organization")){
                            System.out.println("Adding it in provider organization"+o);
                            o.getWorkQueue().addCreatedWorkrequest(w);
                            JOptionPane.showMessageDialog(null, "Order was placed successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Order could not be placed.");
                        }
                    }
                } 
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VaccineHistoryJPanel manageEnterpriseAdminJPanel=new VaccineHistoryJPanel(userProcessContainer, business,hosOrganization);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VaccineTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
