package TaskSubtaskCategory.db;

import java.sql.*;

public class Delete {
    public static void main(String[] args) throws SQLException {
        task(5);
    }

    public static void task(long id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement ps = conn.prepareStatement("select * from calendar.task WHERE idTask = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();

        System.out.printf("%-15s%-22s%-22s%-22s\n", "idTask", "Name", "Date", "IdCategory");

        while (rs.next()) {
            System.out.printf("%-15s%-22s%-22s%-22s\n",
                    rs.getString("idTask"),
                    rs.getString("name"),
                    rs.getString("Date"),
                    rs.getString("idCategory1"));
        }
        PreparedStatement statement = conn.prepareStatement("delete from task" + " where idTask = ?");
        statement.setLong(1, id);
        int count = statement.executeUpdate();

        System.out.println ("Number of rows affected: " + count);
//        conn.close();????????

    }
}
