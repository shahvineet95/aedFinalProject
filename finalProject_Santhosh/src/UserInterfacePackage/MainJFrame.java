/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage;

import Business.User.User;
import Business.User.UserDirectory;
import Business.WorkRequest.WorkQueue;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author imskr
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private UserDirectory directory;
    private WorkQueue wq;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
//        this.setSize(1680, 1050);
        this.directory = new UserDirectory();
        this.wq = new WorkQueue();
        button_logout.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jSplitPane1 = new javax.swing.JSplitPane();
        displayJPanel = new javax.swing.JPanel();
        txt_userName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pwd_password = new javax.swing.JPasswordField();
        checkBox = new javax.swing.JCheckBox();
        button_logout = new javax.swing.JButton();
        button_login = new javax.swing.JButton();
        viewJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        pwd_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_passwordActionPerformed(evt);
            }
        });

        checkBox.setText("Show Password");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        button_logout.setText("Logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        button_login.setText("Login");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayJPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBox)
                    .addComponent(jLabel1)
                    .addComponent(txt_userName)
                    .addComponent(jLabel2)
                    .addComponent(pwd_password)
                    .addComponent(button_login, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayJPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBox)
                .addGap(51, 51, 51)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(displayJPanel);

        viewJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(viewJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwd_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd_passwordActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
        if (checkBox.isSelected()) {
            pwd_password.setEchoChar((char)0);
        } else {
            pwd_password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxActionPerformed

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        // TODO add your handling code here:
        button_login.setEnabled(true);
        button_logout.setEnabled(false);
        viewJPanel.removeAll();
        //jPanel1.add(CardSequenceLayout);
//        CardLayout crdLyt = (CardLayout) viewJPanel.getLayout();
//        crdLyt.next(viewJPanel);
        txt_userName.setEnabled(true);
        pwd_password.setEnabled(true);
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        ArrayList<User> list = new ArrayList<>();
        list = this.directory.getDirectory();
        if ((txt_userName.getText().equals("d") && pwd_password.getText().equals("d"))) {
            CardLayout layout = (CardLayout)viewJPanel.getLayout();
            viewJPanel.add(new DeliveryManagerWorkArea(viewJPanel, directory, txt_userName.getText()));
            layout.next(viewJPanel);
            //login successful, disable login
            button_login.setEnabled(false);
            button_logout.setEnabled(true);
            txt_userName.setEnabled(false);
            pwd_password.setEnabled(false);
            txt_userName.setText("");
            pwd_password.setText("");
        } else if (txt_userName.getText().equals("p") && pwd_password.getText().equals("p")) {
            CardLayout layout = (CardLayout)viewJPanel.getLayout();
            viewJPanel.add(new ProviderWorkArea(viewJPanel, directory, txt_userName.getText(), wq));
            layout.next(viewJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong username or password!");
        }
    }//GEN-LAST:event_button_loginActionPerformed

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
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JButton button_logout;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField pwd_password;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}
