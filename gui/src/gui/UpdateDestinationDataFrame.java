/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author antonis
 */
public class UpdateDestinationDataFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDestinationDataFrame
     */
    public UpdateDestinationDataFrame() {
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
        jLabel5 = new javax.swing.JLabel();
        DestIDTextField = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        UpdateNameButton = new javax.swing.JButton();
        Name1 = new javax.swing.JLabel();
        DescriptionTextField = new javax.swing.JTextField();
        UpdateDescButton = new javax.swing.JButton();
        Name2 = new javax.swing.JLabel();
        LanguageTextField = new javax.swing.JTextField();
        UpdateLanguageButton = new javax.swing.JButton();
        Name3 = new javax.swing.JLabel();
        UpdateRTypeButton = new javax.swing.JButton();
        Name4 = new javax.swing.JLabel();
        LocationTextField = new javax.swing.JTextField();
        UpdateLocationButton = new javax.swing.JButton();
        ChooseRouteType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Laksaman", 1, 18)); // NOI18N
        jLabel1.setText("Update Data for Destination");

        jLabel5.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel5.setText("Destination ID");

        Name.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        Name.setText("Name:");

        UpdateNameButton.setText("UPDATE");
        UpdateNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNameButtonActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        Name1.setText("Description:");

        UpdateDescButton.setText("UPDATE");
        UpdateDescButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDescButtonActionPerformed(evt);
            }
        });

        Name2.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        Name2.setText("Language:");

        UpdateLanguageButton.setText("UPDATE");
        UpdateLanguageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLanguageButtonActionPerformed(evt);
            }
        });

        Name3.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        Name3.setText("Route Type:");

        UpdateRTypeButton.setText("UPDATE");
        UpdateRTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRTypeButtonActionPerformed(evt);
            }
        });

        Name4.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        Name4.setText("Location ID:");

        UpdateLocationButton.setText("UPDATE");
        UpdateLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLocationButtonActionPerformed(evt);
            }
        });

        ChooseRouteType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOCAL", "ABROAD" }));
        ChooseRouteType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseRouteTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UpdateDescButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DestIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(NameTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UpdateNameButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LanguageTextField)
                            .addComponent(ChooseRouteType, 0, 201, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateLanguageButton)
                            .addComponent(UpdateRTypeButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateLocationButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateDescButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateRTypeButton)
                    .addComponent(ChooseRouteType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LanguageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateLanguageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateLocationButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNameButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE destination SET dst_name = ? WHERE dst_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, NameTextField.getText());
            pst.setInt(2, Integer.parseInt(DestIDTextField.getText()));

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

    private void UpdateDescButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDescButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE destination SET dst_descr = ? WHERE dst_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, DescriptionTextField.getText());
            pst.setInt(2, Integer.parseInt(DestIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateDescButtonActionPerformed

    private void UpdateLanguageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLanguageButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE destination SET dst_language = ? WHERE dst_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, LanguageTextField.getText());
            pst.setInt(2, Integer.parseInt(DestIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateLanguageButtonActionPerformed

    private void UpdateRTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRTypeButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE destination SET dst_rtype = ? WHERE dst_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, ChooseRouteType.getSelectedItem().toString());
            pst.setInt(2, Integer.parseInt(DestIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateRTypeButtonActionPerformed

    private void UpdateLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLocationButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE destination SET dst_location = ? WHERE dst_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setInt(1, Integer.parseInt(LocationTextField.getText()));
            pst.setInt(2, Integer.parseInt(DestIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateLocationButtonActionPerformed

    private void ChooseRouteTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseRouteTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseRouteTypeActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDestinationDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDestinationDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDestinationDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDestinationDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDestinationDataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseRouteType;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JTextField DestIDTextField;
    private javax.swing.JTextField LanguageTextField;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton UpdateDescButton;
    private javax.swing.JButton UpdateLanguageButton;
    private javax.swing.JButton UpdateLocationButton;
    private javax.swing.JButton UpdateNameButton;
    private javax.swing.JButton UpdateRTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
