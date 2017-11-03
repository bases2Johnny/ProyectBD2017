package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.CNS;
import model.RowCNS;

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
    
    public int getEstrategias() {
        int cantidad=0;
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select count(name) from estrategias";
            rset = stmt.executeQuery(query);
            rset.next();
            cantidad=rset.getInt(1);
            System.out.println(cantidad);
            cn.disconnect();
            return cantidad;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }
    
    public void insertEstrategia(String sql){
         try {
            Connection conn = cn.connect();
            stmt = conn.createStatement();
            query = "insert into estrategias values("+sql+")";
            System.out.println(query);
            rset = stmt.executeQuery(query);
            cn.disconnect();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public CNS getCNS() {
        return null;
    }
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    private final Conection cn;
}
