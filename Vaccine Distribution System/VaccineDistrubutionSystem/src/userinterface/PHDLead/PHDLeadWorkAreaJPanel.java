/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PHDLead;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PHDOrganization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imskr
 */
public class PHDLeadWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PHDOrganization phdorganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;
    private ProviderOrganization organization;

    /**
     * Creates new form PHDLeadWorkAreaJPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     */
    public PHDLeadWorkAreaJPanel(JPanel userProcessContainer, Network network, UserAccount account, PHDOrganization phdorganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.phdorganization = phdorganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populationField.setText(""+network.getPopulation());
    }

//    public PHDLeadWorkAreaJPanel(ProviderOrganization organization) {
//        this.organization = organization;
//    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = request.getVaccine().getName();
            row[1] = request.getSender();
            row[2] = request.getQuantity();
            row[3] = request.getQuantity()*request.getVaccine().getCost();
            row[4] = request;
            row[5] = request.getMessage();
            row[6] = request.getRequestDate();
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        populationField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Deny");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHD LEAD WORK AREA");

        valueLabel.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        valueLabel.setText("<value>");

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel3.setText("Enterprise:");

        jLabel2.setText("State Population : ");

        populationField.setText("<>");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Hospital", "Quantity", "Cost", "Status", "Message", "Created Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(populationField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valueLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(populationField))
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(153, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow=workRequestJTable.getSelectedRow();
        if(selectedRow>=0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
       
            WorkRequest w =(WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
            w.setStatus("PHD Approved");
            w.setMessage(str1);
            system.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(w);
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow=workRequestJTable.getSelectedRow();
        if(selectedRow>=0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
       
            WorkRequest w =(WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
            w.setStatus("PHD Denied");
            w.setMessage(str1);
            system.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(w);
           populateRequestTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel populationField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
