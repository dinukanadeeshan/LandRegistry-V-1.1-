/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import controller.UserController;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.User;
import view.main.MainFrame;

/**
 *
 * @author Nadeeshan
 */
public class ChangePassword extends javax.swing.JDialog {

    User user;

    JFrame parent;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        this.user = user;
        this.parent = (JFrame) parent;
        initComponents();
        setLocationRelativeTo(null);
        userNameTextField.setText(user.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        currentPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        verifyPasswordLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        currentPasswordWarningLabel = new javax.swing.JLabel();
        passwordMatchWarningLabel = new javax.swing.JLabel();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        verifyPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Change Password");

        userNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNameLabel.setText("User Name");

        userNameTextField.setEditable(false);
        userNameTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        userNameTextField.setFocusable(false);

        currentPasswordLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        currentPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentPasswordLabel.setText("Current Password");

        newPasswordLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        newPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPasswordLabel.setText("New Password");

        verifyPasswordLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        verifyPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        verifyPasswordLabel.setText("Verify Password");

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/dialog-accept.png"))); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/window-close-3.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        currentPasswordWarningLabel.setFont(new java.awt.Font("Bradley Hand ITC", 3, 16)); // NOI18N
        currentPasswordWarningLabel.setForeground(new java.awt.Color(255, 0, 0));

        passwordMatchWarningLabel.setForeground(new java.awt.Color(255, 0, 0));

        currentPasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        currentPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPasswordFieldActionPerformed(evt);
            }
        });
        currentPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currentPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                currentPasswordFieldKeyReleased(evt);
            }
        });

        newPasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });
        newPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPasswordFieldKeyPressed(evt);
            }
        });

        verifyPasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        verifyPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPasswordFieldActionPerformed(evt);
            }
        });
        verifyPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verifyPasswordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addGap(5, 5, 5)
                .addComponent(cancelButton)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordMatchWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(currentPasswordWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(verifyPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(currentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(verifyPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {currentPasswordField, newPasswordField, userNameTextField, verifyPasswordField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPasswordWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verifyPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verifyPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(passwordMatchWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        try {
            int res = UserController.changePassword(user, newPasswordField.getText());
            if (res > 0) {
                JLabel messageLable = new JLabel("Password Changed Successfully...");
                messageLable.setFont(new Font("High Tower Text", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(this, messageLable);
                User user = new User(this.user.getUserName(), newPasswordField.getText(), this.user.getPrivilage());
                if (parent instanceof MainFrame) {
                    ((MainFrame)parent).setUser(user);
                }
            } else {
                JLabel messageLable = new JLabel("Password Changed fails...");
                messageLable.setFont(new Font("High Tower Text", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(this, messageLable);
            }
            currentPasswordField.setText("");
            newPasswordField.setText("");
            verifyPasswordField.setText("");
            currentPasswordField.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed
        verifyPasswordField.requestFocus();
    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void currentPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPasswordFieldActionPerformed
        if (new String(currentPasswordField.getPassword()).equals(user.getPassword())) {
            newPasswordField.requestFocus();
        } else {
            currentPasswordWarningLabel.setText("Current Password is incorrect. Check again!!");
        }
    }//GEN-LAST:event_currentPasswordFieldActionPerformed

    private void currentPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentPasswordFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_currentPasswordFieldKeyReleased

    private void currentPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentPasswordFieldKeyPressed
        currentPasswordWarningLabel.setText("");
    }//GEN-LAST:event_currentPasswordFieldKeyPressed

    private void verifyPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPasswordFieldActionPerformed
        if (new String(newPasswordField.getPassword()).equals(new String(verifyPasswordField.getPassword()))) {
            confirmButton.doClick();
        } else {
            passwordMatchWarningLabel.setText("Password doesn't match to new Password. Try Again!!");
            newPasswordField.setText("");
            verifyPasswordField.setText("");
            newPasswordField.requestFocus();
        }
    }//GEN-LAST:event_verifyPasswordFieldActionPerformed

    private void newPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPasswordFieldKeyPressed
        passwordMatchWarningLabel.setText("");
    }//GEN-LAST:event_newPasswordFieldKeyPressed

    private void verifyPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyPasswordFieldKeyPressed
        passwordMatchWarningLabel.setText("");
    }//GEN-LAST:event_verifyPasswordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePassword dialog = new ChangePassword(new javax.swing.JFrame(), true, new User("dinuka", "avchin", 0));
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JLabel currentPasswordLabel;
    private javax.swing.JLabel currentPasswordWarningLabel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JLabel passwordMatchWarningLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JPasswordField verifyPasswordField;
    private javax.swing.JLabel verifyPasswordLabel;
    // End of variables declaration//GEN-END:variables
}