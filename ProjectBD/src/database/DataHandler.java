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
    
    public Boolean addServer(String query){
        return true;
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
