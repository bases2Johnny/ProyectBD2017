package database;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.CNS;
import model.RowCNS;
import model.Servidor;

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
    
    
    public ArrayList<String> getTablespaces(String name) {
        ArrayList<String> lista = new ArrayList();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select tablespace_name from dba_tablespaces" + name;
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
    
    public ArrayList<Object> AddServer(Servidor server){
        ArrayList<Object> lista = new ArrayList<>();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "create public database link "+ server.getNombre() +"\n" +
            "connect to "+ server.getUser() +" identified by "+ server.getPass() +"\n" +
            "using '(DESCRIPTION =\n" +
            "    (ADDRESS = (PROTOCOL = TCP)(HOST = "+ server.getIp() +")(PORT = "+ server.getPuerto() +"))\n" +
            "    (CONNECT_DATA =\n" +
            "      (SERVER = DEDICATED)\n" +
            "      (SERVICE_NAME = "+ server.getDB() +")\n" +
            "    )\n" +
            "  )'";
            rset = stmt.executeQuery(query);
            cn.disconnect();
            lista.add(true);
            lista.add("se creo exitosamente la coneccion");
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            lista.add(false);
            lista.add(e.getLocalizedMessage());
            return lista;
        }
    }

    public int getEstrategias(String name) {
        int cantidad=0;

        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select count(name) from estrategias"+name;
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
    
    public void insertEstrategia(String sql, String name){
        String commit="commit";
         try {
            Connection conn = cn.connect();
            stmt = conn.createStatement();
            query = "insert into estrategias "+name+" values("+sql+")";
            System.out.println(query);
            rset = stmt.executeQuery(query);
            stmt.executeQuery(commit);
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
