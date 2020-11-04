package TaskSubtaskCategory.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from task" + " where idTask = 2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
