/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Payment.Payment;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author dharm
 */
public class VaccineHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineHistoryJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private HospitalOrganization hosOrganization;
   private Order selectedWorkrequest;
    public VaccineHistoryJPanel(JPanel userProcessContainer, EcoSystem bussiness,HospitalOrganization hosOrganization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=bussiness;
        this.hosOrganization=hosOrganization;
        populateTable();
        jPanel1.setVisible(false);
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
        requesttable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        expDateField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CvcField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cardNumberField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amountText = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requesttable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        requesttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Cost", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requesttable.setRowHeight(24);
        jScrollPane1.setViewportView(requesttable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 840, 200));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 153));
        jButton2.setText("Pay Now");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 180, 40));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 153));
        jButton3.setText("View Bill");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 190, 40));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Product Sans", 0, 20), new java.awt.Color(204, 255, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Product Sans", 0, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Credit Card Number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 34, -1, -1));

        NameField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jPanel1.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 330, -1));

        jLabel3.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Expiry Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        expDateField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        expDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(expDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, 30));

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CVC code:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        CvcField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        CvcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CvcFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CvcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, 30));

        jLabel5.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));
        jPanel1.add(cardNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 32, 230, 30));

        jLabel6.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, -1));

        emailField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 330, -1));

        jLabel7.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        amountText.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        amountText.setForeground(new java.awt.Color(255, 255, 255));
        amountText.setText("xxxx");
        jPanel1.add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jButton4.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton4.setText("Pay Now");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 140, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 460, 400));

        jLabel9.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Vaccine History");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 312, -1));

        jLabel10.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_activity_history_50px.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 60, 50));
    }// </editor-fold>//GEN-END:initComponents
    void populateTable(){
         DefaultTableModel model = (DefaultTableModel) requesttable.getModel();

        model.setRowCount(0);
        for (WorkRequest w : hosOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = w.getVaccine().getName();
            row[1] = w.getQuantity();
            row[2] = w.getQuantity()*w.getVaccine().getCost();
            row[3] = w;
            row[4] = w.getMessage();
            
            model.addRow(row);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           int selectedRow = requesttable.getSelectedRow();
        if(selectedRow >= 0){
            jPanel1.setVisible(true);
            selectedWorkrequest = (Order)requesttable.getValueAt(selectedRow, 3);
            amountText.setText(""+selectedWorkrequest.getQuantity()*selectedWorkrequest.getVaccine().getCost());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int selectedRow = requesttable.getSelectedRow();
        if(selectedRow >= 0){
            selectedWorkrequest=(Order)requesttable.getValueAt(selectedRow, 3);
            ViewBillJPanel manageEnterpriseAdminJPanel = new ViewBillJPanel(userProcessContainer,business,selectedWorkrequest);
            userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void expDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expDateFieldActionPerformed

    private void CvcFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CvcFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CvcFieldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Payment p=selectedWorkrequest.getHosPayment();
        p.setAmount(selectedWorkrequest.getQuantity()*selectedWorkrequest.getVaccine().getCost());
        p.setCompleted(true);
        p.setEnd4digits("**** **** **** "+cardNumberField.getText().substring(cardNumberField.getText().length()-4,cardNumberField.getText().length()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageHospitalJPanle sysAdminwjp = (ManageHospitalJPanle) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CvcField;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel amountText;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField expDateField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable requesttable;
    // End of variables declaration//GEN-END:variables
}
