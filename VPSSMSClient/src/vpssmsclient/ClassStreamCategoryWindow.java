/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClassStreamCategoryWindow.java
 *
 * Created on Dec 6, 2013, 11:50:10 PM
 */
package vpssmsclient;

import javax.swing.JOptionPane;
import vpssmsserver.ClassStream;
import vpssmsserver.ClassStreamRegister;
import vpssmsserver.StudentClass;

/**
 *
 * @author Royal
 */
public class ClassStreamCategoryWindow extends javax.swing.JPanel {

    public static StudentClass studentClass;
    public static ClassStream classStream;
    public static ClassStreamRegister classStreamRegister;

    /** Creates new form ClassStreamCategoryWindow */
    public ClassStreamCategoryWindow() {
        initComponents();
        try {
            classTable.setModel(new Controller().classTableModel());
            streamTable.setModel(new Controller().streamTableModel());
            classStreamRegisterTable.setModel(new Controller().classStreamRegisteredTableModel());
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

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        addClass = new javax.swing.JButton();
        updateClass = new javax.swing.JButton();
        deleteClass = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        streamTable = new javax.swing.JTable();
        addStream = new javax.swing.JButton();
        updateStream = new javax.swing.JButton();
        deleteStream = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        classStreamRegisterTable = new javax.swing.JTable();
        addCategory = new javax.swing.JButton();
        updateCategory = new javax.swing.JButton();
        deleteClassStreamRecord = new javax.swing.JButton();
        logout = new javax.swing.JLabel();

        classTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        classTable.setForeground(new java.awt.Color(102, 102, 102));
        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Class ID", "Class Name", "Status", "Creation Date"
            }
        ));
        classTable.setGridColor(new java.awt.Color(51, 51, 51));
        classTable.setRowHeight(28);
        classTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        classTable.setSelectionForeground(new java.awt.Color(249, 242, 242));
        jScrollPane6.setViewportView(classTable);

        addClass.setFont(new java.awt.Font("Times New Roman", 0, 14));
        addClass.setText("Add");
        addClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassActionPerformed(evt);
            }
        });

        updateClass.setFont(new java.awt.Font("Times New Roman", 0, 14));
        updateClass.setText("Edit");
        updateClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClassActionPerformed(evt);
            }
        });

        deleteClass.setFont(new java.awt.Font("Times New Roman", 0, 14));
        deleteClass.setText("Delete");
        deleteClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(addClass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateClass)
                        .addGap(18, 18, 18)
                        .addComponent(deleteClass))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addClass, deleteClass, updateClass});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addClass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateClass)
                    .addComponent(deleteClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addClass, deleteClass, updateClass});

        jTabbedPane3.addTab("Create Class", jPanel11);

        streamTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        streamTable.setForeground(new java.awt.Color(102, 102, 102));
        streamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Steram ID", "Stream Name", "Status", "Creation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        streamTable.setGridColor(new java.awt.Color(51, 51, 51));
        streamTable.setRowHeight(28);
        streamTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        streamTable.setSelectionForeground(new java.awt.Color(249, 242, 242));
        jScrollPane7.setViewportView(streamTable);

        addStream.setFont(new java.awt.Font("Times New Roman", 0, 14));
        addStream.setText("Add");
        addStream.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStreamActionPerformed(evt);
            }
        });

        updateStream.setFont(new java.awt.Font("Times New Roman", 0, 14));
        updateStream.setText("Edit");
        updateStream.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStreamActionPerformed(evt);
            }
        });

        deleteStream.setFont(new java.awt.Font("Times New Roman", 0, 14));
        deleteStream.setText("Delete");
        deleteStream.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStreamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(addStream, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateStream)
                        .addGap(18, 18, 18)
                        .addComponent(deleteStream))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addStream, deleteStream, updateStream});

        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStream, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStream)
                    .addComponent(deleteStream))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addStream, deleteStream, updateStream});

        jTabbedPane3.addTab("Create Stream", jPanel12);

        classStreamRegisterTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        classStreamRegisterTable.setForeground(new java.awt.Color(102, 102, 102));
        classStreamRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Class", "Stream", "Term", "Academic Year", "Status", "Creation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        classStreamRegisterTable.setGridColor(new java.awt.Color(51, 51, 51));
        classStreamRegisterTable.setRowHeight(28);
        classStreamRegisterTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        classStreamRegisterTable.setSelectionForeground(new java.awt.Color(249, 242, 242));
        jScrollPane8.setViewportView(classStreamRegisterTable);

        addCategory.setFont(new java.awt.Font("Times New Roman", 0, 14));
        addCategory.setText("Add");
        addCategory.setToolTipText("This will Add  a Stream to Class. Forexample S1 A, S1B etc");
        addCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });

        updateCategory.setFont(new java.awt.Font("Times New Roman", 0, 14));
        updateCategory.setText("Edit");
        updateCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCategoryActionPerformed(evt);
            }
        });

        deleteClassStreamRecord.setFont(new java.awt.Font("Times New Roman", 0, 14));
        deleteClassStreamRecord.setText("Delete");
        deleteClassStreamRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteClassStreamRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassStreamRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteClassStreamRecord)))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addCategory, deleteClassStreamRecord, updateCategory});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCategory)
                    .addComponent(deleteClassStreamRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addCategory, deleteClassStreamRecord, updateCategory});

        jTabbedPane3.addTab("Assign A Class Streams", jPanel13);

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
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
                    .addComponent(logout))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
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

private void addClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassActionPerformed
// TODO add your handling code here:
    try {
        AddNewClassDialog addNewClassDialog = new AddNewClassDialog(VPSSMSClient.mainWindow, true);
        addNewClassDialog.setLocation((int) (VPSSMSClient.width / 8), (int) (VPSSMSClient.height / 10));
        addNewClassDialog.setTitle("Create New Class");
        addNewClassDialog.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_addClassActionPerformed

private void addStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStreamActionPerformed
// TODO add your handling code here:
    try {
        AddStreamDialog addStreamDialog = new AddStreamDialog(VPSSMSClient.mainWindow, true);
        addStreamDialog.setLocation((int) (VPSSMSClient.width / 8), (int) (VPSSMSClient.height / 10));
        addStreamDialog.setTitle("Create New Stream");
        addStreamDialog.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_addStreamActionPerformed

private void addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryActionPerformed
// TODO add your handling code here:
    try {
        AddClassStreamDialog createCategoryDialog = new AddClassStreamDialog(VPSSMSClient.mainWindow, true);
        createCategoryDialog.setLocation((int) (VPSSMSClient.width / 8), (int) (VPSSMSClient.height / 10));
        createCategoryDialog.setTitle("Add Stream To Class");
        createCategoryDialog.setVisible(true);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_addCategoryActionPerformed

private void deleteClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassActionPerformed
// TODO add your handling code here:
    try {
        int row = classTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record");
        } else {
            Object id = classTable.getModel().getValueAt(row, 0);
            if (id.toString().isEmpty()) {
            } else {
                int deleteResponse = JOptionPane.showInternalConfirmDialog(this, "Are You sure Want to DELETE\n the Selected Record?");
                if (deleteResponse == 0) {
                    boolean deleted = new Controller().deleteRecord(id.toString(), "StudentClass", "ClassId");
                    if (deleted == true) {
                        JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                        classTable.setModel(new Controller().classTableModel());
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR\nRecord\n NOT Deleted Successfully.. Please try again");
                    }
                }
            }

        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_deleteClassActionPerformed

private void deleteStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStreamActionPerformed
// TODO add your handling code here:
    try {
        int row = streamTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record");
        } else {
            Object id = streamTable.getModel().getValueAt(row, 0);
            if (id.toString().isEmpty()) {
            } else {
                int deleteResponse = JOptionPane.showInternalConfirmDialog(this, "Are You sure Want to DELETE\n the Selected Record?");
                if (deleteResponse == 0) {
                    boolean deleted = new Controller().deleteRecord(id.toString(), "classstream", "StreamId");
                    if (deleted == true) {
                        JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                        streamTable.setModel(new Controller().streamTableModel());
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR\nRecord\n NOT Deleted Successfully.. Please try again");
                    }
                }
            }
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_deleteStreamActionPerformed

private void deleteClassStreamRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassStreamRecordActionPerformed
// TODO add your handling code here:
    try {
        int row = classStreamRegisterTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record");
        } else {
            Object id = classStreamRegisterTable.getModel().getValueAt(row, 0);
            if (id.toString().isEmpty()) {
            } else {

                int deleteResponse = JOptionPane.showInternalConfirmDialog(this, "Are You sure Want to DELETE\n the Selected Record?");
                if (deleteResponse == 0) {
                    boolean deleted = new Controller().deleteRecord(id.toString(), "classstreamregister", "RegisterId");
                    if (deleted == true) {
                        JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                        classStreamRegisterTable.setModel(new Controller().classStreamRegisteredTableModel());
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR\nRecord\n NOT Deleted Successfully.. Please try again");
                    }
                }
            }
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}//GEN-LAST:event_deleteClassStreamRecordActionPerformed

private void updateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClassActionPerformed
// TODO add your handling code here:
    try {
        int row = classTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, row + " \nPlease Select Record");
        } else {
            studentClass = new StudentClass();
            studentClass.setClassId(classTable.getModel().getValueAt(row, 0).toString());
            studentClass.setName(classTable.getModel().getValueAt(row, 1).toString());
            studentClass.setStatus(classTable.getModel().getValueAt(row, 2).toString());
            studentClass.setDate(classTable.getModel().getValueAt(row, 3).toString());
            UpdateClassDialog updateClassDialog = new UpdateClassDialog(null, true);
            updateClassDialog.setLocation((int) (VPSSMSClient.width / 10), (int) (VPSSMSClient.height / 10));
            updateClassDialog.setVisible(true);
        }


    } catch (Exception ex) {
        System.err.println(ex.getMessage() + "\nERROR from updateClassActionPerformed Method");

    }
}//GEN-LAST:event_updateClassActionPerformed

private void updateStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStreamActionPerformed
// TODO add your handling code here:
    try {
        int row = streamTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, row + " \nPlease Select Record");
        } else {
            classStream = new ClassStream();
            classStream.setStreamId(streamTable.getModel().getValueAt(row, 0).toString());
            classStream.setName(streamTable.getModel().getValueAt(row, 1).toString());
            classStream.setStatus(streamTable.getModel().getValueAt(row, 2).toString());
            classStream.setDate(streamTable.getModel().getValueAt(row, 3).toString());
            UpdateStreamDialog updateStreamDialog = new UpdateStreamDialog(null, true);
            updateStreamDialog.setLocation((int) (VPSSMSClient.width / 10), (int) (VPSSMSClient.height / 10));
            updateStreamDialog.setVisible(true);
        }


    } catch (Exception ex) {
        System.err.println(ex.getMessage() + "\nERROR from updateClassActionPerformed Method");

    }
}//GEN-LAST:event_updateStreamActionPerformed

private void updateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCategoryActionPerformed
// TODO add your handling code here:
    try {
        int row = classStreamRegisterTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, row + " \nPlease Select Record");
        } else {
            classStreamRegister = new ClassStreamRegister();
            classStreamRegister.setRegisterId(classStreamRegisterTable.getModel().getValueAt(row, 0).toString());
            classStreamRegister.setClassId(classStreamRegisterTable.getModel().getValueAt(row, 1).toString());
            classStreamRegister.setStreamId(classStreamRegisterTable.getModel().getValueAt(row, 2).toString());
            classStreamRegister.setTerm(classStreamRegisterTable.getModel().getValueAt(row, 3).toString());
            classStreamRegister.setYear(classStreamRegisterTable.getModel().getValueAt(row, 4).toString());
            classStreamRegister.setStatus(classStreamRegisterTable.getModel().getValueAt(row, 5).toString());
            classStreamRegister.setDate(classStreamRegisterTable.getModel().getValueAt(row, 6).toString());
            UpdateClassStreamDialog updateClassStreamDialog = new UpdateClassStreamDialog(null, true);
            updateClassStreamDialog.setLocation((int) (VPSSMSClient.width / 10), (int) (VPSSMSClient.height / 10));
            updateClassStreamDialog.setVisible(true);
        }


    } catch (Exception ex) {
        System.err.println(ex.getMessage() + "\nERROR from updateClassActionPerformed Method");

    }
}//GEN-LAST:event_updateCategoryActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategory;
    private javax.swing.JButton addClass;
    private javax.swing.JButton addStream;
    public static javax.swing.JTable classStreamRegisterTable;
    public static javax.swing.JTable classTable;
    private javax.swing.JButton deleteClass;
    private javax.swing.JButton deleteClassStreamRecord;
    private javax.swing.JButton deleteStream;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel logout;
    public static javax.swing.JTable streamTable;
    private javax.swing.JButton updateCategory;
    private javax.swing.JButton updateClass;
    private javax.swing.JButton updateStream;
    // End of variables declaration//GEN-END:variables
}
