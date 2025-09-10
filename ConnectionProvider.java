import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/qems",  // your DB
                "root",                             // username
                "KEerthi@098"                       // password
            );
            return con;
        } catch (Exception e) {
            e.printStackTrace(); // for debugging
            return null;
        }
    }
}
