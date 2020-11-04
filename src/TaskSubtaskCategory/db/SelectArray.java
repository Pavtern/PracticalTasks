package TaskSubtaskCategory.db;

import java.sql.*;
import java.util.ArrayList;

public class SelectArray {

    public static void main(String[] args) throws Exception {
        SelectArray.get();
    }
    public static ArrayList<String> get() throws Exception{

        String url = "jdbc:mysql://localhost:3306/calendar";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from calendar.task");

            ArrayList<String> array = new ArrayList<String>();
            while (rs.next()) {
                System.out.print(rs.getString("idTask"));
                System.out.print(" - ");
                System.out.print(rs.getString("name"));
                System.out.print(" - ");
                System.out.print(rs.getString("Date"));
                System.out.print(" - ");
                System.out.println(rs.getString("idCategory1"));

                array.add(rs.getString("name"));
                return array;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
