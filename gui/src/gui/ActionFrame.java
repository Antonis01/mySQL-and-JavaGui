/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antonis
 */
public class ActionFrame extends javax.swing.JFrame {

    /**
     * Creates new form ActionFrame
     */
    public ActionFrame() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jButton1 = new javax.swing.JButton();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        button1 = new java.awt.Button();
        jButton2 = new javax.swing.JButton();
        MenuBarFrame = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        InserDataButton = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        InsertPhonesButton = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        InsertAdminsButton = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        GuideInsertButton = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        DriverInsertButton = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        TripInsertButton = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        EventInsertButton = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        DestinationInsertButton = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        TravelToInstertButton = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        ReservationInsertButton = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        EditDataButton = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        BranchDeleteButton = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        PhonesDeleteButton = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        TripDeleteButton = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        EventDeleteButton = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        AddNewITButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TripInfoButton = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        CustomerInfoButton = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        BranchInfoButton = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        WorkerInfoButton = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        ViewChangesButton = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jButton1.setText("jButton1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu6.setText("File");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar1.add(jMenu7);

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button1.setLabel("button1");

        jButton2.setText("jButton2");

        jMenu1.setText("Edit");

        jMenu4.setText("Insert Data");

        InserDataButton.setText("Branch");
        InserDataButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                InserDataButtonComponentShown(evt);
            }
        });
        InserDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserDataButtonActionPerformed(evt);
            }
        });
        jMenu4.add(InserDataButton);
        jMenu4.add(jSeparator8);

        InsertPhonesButton.setText("Phones");
        InsertPhonesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertPhonesButtonActionPerformed(evt);
            }
        });
        jMenu4.add(InsertPhonesButton);
        jMenu4.add(jSeparator9);

        jMenu3.setText("Worker");

        InsertAdminsButton.setText("Admin");
        InsertAdminsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAdminsButtonActionPerformed(evt);
            }
        });
        jMenu3.add(InsertAdminsButton);
        jMenu3.add(jSeparator10);

        GuideInsertButton.setText("Guide");
        GuideInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuideInsertButtonActionPerformed(evt);
            }
        });
        jMenu3.add(GuideInsertButton);
        jMenu3.add(jSeparator11);

        DriverInsertButton.setText("Driver");
        DriverInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverInsertButtonActionPerformed(evt);
            }
        });
        jMenu3.add(DriverInsertButton);

        jMenu4.add(jMenu3);
        jMenu4.add(jSeparator13);

        TripInsertButton.setText("Trip");
        TripInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripInsertButtonActionPerformed(evt);
            }
        });
        jMenu4.add(TripInsertButton);
        jMenu4.add(jSeparator15);

        EventInsertButton.setText("Event");
        EventInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventInsertButtonActionPerformed(evt);
            }
        });
        jMenu4.add(EventInsertButton);
        jMenu4.add(jSeparator16);

        DestinationInsertButton.setText("Destination");
        DestinationInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationInsertButtonActionPerformed(evt);
            }
        });
        jMenu4.add(DestinationInsertButton);
        jMenu4.add(jSeparator17);

        TravelToInstertButton.setText("Travel To");
        TravelToInstertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelToInstertButtonActionPerformed(evt);
            }
        });
        jMenu4.add(TravelToInstertButton);
        jMenu4.add(jSeparator19);

        ReservationInsertButton.setText("Reservation");
        ReservationInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationInsertButtonActionPerformed(evt);
            }
        });
        jMenu4.add(ReservationInsertButton);
        jMenu4.add(jSeparator18);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        EditDataButton.setText("Edit Data");
        EditDataButton.setActionCommand("EditDataButton");
        EditDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDataButtonActionPerformed(evt);
            }
        });
        jMenu1.add(EditDataButton);
        jMenu1.add(jSeparator2);

        jMenu5.setText("Delete Data");

        BranchDeleteButton.setText("Branch");
        BranchDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchDeleteButtonActionPerformed(evt);
            }
        });
        jMenu5.add(BranchDeleteButton);
        jMenu5.add(jSeparator21);

        PhonesDeleteButton.setText("Phones");
        PhonesDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonesDeleteButtonActionPerformed(evt);
            }
        });
        jMenu5.add(PhonesDeleteButton);
        jMenu5.add(jSeparator22);

        TripDeleteButton.setText("Trip");
        TripDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripDeleteButtonActionPerformed(evt);
            }
        });
        jMenu5.add(TripDeleteButton);
        jMenu5.add(jSeparator23);

        EventDeleteButton.setText("Event");
        EventDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventDeleteButtonActionPerformed(evt);
            }
        });
        jMenu5.add(EventDeleteButton);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator3);

        AddNewITButton.setText("Add New IT");
        AddNewITButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewITButtonActionPerformed(evt);
            }
        });
        jMenu1.add(AddNewITButton);

        MenuBarFrame.add(jMenu1);

        jMenu2.setText("Info");

        TripInfoButton.setText("Trip Info");
        TripInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripInfoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(TripInfoButton);
        jMenu2.add(jSeparator4);

        CustomerInfoButton.setText("Customer Info");
        CustomerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerInfoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(CustomerInfoButton);
        jMenu2.add(jSeparator5);

        BranchInfoButton.setText("Branch Info");
        BranchInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchInfoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(BranchInfoButton);
        jMenu2.add(jSeparator6);

        WorkerInfoButton.setText("Worker Info");
        WorkerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerInfoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(WorkerInfoButton);
        jMenu2.add(jSeparator7);

        ViewChangesButton.setText("View Changes");
        ViewChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewChangesButtonActionPerformed(evt);
            }
        });
        jMenu2.add(ViewChangesButton);

        MenuBarFrame.add(jMenu2);

        setJMenuBar(MenuBarFrame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1288, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserDataButtonActionPerformed
        // TODO add your handling code here:
        InsertBranchDataFrame ib = new InsertBranchDataFrame();
        ib.setVisible(true);
    }//GEN-LAST:event_InserDataButtonActionPerformed

    private void EditDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDataButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EditDataButtonActionPerformed

    private void TripInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripInfoButtonActionPerformed
        // TODO add your handling code here:
        TripInfoFrame ti = new TripInfoFrame();
        ti.setVisible(true);
    }//GEN-LAST:event_TripInfoButtonActionPerformed

    private void BranchInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchInfoButtonActionPerformed
        
        BranchInfo bi = new BranchInfo();
        bi.setVisible(true);
        
        ConnectToMySQL con = new ConnectToMySQL();

        String sql = "SELECT b.br_code, b.br_street, b.br_num, b.br_city, w.wrk_name, w.wrk_lname, br_res.total_reservations, br_res.total_income FROM branch AS b "
                + "INNER JOIN worker AS w ON w.wrk_br_code = b.br_code "
                + "INNER JOIN _admin AS a ON a.adm_AT = w.wrk_AT "
                + "INNER JOIN (SELECT tr_br_code, COUNT(r.res_tr_id) AS total_reservations, "
                + "SUM(t.tr_cost) AS total_income FROM  trip AS t "
                + "INNER JOIN reservation AS r ON r.res_tr_id = t.tr_id "
                + "GROUP BY tr_br_code) AS br_res ON br_res.tr_br_code = b.br_code "
                + "ORDER BY br_code ASC";
        
        DefaultTableModel model = (DefaultTableModel)bi.branchInfoTable.getModel();
        model.setRowCount(0);
        model.setRowCount(10);

        try{
            PreparedStatement pst =  con.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            }

            pst.close();
            rs.close();
            con.getConnection().close();
            
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_BranchInfoButtonActionPerformed

    private void ViewChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewChangesButtonActionPerformed
        // TODO add your handling code here:
        LogInfoFrame li = new LogInfoFrame();
        li.setVisible(true);
        
        ConnectToMySQL con = new ConnectToMySQL();

        String sql = "SELECT table_name, event_type, username FROM log";
        
        DefaultTableModel model = (DefaultTableModel)li.LogInfoTable.getModel();
        model.setRowCount(0);
        model.setRowCount(1);

        try{
            PreparedStatement pst =  con.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
            
            pst.close();
            rs.close();
            con.getConnection().close();
            
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
        
    }//GEN-LAST:event_ViewChangesButtonActionPerformed

    private void InserDataButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_InserDataButtonComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_InserDataButtonComponentShown

    private void WorkerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerInfoButtonActionPerformed
        // TODO add your handling code here:
        WorkerInfoFrame wi = new WorkerInfoFrame();
        wi.setVisible(true);
        
        ConnectToMySQL con = new ConnectToMySQL();

        String sql = "SELECT br_code, wrk_name, wrk_lname, wrk_salary FROM branch INNER JOIN worker ON br_code=wrk_br_code ORDER BY br_code ASC";
        String sql2 = "SELECT SUM(wrk_salary) FROM worker";
        
        DefaultTableModel model = (DefaultTableModel)wi.WorkerInfoTable.getModel();
        model.setRowCount(0);
        model.setRowCount(10);

        DefaultTableModel model2 = (DefaultTableModel)wi.totalSalaryTable.getModel();
        model2.setRowCount(1);
        model2.setRowCount(1);
        
        try{
            PreparedStatement pst =  con.getConnection().prepareStatement(sql);
            PreparedStatement pst2 = con.getConnection().prepareStatement(sql2);
            
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            
            model.setRowCount(0);
            model2.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
            
            while(rs2.next()){
                model2.addRow(new String[]{rs2.getString(1)});
                break;
            }
            
            pst.close();
            pst2.close();
            rs.close();
            rs2.close();
            con.getConnection().close();
            
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_WorkerInfoButtonActionPerformed

    private void CustomerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerInfoButtonActionPerformed
        // TODO add your handling code here:
        CustomerInfoFrame ci = new CustomerInfoFrame();
        ci.setVisible(true);
    }//GEN-LAST:event_CustomerInfoButtonActionPerformed

    private void AddNewITButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewITButtonActionPerformed
        // TODO add your handling code here:
        AddNewITFrame it = new AddNewITFrame();
        it.setVisible(true);
    }//GEN-LAST:event_AddNewITButtonActionPerformed

    private void InsertPhonesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertPhonesButtonActionPerformed
        // TODO add your handling code here:
        InsertPhonesDataFrame ip = new InsertPhonesDataFrame();
        ip.setVisible(true);
    }//GEN-LAST:event_InsertPhonesButtonActionPerformed

    private void InsertAdminsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAdminsButtonActionPerformed
        // TODO add your handling code here:
        InsertAdminDataFrame ia = new InsertAdminDataFrame();
        ia.setVisible(true);
    }//GEN-LAST:event_InsertAdminsButtonActionPerformed

    private void GuideInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuideInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertGuideDataFrame ig = new InsertGuideDataFrame();
        ig.setVisible(true);
    }//GEN-LAST:event_GuideInsertButtonActionPerformed

    private void DriverInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertDriverDataFrame id = new InsertDriverDataFrame();
        id.setVisible(true);
    }//GEN-LAST:event_DriverInsertButtonActionPerformed

    private void TripInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertTripDataFrame it = new InsertTripDataFrame();
        it.setVisible(true);
    }//GEN-LAST:event_TripInsertButtonActionPerformed

    private void EventInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertEventDataFrame ie = new InsertEventDataFrame();
        ie.setVisible(true);
    }//GEN-LAST:event_EventInsertButtonActionPerformed

    private void DestinationInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertDestinationDataFrame id = new InsertDestinationDataFrame();
        id.setVisible(true);
    }//GEN-LAST:event_DestinationInsertButtonActionPerformed

    private void TravelToInstertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelToInstertButtonActionPerformed
        // TODO add your handling code here:
        InsertTravelToDataFrame it =  new InsertTravelToDataFrame();
        it.setVisible(true);
    }//GEN-LAST:event_TravelToInstertButtonActionPerformed

    private void BranchDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchDeleteButtonActionPerformed
        // TODO add your handling code here:
        DeleteBranchDataFrame db= new DeleteBranchDataFrame();
        db.setVisible(true);
    }//GEN-LAST:event_BranchDeleteButtonActionPerformed

    private void ReservationInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertReservationDataFrame ir = new InsertReservationDataFrame ();
        ir.setVisible(true);
    }//GEN-LAST:event_ReservationInsertButtonActionPerformed

    private void PhonesDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonesDeleteButtonActionPerformed
        // TODO add your handling code here:
        DeletePhonesDataFrame dp = new DeletePhonesDataFrame();
        dp.setVisible(true);
    }//GEN-LAST:event_PhonesDeleteButtonActionPerformed

    private void TripDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripDeleteButtonActionPerformed
        // TODO add your handling code here:
        DeleteTripDataFrame dt = new DeleteTripDataFrame ();
        dt.setVisible(true);
    }//GEN-LAST:event_TripDeleteButtonActionPerformed

    private void EventDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventDeleteButtonActionPerformed
        // TODO add your handling code here:
        DeleteEventDataFrame de = new DeleteEventDataFrame ();
        de.setVisible(true);
    }//GEN-LAST:event_EventDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddNewITButton;
    private javax.swing.JMenuItem BranchDeleteButton;
    private javax.swing.JMenuItem BranchInfoButton;
    private javax.swing.JMenuItem CustomerInfoButton;
    private javax.swing.JMenuItem DestinationInsertButton;
    private javax.swing.JMenuItem DriverInsertButton;
    private javax.swing.JMenuItem EditDataButton;
    private javax.swing.JMenuItem EventDeleteButton;
    private javax.swing.JMenuItem EventInsertButton;
    private javax.swing.JMenuItem GuideInsertButton;
    private javax.swing.JMenuItem InserDataButton;
    private javax.swing.JMenuItem InsertAdminsButton;
    private javax.swing.JMenuItem InsertPhonesButton;
    private javax.swing.JMenuBar MenuBarFrame;
    private javax.swing.JMenuItem PhonesDeleteButton;
    private javax.swing.JMenuItem ReservationInsertButton;
    private javax.swing.JMenuItem TravelToInstertButton;
    private javax.swing.JMenuItem TripDeleteButton;
    private javax.swing.JMenuItem TripInfoButton;
    private javax.swing.JMenuItem TripInsertButton;
    private javax.swing.JMenuItem ViewChangesButton;
    private javax.swing.JMenuItem WorkerInfoButton;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
