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
    private PHDOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;

    /**
     * Creates new form PHDLeadWorkAreaJPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     */
    public PHDLeadWorkAreaJPanel(JPanel userProcessContainer, Network network, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (PHDOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populationField.setText(""+network.getPopulation());
    }

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

        button_approve = new javax.swing.JButton();
        button_deny = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        populationField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_approve.setText("Approve");
        button_approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_approveActionPerformed(evt);
            }
        });
        add(button_approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 485, -1, -1));

        button_deny.setText("Deny");
        button_deny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_denyActionPerformed(evt);
            }
        });
        add(button_deny, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 485, -1, -1));

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD
        jLabel1.setText("PHD Lead Work Area.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 740, -1));
=======
        jLabel1.setText("PHD Lead Work Area");
>>>>>>> submaster

        valueLabel.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 164, -1));

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel3.setText("Enterprise:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, -1));

        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setText("State Population : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        populationField.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        populationField.setText("<>");
        add(populationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 164, -1));

        workRequestJTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
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
        workRequestJTable.setRowHeight(24);
        jScrollPane1.setViewportView(workRequestJTable);

<<<<<<< HEAD
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 740, 262));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_administrator_male_50px.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 40));
=======
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(populationField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(populationField))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(227, Short.MAX_VALUE))
        );
>>>>>>> submaster
    }// </editor-fold>//GEN-END:initComponents

    private void button_approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_approveActionPerformed
        // TODO add your handling code here:
        int selectedRow=workRequestJTable.getSelectedRow();
        if(selectedRow>=0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
            WorkRequest w =(WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
            w.setStatus("PHD Approved");
            w.setMessage(str1);
            //system.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(w);
            
            for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                if(o.toString().equals("Delivery Organization")){
                    System.out.println("if part was executed...");
                    o.getWorkQueue().addCreatedWorkrequest(w);
                    JOptionPane.showMessageDialog(null, "Order forwarded to Delivery Person!");
                } else {
                    System.out.println("Else part was executed..");
                    //JOptionPane.showMessageDialog(null, "Order could not be forwarded Delivery Person!");
                }
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_button_approveActionPerformed

    private void button_denyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_denyActionPerformed
        // TODO add your handling code here:
        int selectedRow=workRequestJTable.getSelectedRow();
        if(selectedRow>=0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is placed. Do you want to add addtional message");
       
            WorkRequest w =(WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
            w.setStatus("PHD Denied");
            w.setMessage(str1);
            system.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(w);
           populateRequestTable();
        }
    }//GEN-LAST:event_button_denyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_approve;
    private javax.swing.JButton button_deny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel populationField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
