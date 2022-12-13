 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.mysql.cj.result.Row;
import javax.swing.*;
import javax.swing.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;


import javax.swing.table.DefaultTableModel;
 public class sellermanager_final extends javax.swing.JFrame {
    
    

    
    public sellermanager_final()  {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sellerIDLabel = new javax.swing.JLabel();
        SellerIdTextfield = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        sellerPasswordTextfield = new javax.swing.JTextField();
        sellerNameLabel = new javax.swing.JLabel();
        sellerNameTextfield = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        sellerGenderTextfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        sellerListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        manageSellerLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(223, 237, 231));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(223, 237, 231));
        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell5468i5\\Desktop\\freshmartpart2\\fresh mart\\freshmart\\src\\main\\java\\Supermarket management system (2).png")); // NOI18N
        jLabel1.setText("jLabel1");

        sellerIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sellerIDLabel.setText("SELLER ID");

        SellerIdTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerIdTextfieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setText("PASSWORD");

        sellerPasswordTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerPasswordTextfieldActionPerformed(evt);
            }
        });

        sellerNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sellerNameLabel.setText("SELLER NAME");

        sellerNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerNameTextfieldActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderLabel.setText("GENDER");

        sellerGenderTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerGenderTextfieldActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        sellerListLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sellerListLabel.setText("                 SELLER LIST");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sellerNameLabel)
                            .addComponent(sellerIDLabel))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(sellerNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genderLabel))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(SellerIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(220, 220, 220)
                                    .addComponent(passwordLabel)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(editButton)
                                .addGap(118, 118, 118)
                                .addComponent(deleteButton)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton)
                            .addComponent(sellerPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerGenderTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(AddButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(sellerListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellerIDLabel)
                    .addComponent(passwordLabel)
                    .addComponent(sellerPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(sellerGenderTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerNameLabel)
                            .addComponent(sellerNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addGap(73, 73, 73)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(sellerListLabel)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        manageSellerLabel.setBackground(new java.awt.Color(223, 237, 231));
        manageSellerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manageSellerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSellerLabel.setText("MANAGE SELLER");
        manageSellerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(223, 237, 231), null));

        jButton1.setText("PRODUCT CATEGORIES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageSellerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(manageSellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellerIdTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerIdTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerIdTextfieldActionPerformed

    private void sellerGenderTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerGenderTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerGenderTextfieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
//        DBconnection db = new DBconnection();
        int result;    
        
        String seller_id =SellerIdTextfield.getText();
        String seller_name=sellerNameTextfield.getText();     
        String password=sellerPasswordTextfield.getText();
        String gender=sellerGenderTextfield.getText(); 
        
        String updateQuery = String.format("update manage_seller set seller_id= '%s', seller_name= '%s',password= '%s', gender= '%s' where seller_id = '%s'",seller_id,seller_name,password,gender,seller_id);
//        result= db.execute_command(updateQuery);
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        if (jTable1.getSelectedRowCount()==1){
       
        
        
        tblModel.setValueAt(seller_id,jTable1.getSelectedRow(),0);
        tblModel.setValueAt(seller_name,jTable1.getSelectedRow(),1);
        tblModel.setValueAt(password,jTable1.getSelectedRow(),2);
        tblModel.setValueAt(gender,jTable1.getSelectedRow(),3);
        
        JOptionPane.showMessageDialog(this,"updated successfully");
        }else{
            if (jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"The table is empty");
            }else{
                JOptionPane.showMessageDialog(this,"Please select a single Row for updating");
                
            }
            
        }
    
        
        
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        
//        DBconnection db = new DBconnection();
        int result;
        String seller_id =SellerIdTextfield.getText();
        String seller_name=sellerNameTextfield.getText();     
        String password=sellerPasswordTextfield.getText();
        String gender=sellerGenderTextfield.getText(); 
        
        String deleteQuery = String.format("delete from manage_seller where seller_id= '%s'",seller_id,seller_name,password,gender,seller_id);
//        result= db.execute_command(deleteQuery);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRowCount()==1){
            tblModel.removeRow(jTable1.getSelectedRow());
        }else{
            if (jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is empty");
            }else{
                JOptionPane.showMessageDialog(this,"Select a row to delete");
                
            }
            
            
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sellerNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerNameTextfieldActionPerformed

    private void sellerPasswordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerPasswordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerPasswordTextfieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
            SellerIdTextfield.setText("");
            sellerNameTextfield.setText("");
            sellerPasswordTextfield.setText("");
            sellerGenderTextfield.setText("");
       
    }//GEN-LAST:event_clearButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
//        DBconnection db = new DBconnection();
        
        if (SellerIdTextfield.getText().equals("")||sellerNameTextfield.getText().equals("")||sellerPasswordTextfield.equals("")||sellerGenderTextfield.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter all details");
        
        }else{
        int result;    
        String insertquery = "insert into manage_seller(seller_id,seller_name,password,gender)"
                + "values('"+SellerIdTextfield.getText()+"','"+sellerNameTextfield.getText()+"','"+sellerPasswordTextfield.getText()+"','"+sellerGenderTextfield.getText()+"')"; 
//        result= db.execute_command(insertquery);
        String data[]= {SellerIdTextfield.getText(),sellerNameTextfield.getText(),sellerPasswordTextfield.getText(),sellerGenderTextfield.getText()};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(data);
                JOptionPane.showMessageDialog(this,"Data added succesfully");
                SellerIdTextfield.setText("");
                sellerNameTextfield.setText("");
                sellerPasswordTextfield.setText("");
                sellerGenderTextfield.setText("");
                
                
                
                
                }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String tbleId = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String tbleName = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tblePassword = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tbleGender = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        
        SellerIdTextfield.setText(tbleId);
        sellerNameTextfield.setText(tbleName);
        sellerPasswordTextfield.setText(tblePassword);
        sellerGenderTextfield.setText(tbleGender);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        manage_categories mc= new manage_categories();
        this.setVisible(false);
        mc.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(sellermanager_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellermanager_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellermanager_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellermanager_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellermanager_final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddButton;
    public javax.swing.JTextField SellerIdTextfield;
    public javax.swing.JButton clearButton;
    public javax.swing.JButton deleteButton;
    public javax.swing.JButton editButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JLabel manageSellerLabel;
    private javax.swing.JLabel passwordLabel;
    public javax.swing.JTextField sellerGenderTextfield;
    private javax.swing.JLabel sellerIDLabel;
    private javax.swing.JLabel sellerListLabel;
    private javax.swing.JLabel sellerNameLabel;
    public javax.swing.JTextField sellerNameTextfield;
    public javax.swing.JTextField sellerPasswordTextfield;
    // End of variables declaration//GEN-END:variables
}
