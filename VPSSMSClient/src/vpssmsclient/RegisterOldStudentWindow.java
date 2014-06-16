/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RegisterOldStudentWindow.java
 *
 * Created on Dec 6, 2013, 11:33:01 PM
 */
package vpssmsclient;

import javax.swing.JOptionPane;

/**
 *
 * @author Royal
 */
public class RegisterOldStudentWindow extends javax.swing.JPanel {

    /** Creates new form RegisterOldStudentWindow */

    public RegisterOldStudentWindow() {
        initComponents();
        try {
            registerTable.setModel(new Controller().studentRegisterTableModel());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        registerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        logout = new javax.swing.JLabel();

        registerTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        registerTable.setForeground(new java.awt.Color(102, 102, 102));
        registerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Class", "Stream", "Academic Term", "Academic Year", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        registerTable.setGridColor(new java.awt.Color(51, 51, 51));
        registerTable.setRowHeight(28);
        registerTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        registerTable.setSelectionForeground(new java.awt.Color(249, 242, 242));
        jScrollPane16.setViewportView(registerTable);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton1.setText("Add");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton2.setText("Edit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteStudent.setFont(new java.awt.Font("Times New Roman", 0, 14));
        deleteStudent.setText("Delete");
        deleteStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(deleteStudent)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteStudent, jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(deleteStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteStudent, jButton1, jButton2});

        jTabbedPane1.addTab("Register Student", jPanel1);

        logout.setText("Back");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                    .addComponent(logout))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
// TODO add your handling code here:
    try {
        VPSSMSClient.mainWindow.setContentPane(new TaskSelectionMenu());
        VPSSMSClient.mainWindow.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_logoutMouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        RegisterOldStudentDialog registerOldStudentDialog = new RegisterOldStudentDialog(VPSSMSClient.mainWindow, true);
        registerOldStudentDialog.setLocation((int) (VPSSMSClient.width / 8), (int) (VPSSMSClient.height / 10));
        registerOldStudentDialog.setTitle("Register Student");
        registerOldStudentDialog.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
// TODO add your handling code here:
    try {
        int row = registerTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record");
        } else {
            Object id = registerTable.getModel().getValueAt(row, 0);
            int deleteResponse = JOptionPane.showInternalConfirmDialog(this, "Are You sure Want to DELETE\n the Selected Record?");
            if (deleteResponse == 0) {
                boolean deleted = new Controller().deleteRecord(id.toString(), "StudentRegister", "RegisterId");
                if (deleted == true) {
                    JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                    registerTable.setModel(new Controller().studentRegisterTableModel());
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR\nRecord\n NOT Deleted Successfully.. Please try again");
                }
            }
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_deleteStudentActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logout;
    public static javax.swing.JTable registerTable;
    // End of variables declaration//GEN-END:variables
}
