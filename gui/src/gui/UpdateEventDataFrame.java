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
public class UpdateEventDataFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEventDataFrame
     */
    public UpdateEventDataFrame() {
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
        EventIDTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StartTextField = new javax.swing.JTextField();
        UpdateStartButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EndTextField = new javax.swing.JTextField();
        UpdateEndButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DescriptionTextField = new javax.swing.JTextField();
        UpdateDescriptionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Laksaman", 1, 18)); // NOI18N
        jLabel1.setText("Update Data for Event");

        jLabel5.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel5.setText("Event ID:");

        jLabel2.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel2.setText("Start Date:");

        UpdateStartButton.setText("UPDATE");
        UpdateStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStartButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel3.setText("End Date:");

        UpdateEndButton.setText("UPDATE");
        UpdateEndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEndButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Laksaman", 1, 16)); // NOI18N
        jLabel4.setText("Description:");

        UpdateDescriptionButton.setText("UPDATE");
        UpdateDescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDescriptionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DescriptionTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EndTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(StartTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EventIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateEndButton)
                    .addComponent(UpdateStartButton)
                    .addComponent(UpdateDescriptionButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStartButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateEndButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateDescriptionButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(436, 279));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStartButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE event SET ev_start = ? WHERE ev_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            java.sql.Date start_datetime = new java.sql.Date(dateFormat.parse(StartTextField.getText()).getTime());

            pst.setDate(1, start_datetime);
            pst.setInt(2, Integer.parseInt(EventIDTextField.getText()));

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
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Insert Unsuccessful");
            Logger.getLogger(InsertTripDataFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateStartButtonActionPerformed

    private void UpdateEndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEndButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE event SET ev_end = ? WHERE ev_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            java.sql.Date end_datetime = new java.sql.Date(dateFormat.parse(EndTextField.getText()).getTime());

            pst.setDate(1, end_datetime);
            pst.setInt(2, Integer.parseInt(EventIDTextField.getText()));

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
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Update Unsuccessful");
            Logger.getLogger(InsertTripDataFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateEndButtonActionPerformed

    private void UpdateDescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDescriptionButtonActionPerformed
        // TODO add your handling code here:
        ConnectToMySQL con = new ConnectToMySQL();

        String update = "UPDATE event SET ev_desc = ? WHERE ev_tr_id = ?";

        PreparedStatement pst;

        try {

            pst = con.getConnection().prepareStatement(update);

            pst.setString(1, DescriptionTextField.getText());
            pst.setInt(2, Integer.parseInt(EventIDTextField.getText()));

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
    }//GEN-LAST:event_UpdateDescriptionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEventDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEventDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEventDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEventDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEventDataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JTextField EndTextField;
    private javax.swing.JTextField EventIDTextField;
    private javax.swing.JTextField StartTextField;
    private javax.swing.JButton UpdateDescriptionButton;
    private javax.swing.JButton UpdateEndButton;
    private javax.swing.JButton UpdateStartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
