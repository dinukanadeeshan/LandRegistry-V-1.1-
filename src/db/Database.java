/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.IOException;
import others.BackupClass;

/**
 *
 * @author Nadeeshan
 */
public class Database {
    public static boolean createDatabase() throws IOException, InterruptedException{
        return BackupClass.restoreDB("root", "123", "./src/db/DBBackup.txt");
    }
}
