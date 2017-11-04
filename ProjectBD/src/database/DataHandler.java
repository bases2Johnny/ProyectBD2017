package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.CNS;

public class DataHandler {

    public DataHandler(Conection cn) {
        this.cn = cn;
    }

    public ResultSet testQuery() {
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM v$log";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
            cn.disconnect();
            return rset;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
<<<<<<< HEAD
    
    public Boolean addServer(String query){
        return true;
    }
    
=======

    public ArrayList<String> getTablespaces() {
        ArrayList<String> lista = new ArrayList();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select tablespace_name from dba_tablespaces";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                
                lista.add(rset.getString("TABLESPACE_NAME"));
            }
            cn.disconnect();
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

>>>>>>> 5573416f1abdf1eefd3070eccc7f1844991b06df
    public CNS getCNS() {
        return null;
    }
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    private final Conection cn;
}
