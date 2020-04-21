/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.Batch.Batch;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Pharmaceutical;
import Business.Enterprise.PharmaceuticalEnterprise;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.RegisterVaccine;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author India
 */
public class CreateVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVaccineJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private InventoryOrganization inventoryOrganization;
    private Network network;
    private Enterprise pharmEnterprise; 
    ArrayList<Vaccine> arr;
    Batch batch = new Batch();
    public CreateVaccineJPanel(JPanel userProcessContainer,Network network, UserAccount account, Organization organization, EcoSystem business, Enterprise pharmEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.inventoryOrganization = (InventoryOrganization)organization;
        this.network=network;
        this.pharmEnterprise = pharmEnterprise;
        arr = business.getVaccinedir().getVaccDir();
        populateComboBox();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineTable = new javax.swing.JTable();
        txtCost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescField = new javax.swing.JTextArea();
        createBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBatch = new javax.swing.JTextField();
        bestBeforeDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btnPass = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVaccineId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nameBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtBatchId = new javax.swing.JTextField();

        VaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Vaccine Id", "Batch", "Cost", "Description", "Best Before"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineTable);

        txtCost.setEditable(false);

        jLabel2.setText("Name");

        jLabel3.setText("Cost");

        jLabel4.setText("Desc");

        DescField.setColumns(20);
        DescField.setRows(5);
        jScrollPane2.setViewportView(DescField);

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Batch");

        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });

        jLabel6.setText("Best before");

        btnPass.setText("Pass to Test");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });

        jLabel7.setText("Vaccine Id");

        txtVaccineId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineIdActionPerformed(evt);
            }
        });

        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create Vaccine Request");

        nameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nameBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nameBoxItemStateChanged(evt);
            }
        });
        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Batch Id");
        jLabel9.setMaximumSize(new java.awt.Dimension(43, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(43, 14));

        txtBatchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPass)
                            .addComponent(createBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(nameBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bestBeforeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtVaccineId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBatchId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(txtVaccineId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBatchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(bestBeforeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPass)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void populateComboBox(){
       nameBox.removeAllItems();
       for(int i=0;i<arr.size(); i++){
        nameBox.addItem(arr.get(i).getName());
        txtCost.setText(""+arr.get(i).getCost());
       }
       
    }
     
    void populateTable(){
         DefaultTableModel model = (DefaultTableModel) VaccineTable.getModel();

        model.setRowCount(0);
        for (Vaccine v : business.getVaccinedir().getVaccDir()) {
            Object[] row = new Object[6];
            row[0] = v;
            row[1] = v.getVaccineId();
            row[2] = v.getBatch();
            row[3] = v.getCost();
            row[4] = v.getDesc();
            row[5] = v.getBestUse();
            model.addRow(row);
         }
    }
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        Vaccine v = business.getVaccinedir().addVaccDir();
        if(txtVaccineId.getText().equals(v.getVaccineId()))
        {
            JOptionPane.showMessageDialog(null, "Vaccine Id already present.");
        }
        else
        {
            v.setName(""+nameBox.getSelectedItem());
            v.setCost(Float.parseFloat(txtCost.getText()));
            v.setDesc(DescField.getText());
            v.setBestUse(bestBeforeDate.getDate());
            v.setBatch(Integer.parseInt(txtBatch.getText()));
            v.setVaccineId(txtVaccineId.getText());
            
            batch.setBatchId(txtBatchId.getText());
            batch.setVaccine(v);            
    //batch.setVaccineStorage(v);
            System.out.println("Batch=>"+batch);
            
            //v.setName(txtName.getText());
            populateTable();
        }
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        // TODO add your handling code here:
        int selectedRow = VaccineTable.getSelectedRow();
        if(selectedRow >= 0){
            String str1 = JOptionPane.showInputDialog(null, "Your order is sent for testing");
            Vaccine v = (Vaccine)VaccineTable.getValueAt(selectedRow, 0);
            System.out.println("org"+inventoryOrganization.getWorkQueue().addWorkRequestList2());
            RegisterVaccine rv = inventoryOrganization.getWorkQueue().addWorkRequestList2();
            rv.setSender(userAccount);
            rv.setStatus("Order placed");
            rv.setMessage(str1);
            rv.setVaccine(v);
            rv.setBatch(batch);
            rv.setQuantity(Integer.parseInt(txtBatch.getText()));
            // rv.setVaccineId(txtVaccineId.getText());
            rv.setNetwork(network.getName());
            business.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(rv);
           
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e.getEnterpriseType().equals(Pharmaceutical)){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if(o.toString().equals("Lab Organization")){
                        o.getWorkQueue().addCreatedWorkrequest(rv);
                            JOptionPane.showMessageDialog(null, "Order was been sent successfully to Lab for Testing!");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Order could not be placed.");
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnPassActionPerformed

    private void txtVaccineIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxActionPerformed

    private void nameBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameBoxItemStateChanged
        // TODO add your handling code here:
        
       for(int i=0;i<arr.size(); i++){
        String selectedItem = (String) nameBox.getSelectedItem();
        if(arr.get(i).getName().equals(selectedItem))
        {
            txtCost.setText(""+arr.get(i).getCost());
        }
       }
    }//GEN-LAST:event_nameBoxItemStateChanged

    private void txtBatchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescField;
    private javax.swing.JTable VaccineTable;
    private com.toedter.calendar.JDateChooser bestBeforeDate;
    private javax.swing.JButton btnPass;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> nameBox;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtBatchId;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtVaccineId;
    // End of variables declaration//GEN-END:variables
}
