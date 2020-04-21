/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Pharmaceutical;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Payment.Payment;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dharm
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network selectedNetwork;
    private Organization selectedOrganization;
    private Order selectedWorkrequest;
   
    public ManageOrdersJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        populatePopulationTable();
           NetworkCombobox.removeAllItems();
        for(Network a:system.getNetworkList()){
            NetworkCombobox.addItem(a);
        }
        try{
            selectedNetwork=system.getNetworkList().get(0);
            organizationCombo.removeAllItems();
            System.out.println("Selected Network"+selectedNetwork);
            for(Enterprise e:selectedNetwork.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("ENterprise"+e+"AAAA "+e.getEnterpriseType());
                if(e.getEnterpriseType().equals(Pharmaceutical)){
                    System.out.println("ENterprise1"+e);
                    for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                        organizationCombo.addItem(o);
                        System.out.println("ENterprise11"+o);
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error");
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
        ManageOrdersJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NetworkCombobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        populationTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        expDateField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CvcField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cardNumberField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        avlNumber = new javax.swing.JLabel();

        ManageOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Batches", "Cost", "Hospital", "Created Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageOrdersJTable);

        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decline");

        NetworkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkComboboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Network:");

        jLabel3.setText("Organization:");

        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });

        populationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State ", "Population"
            }
        ));
        jScrollPane2.setViewportView(populationTable);
        if (populationTable.getColumnModel().getColumnCount() > 0) {
            populationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton3.setText("< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manage Orders");

        jButton4.setText("Pay");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Details"));

        jLabel4.setText("Credit Card Number:");

        jLabel5.setText("Expiry Date:");

        expDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("CVC code:");

        CvcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CvcFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Name :");

        jLabel9.setText("Email :");

        jLabel10.setText("Amount :");

        jLabel11.setText("xxxx");

        jButton5.setText("Pay Now");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cardNumberField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CvcField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(expDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CvcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addContainerGap())))
        );

        jButton6.setText("View Bill");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Check Availibility");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton2)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NetworkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(avlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(avlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ManageOrdersJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest w :system.getCdcOrganization().getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[7];
            row[0] = w.getVaccine().getName();
            row[1] = w.getQuantity();
            row[2] = w.getQuantity()*w.getVaccine().getCost();
            row[3] = w.getSender();
            row[4] = w.getRequestDate();
            row[5] = w;
            row[6] = w.getMessage();
            
            model.addRow(row);
        }
    }
    
    void populatePopulationTable(){
        DefaultTableModel model = (DefaultTableModel) populationTable.getModel();

        model.setRowCount(0);
        for (Network n :system.getNetworkList()) {
            Object[] row = new Object[2];
            row[0] = n;
            row[1] = n.getPopulation();
            model.addRow(row);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int selectedRow = ManageOrdersJTable.getSelectedRow();
       if(selectedRow>=0){
          System.out.println("AAAAA"+ManageOrdersJTable.getValueAt(selectedRow, 5));
          WorkRequest w =(WorkRequest)ManageOrdersJTable.getValueAt(selectedRow, 5);
          w.setStatus("CDC Approved");
          selectedOrganization.getWorkQueue().addCreatedWorkrequest(w);
          populateTable();
           System.out.println("SelectedWorkreq"+selectedOrganization);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void organizationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboActionPerformed
        // TODO add your handling code here:
       selectedOrganization=(Organization)organizationCombo.getSelectedItem();
    }//GEN-LAST:event_organizationComboActionPerformed

    private void NetworkComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkComboboxActionPerformed
        // TODO add your handling code here:
       selectedNetwork=(Network)NetworkCombobox.getSelectedItem();
       organizationCombo.removeAllItems();
       for(Enterprise e:selectedNetwork.getEnterpriseDirectory().getEnterpriseList()){
           if(e.getEnterpriseType().equals("Pharmaceutical")){
              for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                  organizationCombo.addItem(o);
              }
           }
       } 
    }//GEN-LAST:event_NetworkComboboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void expDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expDateFieldActionPerformed

    private void CvcFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CvcFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CvcFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Payment p=selectedWorkrequest.getCdcPayment();
        p.setAmount(selectedWorkrequest.getQuantity()*selectedWorkrequest.getVaccine().getCost());
        p.setCompleted(true);
        p.setEnd4digits("**** **** **** "+cardNumberField.getText().substring(-4));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          int selectedRow = ManageOrdersJTable.getSelectedRow();
        if(selectedRow >= 0){
            jPanel1.setVisible(true);
            selectedWorkrequest = (Order)ManageOrdersJTable.getValueAt(selectedRow, 3);
            jLabel8.setText(""+selectedWorkrequest.getQuantity()*selectedWorkrequest.getVaccine().getCost());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          int selectedRow = ManageOrdersJTable.getSelectedRow();
        if(selectedRow >= 0){
            selectedWorkrequest=(Order)ManageOrdersJTable.getValueAt(selectedRow, 3);
            ViewBillJPanel manageEnterpriseAdminJPanel = new ViewBillJPanel(userProcessContainer,system,selectedWorkrequest);
            userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CvcField;
    private javax.swing.JTable ManageOrdersJTable;
    private javax.swing.JTextField NameField;
    private javax.swing.JComboBox NetworkCombobox;
    private javax.swing.JLabel avlNumber;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField expDateField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JTable populationTable;
    // End of variables declaration//GEN-END:variables
}
