/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.Batch.Batch;
import Business.Batch.BatchDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Distributor;
import static Business.Enterprise.Enterprise.EnterpriseType.Pharmaceutical;
import Business.Enterprise.PharmaceuticalEnterprise;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.Order;
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
public class ManageVaccineOrdersJPanel extends javax.swing.JPanel {

    /** 
     * Creates new form ManageVaccineOrdersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    private InventoryOrganization inventoryOrganization;
    private PharmaceuticalEnterprise enterprise;
    private Network network;
    public ManageVaccineOrdersJPanel(JPanel userProcessContainer,Network network, EcoSystem ecosystem,InventoryOrganization organization, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.enterprise = (PharmaceuticalEnterprise) enterprise;
        this.inventoryOrganization = (InventoryOrganization)organization;
        this.network = network;
        populateBatchTable();
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

        proceedBtn = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrdersJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        batchTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proceedBtn.setBackground(new java.awt.Color(0, 51, 51));
        proceedBtn.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(153, 255, 153));
        proceedBtn.setText("Proceed");
        proceedBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        add(proceedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 160, 50));

        refreshTestJButton.setBackground(new java.awt.Color(0, 51, 51));
        refreshTestJButton.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(153, 255, 153));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 150, 50));

        enterpriseLabel.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 127, 30));

        valueLabel.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 158, 30));

        ManageOrdersJTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        ManageOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Batches", "Cost", "Hospital", "Created Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageOrdersJTable.setRowHeight(24);
        jScrollPane1.setViewportView(ManageOrdersJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 630, 213));

        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 50));

        batchTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        batchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "BatchId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
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
        batchTable.setRowHeight(24);
        jScrollPane2.setViewportView(batchTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 300, 213));

        jLabel7.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Vaccine Orders");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 312, -1));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_syringe_50px_4.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, 50));
    }// </editor-fold>//GEN-END:initComponents

   public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ManageOrdersJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest w :ecosystem.getCdcOrganization().getWorkQueue().getWorkRequestList()) {
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
   
   public void populateBatchTable(){
       DefaultTableModel model = (DefaultTableModel) batchTable.getModel();
        model.setRowCount(0);
        System.out.println(""+enterprise.getBatchDir().getBatchStorage());
        for (Batch b :enterprise.getBatchDir().getBatchStorage()) {
            Object[] row = new Object[2];
            row[0] = b.getVaccine().getName(); 
            row[1] = b; 
            model.addRow(row);
        }
   }
   
    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed

            int selectedRow = ManageOrdersJTable.getSelectedRow();
            int batchRow = batchTable.getSelectedRow();
        if(selectedRow >= 0){
            if(batchRow >= 0){
                String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
            System.out.println(""+selectedRow);
            
           // Batch b = batch.get(batchRow);
            Batch b = (Batch)batchTable.getValueAt(batchRow, 1);
            
            Order w = (Order)ManageOrdersJTable.getValueAt(selectedRow, 5);
            
            w.setSender(account);
            w.setStatus("Order placed");
            w.setMessage(str1);
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
               
               if(e.getEnterpriseType().equals(Distributor)) {
                    System.out.println("AAAA1"+e);
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println("A11111AAA1"+o);
                        if(o.toString().equals("Delivery Organization")){
                            System.out.println("Adding it in Delivery organization"+o);
                            o.getWorkQueue().addCreatedWorkrequest(w);
                            JOptionPane.showMessageDialog(null, "Order was placed successfully!");
                           
                            enterprise.getBatchDir().removeBatchStorage(b);
                            batchTable.remove(batchRow);

                        } else {
                            JOptionPane.showMessageDialog(null, "Order could not be placed.");
                        }
                    }
                } 
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Selected row from both tables");
            }
        }
        
        
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateTable();
        populateBatchTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageOrdersJTable;
    private javax.swing.JTable batchTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
