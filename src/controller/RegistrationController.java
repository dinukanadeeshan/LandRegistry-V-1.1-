/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Grantee;
import model.Grantor;
import model.RegistrationModel;

/**
 *
 * @author Nadeeshan
 */
public class RegistrationController {

    public static int doRegistration(RegistrationModel registrationModel, Grantor grantor, Grantee grantee) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            String query = "insert into Grantor values(?,?,?)";
            int res1, res2, res3;
            connection = DBConnection.getConnection();
            connection.setAutoCommit(false);
            res1 = DBHandle.setData(connection, query, grantor.getGrId(), grantor.getName(), grantor.getAddress());
            query = "insert into Grantee values(?,?,?)";
            res2 = DBHandle.setData(connection, query, grantee.getGeId(), grantee.getName(), grantee.getAddress());
            query = "insert into Registration values(?,?,?,?,?,?)";

            res3 = DBHandle.setData(DBConnection.getConnection(), query, new Object[]{registrationModel.getDeedId(), registrationModel.getLandCode(), registrationModel.getRegisteredDate(), grantor.getGrId(), grantee.getGeId(), registrationModel.getRemark()});



            connection.commit();
            return res1 + res2 + res3;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

    /**
     *
     * @return
     */
    public static ArrayList<ArrayList<String>> getRegistrationInfo(String date) throws ClassNotFoundException, SQLException {

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

        String query = "SELECT d.dayBookNo, l.volume, l.folio, l.name, v.name, e.acre, e.rood, e.perch, l.lotNo, n.name, (select o.name from Office o where o.officeCode = n. officeCode) as Office, d.notryNo, d.deedValue, nod.registrationDuty "
                + " FROM Deed d, Land l, VillageOrTown v, Extent e, Notry n, NatureOfDeed nod, Registration r  "
                + "WHERE d.notryCode = n.notryCode and v.villageCode = l.villageCode and e.ExtId = l.ExtId and nod.natureCode = d.natureCode and r.landCode = l.landCode and r.deedId = d.deedId and r.registeredDate = '" + date + "'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        while (resultSet.next()) {
            ArrayList<String> registrationInfo = new ArrayList<String>();
            for (int i = 1; i <= 14; i++) {
                registrationInfo.add(resultSet.getString(i));
            }
            list.add(registrationInfo);
        }
        return list;
    }

    public static boolean isRegistrationAvailableFor(String date) throws ClassNotFoundException, SQLException {
        String query = "select landCode from Registration where registeredDate = '" + date + "'";
        ResultSet data = DBHandle.getData(DBConnection.getConnection(), query);
        return data.next();

    }

    public static ArrayList<ArrayList<String>> getRegistrationInfo(String volume, String folio) throws ClassNotFoundException, SQLException {
        String query = "SELECT d.dayBookNo, nod.name, n.name, n.address, d.notryNo, d.deedValue, gr.name, gr.address, ge.name, ge.address, r.note, nod.registrationDuty  "
                + "FROM Deed d, Land l, Grantor gr, Grantee ge, Notry n, NatureOfDeed nod, Registration r  "
                + "WHERE d.notryCode = n.notryCode  and nod.natureCode = d.natureCode and r.landCode = l.landCode and r.deedId = d.deedId and  l.volume = '" + volume + "' AND l.folio = " + folio + " and r.geId = ge.geId and r.grid = gr.grId";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        while (resultSet.next()) {
            ArrayList<String> registrationInfo = new ArrayList<String>();
            for (int i = 1; i <= 12; i++) {
                registrationInfo.add(resultSet.getString(i));
            }
            list.add(registrationInfo);
        }
        return list;
    }

    public static int undoRegistration(String landCode, String deedId) throws ClassNotFoundException, SQLException {
        String query = "delete from Registration where landCode = ? and deedId = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, landCode, deedId);
    }
}
