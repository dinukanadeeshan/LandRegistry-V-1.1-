/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.notry;

import controller.NotryController;
import controller.OfficeController;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Notry;
import others.Validation;

/**
 *
 * @author Nadeeshan
 */
public class UpdateNotry extends javax.swing.JDialog {

    /**
     * Creates new form UpdateNotry
     */
    public UpdateNotry(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        setLocation(406, 90);
        initNotryCodeComboBox();
        initOfficeComboBox();

    }

    private void initNotryCodeComboBox() {
        notryCodeComboBox.removeAllItems();
        try {
            ArrayList<String> notries = NotryController.getNotries();
            for (int i = 0; i < notries.size(); i++) {
                String notry = notries.get(i);
                notryCodeComboBox.addItem(notry);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RemoveNotry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveNotry.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (notryCodeComboBox.getItemCount() == 0) {
            notryCodeComboBox.addItem("No Records..");
        }
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
        nameText = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        notryOrJudgeLabel = new javax.swing.JLabel();
        doaLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        genderText = new javax.swing.JTextField();
        notryOrJudgeText = new javax.swing.JTextField();
        doaText = new javax.swing.JTextField();
        officeLabel = new javax.swing.JLabel();
        officeComboBox = new javax.swing.JComboBox();
        notryCodeLabel = new javax.swing.JLabel();
        notryCodeComboBox = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notry Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 16))); // NOI18N

        nameText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender");

        nameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name");

        addressLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLabel.setText("Address");

        notryOrJudgeLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        notryOrJudgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notryOrJudgeLabel.setText("Notry Or Judge");

        doaLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        doaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doaLabel.setText("Date of Appointment");

        addressText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        genderText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });

        notryOrJudgeText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        notryOrJudgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notryOrJudgeTextActionPerformed(evt);
            }
        });

        doaText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        doaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doaTextActionPerformed(evt);
            }
        });
        doaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                doaTextKeyReleased(evt);
            }
        });

        officeLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        officeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        officeLabel.setText("Office");

        officeComboBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        officeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        officeComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                officeComboBoxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                officeComboBoxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(officeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressText)
                            .addComponent(nameText)
                            .addComponent(officeComboBox, 0, 295, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doaLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(notryOrJudgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderText)
                            .addComponent(notryOrJudgeText)
                            .addComponent(doaText))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notryOrJudgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notryOrJudgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        notryCodeLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        notryCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notryCodeLabel.setText("Notry Code");

        notryCodeComboBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        notryCodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notryCodeComboBoxActionPerformed(evt);
            }
        });
        notryCodeComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notryCodeComboBoxKeyPressed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Update Notry");

        warningLabel.setFont(new java.awt.Font("Bradley Hand ITC", 3, 16)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(notryCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notryCodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notryCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notryCodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton)
                        .addComponent(updateButton))
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notryCodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notryCodeComboBoxActionPerformed
        try {
            Notry notry = NotryController.getNotry(notryCodeComboBox.getSelectedItem().toString().split(" - ")[0]);
            nameText.setText(notry.getName());
            addressText.setText(notry.getAddress());
            genderText.setText(notry.getGender());
            doaText.setText(notry.getDateOfAppointment());
            notryOrJudgeText.setText(notry.getNotryOrJudge());
            officeComboBox.setSelectedItem(OfficeController.getOfficeName(notry.getOfficeCode()));
            if (!notryCodeComboBox.getSelectedItem().toString().contains("No Records")) {
                updateButton.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RemoveNotry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveNotry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
        }

    }//GEN-LAST:event_notryCodeComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            Notry notry = new Notry(((String) notryCodeComboBox.getSelectedItem()).split(" - ")[0], nameText.getText(),
                    addressText.getText(), notryOrJudgeText.getText(), doaText.getText(), genderText.getText(), OfficeController.getOfficeCode((String) officeComboBox.getSelectedItem()));
            int res = NotryController.updateNotry(notry);
            if (res > 0) {
                JLabel messageLabel = new JLabel("Update Succesfully....");
                messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(this, messageLabel);
                initNotryCodeComboBox();

            } else {
                JLabel messageLabel = new JLabel("Update failed....");
                messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(this, messageLabel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateNotry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateNotry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        addressText.requestFocus();
    }//GEN-LAST:event_nameTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        officeComboBox.requestFocus();
    }//GEN-LAST:event_addressTextActionPerformed

    private void officeComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_officeComboBoxKeyReleased
    }//GEN-LAST:event_officeComboBoxKeyReleased

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        notryOrJudgeText.requestFocus();
    }//GEN-LAST:event_genderTextActionPerformed

    private void doaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doaTextActionPerformed
        try {
            String text = doaText.getText();
            if (Validation.validateDate(text)) {
                updateButton.doClick();
            } else {
                warningLabel.setText("Invalid date..");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_doaTextActionPerformed

    private void notryOrJudgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notryOrJudgeTextActionPerformed
        doaText.requestFocus();
    }//GEN-LAST:event_notryOrJudgeTextActionPerformed

    private void notryCodeComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notryCodeComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nameText.requestFocus();
        }
    }//GEN-LAST:event_notryCodeComboBoxKeyPressed

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            notryCodeComboBox.requestFocus();
        }
    }//GEN-LAST:event_nameTextKeyPressed

    private void officeComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_officeComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            genderText.requestFocus();
        }
    }//GEN-LAST:event_officeComboBoxKeyPressed

    private void doaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doaTextKeyReleased
        String text = doaText.getText();
        int caretPosition = doaText.getCaretPosition();
        warningLabel.setText("");
        if (!(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                if (caretPosition == 4 || caretPosition == 7) {
                    char charactor = text.charAt(caretPosition);
                    if (!(charactor == '-')) {
                        doaText.setText(text.substring(0, caretPosition) + "-" + text.substring(caretPosition));
                    }
                    doaText.setCaretPosition(caretPosition + 1);
                }
                System.out.println(caretPosition);
            } catch (StringIndexOutOfBoundsException e) {
                doaText.setText(text + "-");
                doaText.setCaretPosition(caretPosition + 1);
            }
            try {
                if (text.length() > 10) {
                    doaText.setText(text.substring(0, caretPosition - 1));
                }
                if (!Validation.validateDateChar(text)) {
                    doaText.setText(text.substring(0, caretPosition - 1) + "" + text.substring(caretPosition));
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_doaTextKeyReleased

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
            java.util.logging.Logger.getLogger(UpdateNotry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNotry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNotry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNotry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateNotry dialog = new UpdateNotry(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel doaLabel;
    private javax.swing.JTextField doaText;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox notryCodeComboBox;
    private javax.swing.JLabel notryCodeLabel;
    private javax.swing.JLabel notryOrJudgeLabel;
    private javax.swing.JTextField notryOrJudgeText;
    private javax.swing.JComboBox officeComboBox;
    private javax.swing.JLabel officeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables

    private void initOfficeComboBox() {
        officeComboBox.removeAllItems();
        try {
            ArrayList<String> officeList = OfficeController.getOfficeList();
            for (int i = 0; i < officeList.size(); i++) {
                String office = officeList.get(i);
                officeComboBox.addItem(office);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNotry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNotry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}