package database;

import model.Estrategia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            query = "select nombreconexion from databaselinkserver";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                RowCNS rowcns = new RowCNS(rset.getString("nombreconexion"));
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
            lista.add(true);
            lista.add("se creo exitosamente la coneccion");
            query = "insert into databaselinkserver values('"+server.getNombre().toUpperCase()+"','"+server.getDB()+"','"+ server.getIp()+"','"+server.getPuerto()+"','"+server.getUser()+"','"+server.getPass()+"')";
            stmt.executeQuery(query);
            cn.disconnect();
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            lista.add(false);
            lista.add(e.getLocalizedMessage());
            return lista;
        }
    }

    public ArrayList<Object> editServer(Servidor server) {
        ArrayList<Object> lista = new ArrayList<>();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "drop public database link "+ server.getNombre();
            stmt.executeQuery(query);
            
            query = "create public database link "+ server.getNombre() +"\n" +
            "connect to "+ server.getUser() +" identified by "+ server.getPass() +"\n" +
            "using '(DESCRIPTION =\n" +
            "    (ADDRESS = (PROTOCOL = TCP)(HOST = "+ server.getIp() +")(PORT = "+ server.getPuerto() +"))\n" +
            "    (CONNECT_DATA =\n" +
            "      (SERVER = DEDICATED)\n" +
            "      (SERVICE_NAME = "+ server.getDB() +")\n" +
            "    )\n" +
            "  )'";
            stmt.executeQuery(query);
            
            lista.add(true);
            lista.add("se edito exitosamente la conexion");
            query = "update databaselinkserver set nombredb = '"+ server.getDB() +"', ip ='" + server.getIp()+"', puerto = '" + server.getPuerto() + "', username = '"+ server.getUser()+ "', pass = '"+ server.getPass()+ "' where nombreconexion = '" + server.getNombre() +"'";
            stmt.executeQuery(query);
            cn.disconnect();
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
            query = "select count(name) from estrategias @"+name;
            rset = stmt.executeQuery(query);
            rset.next();
            cantidad=rset.getInt(1);
            //System.out.println(cantidad);
            cn.disconnect();
            return cantidad;
        } catch (SQLException e) {
            //System.err.println(e.getMessage());
            return 0;
        }
    }
    public ArrayList<Estrategia> getEstrategias1(String name) {
        ArrayList<Estrategia> lista=new ArrayList<>();
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select * from estrategias @"+name;
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
    
    public Boolean testCon(String name){
        try {
            Connection conn = cn.connect();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            query = "select * from dual@"+name;
            rset = stmt.executeQuery(query);
            cn.disconnect();
            return true;
        } catch (SQLException e) {
            //System.err.println(e.getMessage());
            return false;
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
    
    public ArrayList<String> getDatabaseLinkValues(String nombre) {
        try {
            ArrayList<String> lista = new ArrayList<>();
            Connection conn = cn.connect();
            stmt = conn.createStatement();
            query = "select * from databaselinkserver where nombreconexion = '" + nombre +"'";
            rset = stmt.executeQuery(query);
            while(rset.next()){
                lista.add(rset.getString("NOMBRECONEXION"));
                lista.add(rset.getString("NOMBREDB"));
                lista.add(rset.getString("IP"));
                lista.add(rset.getString("PUERTO"));
                lista.add(rset.getString("USERNAME"));
                lista.add(rset.getString("PASS"));
            }
            cn.disconnect();
            return lista;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    private final Conection cn;


    
}
