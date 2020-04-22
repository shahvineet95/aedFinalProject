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
import Business.WorkQueue.WorkRequest;
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
    //Batch batch = new Batch();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVaccineId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nameBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtBatchId = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VaccineTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        VaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "Vaccine", "Cost", "status", "message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VaccineTable.setRowHeight(24);
        jScrollPane1.setViewportView(VaccineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 860, 300));

        txtCost.setEditable(false);
        txtCost.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 190, -1));

        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 50, -1));

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel3.setText("Cost");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 50, -1));

        jLabel4.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel4.setText("Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, -1));

        DescField.setColumns(20);
        DescField.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        DescField.setRows(5);
        jScrollPane2.setViewportView(DescField);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 140));

        createBtn.setBackground(new java.awt.Color(0, 51, 51));
        createBtn.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        createBtn.setForeground(new java.awt.Color(204, 255, 204));
        createBtn.setText("Create");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 340, 50));

        jLabel5.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel5.setText("Batch");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 60, -1));

        txtBatch.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });
        add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 180, -1));

        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel6.setText("Best before");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 100, -1));

        jLabel7.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel7.setText("Vaccine Id");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 30));

        txtVaccineId.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        txtVaccineId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineIdActionPerformed(evt);
            }
        });
        add(txtVaccineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 180, -1));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 50));

        nameBox.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        nameBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, -1));

        jLabel9.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel9.setText("Batch Id");
        jLabel9.setMaximumSize(new java.awt.Dimension(43, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(43, 14));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 70, -1));

        txtBatchId.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        txtBatchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchIdActionPerformed(evt);
            }
        });
        add(txtBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 180, -1));

        jDateChooser1.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 180, 30));

        jLabel10.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Create Vaccine Request");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 312, -1));

        jLabel11.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_syringe_50px.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 70, 50));
    }// </editor-fold>//GEN-END:initComponents

     public void populateComboBox(){
       nameBox.removeAllItems();
       for(int i=0;i<arr.size(); i++){
        nameBox.addItem(arr.get(i));
        txtCost.setText(""+arr.get(i).getCost());
       }
       
    }
     
    void populateTable(){
         DefaultTableModel model = (DefaultTableModel) VaccineTable.getModel();

        model.setRowCount(0);
        for (WorkRequest v : inventoryOrganization.getWorkQueue().getWorkRequestList()) {
            if(v instanceof RegisterVaccine){
            Object[] row = new Object[5];
            row[0] = ((RegisterVaccine) v).getBatch().getBatchId();
            row[1] = v.getVaccine();
            row[2] = v.getVaccine().getCost();
            row[3] = v.getStatus();
            row[4] = v.getMessage();
            
            model.addRow(row);
            }
         }
    }
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        
            String str1 = JOptionPane.showInputDialog(null, "Your order is sent for testing");
            RegisterVaccine rv = inventoryOrganization.getWorkQueue().addWorkRequestList2();
            Batch newbatch = new Batch();
            newbatch.setVaccine((Vaccine)nameBox.getSelectedItem());
            rv.setSender(userAccount);
            rv.setStatus("Order placed");
            rv.setMessage(str1);
            rv.setVaccine((Vaccine)nameBox.getSelectedItem());
            rv.setBatch(newbatch);
            //rv.setQuantity(Integer.parseInt(txtBatch.getText()));
            rv.setNetwork(network.getName());
            business.getCdcOrganization().getWorkQueue().addCreatedWorkrequest(rv);
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e.getEnterpriseType().equals(Pharmaceutical)){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if(o.toString().equals("Lab Organization")){
                            o.getWorkQueue().addCreatedWorkrequest(rv);
                        }
                    }
                }
            }   
            populateTable();
    }//GEN-LAST:event_createBtnActionPerformed

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    private void txtVaccineIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineIdActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxActionPerformed

    private void nameBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameBoxItemStateChanged
        // TODO add your handling code here:
        
//       for(int i=0;i<arr.size(); i++){
//        String selectedItem = nameBox.getSelectedItem().toString();
//        if(arr.get(i).getName().equals(selectedItem))
//        {
//            txtCost.setText(""+arr.get(i).getCost());
//        }
//       }
    }//GEN-LAST:event_nameBoxItemStateChanged

    private void txtBatchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchIdActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescField;
    private javax.swing.JTable VaccineTable;
    private javax.swing.JButton createBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox nameBox;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtBatchId;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtVaccineId;
    // End of variables declaration//GEN-END:variables
}