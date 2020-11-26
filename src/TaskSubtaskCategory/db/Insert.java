package TaskSubtaskCategory.db;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {

        set("d","1", 1);
    }

    public static void set(String name, String date, long id) throws SQLException {

        Connection conn = Conn.getConnection();
        PreparedStatement statement = conn.prepareStatement("insert into task" + "(name,date,idCategory1)" + "values(?,?,?)");
        statement.setString(1, name);
        statement.setString(2, date);
        statement.setLong(3, id);
        int count = statement.executeUpdate();
        Conn.close(conn);
        System.out.println ("Number of rows created: " + count);
    }
}
