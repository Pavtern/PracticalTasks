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
        PreparedStatement statement = conn.prepareStatement("delete from task" + " where idTask = ?");
        statement.setLong(1, id);
        int count = statement.executeUpdate();

        System.out.println ("Number of rows affected: " + count);
//        conn.close();????????

    }
}
