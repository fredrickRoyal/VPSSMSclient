/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StudentSearchDialog.java
 *
 * Created on Dec 17, 2013, 9:52:29 PM
 */
package vpssmsclient;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import vpssmsserver.Student;

/**
 *
 * @author Royal
 */
public class StudentSearchDialog extends javax.swing.JDialog {

    public static String searchRequestSource;

    /** Creates new form StudentSearchDialog */
    public StudentSearchDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            studentSearchTable.setModel(new Controller().searchStudentTableModel("first name", "all"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        studentSearchTable = new javax.swing.JTable();
        searchText = new javax.swing.JFormattedTextField();
        searchStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        criteria = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        studentSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "StudentId", "FirstName", "Other Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentSearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentSearchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentSearchTable);

        searchText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        searchText.setFont(new java.awt.Font("Times New Roman", 1, 24));
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        searchStudent.setText("Search");
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setText("Search By");

        criteria.setFont(new java.awt.Font("Times New Roman", 1, 14));
        criteria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Name", "Last Name", "Middle Name" }));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setText("Ok");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(criteria, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(criteria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchStudent))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {criteria, searchStudent, searchText});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
// TODO add your handling code here:
    try {
        studentSearchTable.setModel(new Controller().searchStudentTableModel(criteria.getSelectedItem().toString(), searchText.getText()));
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_searchTextKeyReleased

private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
// TODO add your handling code here:
    try {
        studentSearchTable.setModel(new Controller().searchStudentTableModel(criteria.getSelectedItem().toString(), searchText.getText()));
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_searchStudentActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        utilizeStudentSearchResult();
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }

}//GEN-LAST:event_jButton1ActionPerformed

private void studentSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentSearchTableMouseClicked
// TODO add your handling code here:
    try {
        if (evt.getClickCount() == 2) {
            utilizeStudentSearchResult();
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_studentSearchTableMouseClicked

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
            java.util.logging.Logger.getLogger(StudentSearchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSearchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSearchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSearchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                StudentSearchDialog dialog = new StudentSearchDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox criteria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchStudent;
    private javax.swing.JFormattedTextField searchText;
    private javax.swing.JTable studentSearchTable;
    // End of variables declaration//GEN-END:variables

    public void utilizeStudentSearchResult() {
        try {
            int row = studentSearchTable.getSelectedRow();
            Student student = Controller.studentsList.get(row);
            if (searchRequestSource.equalsIgnoreCase("addParent")) {
                if (student != null) {
                    AddParentDialog.student = student;
                    AddParentDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    AddParentDialog.studentPhoto.setText(null);
                    AddParentDialog.studentPhoto.setIcon(icon);

                } else {
                }
            } else if (searchRequestSource.equalsIgnoreCase("updateParent")) {
                if (student != null) {
                    UpdateParentDialog.studentId = student.getStudentId();
                    UpdateParentDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    UpdateParentDialog.studentPhoto.setText(null);
                    UpdateParentDialog.studentPhoto.setIcon(icon);

                } else {
                }
            } else if (searchRequestSource.equalsIgnoreCase("addGuardian")) {
                if (student != null) {
                    AddGuadianDialog.student = student;
                    AddGuadianDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    AddGuadianDialog.studentPhoto.setText(null);
                    AddGuadianDialog.studentPhoto.setIcon(icon);

                } else {
                }
            } else if (searchRequestSource.equalsIgnoreCase("updateGuardian")) {
                if (student != null) {
                    UpdateGuadianDialog.studentId = student.getStudentId();
                    UpdateGuadianDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    UpdateGuadianDialog.studentPhoto.setText(null);
                    UpdateGuadianDialog.studentPhoto.setIcon(icon);

                } else {
                }
            } else if (searchRequestSource.equalsIgnoreCase("attendedSchool")) {
                if (student != null) {
                    AddSchoolAttendedDialog.student = student;
                    AddSchoolAttendedDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    AddSchoolAttendedDialog.studentPhoto.setText(null);
                    AddSchoolAttendedDialog.studentPhoto.setIcon(icon);

                } else {
                }
            } else if (searchRequestSource.equalsIgnoreCase("OldStudentRegister")) {
                if (student != null) {
                    RegisterOldStudentDialog.student = student;
                    RegisterOldStudentDialog.studentName.setText(student.getFirstName().toUpperCase() + " " + student.getOtherName() + " " + student.getLastName());
                    Image img = Toolkit.getDefaultToolkit().createImage(student.getImageData());
                    ImageIcon icon = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(129, 135, java.awt.Image.SCALE_SMOOTH));
                    RegisterOldStudentDialog.studentPhoto.setText(null);
                    RegisterOldStudentDialog.studentPhoto.setIcon(icon);

                } else {
                }

            } else if (searchRequestSource.equalsIgnoreCase("")) {
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.setVisible(false);
        this.getRootPane().removeAll();
        this.removeAll();
        this.dispose();
    }
}
