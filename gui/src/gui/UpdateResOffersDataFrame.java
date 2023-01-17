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
public class UpdateResOffersDataFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateResOffersDataFrame
     */
    public UpdateResOffersDataFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LastnameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OfferTripIDTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PayInAdvanceTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ResOfferIDTextField = new javax.swing.JTextField();
        UpdateLnameButton = new javax.swing.JButton();
        UpdateNameButton = new javax.swing.JButton();
        UpdateOfferTrIDButton = new javax.swing.JButton();
        UpdatePayInAdvButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Laksaman", 1, 18)); // NOI18N
        jLabel1.setText("Update a Reservation for an Offer:");

        jLabel3.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel3.setText("Lastname:");

        LastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel4.setText("Name:");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel5.setText("Offer Trip ID:");

        OfferTripIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfferTripIDTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel6.setText("Pay in advance:");

        PayInAdvanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayInAdvanceTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel7.setText("Reservation Offers ID");

        UpdateLnameButton.setText("UPDATE");
        UpdateLnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLnameButtonActionPerformed(evt);
            }
        });

        UpdateNameButton.setText("UPDATE");
        UpdateNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNameButtonActionPerformed(evt);
            }
        });

        UpdateOfferTrIDButton.setText("UPDATE");
        UpdateOfferTrIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOfferTrIDButtonActionPerformed(evt);
            }
        });

        UpdatePayInAdvButton.setText("UPDATE");
        UpdatePayInAdvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePayInAdvButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(OfferTripIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PayInAdvanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LastnameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateLnameButton)
                            .addComponent(UpdateNameButton)
                            .addComponent(UpdateOfferTrIDButton)
                            .addComponent(UpdatePayInAdvButton))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(ResOfferIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResOfferIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateLnameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OfferTripIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateOfferTrIDButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayInAdvanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatePayInAdvButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(510, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameTextFieldActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void OfferTripIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfferTripIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OfferTripIDTextFieldActionPerformed

    private void PayInAdvanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayInAdvanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayInAdvanceTextFieldActionPerformed

    private void UpdateLnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLnameButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE reservation_offers SET lastname = ? WHERE res_off_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, LastnameTextField.getText());
            pst.setInt(2, Integer.parseInt(ResOfferIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateLnameButtonActionPerformed

    private void UpdateNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNameButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE reservation_offers SET firstname = ? WHERE res_off_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, NameTextField.getText());
            pst.setInt(2, Integer.parseInt(ResOfferIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateNameButtonActionPerformed

    private void UpdateOfferTrIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOfferTrIDButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE reservation_offers SET offer_tr_id = ? WHERE res_off_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setInt(1, Integer.parseInt(OfferTripIDTextField.getText()));
            pst.setInt(2, Integer.parseInt(ResOfferIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateOfferTrIDButtonActionPerformed

    private void UpdatePayInAdvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePayInAdvButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE reservation_offers SET pay_in_adv = ? WHERE res_off_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setFloat(1, Float.parseFloat(PayInAdvanceTextField.getText()));
            pst.setInt(2, Integer.parseInt(ResOfferIDTextField.getText()));

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
    }//GEN-LAST:event_UpdatePayInAdvButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateResOffersDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateResOffersDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateResOffersDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateResOffersDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateResOffersDataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastnameTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField OfferTripIDTextField;
    private javax.swing.JTextField PayInAdvanceTextField;
    private javax.swing.JTextField ResOfferIDTextField;
    private javax.swing.JButton UpdateLnameButton;
    private javax.swing.JButton UpdateNameButton;
    private javax.swing.JButton UpdateOfferTrIDButton;
    private javax.swing.JButton UpdatePayInAdvButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
