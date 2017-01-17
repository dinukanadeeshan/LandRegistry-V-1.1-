/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Deed;

/**
 *
 * @author Nadeeshan
 */
public class DeedController {

    public static ArrayList<String> getDeedInfo(String dayBookNo) throws ClassNotFoundException, SQLException {
        String query = "select bt.name as Book_Type, nod.name as Nature, n.name as Notry, d.notryNo, d.deedDate, d.deedValue, nod.registrationDuty, d.deedId, d.refVolume, d.refFolio, (select name from Office where officeCode = n.officeCode) as Office "
                + "from DayBookRecord dbr, Deed d, NatureOfDeed nod, Notry n, BookType bt "
                + " where  d.natureCode = nod.natureCode and n.notryCode = d.notryCode and bt.typeCode = d.bookType "
                + " and d.dayBookNo = '" + dayBookNo + "'";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> deedInfo = new ArrayList<String>();
        rst.next();
        for (int i = 1; i <= 11; i++) {
            deedInfo.add(rst.getString(i));
        }
        return deedInfo;
    }

    public static int addDeed(Deed deed) throws ClassNotFoundException, SQLException {
        String query = "insert into Deed values (?,?,?,?,?,?,?,?,?,?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, deed.getDeedId(), deed.getDayBookNo(), deed.getRefVolume(),
                deed.getRefFolio(), deed.getNotryCode(), deed.getDeedType(), deed.getNatureCode(), deed.getDeedDate(),
                deed.getNotryNo(), deed.getMediumCode(), deed.getNoOfLands(), deed.getDeedValue());
    }

    public static String getDeedId(String dayBookNo) throws SQLException, ClassNotFoundException {
        String query = "Select deedId from Deed where dayBookNo = '" + dayBookNo + "'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }
}
