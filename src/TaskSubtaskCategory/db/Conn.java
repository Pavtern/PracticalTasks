package TaskSubtaskCategory.db;
import java.sql.*;

public class Conn {
    private static String url = "jdbc:mysql://localhost:3306/calendar";
    private static String user = "root";
    private static String password = "root";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

    public static Connection close(Connection conn)throws SQLException{
        conn.close();
        return conn;
    }
}
