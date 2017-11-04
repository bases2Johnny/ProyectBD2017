package Database;

import Model.Estrategia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataHandler {

    public DataHandler(Conection cn) {
        this.cn = cn;
    }
    
    public ArrayList<Estrategia> getEstrategias() {
        ArrayList<Estrategia> lista=new ArrayList<>();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select * from estrategias";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                lista.add(
                        new Estrategia(rset.getString(1),rset.getString(2),
                                rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6)));
            }
            cn.disconnect();
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public void update(String estado){
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement();
            query = "update estrategias set ejecutado = '1' where name = '"+ estado+"'" ;
            System.out.println(query);
            rset = stmt.executeQuery(query);
            cn.disconnect();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    private final Conection cn;
}
