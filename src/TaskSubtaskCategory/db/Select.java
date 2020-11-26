package TaskSubtaskCategory.db;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        get();

    }

    public static String get() throws SQLException{
        Connection conn = Conn.getConnection();
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
        Conn.close(conn);
        return ".";
    }
}
