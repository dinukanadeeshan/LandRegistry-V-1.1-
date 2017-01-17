/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.village;

import controller.LocalAuthorityController;
import controller.VillageController;
import java.awt.Dialog;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LocalAuthority;
import model.Village;
import others.ComboSearchNew;
import others.IdGen;
import others.Validation;
import view.land.AddLand;
import view.land.UpdateLand;
import view.localAuthority.AddLocalAuthority;

/**
 *
 * @author Nadeeshan
 */
public class AddVillage extends javax.swing.JDialog {

    Dialog dialog;
    Frame parent;

    /**
     * Creates new form AddVillage
     */
    public AddVillage(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        dialog = parent;
        initComponents();
        setLocationRelativeTo(null);
        initLocalAuthorityCombo();
        try {
            villageCodeText.setText(IdGen.getNextId("VillageOrTown", "villageCode", "V"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ComboSearchNew().setSearchableCombo(localAuthorityComboBox, true, "No Matches Founds...", nameText);
    }

    public AddVillage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;

        initComponents();
        setLocation(406, 90);
        initLocalAuthorityCombo();
        try {
            villageCodeText.setText(IdGen.getNextId("VillageOrTown", "villageCode", "V"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ComboSearchNew().setSearchableCombo(localAuthorityComboBox, true, "No Matches Founds...", nameText);
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
        villageCodeLabel = new javax.swing.JLabel();
        villageCodeText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        localAuthorityLabel = new javax.swing.JLabel();
        localAuthorityComboBox = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addLocalAuthorityButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Village");

        titleLabel.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Add Village");

        villageCodeLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        villageCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        villageCodeLabel.setText("Village Code");

        villageCodeText.setEditable(false);
        villageCodeText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        villageCodeText.setFocusable(false);

        nameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name");

        nameText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextKeyReleased(evt);
            }
        });

        localAuthorityLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        localAuthorityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        localAuthorityLabel.setText("Local Authority");

        localAuthorityComboBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        localAuthorityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        localAuthorityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localAuthorityComboBoxActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addLocalAuthorityButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addLocalAuthorityButton.setText("Add L.Authority");
        addLocalAuthorityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocalAuthorityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(localAuthorityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(villageCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localAuthorityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addLocalAuthorityButton))
                    .addComponent(villageCodeText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 257, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localAuthorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(villageCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(villageCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localAuthorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addLocalAuthorityButton))
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void localAuthorityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localAuthorityComboBoxActionPerformed
    }//GEN-LAST:event_localAuthorityComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String villageCode = villageCodeText.getText();
        String authorityCode = localAuthorityComboBox.getSelectedItem().toString().split(" - ")[0];
        String name = nameText.getText();
        try {
            VillageController.addVillage(new Village(villageCode, authorityCode, name));
            nameText.setText("");
            localAuthorityComboBox.setSelectedIndex(-1);
            localAuthorityComboBox.requestFocus();
            villageCodeText.setText(IdGen.getNextId("VillageOrTown", "villageCode", "V"));
            if (dialog instanceof AddLand) {
                this.dispose();
                ((AddLand) dialog).initComboBoxes();
            }
            if (dialog instanceof UpdateLand) {
                this.dispose();
                ((UpdateLand) dialog).initLandCodeComboBox();
                ((UpdateLand) dialog).initVillageComboBox();

            }
            if (dialog instanceof ViewVillage) {
                this.dispose();
                ((ViewVillage) dialog).reload();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        saveButton.doClick();
    }//GEN-LAST:event_nameTextActionPerformed

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
        try {
            String text = nameText.getText();
            if (!Validation.validateName(text)) {
                nameText.setText(text.substring(0, text.length() - 1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nameTextKeyReleased

    private void addLocalAuthorityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocalAuthorityButtonActionPerformed
        new AddLocalAuthority(this, true).show();
    }//GEN-LAST:event_addLocalAuthorityButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddVillage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVillage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVillage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVillage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddVillage dialog = null;
                
                dialog = new AddVillage(new javax.swing.JDialog(), true);

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
    private javax.swing.JButton addLocalAuthorityButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox localAuthorityComboBox;
    private javax.swing.JLabel localAuthorityLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel villageCodeLabel;
    private javax.swing.JTextField villageCodeText;
    // End of variables declaration//GEN-END:variables

    /**
     * Java
     */
    public void initLocalAuthorityCombo() {
        try {
            localAuthorityComboBox.removeAllItems();
            Vector<LocalAuthority> localAuthorityies = LocalAuthorityController.getLocalAuthorityies();
            for (int i = 0; i < localAuthorityies.size(); i++) {
                LocalAuthority localAuthority = localAuthorityies.get(i);
                localAuthorityComboBox.addItem(localAuthority);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddVillage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}