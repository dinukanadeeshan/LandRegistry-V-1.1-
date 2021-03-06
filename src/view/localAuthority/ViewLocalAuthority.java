/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.localAuthority;

import controller.LocalAuthorityController;
import java.awt.Font;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LocalAuthority;
import view.office.ViewOffice;

/**
 *
 * @author Nadeeshan
 */
public class ViewLocalAuthority extends javax.swing.JDialog {

    /**
     * Creates new form ViewLocalAuthority
     */
    public ViewLocalAuthority(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        initLocalAuthorityInfoTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        officeInfoTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        uodateButton = new javax.swing.JButton();
        addNewButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        officeInfoTable.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 17)); // NOI18N
        officeInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "L Authority Code", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        officeInfoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(officeInfoTable);
        officeInfoTable.getColumnModel().getColumn(0).setHeaderValue("L Authority Code");
        officeInfoTable.getColumnModel().getColumn(1).setHeaderValue("Name");

        titleLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Local Authority");

        deleteButton.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/layer-delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        uodateButton.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        uodateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/update-product.png"))); // NOI18N
        uodateButton.setText("Update");
        uodateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uodateButtonActionPerformed(evt);
            }
        });

        addNewButton.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        addNewButton.setText("Add New");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/window-close-3.png"))); // NOI18N
        cancelButton.setText("Close");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uodateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uodateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addGap(30, 30, 30)
                        .addComponent(addNewButton)
                        .addGap(88, 88, 88)
                        .addComponent(cancelButton)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = officeInfoTable.getSelectedRow();
        if (selectedRow >= 0) {
            JLabel messageLabel = new JLabel("Are you sure want to delete this Local Authority?");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            if (JOptionPane.showConfirmDialog(this, messageLabel, "", JOptionPane.YES_NO_OPTION) == 0) {
                try {

                    int res = LocalAuthorityController.deleteAuthority((String) officeInfoTable.getValueAt(selectedRow, 0));
                    if (res > 0) {
                        messageLabel.setText("Local Authority deleted..");
                        JOptionPane.showMessageDialog(this, messageLabel);
                        initLocalAuthorityInfoTable();
                    } else {
                        messageLabel.setText("Local Authority deleted failed..");

                        JOptionPane.showMessageDialog(this, messageLabel);
                    }
                } catch (ClassNotFoundException ex) {
                } catch (SQLException ex) {
                    Logger.getLogger(ViewLocalAuthority.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
            }
        } else {
            JLabel messageLabel = new JLabel("select a Row..");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(this, messageLabel, "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void uodateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uodateButtonActionPerformed
        int selectedRow = officeInfoTable.getSelectedRow();
        if (selectedRow >= 0) {
            String authorityCode = (String) officeInfoTable.getValueAt(selectedRow, 0);
            new UpdateLocalAuthority(this, true, authorityCode).show();
        } else {
            JLabel messageLabel = new JLabel("select a Row..");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(this, messageLabel, "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_uodateButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        new AddLocalAuthority(this, true).show();
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLocalAuthority.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLocalAuthority.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLocalAuthority.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLocalAuthority.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewLocalAuthority dialog = new ViewLocalAuthority(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable officeInfoTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uodateButton;
    // End of variables declaration//GEN-END:variables

    public void initLocalAuthorityInfoTable() {
        try {
            int rowCount = officeInfoTable.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                ((DefaultTableModel) officeInfoTable.getModel()).removeRow(0);
            }
            Vector<LocalAuthority> localAuthorityies = LocalAuthorityController.getLocalAuthorityies();
            for (LocalAuthority localAuthority : localAuthorityies) {
                ((DefaultTableModel) officeInfoTable.getModel()).addRow(new Object[]{localAuthority.getAuthorityCode(), localAuthority.getName()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewOffice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewOffice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
