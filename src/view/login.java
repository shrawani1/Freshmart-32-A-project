
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 //*///////
package view;

import models.User;

import javax.swing.*;

import controller.UserController;

import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class login extends javax.swing.JFrame {

    private String role;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbfield = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tfpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        contactusbtn = new javax.swing.JButton();
        aboutusbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/trolly.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/trolly3.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -40, -1, 560));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Select role");

        cbfield.setBackground(new java.awt.Color(204, 204, 255));
        cbfield.setEditable(true);
        cbfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "admin", "seller" }));
        cbfield.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("User Id");

        tfuser.setBackground(new java.awt.Color(153, 153, 153));
        tfuser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfuser.setForeground(new java.awt.Color(255, 255, 255));
        tfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Password");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfpass.setBackground(new java.awt.Color(153, 153, 153));
        tfpass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfpass.setForeground(new java.awt.Color(255, 255, 255));
        tfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpassActionPerformed(evt);
            }
        });

        btnlogin.setBackground(new java.awt.Color(51, 255, 51));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbfield, 0, 151, Short.MAX_VALUE)
                            .addComponent(tfuser)
                            .addComponent(tfpass))))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnlogin))
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 470));

        contactusbtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        contactusbtn.setText("Contact us");
        contactusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusbtnActionPerformed(evt);
            }
        });
        jPanel2.add(contactusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 140, 40));

        aboutusbtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        aboutusbtn.setText("About us");
        aboutusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusbtnActionPerformed(evt);
            }
        });
        jPanel2.add(aboutusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 422, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1654, 1654, 1654))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(977, 977, 977)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1601, 2707);
    }// </editor-fold>//GEN-END:initComponents

    private void contactusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusbtnActionPerformed
        dispose();
        new contactus().setVisible(true);
    }//GEN-LAST:event_contactusbtnActionPerformed

    private void aboutusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusbtnActionPerformed
        dispose();
        new aboutUs().setVisible(true);
    }//GEN-LAST:event_aboutusbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        role = "admin";
    }// GEN-LAST:event_formWindowOpened

    private void cbfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbfieldActionPerformed

    private void tfuserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfuserActionPerformed
        // // TODO add your handling code here:
    }// GEN-LAST:event_tfuserActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnloginActionPerformed

        // String combobox = cbfield.getItemAt(0);
        role = cbfield.getSelectedItem().toString().toLowerCase();
        String pass = new String(tfpass.getPassword());
        String user = tfuser.getText();
        try {
            User u1 = new User(user, pass, Integer.parseInt(user));
            UserController uc = new UserController();
            ResultSet result = uc.selectQuery(u1);
            if (result.next()) {
                String seller_id = result.getString("seller_id");
                String fetchedRole = result.getString("role");
                System.out.println("CLICKED BHAKO VALUE: -->" + role);

                System.out.println("Fetched Role:" + fetchedRole);
                JOptionPane.showMessageDialog(this, "loggedin successfully");
                uc.changeStatus(u1);
                uc.updatestatus(u1);
                if (role.equals("seller")) {
                    dispose();
                    new BillingPoint().setVisible(true);
                }

                else if (role.equals("admin")) {
                    dispose();
                    new product().setVisible(true);
                }
            } else {
                // System.out.println("some error occured");
                JOptionPane.showMessageDialog(this, "incorrect password");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }

        // TODO add your handling code here:
    }// GEN-LAST:event_btnloginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jButton2ActionPerformed

    private void tfpassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfpassActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_tfpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
        
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutusbtn;
    private javax.swing.JButton btnlogin;
    private javax.swing.JComboBox<String> cbfield;
    private javax.swing.JButton contactusbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables

}
