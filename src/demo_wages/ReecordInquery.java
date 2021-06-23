/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_wages;

import java.awt.BorderLayout;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author MadinaJute
 */
public class ReecordInquery extends javax.swing.JFrame {

    /**
     * Creates new form ReecordInquery
     */
    private String parent = "";
    private String fromDate;
    private String toDate;
    private String cardNo;
    private HashMap parameter;
    private static Connection connection;
    private Date weekStartDate;
    private Date weekEndDate;

    public ReecordInquery() {
        initComponents();
        connection = DBconnect.dbconnect();
        setExtendedState(MAXIMIZED_BOTH);

        getRunningWeek();
         if (runningWeekCB.isSelected()) {
            //  weekCombo.setEnabled(false);
            fromDateDC.setEnabled(false);
            toDateDC.setEnabled(false);
        } else {
            //weekCombo.setEnabled(true);
            fromDateDC.setEnabled(true);
            toDateDC.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cardNoTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        runningWeekCB = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fromDateDC = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        toDateDC = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 493));

        jLabel4.setText("Card No.");

        cardNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNoTFActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        runningWeekCB.setSelected(true);
        runningWeekCB.setText("Running Week");
        runningWeekCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runningWeekCBActionPerformed(evt);
            }
        });

        jLabel5.setText("From:");

        jLabel6.setText("To:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toDateDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDateDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fromDateDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(toDateDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("OR Select Week");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(runningWeekCB)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cardNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(runningWeekCB)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cardNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        reportPanel.setMinimumSize(new java.awt.Dimension(900, 100));
        reportPanel.setPreferredSize(new java.awt.Dimension(900, 493));

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        getContentPane().add(reportPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        viewRecord();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void cardNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNoTFActionPerformed
        // TODO add your handling code here:
        viewRecord();
    }//GEN-LAST:event_cardNoTFActionPerformed

    private void runningWeekCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runningWeekCBActionPerformed
        // TODO add your handling code here:
        if (runningWeekCB.isSelected()) {
            //  weekCombo.setEnabled(false);
            fromDateDC.setEnabled(false);
            toDateDC.setEnabled(false);
        } else {
            //weekCombo.setEnabled(true);
            fromDateDC.setEnabled(true);
            toDateDC.setEnabled(true);
        }
    }//GEN-LAST:event_runningWeekCBActionPerformed

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
            java.util.logging.Logger.getLogger(ReecordInquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReecordInquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReecordInquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReecordInquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReecordInquery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardNoTF;
    private com.toedter.calendar.JDateChooser fromDateDC;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JCheckBox runningWeekCB;
    private javax.swing.JButton searchBTN;
    private com.toedter.calendar.JDateChooser toDateDC;
    // End of variables declaration//GEN-END:variables

    private void viewRecord() {
        getMainFilePath();
        getData();
        getParam();
        showReport();
    }

    private void getMainFilePath() {
        File mainFilePath = new File("AutoRetresh.class");
        File parentLocation = new File(mainFilePath.getAbsolutePath());
        parent = parentLocation.getParent();
    }

    private void getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if (runningWeekCB.isSelected()) {
            fromDate = sdf.format(weekStartDate);
            toDate = sdf.format(weekEndDate);
        } else {
            fromDate = sdf.format(fromDateDC.getDate().getTime());
            toDate = sdf.format(toDateDC.getDate().getTime());
        }

        cardNo = cardNoTF.getText();
    }

    private void getParam() {
        parameter = new HashMap();
        parameter.put("cardNo", cardNo);
        parameter.put("start_date", fromDate);
        parameter.put("end_date", toDate);
    }

    private void showReport() {
        reportPanel.removeAll();
        reportPanel.repaint();
        reportPanel.revalidate();

        // C:\Users\MadinaJute\OneDrive\Documents\NetBeansProjects\MEGAsync\Demo_Wages\src\demo_wages\report\arrendence_inquery.jrxml
        try {
            JasperDesign jDesign = JRXmlLoader.load(parent + "\\src\\demo_wages\\report\\attendence_inquery.jrxml");
            JasperReport jReport = JasperCompileManager.compileReport(jDesign);
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, connection);
            JRViewer jRViewer = new JRViewer(jPrint);
            reportPanel.setLayout(new BorderLayout());
            reportPanel.add(jRViewer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void getRunningWeek() {
        try {
            String sql = "select * from running_week";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                weekStartDate = rs.getDate("week_start_date");
                weekEndDate = rs.getDate("week_end_date");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
