package TaskSubtaskCategory.db;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        get();

    }

    public static String get() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";
//        if id+

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from calendar.task");

        System.out.printf("%-15s%-22s%-22s%-22s\n", "idTask", "Name", "Date", "IdCategory");

        while (rs.next()) {
            System.out.printf("%-15s%-22s%-22s%-22s\n",
                    rs.getString("idTask"),
                    rs.getString("name"),
                    rs.getString("Date"),
                    rs.getString("idCategory1"));
        }
        return ".";
    }
}
