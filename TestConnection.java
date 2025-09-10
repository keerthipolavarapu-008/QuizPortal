import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Try connecting
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/qems",  // your DB name
                "root",                             // username
                "KEerthi@098"                       // password
            );

            System.out.println("✅ Connection Successful!");

        } catch (Exception e) {
            System.out.println("❌ Connection Failed!");
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
