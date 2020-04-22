/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

	//this is the mainJFrame..

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() throws IOException{
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1300, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        loginJButton.setBackground(new java.awt.Color(135, 206, 250));
        loginJButton.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        userNameJTextField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N

        passwordField.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(135, 206, 250));
        logoutJButton.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(loginJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(loginJButton)
                .addGap(1, 1, 1)
                .addComponent(loginJLabel)
                .addGap(28, 28, 28)
                .addComponent(logoutJButton))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VaccineGO.");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Safe.");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 95, -1));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_trust_50px.png"))); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 86, 71));

        jLabel9.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Secure.");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 95, -1));

        jLabel10.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_key_50px_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 95, 71));

        jLabel12.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reliable.");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_syringe_50px_4.png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_protect_50px_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 95, 71));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 490, 10));

        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel6.setText("Created with ");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_heart_20px.png"))); // NOI18N
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, -1, 40));

        jLabel13.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        jLabel13.setText("by CaffeineRushers");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 160, 40));

        jLabel14.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        jLabel14.setText("A Vaccine Distribution System.");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 270, -1));

        jLabel15.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel15.setText("Dharmik Harkani");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 420, -1));

        jLabel16.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel16.setText("Santhosh Krishnan");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 170, -1));

        jLabel17.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel17.setText("Vineeth Shah");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 420, -1));

        jLabel18.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel18.setText("001029591");
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 410, 20));

        jLabel19.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel19.setText("001029708");
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 200, 20));

        jLabel20.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel20.setText("001020429");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 410, 20));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 310, 10));

        jLabel22.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 0));
        jLabel22.setText("Our Team");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_delivery_50px.png"))); // NOI18N
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        container.add(kGradientPanel1, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
      
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network networka = null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               networka=network;
                               break;
                           }
                       }
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container,networka, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }
        
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", kGradientPanel1);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
