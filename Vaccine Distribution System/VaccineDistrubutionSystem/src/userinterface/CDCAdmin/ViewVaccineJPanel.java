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

        jLabel1.setText("View Vaccine");

        ViewVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "Vaccine", "Network", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ViewVaccine);

        VaccineDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineDropActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BatchID", "Vaccine"
            }
        ));
        jScrollPane2.setViewportView(viewBatch);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(networkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(EnterpriseDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(VaccineDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterpriseDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaccineDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
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
