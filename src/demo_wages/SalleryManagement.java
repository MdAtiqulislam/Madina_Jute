/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_wages;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MJIL
 */
public class SalleryManagement extends javax.swing.JFrame {

    /**
     * Creates new form SalleryManagement
     */
    public static Connection connection = null;
    private String department;
    private String designation;
    private int wagesRate;
    
    public SalleryManagement() {
        initComponents();
        connection = DBconnect.dbconnect();
        this.setLocationRelativeTo(this);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("account.png")));
        getDepartment();
        getDesignation();
        getWagesData();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wagesTable = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        department_combobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        designationCombo = new javax.swing.JComboBox<>();
        btn_update3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wagesRateTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        wagesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        wagesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wagesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(wagesTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Sallery Management");

        jLabel1.setText("  Department");

        department_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        department_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                department_comboboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Designation");

        designationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        designationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationComboActionPerformed(evt);
            }
        });

        btn_update3.setText("Update");
        btn_update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update3ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Daily Wages(TK)");

        wagesRateTF.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        wagesRateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wagesRateTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(designationCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(department_combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wagesRateTF))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_update3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(department_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(designationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(wagesRateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void department_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_department_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_department_comboboxActionPerformed

    private void btn_update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update3ActionPerformed
        // TODO add your handling code here:

        department=department_combobox.getSelectedItem().toString();
        designation=designationCombo.getSelectedItem().toString();
        wagesRate=Integer.parseInt(wagesRateTF.getText());
        
        if(department_combobox.getSelectedIndex()!=0 && designationCombo.getSelectedIndex()!=0 && wagesRate!=0){
            AddData();
        }
        
        

    }//GEN-LAST:event_btn_update3ActionPerformed

    private void designationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationComboActionPerformed

    private void wagesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wagesTableMouseClicked
        // TODO add your handling code here:
        settSelectedData();
    }//GEN-LAST:event_wagesTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        deleteData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wagesRateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wagesRateTFActionPerformed
        // TODO add your handling code here:
          department=department_combobox.getSelectedItem().toString();
        designation=designationCombo.getSelectedItem().toString();
        wagesRate=Integer.parseInt(wagesRateTF.getText());
        
        if(department_combobox.getSelectedIndex()!=0 && designationCombo.getSelectedIndex()!=0 && wagesRate!=0){
            AddData();
        }
        
    }//GEN-LAST:event_wagesRateTFActionPerformed

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
            java.util.logging.Logger.getLogger(SalleryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalleryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalleryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalleryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SalleryManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update3;
    private javax.swing.JComboBox<String> department_combobox;
    private javax.swing.JComboBox<String> designationCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField wagesRateTF;
    private javax.swing.JTable wagesTable;
    // End of variables declaration//GEN-END:variables

    private void getDepartment() {
        try {
            
            String sql_1 = "select * from department order by department_name ASC";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                department_combobox.addItem(rs.getString("department_name"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void getWagesData() {
        
        try {
            String sql_1 = "select department,designation,wages_rate from wages_mangement ORDER BY department";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs_1 = st.executeQuery();
            wagesTable.setModel(DbUtils.resultSetToTableModel(rs_1));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void settSelectedData() {
        int row = wagesTable.getSelectedRow();
         department = (wagesTable.getModel().getValueAt(row, 0).toString());
         designation = (wagesTable.getModel().getValueAt(row, 1).toString());
         wagesRate = (int)(wagesTable.getModel().getValueAt(row, 2));
        
        department_combobox.setSelectedItem(department);
        designationCombo.setSelectedItem(designation);
        wagesRateTF.setText(String.valueOf(wagesRate));
    }
    
    private void getDesignation() {
        try {
            
            String sql_1 = "select * from designation order by code ASC";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                designationCombo.addItem(rs.getString("designation"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteData() {
        
        try {
            String sql = "delete from wages_mangement where department='" + department + "' "
                    + "and  designation='" + designation + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            
            getWagesData();
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
            }

    private void clearField() {
        //department_combobox.setSelectedIndex(0);
        designationCombo.setSelectedIndex(0);
        wagesRateTF.setText("");
        
        department="";
        designation="";
        wagesRate=0;
            }

    private void AddData() {
        
        if(checkData()){
            updateData();
        }else{
            addData();
        }
        
            }

    private boolean checkData() {
        try {
            String sql="select * from wages_mangement where department='"+department+"'"
                    + " and designation='"+designation+"'";
            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
            }

    private void updateData() {
        try {
             String sql = "update wages_mangement set wages_rate='"+wagesRate+"' where department='" + department + "' "
                    + "and designation='" + designation + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            getWagesData();
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
           }

    private void addData() {
        try {
            String sql="insert into wages_mangement (department,designation,wages_rate) values(?,?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1, department);
            statement.setString(2, designation);
            statement.setInt(3, wagesRate);
            
            statement.executeUpdate();
            getWagesData();
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
}
