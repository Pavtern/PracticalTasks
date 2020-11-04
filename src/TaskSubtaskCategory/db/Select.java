package TaskSubtaskCategory.db;

import java.sql.*;

public class Select {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from calendar.task");

            while (rs.next()) {
                System.out.println(rs.getString("idTask"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
