/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package gui;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author antonis
 */
public class UpdateBranchDataFrame extends javax.swing.JFrame {

    /** Creates new form UpdateBranchDataFrame */
    public UpdateBranchDataFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StreetTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        StreetNumTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BranchCodeTextField = new javax.swing.JTextField();
        UpdateStreetButton = new javax.swing.JButton();
        UpdateStrNumButton = new javax.swing.JButton();
        UpdateCityButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        UpdatePhoneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Laksaman", 1, 18)); // NOI18N
        jLabel1.setText("Update Data for Branch");

        jLabel2.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel2.setText("Street:");

        jLabel3.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel3.setText("Street number:");

        jLabel4.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel4.setText("City:");

        jLabel5.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel5.setText("Branch Code:");

        UpdateStreetButton.setText("UPDATE");
        UpdateStreetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStreetButtonActionPerformed(evt);
            }
        });

        UpdateStrNumButton.setText("UPDATE");
        UpdateStrNumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStrNumButtonActionPerformed(evt);
            }
        });

        UpdateCityButton.setText("UPDATE");
        UpdateCityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCityButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel6.setText("Phone Number:");

        UpdatePhoneButton.setText("UPDATE");
        UpdatePhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePhoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PhoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CityTextField))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StreetTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(StreetNumTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BranchCodeTextField))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateStreetButton)
                    .addComponent(UpdateStrNumButton)
                    .addComponent(UpdateCityButton)
                    .addComponent(UpdatePhoneButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BranchCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStreetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StreetNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStrNumButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateCityButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatePhoneButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(501, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStreetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStreetButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update_branch = "UPDATE branch SET br_street = ? WHERE br_code = ?";
        
        PreparedStatement pst;

        try {
                   
            pst = con.getConnection().prepareStatement(update_branch);
            
            pst.setString(1, StreetTextField.getText());
            pst.setInt(2, Integer.parseInt(BranchCodeTextField.getText()));
           
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(rootPane,"Update Successful");
            pst.close();
            
            con.getConnection().close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            Logger.getLogger(AddNewITFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            System.out.println("Invalid input");
        }
    }//GEN-LAST:event_UpdateStreetButtonActionPerformed

    private void UpdateStrNumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStrNumButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update_branch = "UPDATE branch SET br_num = ? WHERE br_code = ?";
        
        PreparedStatement pst;

        try {
                   
            pst = con.getConnection().prepareStatement(update_branch);
            
            pst.setInt(1, Integer.parseInt(StreetNumTextField.getText()));
            pst.setInt(2, Integer.parseInt(BranchCodeTextField.getText()));
           
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(rootPane,"Update Successful");
            pst.close();
            
            con.getConnection().close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            Logger.getLogger(AddNewITFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            System.out.println("Invalid input");
        }
    }//GEN-LAST:event_UpdateStrNumButtonActionPerformed

    private void UpdateCityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCityButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update_branch = "UPDATE branch SET br_city = ? WHERE br_code = ?";
        
        PreparedStatement pst;

        try {
                   
            pst = con.getConnection().prepareStatement(update_branch);
            
            pst.setString(1, CityTextField.getText());
            pst.setInt(2, Integer.parseInt(BranchCodeTextField.getText()));
           
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(rootPane,"Update Successful");
            pst.close();
            
            con.getConnection().close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            Logger.getLogger(AddNewITFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            System.out.println("Invalid input");
        }
    }//GEN-LAST:event_UpdateCityButtonActionPerformed

    private void UpdatePhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePhoneButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update_branch = "UPDATE phones SET ph_number = ? WHERE ph_br_code = ?";
        
        PreparedStatement pst;

        try {
                   
            pst = con.getConnection().prepareStatement(update_branch);
            
            pst.setString(1, PhoneTextField.getText());
            pst.setInt(2, Integer.parseInt(BranchCodeTextField.getText()));
           
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(rootPane,"Update Successful");
            pst.close();
            
            con.getConnection().close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            Logger.getLogger(AddNewITFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            System.out.println("Invalid input");
        }
    }//GEN-LAST:event_UpdatePhoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBranchDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBranchDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBranchDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBranchDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBranchDataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BranchCodeTextField;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField StreetNumTextField;
    private javax.swing.JTextField StreetTextField;
    private javax.swing.JButton UpdateCityButton;
    private javax.swing.JButton UpdatePhoneButton;
    private javax.swing.JButton UpdateStrNumButton;
    private javax.swing.JButton UpdateStreetButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
