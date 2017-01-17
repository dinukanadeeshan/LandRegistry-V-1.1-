/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.awt.Font;
import java.io.IOException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadeeshan
 */
public class BackupClass {

    public static boolean backupDB(String  dbName, String dbUserName, String dbPassword, String path) throws InterruptedException, IOException {

        String executeCmd = "mysqldump -u" + dbUserName + " -p" + dbPassword + " --add-drop-database -B" + dbName + " -r" + path;
        Process runtimeProcess;
        long x = new Date().getTime();
        runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();
        x = new Date().getTime() - x;
        System.out.println(x);
        System.out.println(processComplete);
        if (processComplete == 0) {
            JLabel messageLabel = new JLabel("Backup created successfully");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, messageLabel);
            return true;
        } else {
            JLabel messageLabel = new JLabel("Could not create the backup");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, messageLabel);
        }


        return false;
    }

    public static boolean restoreDB(String dbUserName, String dbPassword, String source) throws IOException, InterruptedException {

        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + source};

        Process runtimeProcess;

        runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();

        if (processComplete == 0) {
            JLabel messageLabel = new JLabel("Backup restored successfully");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, messageLabel);
            return true;
        } else {
            JLabel messageLabel = new JLabel("Could not restore the backup");
            messageLabel.setFont(new Font("High Tower Text", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, messageLabel);
        }

        return false;
    }
}
