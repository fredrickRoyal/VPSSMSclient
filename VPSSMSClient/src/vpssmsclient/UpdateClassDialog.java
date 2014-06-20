/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateClassDialog.java
 *
 * Created on Jun 19, 2014, 10:29:08 PM
 */
package vpssmsclient;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vpssmsserver.StudentClass;

/**
 *
 * @author Royal
 */
public class UpdateClassDialog extends javax.swing.JDialog {

    private StudentClass studentClass = null;

    /** Creates new form UpdateClassDialog */
    public UpdateClassDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        studentClass = ClassStreamCategoryWindow.studentClass;
        try {
            this.className.setText(studentClass.getName());
            this.status.setSelectedItem(studentClass.getStatus());
            ((JTextField) date.getDateEditor().getUiComponent()).setText(studentClass.getDate());
            
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

        jLabel1 = new javax.swing.JLabel();
        className = new javax.swing.JTextField();
        status = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        createClass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Class Name");

        className.setFont(new java.awt.Font("Times New Roman", 1, 18));
        className.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        status.setFont(new java.awt.Font("Times New Roman", 1, 18));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "In-active" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Creation Date");

        date.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date.setDateFormatString(" d/MMM/yyyy");
        date.setFont(new java.awt.Font("Times New Roman", 1, 18));

        createClass.setFont(new java.awt.Font("Times New Roman", 0, 14));
        createClass.setText("Update");
        createClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {className, date, status});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {className, date, status});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void createClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassActionPerformed
// TODO add your handling code here:
    try {
        if (className.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill in the Class Name");
        } else if ((((JTextField) date.getDateEditor().getUiComponent()).getText()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill in Creation Date");
        } else {
            boolean studentClassUpdated = new Controller().updateStudentClass(new StudentClass(
                    studentClass.getClassId(),
                    className.getText(),
                    status.getSelectedItem().toString(),
                    ((JTextField) date.getDateEditor().getUiComponent()).getText()));
            if (studentClassUpdated == true) {
                JOptionPane.showMessageDialog(this, "Student Class Updated successfully");
                ClassStreamCategoryWindow.classTable.setModel(new Controller().classTableModel());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "ERROR \n Student Class\nNOT\n Updated.\n Please try again..");
            }
        }
        
        
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_createClassActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                UpdateClassDialog dialog = new UpdateClassDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField className;
    private javax.swing.JButton createClass;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox status;
    // End of variables declaration//GEN-END:variables
}
