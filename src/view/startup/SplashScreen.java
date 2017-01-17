/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.startup;

import db.DBConnection;
import db.Database;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.user.AddUser;

/**
 *
 * @author Nadeeshan
 */
public class SplashScreen extends javax.swing.JDialog {

    Timer timer;
    int x;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progressBar.getValue() + 1);
                if (progressBar.getValue() == 100) {
                    timer.stop();
                    SplashScreen.this.dispose();
                    Login login = new Login(null, false);
                    login.setVisible(true);
                }
                if (progressBar.getValue() == 2) {
                    packageNameLabel.setText("landRegistry.controller");
                } else if (progressBar.getValue() == 6) {
                    packageNameLabel.setText("landRegistry.db");
                } else if (progressBar.getValue() == 12) {
                    packageNameLabel.setText("landRegistry.others");
                } else if (progressBar.getValue() == 18) {
                    packageNameLabel.setText("landRegistry.reports");
                } else if (progressBar.getValue() == 22) {
                    packageNameLabel.setText("landRegistry.dayBook");
                } else if (progressBar.getValue() == 28) {
                    packageNameLabel.setText("landRegistry.controller");
                } else if (progressBar.getValue() == 34) {
                    packageNameLabel.setText("landRegistry.model");
                } else if (progressBar.getValue() == 48) {
                    packageNameLabel.setText("landRegistry.deed");
                } else if (progressBar.getValue() == 58) {
                    packageNameLabel.setText("landRegistry.main");
                } else if (progressBar.getValue() == 60) {
                    packageNameLabel.setText("landRegistry.land");
                } else if (progressBar.getValue() == 64) {
                    packageNameLabel.setText("landRegistry.localauthority");
                } else if (progressBar.getValue() == 69) {
                    packageNameLabel.setText("landRegistry.natureOfDeed");
                } else if (progressBar.getValue() == 75) {
                    packageNameLabel.setText("landRegistry.notry");
                } else if (progressBar.getValue() == 80) {
                    packageNameLabel.setText("landRegistry.regiastration");
                } else if (progressBar.getValue() == 85) {
                    packageNameLabel.setText("landRegistry.village");
                } else if (progressBar.getValue() == 89) {
                    packageNameLabel.setText("landRegistry.LandRegistry");
                }
                x += 1;
                if (x % 4 == 0) {
                    dotLabel.setText(". . . .");
                } else if (x % 4 == 1) {
                    dotLabel.setText(".");
                } else if (x % 4 == 2) {
                    dotLabel.setText(". .");
                } else if (x % 4 == 3) {
                    dotLabel.setText(". . .");
                }
                if (progressBar.getValue() == 50) {
                    packageNameLabel.setText("Database");
                    try {
                        DBConnection.getConnection();
                        System.out.println("a");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                        if (ex.getMessage().contains("Could not create connection to database server. Attempted reconnect 3 times. Giving up.")) {
                            timer.stop();
                            System.out.println("c");
                            JLabel messageLabel = new JLabel("<html>Database doesn't Exsist. <br>Do you want create new?</html>");
                            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
                            int res = JOptionPane.showConfirmDialog(SplashScreen.this, messageLabel, "", JOptionPane.YES_NO_OPTION);
                            if (res == 0) {
                                loadingLabel.setText("Creating");
                                packageNameLabel.setText("New Database");
                                try {
                                    boolean response = Database.createDatabase();;
                                    if (response) {
                                        new AddUser(SplashScreen.this, false).setVisible(true);
                                    }

                                } catch (IOException ex1) {
                                    Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex1);
                                } catch (InterruptedException ex1) {
                                    Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex1);
                                }
                               
                                
                            } else {
                                System.exit(0);
                            }
                            loadingLabel.setText("Loading");
                        }
                    }
                }
            }
        });
        timer.start();
    }

    public void setTimerStart() {
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        loadingLabel = new javax.swing.JLabel();
        packageNameLabel = new javax.swing.JLabel();
        dotLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setBackground(new java.awt.Color(0, 153, 255));
        progressBar.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 931, 10));

        loadingLabel.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 13)); // NOI18N
        loadingLabel.setText("Loading ");
        getContentPane().add(loadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 20));

        packageNameLabel.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 13)); // NOI18N
        packageNameLabel.setText(".");
        packageNameLabel.setAutoscrolls(true);
        getContentPane().add(packageNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 260, 20));
        getContentPane().add(dotLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 20));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 25)); // NOI18N
        jLabel1.setText("Version 1.1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/LandManagement.jpg"))); // NOI18N
        pictureLabel.setText("Version 1.1");
        getContentPane().add(pictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 931, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen dialog = new SplashScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel dotLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JLabel packageNameLabel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
