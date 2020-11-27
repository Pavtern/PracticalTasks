package Archive;

import java.sql.*;

public class SelectR {
    public static void main(String[] args) throws SQLException {
        get(11);

    }

    public static String get(int id) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";
//        if id+

        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement("select * from calendar.task WHERE idTask = ?");
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

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