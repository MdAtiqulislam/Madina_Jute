/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_wages;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MJIL
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form Department
     */
    String fileName = "";
    long lines = 0;
    public static Connection connection = null;
    int departmentId = 0;

    public Department() {
        initComponents();
        connection = DBconnect.dbconnect();
        showDepartmentTable();
        getBaseDepartment();
        
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
        file_name_lbl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        department_name_tf = new javax.swing.JTextField();
        department_code_tf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_upload_file = new javax.swing.JButton();
        btn_add_user = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        department_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        progressbar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        file_name_lbl.setEditable(false);
        file_name_lbl.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_File_20px.png"))); // NOI18N
        jButton1.setText("Brows file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Code");

        jLabel2.setText(" Name");

        btn_upload_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_External_20px.png"))); // NOI18N
        btn_upload_file.setText("Upload");
        btn_upload_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upload_fileActionPerformed(evt);
            }
        });

        btn_add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_20px.png"))); // NOI18N
        btn_add_user.setText("Add");
        btn_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_userActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Update_20px.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_Database_20px.png"))); // NOI18N
        btn_delete.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_upload_file)
                .addGap(18, 18, 18)
                .addComponent(btn_add_user)
                .addGap(18, 18, 18)
                .addComponent(btn_update)
                .addGap(18, 18, 18)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_upload_file)
                    .addComponent(btn_add_user)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        department_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Name"
            }
        ));
        department_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                department_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(department_table);
        if (department_table.getColumnModel().getColumnCount() > 0) {
            department_table.getColumnModel().getColumn(0).setMinWidth(100);
            department_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("All Department");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Search_16px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        );

        jLabel4.setText("Base Department");

        departmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_20px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(file_name_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(department_code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(department_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department_code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(department_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser("C:\\Users\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("files", "csv", "xls");
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        if (file != null) {
            fileName = file.getAbsolutePath();
            file_name_lbl.setText(fileName);

            Path path = Paths.get(fileName);

            try {
                lines = Files.lines(path).count();
            } catch (IOException ex) {
                Logger.getLogger(Wages.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_upload_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upload_fileActionPerformed
        // TODO add your handling code here:

        int i = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String data;

            while ((data = reader.readLine()) != null) {

                i++;
                progressbar.setMaximum((int) lines);
                progressbar.paintImmediately(0, 0, 1000, 100);
                progressbar.setValue(i);

                String value = data;

                System.err.println(value);

                if (!value.equals("department") && !value.equals(null)) {

                    try {

                        String sql = "select * from department where department_name='" + value + "'";
                        PreparedStatement st = connection.prepareStatement(sql);
                        ResultSet rs = st.executeQuery();
                        if (rs.next()) {
                            // JOptionPane.showMessageDialog(null, "user name is exist!");
                            //userNameTF.requestFocus();
                            System.err.println("Department is exiset");
                            st.close();
                            rs.close();
                        } else {

                            String sql_1 = "insert into department"
                                    + "(department_name,mody_depart)"
                                    + " values(?,?)";
                            try (PreparedStatement statement2 = connection.prepareStatement(sql_1)) {
                                statement2.setString(1, value);
                                statement2.setString(2, value);
                                statement2.executeUpdate();
                                //dispose();
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                }

            }
            showDepartmentTable();
            fileName = null;
            file_name_lbl.setText("");
            JOptionPane.showMessageDialog(this, lines + " data upload successfull.");
            progressbar.setValue(0);

        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Please import department data from select file");

        }

    }//GEN-LAST:event_btn_upload_fileActionPerformed

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
        // TODO add your handling code here:
        String departmentName = department_name_tf.getText();
        String departmentCode = department_code_tf.getText();
        String baseDepartment=departmentCombo.getSelectedItem().toString();
        if (departmentName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "please insert department name.");
        } else {
            try {

                String sql = "select * from department where department_name='" + departmentName + "' or "
                        + "department_code ='" + departmentCode + "'";
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Department is exist!");
                    //userNameTF.requestFocus();
                    st.close();
                    rs.close();
                } else {

                    String sql_1 = "insert into department"
                            + "(department_name,mody_depart,department_code,display_name)"
                            + " values(?,?,?,?)";
                    try (PreparedStatement statement2 = connection.prepareStatement(sql_1)) {
                        statement2.setString(1, baseDepartment);
                        statement2.setString(2, departmentName);
                        statement2.setString(3, departmentCode);
                        statement2.setString(4, departmentCode+": "+departmentName);
                        
                        statement2.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "New Department entry successful.");

                }
                showDepartmentTable();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:

        String departmentCode = department_code_tf.getText();
        String departmentName = departmentCombo.getSelectedItem().toString();
        String modyDept = department_name_tf.getText();
       // String departmentName = department_name_tf.getText();

        if (departmentName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Department name must not empty.");
        }else if(departmentId==0){
            JOptionPane.showMessageDialog(this, "Please select a record for update.");
        }
        
        else {
            
            
            try {
                String sql = "update department set department_name = '" + departmentName + "',mody_depart='"+modyDept+"', "
                        + "department_code = '" + departmentCode + "', display_name='"+departmentCode+": "+modyDept+"'"
                        + " where id='" + departmentId + "'";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update record successful.");
            } catch (HeadlessException | SQLException e) {
                 e.printStackTrace();
            }
            showDepartmentTable();
            
        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void department_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_department_tableMouseClicked
        // TODO add your handling code here:
        int row = department_table.getSelectedRow();
        String taleClicked = (department_table.getModel().getValueAt(row, 1).toString());
        System.out.println(taleClicked);

        try {

            String sql = "select * from department where mody_depart='" + taleClicked + "'";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                departmentId = rs.getInt("id");
                department_name_tf.setText(rs.getString("mody_depart"));
                department_code_tf.setText(rs.getString("department_code"));
                departmentCombo.setSelectedItem(rs.getString("department_name"));
                st.close();
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_department_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new BaseDepartment().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Department().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_upload_file;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JTextField department_code_tf;
    private javax.swing.JTextField department_name_tf;
    private javax.swing.JTable department_table;
    private javax.swing.JTextField file_name_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables

    private void showDepartmentTable() {

        try {
            String sql_1 = "select department_code,mody_depart,display_name from department ORDER BY department_code ASC";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs_1 = st.executeQuery();
            department_table.setModel(DbUtils.resultSetToTableModel(rs_1));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void getBaseDepartment() {
        try {
           String sql="select department_name from department";
           PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                departmentCombo.addItem(rs.getString("department_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
}
