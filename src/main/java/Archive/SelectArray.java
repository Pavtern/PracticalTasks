package Archive;

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

            System.out.printf("%-15s%-22s%-22s%-22s\n","idTask","Name","Date","IdCategory");
            while (rs.next()) {

                System.out.printf("%-15s%-22s%-22s%-22s\n",rs.getString("idTask"),rs.getString("name"),rs.getString("Date"),rs.getString("idCategory1"));

            }
            return array;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
