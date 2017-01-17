/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.client;

import controller.ClientController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import model.Client;
import others.Validation;

/**
 *
 * @author Dinuka
 */
public class SearchClient extends javax.swing.JDialog {

    /**
     * Creates new form SearchClient
     */
    public SearchClient(java.awt.Frame parent, boolean modal) throws UnsupportedLookAndFeelException {
        super(parent, modal);
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchByButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        seachByLabel = new javax.swing.JLabel();
        nameRadioButton = new javax.swing.JRadioButton();
        clientCodeRadioButton = new javax.swing.JRadioButton();
        addressRadioButton = new javax.swing.JRadioButton();
        clientCodeText = new javax.swing.JTextField();
        clientCodeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Search Client");

        seachByLabel.setText("Search By :");

        searchByButtonGroup.add(nameRadioButton);
        nameRadioButton.setText("Name");
        nameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioButtonActionPerformed(evt);
            }
        });

        searchByButtonGroup.add(clientCodeRadioButton);
        clientCodeRadioButton.setSelected(true);
        clientCodeRadioButton.setText("Client Code");
        clientCodeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCodeRadioButtonActionPerformed(evt);
            }
        });

        searchByButtonGroup.add(addressRadioButton);
        addressRadioButton.setText("Address");
        addressRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressRadioButtonActionPerformed(evt);
            }
        });

        clientCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCodeTextActionPerformed(evt);
            }
        });
        clientCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clientCodeTextKeyReleased(evt);
            }
        });

        clientCodeLabel.setText("Client Code");

        nameLabel.setText("Name");
        nameLabel.setEnabled(false);

        nameText.setEditable(false);
        nameText.setFocusable(false);
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

        addressLabel.setText("Address");
        addressLabel.setEnabled(false);

        addressText.setEditable(false);
        addressText.setFocusable(false);
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seachByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clientCodeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(addressRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameRadioButton)
                        .addGap(263, 263, 263))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seachByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRadioButton)
                    .addComponent(addressRadioButton)
                    .addComponent(clientCodeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientCodeText)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        clientCodeLabel.setEnabled(false);
        clientCodeText.setEditable(false);
        clientCodeText.setFocusable(false);
        nameLabel.setEnabled(true);
        nameText.setEditable(true);
        nameText.setFocusable(true);
        addressLabel.setEnabled(false);
        addressText.setEditable(false);
        addressText.setFocusable(false);
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void addressRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressRadioButtonActionPerformed
        clientCodeLabel.setEnabled(false);
        clientCodeText.setEditable(false);
        clientCodeText.setFocusable(false);
        nameLabel.setEnabled(false);
        nameText.setEditable(false);
        nameText.setFocusable(false);
        addressLabel.setEnabled(true);
        addressText.setEditable(true);
        addressText.setFocusable(true);
    }//GEN-LAST:event_addressRadioButtonActionPerformed

    private void clientCodeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCodeRadioButtonActionPerformed
        clientCodeLabel.setEnabled(true);
        clientCodeText.setEditable(true);
        clientCodeText.setFocusable(true);
        nameLabel.setEnabled(false);
        nameText.setEditable(false);
        nameText.setFocusable(false);
        addressLabel.setEnabled(false);
        addressText.setEditable(false);
        addressText.setFocusable(false);
    }//GEN-LAST:event_clientCodeRadioButtonActionPerformed

    private void clientCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCodeTextActionPerformed
        try {
            Client client = ClientController.searchClientByCode(clientCodeText.getText());
            nameText.setText(client.getName());
            addressText.setText(client.getAddress());
        } catch (SQLException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
            if (ex.getMessage().contains("empty result set")) {
                JOptionPane.showMessageDialog(this, "There is no such Client Client code - "+clientCodeText.getText());
                clientCodeText.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clientCodeTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        try {
            Client client = ClientController.searchClientByName(nameText.getText());
            clientCodeText.setText(client.getClientId());
            addressText.setText(client.getAddress());
        } catch (SQLException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
             if (ex.getMessage().contains("empty result set")) {
                JOptionPane.showMessageDialog(this, "There is no such Client Client Name - "+nameText.getText());
                nameText.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nameTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        try {
            Client client = ClientController.searchClientByName(addressText.getText());
            clientCodeText.setText(client.getClientId());
            nameText.setText(client.getName());
        } catch (SQLException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
             if (ex.getMessage().contains("empty result set")) {
                JOptionPane.showMessageDialog(this, "There is no such Client Address code - "+addressText.getText());
                addressText.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addressTextActionPerformed

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
        try {
            String text = nameText.getText();
            if (!Validation.validateName(text)) {
                nameText.setText(text.substring(0, text.length() - 1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nameTextKeyReleased

    private void clientCodeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientCodeTextKeyReleased
        try {
            String text = clientCodeText.getText();
            if (!Validation.validateClientCode(text)) {
                clientCodeText.setText(text.substring(0, text.length() - 1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_clientCodeTextKeyReleased

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
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchClient dialog = null;
                try {
                    dialog = new SearchClient(new javax.swing.JFrame(), true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JRadioButton addressRadioButton;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel clientCodeLabel;
    private javax.swing.JRadioButton clientCodeRadioButton;
    private javax.swing.JTextField clientCodeText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel seachByLabel;
    private javax.swing.ButtonGroup searchByButtonGroup;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
