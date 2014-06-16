/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EnterResultsWindow.java
 *
 * Created on Dec 6, 2013, 11:40:18 PM
 */
package vpssmsclient;
/**
 *
 * @author Royal
 */
public class EnterResultsWindow extends javax.swing.JPanel {

    /** Creates new form EnterResultsWindow */
    public EnterResultsWindow() {
        initComponents();
        try {


            studentResultTable.setModel(new Controller().studentResultTableModel());
            /*studentResultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnAdjuster tca = new TableColumnAdjuster(studentResultTable);
            tca.adjustColumns();
            tca.setOnlyAdjustLarger(true);
            tca.setDynamicAdjustment(true);
            tca.setColumnDataIncluded(true);
            tca.setColumnHeaderIncluded(true);*/
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
        jScrollPane1 = new javax.swing.JScrollPane();
        studentResultTable = new javax.swing.JTable();
        RecordStudentResult = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deleteResult = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();

        studentResultTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        studentResultTable.setForeground(new java.awt.Color(102, 102, 102));
        studentResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Subject", "Paper", "Paper Code", "Term", "Year", "Holiday Work", "B.O.T", "Mid-Term", "E.O.T", "Status"
            }
        ));
        studentResultTable.setGridColor(new java.awt.Color(51, 51, 51));
        studentResultTable.setRowHeight(28);
        studentResultTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        studentResultTable.setSelectionForeground(new java.awt.Color(249, 242, 242));
        jScrollPane1.setViewportView(studentResultTable);

        RecordStudentResult.setFont(new java.awt.Font("Times New Roman", 0, 14));
        RecordStudentResult.setText("Add");
        RecordStudentResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecordStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordStudentResultActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton2.setText("Edit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteResult.setFont(new java.awt.Font("Times New Roman", 0, 14));
        deleteResult.setText("Delete");
        deleteResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(RecordStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteResult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RecordStudentResult, deleteResult, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecordStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RecordStudentResult, deleteResult, jButton2});

        jTabbedPane1.addTab("Student Results", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        logout.setText("Logout");
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
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logout)
                        .addContainerGap(1089, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
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

private void RecordStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordStudentResultActionPerformed
// TODO add your handling code here:
    try {
        EnterResultsDialog enterResultsDialog = new EnterResultsDialog(VPSSMSClient.mainWindow, true);
        enterResultsDialog.setLocation((int) (VPSSMSClient.width / 8), (int) (VPSSMSClient.height / 10));
        enterResultsDialog.setTitle("Enter Students Results");
        enterResultsDialog.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_RecordStudentResultActionPerformed

private void deleteResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResultActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deleteResultActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecordStudentResult;
    private javax.swing.JButton deleteResult;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logout;
    public static javax.swing.JTable studentResultTable;
    // End of variables declaration//GEN-END:variables
}