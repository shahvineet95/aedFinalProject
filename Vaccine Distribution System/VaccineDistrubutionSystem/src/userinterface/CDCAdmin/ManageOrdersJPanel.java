/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCAdmin;

import Business.Batch.Batch;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Pharmaceutical;
import Business.Enterprise.PharmaceuticalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Payment.Payment;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
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
        jPanel1.setVisible(false);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageOrdersJTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        ManageOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Batches", "Cost", "State", "Created Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageOrdersJTable.setRowHeight(24);
        jScrollPane1.setViewportView(ManageOrdersJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 750, 200));

        jButton1.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 40));

        jButton2.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton2.setText("Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, 40));

        NetworkCombobox.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        NetworkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkComboboxActionPerformed(evt);
            }
        });
        add(NetworkCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 140, -1));

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel2.setText("Network:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jLabel3.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, 30));

        organizationCombo.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });
        add(organizationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 160, -1));

        populationTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        populationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State ", "Population"
            }
        ));
        populationTable.setRowHeight(24);
        jScrollPane2.setViewportView(populationTable);
        if (populationTable.getColumnModel().getColumnCount() > 0) {
            populationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 270, 700));

        jButton4.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton4.setText("Pay");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, 40));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Product Sans", 0, 18), new java.awt.Color(204, 255, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Credit Card Number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 34, -1, -1));

        NameField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jPanel1.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Expiry Date:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        expDateField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        expDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(expDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, 30));

        jLabel6.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("CVC code:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 30));

        CvcField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        CvcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CvcFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CvcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 90, 90, 30));

        jLabel7.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, 60, 30));

        cardNumberField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jPanel1.add(cardNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 320, -1));

        jLabel9.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 30));

        emailField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));

        jLabel10.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("Amount :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setText("xxxx");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 70, -1));

        jButton5.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton5.setText("Pay Now");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 180, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 550, 350));

        jButton6.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton6.setText("View Bill");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 120, 40));

        jButton7.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jButton7.setText("Check Availibility");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 190, 40));
        add(avlNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 20, 40));

        jLabel12.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 50));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manage Orders");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 402, -1));

        jLabel14.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_management_50px.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 80, 50));
    }// </editor-fold>//GEN-END:initComponents
    void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ManageOrdersJTable.getModel();

        model.setRowCount(0);
        System.out.println("Y"+system.getCdcOrganization().getWorkQueue().getWorkRequestList());
        for (WorkRequest w :system.getCdcOrganization().getWorkQueue().getWorkRequestList()) {
            if(w instanceof Order){
            Object[] row = new Object[7];
            row[0] = w.getVaccine().getName();
            row[1] = w.getQuantity();
            row[2] = w.getQuantity()*w.getVaccine().getCost();
            row[3] = ((Order) w).getNetwork();
            row[4] = w.getRequestDate();
            row[5] = w;
            row[6] = w.getMessage();
            
            model.addRow(row);

            }
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
           if(!w.getStatus().equals("PHD Approved")){
                 JOptionPane.showMessageDialog(null, "You Can not Process further");
                 return;
            }
          String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
          w.setStatus("CDC Approved");
          w.setMessage(str1);
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
            selectedWorkrequest = (Order)ManageOrdersJTable.getValueAt(selectedRow, 5);
            if(!selectedWorkrequest.getHosPayment().isCompleted()){
                 JOptionPane.showMessageDialog(null, "You Can not Process further");
                 return;
            }
            jPanel1.setVisible(true);
            
            jLabel8.setText(""+selectedWorkrequest.getQuantity()*selectedWorkrequest.getVaccine().getCost());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          int selectedRow = ManageOrdersJTable.getSelectedRow();
        if(selectedRow >= 0){
            selectedWorkrequest=(Order)ManageOrdersJTable.getValueAt(selectedRow, 5);
            if(!selectedWorkrequest.getCdcPayment().isCompleted()){
                 JOptionPane.showMessageDialog(null, "You Can not Process further");
                 return;
            }
            ViewBillJPanel manageEnterpriseAdminJPanel = new ViewBillJPanel(userProcessContainer,system,selectedWorkrequest);
            userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersJTable.getSelectedRow();
        int count =0;
        if(selectedRow>=0){
            Order o = (Order)ManageOrdersJTable.getValueAt(selectedRow, 5);
            for(Network n:system.getNetworkList()){
                if(n.getName().equals(o.getNetwork())){
                    System.out.println("NetW"+n);
                    for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                        System.out.println("ENTER"+e);
                        if(e.getEnterpriseType().equals(Pharmaceutical)){
                            PharmaceuticalEnterprise pe = (PharmaceuticalEnterprise)e;
                            System.out.println("PHARM"+pe);
                            for(Batch b:pe.getBatchDir().getBatchStorage()){
                                System.out.println("Batch:"+b.getVaccine());
                                System.out.println("Batch:"+o.getVaccine());
                                if(b.getVaccine().equals(o.getVaccine())){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        avlNumber.setText(""+count);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = ManageOrdersJTable.getSelectedRow();
       if(selectedRow>=0){
          System.out.println("AAAAA"+ManageOrdersJTable.getValueAt(selectedRow, 5));
          WorkRequest w =(WorkRequest)ManageOrdersJTable.getValueAt(selectedRow, 5);
           if(!w.getStatus().equals("PHD Approved")){
                 JOptionPane.showMessageDialog(null, "You Can not Process further");
                 return;
            }
          String str1 = JOptionPane.showInputDialog(null, "Your order is placed.Do you want to add addtional message");
          w.setStatus("CDC Denied");
          w.setMessage(str1);
          selectedOrganization.getWorkQueue().addCreatedWorkrequest(w);
          populateTable();
           System.out.println("SelectedWorkreq"+selectedOrganization);
       }
    }//GEN-LAST:event_jButton2ActionPerformed


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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
