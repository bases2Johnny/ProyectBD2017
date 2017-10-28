package controller;

import database.Conection;
import database.DataHandler;

public class Controller {

    public Controller() {
        dbH = new DataHandler(new Conection());
    }

//    public Logs testQuery() {
//        try {
//            Logs logs = new Logs();
//            ResultSet rs = dbH.testQuery();
//            Log log;
//            while (rs.next()) {
//                log = new Log(
//                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
//                        rs.getInt(6), rs.getString(7), rs.getString(8),
//                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
//                logs.add(log);
//            }
//            logs.toString();
//            return logs;
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            return null;
//        }
//    }
    
    private DataHandler dbH;
}
