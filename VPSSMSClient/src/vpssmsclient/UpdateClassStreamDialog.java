/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateClassStreamDialog.java
 *
 * Created on Jun 20, 2014, 1:28:56 AM
 */
package vpssmsclient;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vpssmsserver.ClassStream;
import vpssmsserver.ClassStreamRegister;
import vpssmsserver.StudentClass;

/**
 *
 * @author Royal
 */
public class UpdateClassStreamDialog extends javax.swing.JDialog {

    ArrayList<StudentClass> classList;
    ArrayList<ClassStream> streamList;
private ClassStreamRegister classStreamRegister;
    /** Creates new form UpdateClassStreamDialog */
    public UpdateClassStreamDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        classStreamRegister = ClassStreamCategoryWindow.classStreamRegister;
        try {
            classList = new Controller().getStudentClassList();
            streamList = new Controller().getClassStreamList();
            for (int i = 0; i < classList.size(); i++) {
                className.addItem(classList.get(i).getName());
            }
            for (int i = 0; i < streamList.size(); i++) {
                streamName.addItem(streamList.get(i).getName());
            }
            this.className.setSelectedItem(classStreamRegister.getClassId());
            this.streamName.setSelectedItem(classStreamRegister.getStreamId());
            this.term.setSelectedItem(classStreamRegister.getTerm());
            this.status.setSelectedItem(this.classStreamRegister.getStatus());
            academicYear.setYear(Integer.parseInt(this.classStreamRegister.getYear()));
            ((JTextField) creationDate.getDateEditor().getUiComponent()).setText(this.classStreamRegister.getDate());
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
        className = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        streamName = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        term = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        academicYear = new com.toedter.calendar.JYearChooser();
        status = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        creationDate = new com.toedter.calendar.JDateChooser();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Class Name");

        className.setFont(new java.awt.Font("Times New Roman", 1, 24));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Stream");

        streamName.setFont(new java.awt.Font("Times New Roman", 1, 18));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Term");

        term.setFont(new java.awt.Font("Times New Roman", 1, 14));
        term.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Term 1", "Term 2", "Term 3" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Academic Year");

        academicYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        status.setFont(new java.awt.Font("Times New Roman", 1, 18));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "In-active" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Creation Date");

        creationDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creationDate.setDateFormatString(" d/MMM/yyyy");
        creationDate.setFont(new java.awt.Font("Times New Roman", 1, 18));

        save.setFont(new java.awt.Font("Times New Roman", 0, 14));
        save.setText("Update");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(creationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(status, 0, 276, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(className, javax.swing.GroupLayout.Alignment.LEADING, 0, 276, Short.MAX_VALUE)
                    .addComponent(streamName, javax.swing.GroupLayout.Alignment.LEADING, 0, 276, Short.MAX_VALUE))
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6))
                    .addComponent(academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(creationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {academicYear, className, creationDate, status, streamName, term});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
// TODO add your handling code here:\
    try {
        boolean registered = new Controller().updateClassStreamRegister(new ClassStreamRegister(
                this.classStreamRegister.getRegisterId(),
                classList.get(className.getSelectedIndex()).getClassId(),
                streamList.get(streamName.getSelectedIndex()).getStreamId(),
                term.getSelectedItem().toString(),
                Integer.toString(academicYear.getYear()),
                status.getSelectedItem().toString(),
                ((JTextField) creationDate.getDateEditor().getUiComponent()).getText()));
        if (registered == true) {
            JOptionPane.showMessageDialog(this, "Class Stream Updated Successfully");
            ClassStreamCategoryWindow.classStreamRegisterTable.setModel(new Controller().classStreamRegisteredTableModel());
        } else {
            JOptionPane.showMessageDialog(this, "ERROR \nClass Stream \n Updated\n Please try again....");
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateClassStreamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClassStreamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClassStreamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClassStreamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                UpdateClassStreamDialog dialog = new UpdateClassStreamDialog(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JYearChooser academicYear;
    private javax.swing.JComboBox className;
    private com.toedter.calendar.JDateChooser creationDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton save;
    private javax.swing.JComboBox status;
    private javax.swing.JComboBox streamName;
    private javax.swing.JComboBox term;
    // End of variables declaration//GEN-END:variables
}
