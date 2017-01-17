/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import db.DBConnection;
import db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nadeeshan
 */
public class IdGen {

    public static String getNextId(String table, String column, String prefix) throws ClassNotFoundException, SQLException {
        String query = "select "+column+" from "+table+" order by 1 desc limit 1 ";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        
        if (resultSet.next()) {
            String currentId = resultSet.getString(1);
            String newId = null;
            int index = 0;
            for (int i = currentId.length(); i >=0; i--) {
                if (!Character.isDigit(currentId.charAt(i-1))) {
                    index = i;
                    break;
                }
            }
            int newNum = Integer.parseInt(currentId.substring(index));
            newNum++;
            if (String.valueOf(newNum).length() == 1) {
                newId = prefix + "00" + newNum;
            }else if(String.valueOf(newNum).length() == 2) {
                newId = prefix + "0" + newNum;
            }else {
                newId = prefix + newNum;
            }
            return newId;
        }
        
        return prefix+"001";
    }
    public static String getNextDayBookNo(String bookType, String year) throws ClassNotFoundException, SQLException{
        String query = "select dayBookNo from DayBookRecord where dayBookNo like '"+bookType+"%/"+year+"' Order by 1 desc limit 1";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        if (resultSet.next()) {
            String dayBookNo = resultSet.getString(1);
            String currentNo = dayBookNo.split("/")[0];
            int index = 0;
            for (int i = currentNo.length(); i >=0; i--) {
                if (!Character.isDigit(currentNo.charAt(i-1))) {
                    index = i;
                    break;
                }
            }
            int newNum = Integer.parseInt(currentNo.substring(index));
            newNum++;
            String newDBNo = null;
            if (String.valueOf(newNum).length() == 1) {
                newDBNo = bookType + "0000" + newNum;
            }else if(String.valueOf(newNum).length() == 2) {
                newDBNo = bookType + "000" + newNum;
            }else if(String.valueOf(newNum).length() == 3){
                newDBNo = bookType + "00" +newNum;
            } else if (String.valueOf(newNum).length() == 4){
                newDBNo = bookType + "0" +newNum;
            } else if (String.valueOf(newNum).length() == 5){
                newDBNo = bookType +newNum;
            }
            return newDBNo +"/"+ year;
            
        }
        return bookType + "00001/" + year;
    }
    public static String getNextClient() throws SQLException, ClassNotFoundException{
        String query = "select clientCode from Client where clientCode Like 'Ext%' Order by 1 desc limit 1";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        String prefix = "Ext";
        if (resultSet.next()) {
            String currentId = resultSet.getString(1);
            String newId = null;
            int index = 0;
            for (int i = currentId.length(); i >=0; i--) {
                if (!Character.isDigit(currentId.charAt(i-1))) {
                    index = i;
                    break;
                }
            }
            int newNum = Integer.parseInt(currentId.substring(index));
            newNum++;
            if (String.valueOf(newNum).length() == 1) {
                newId = prefix + "00" + newNum;
            }else if(String.valueOf(newNum).length() == 2) {
                newId = prefix + "0" + newNum;
            }else {
                newId = prefix + newNum;
            }
            return newId;
        }
        return prefix+"001";
    }
}