package TaskSubtaskCategory.db;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws SQLException {

        update(1, "Dodf");
    }

    public static void update(long id, String name) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";


        Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement statement = conn.prepareStatement("update task" + " set name = ?" + "where idTask = ?");
        statement.setString(1, name);
        statement.setLong(2, id);
        int count = statement.executeUpdate();

        System.out.println ("Number of rows affected: " + count);
    }
}
