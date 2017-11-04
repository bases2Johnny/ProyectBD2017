package Database;

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
    private final String user = "servidor";
    private final String password = "servidor";
    private final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    private OracleDataSource ds;
}
