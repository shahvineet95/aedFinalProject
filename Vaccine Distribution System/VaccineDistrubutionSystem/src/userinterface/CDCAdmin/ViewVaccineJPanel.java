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
import Business.Vaccine.Vaccine;
import Business.WorkQueue.Order;
import Business.WorkQueue.RegisterVaccine;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dharm
 */
public class ViewVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVaccineJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Network selectedNetwork;
    PharmaceuticalEnterprise selectedEnterprise;
    Vaccine selectedVaccine;
    public ViewVaccineJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
        populateData();
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
        ViewVaccine = new javax.swing.JTable();
        networkDrop = new javax.swing.JComboBox();
        EnterpriseDrop = new javax.swing.JComboBox();
        VaccineDrop = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewBatch = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setText("View Vaccine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 190, 40));

        ViewVaccine.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        ViewVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "Vaccine", "Network", "Title 4"
            }
        ));
        ViewVaccine.setRowHeight(24);
        jScrollPane1.setViewportView(ViewVaccine);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 610, 230));

        networkDrop.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        add(networkDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, -1));

        EnterpriseDrop.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        add(EnterpriseDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 92, -1));

        VaccineDrop.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        VaccineDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineDropActionPerformed(evt);
            }
        });
        add(VaccineDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 90, -1));

        jButton1.setFont(new java.awt.Font("Product Sans", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 385, 220, 40));

        viewBatch.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        viewBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "Vaccine"
            }
        ));
        viewBatch.setRowHeight(24);
        jScrollPane2.setViewportView(viewBatch);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 610, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void VaccineDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccineDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VaccineDropActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) viewBatch.getModel();
        model1.setRowCount(0);
        for (Batch b :selectedEnterprise.getBatchDir().getBatchStorage()) {
            System.out.println("bbb"+b.getVaccine());
            if(b.getVaccine().equals(selectedVaccine)){
            Object[] row = new Object[2];
            row[0] = b.getBatchId();
            row[1] = b.getVaccine();
            model1.addRow(row);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ViewVaccine.getModel();

        model.setRowCount(0);
        for (WorkRequest w :ecosystem.getCdcOrganization().getWorkQueue().getWorkRequestList()) {
            if(w instanceof RegisterVaccine){
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
    }
    void populateData(){
        networkDrop.removeAllItems();
        for(Network n:ecosystem.getNetworkList()){
            networkDrop.addItem(n);
        }
        selectedNetwork=ecosystem.getNetworkList().get(0);
        EnterpriseDrop.removeAllItems();
        boolean flag=true;
        for(Enterprise e : selectedNetwork.getEnterpriseDirectory().getEnterpriseList()){
          if(e.getEnterpriseType().equals(Pharmaceutical)){
              EnterpriseDrop.addItem(e);
              if(flag){
                  selectedEnterprise=(PharmaceuticalEnterprise)e;
                  flag=false;
              }
          }
        }
        VaccineDrop.removeAllItems();
        for(Vaccine v:ecosystem.getVaccinedir().getVaccDir()){
            VaccineDrop.addItem(v);
        }
        selectedVaccine=ecosystem.getVaccinedir().getVaccDir().get(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EnterpriseDrop;
    private javax.swing.JComboBox VaccineDrop;
    private javax.swing.JTable ViewVaccine;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox networkDrop;
    private javax.swing.JTable viewBatch;
    // End of variables declaration//GEN-END:variables
}
