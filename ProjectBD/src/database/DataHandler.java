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

    public ArrayList<RowCNS> getCNS() {
        ArrayList<RowCNS> lista = new ArrayList();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select DB_LINK from DBA_DB_LINKS";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                RowCNS rowcns = new RowCNS(rset.getString("DB_LINK"));
                lista.add(rowcns);
            }
            cn.disconnect();
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public void AddServer(){
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select DB_LINK from DBA_DB_LINKS";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                RowCNS rowcns = new RowCNS(rset.getString("DB_LINK"));
            }
            cn.disconnect();
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
