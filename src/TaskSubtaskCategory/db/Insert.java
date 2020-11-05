package TaskSubtaskCategory.db;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {

        set();
    }

    public static void set() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";


        Connection conn = DriverManager.getConnection(url,user,password);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("insert into task" + "(name,date,idCategory1)" + "values('test','2020.11.08', '1')");

    }
}
