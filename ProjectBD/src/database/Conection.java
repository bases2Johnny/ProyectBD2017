package database;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class Conection {

    public Conection() {
    }

    public Connection connect() {
        try {
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            cn = ds.getConnection(user, password);
            System.out.print("Sì");
            return cn;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            //return null;
        }
        return null;
    }

    public Boolean disconnect() {
        try {
            cn.close();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    private Connection cn;
    private final String user = "maikol";
    private final String password = "maikol";
    private final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    private OracleDataSource ds;
}
