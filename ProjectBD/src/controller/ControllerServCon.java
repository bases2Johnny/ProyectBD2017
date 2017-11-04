package controller;

import database.Conection;
import database.DataHandler;
import java.util.ArrayList;
import model.CNS;
import model.models.ModelServCon;
import model.RowCNS;

public class ControllerServCon {

    public ControllerServCon(ModelServCon modelo) {
        this.modelo = modelo;
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
    public CNS getCNS() {
        RowCNS cn0 = new RowCNS();
        RowCNS cn1 = new RowCNS();
        RowCNS cn2 = new RowCNS();
        ArrayList<RowCNS> cons = new ArrayList();
        cons.add(cn0);
        cons.add(cn1);
        cons.add(cn2);
        CNS c = new CNS(cons);
        return c;
    }

    private ModelServCon modelo;
}
