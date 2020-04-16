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
import Business.Vaccine.Vaccine;
import Business.WorkQueue.WorkRequest;
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
    
    public ManageOrdersJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateTable();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrdersJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NetworkCombobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationCombo = new javax.swing.JComboBox();

        jLabel1.setText("Manage Orders");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NetworkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(160, Short.MAX_VALUE))
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int selectedRow = ManageOrdersJTable.getSelectedRow();
       if(selectedRow>0){
           System.out.println("AAAAA"+ManageOrdersJTable.getValueAt(selectedRow, 5));
          WorkRequest w =(WorkRequest)ManageOrdersJTable.getValueAt(selectedRow, 5);
          w.setStatus("CDC Approved");
          selectedOrganization.getWorkQueue().addCreatedWorkrequest(w);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageOrdersJTable;
    private javax.swing.JComboBox NetworkCombobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationCombo;
    // End of variables declaration//GEN-END:variables
}
