
package eggshooter;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManagement {
    String URL = "jdbc:mysql://localhost:3306/EggShootingGameeeserverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "";
    private Connection conn;
    
    public DBManagement() throws SQLException {
        DriverManager.registerDriver(new Driver());
        conn = (Connection)DriverManager.getConnection(URL, USER, PASS);
    }
    
    public Connection getConnection() {
        return this.conn;
    }
    public boolean isConnected() {
        return this.conn != null;
    }
    
    public void closeConnection() throws SQLException {
        this.conn.close();
    }
}
