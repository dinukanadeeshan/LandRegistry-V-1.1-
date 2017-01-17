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
import model.Grantee;

/**
 *
 * @author Nadeeshan
 */
public class GranteeController {

    public static Grantee getGrantee(String geId) throws ClassNotFoundException, SQLException {
        String query = "select * from Grantee where  GeId = '" + geId + "'";
        ResultSet data = DBHandle.getData(DBConnection.getConnection(), query);
        data.next();
        return new Grantee(data.getString(1), data.getString(2), data.getString(3));

    }

    public static Grantee getGranteeForLand(String landCode) throws SQLException, ClassNotFoundException {
        String query = "SELECT ge.GeId, ge.name, ge.address "
                + "FROM Grantee ge, Registration r "
                + "where ge.GeId = r.GeId and r.landCode = '"+landCode+"' "
                + "ORDER BY r.registeredDate desc , 1 desc "
                + "LIMIT 1";
        ResultSet data = DBHandle.getData(DBConnection.getConnection(), query);
        data.next();
        return new Grantee(data.getString(1), data.getString(2), data.getString(3));
    }
}
