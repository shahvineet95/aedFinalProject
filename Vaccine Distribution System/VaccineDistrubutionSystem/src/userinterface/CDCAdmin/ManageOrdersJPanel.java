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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrdersJTable = new javax.swing.JTable();
        NetworkCombobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        populationTable = new javax.swing.JTable();
        kButton1 = new keeptoo.KButton();
        button_decline = new keeptoo.KButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 220, -1));

        ManageOrdersJTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
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
        ManageOrdersJTable.setRowHeight(24);
        ManageOrdersJTable.setSelectionBackground(new java.awt.Color(51, 204, 0));
        jScrollPane1.setViewportView(ManageOrdersJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 710, 250));

        NetworkCombobox.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        NetworkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkComboboxActionPerformed(evt);
            }
        });
        add(NetworkCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 210, -1));

        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setText("Network:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        organizationCombo.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });
        add(organizationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 210, -1));

        populationTable.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        populationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State ", "Population"
            }
        ));
        populationTable.setRowHeight(24);
        populationTable.setSelectionBackground(new java.awt.Color(51, 204, 0));
        jScrollPane2.setViewportView(populationTable);
        if (populationTable.getColumnModel().getColumnCount() > 0) {
            populationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 220, 500));

        kButton1.setText("Approve");
        kButton1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        kButton1.setkBorderRadius(40);
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 102, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 380, -1));

        button_decline.setText("Decline");
        button_decline.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        button_decline.setkBorderRadius(40);
        button_decline.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        button_decline.setkHoverStartColor(new java.awt.Color(51, 102, 0));
        button_decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_declineActionPerformed(evt);
            }
        });
        add(button_decline, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 380, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_list_50px.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 50, 30));
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

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersJTable.getSelectedRow();
       if(selectedRow>0){
           System.out.println("AAAAA"+ManageOrdersJTable.getValueAt(selectedRow, 5));
          WorkRequest w =(WorkRequest)ManageOrdersJTable.getValueAt(selectedRow, 5);
          w.setStatus("CDC Approved");
          selectedOrganization.getWorkQueue().addCreatedWorkrequest(w);
       }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void button_declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_declineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_declineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageOrdersJTable;
    private javax.swing.JComboBox NetworkCombobox;
    private keeptoo.KButton button_decline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KButton kButton1;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JTable populationTable;
    // End of variables declaration//GEN-END:variables
}
