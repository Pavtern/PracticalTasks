package TaskSubtaskCategory.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Formatter;

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
//            int nameWidth = 1;
//            int rollNumberWidth = 10;
//            int addressWidth = 10;
//            int percentWidth = 1;
//            String format = "%" + nameWidth + "s"
//                    + "%" + rollNumberWidth + "s"
//                    + "%" + addressWidth + "s"
//                    + "%" + percentWidth + "s\n";
//            System.out.printf(format,"idTask","Name","Date","IdCategory");
            System.out.printf("%-15s%-22s%-22s%-22s\n","idTask","Name","Date","IdCategory");
            while (rs.next()) {
//                  Formatter formatter = new Formatter();
//                String idTask = rs.getString("idTask");
//                String name = rs.getString("name");
//                String date = rs.getString("Date");
//                String idcat = rs.getString("idCategory1");
//                System.out.printf(format,idTask,name,date,idcat);
//                  formatter.format("%-22d%", rs.getString("idTask"));
//                System.out.print(rs.getString("idTask"));
//                System.out.print(rs.getString("name"));
//                System.out.print(String.format("%-20d" ,rs.getString("idTask")));
//                System.out.print(rs.getString("Date"));
//                System.out.println(rs.getString("idCategory1"));


                System.out.printf("%-15s%-22s%-22s%-22s\n",rs.getString("idTask"),rs.getString("name"),rs.getString("Date"),rs.getString("idCategory1"));
//                array.add(rs.getString("idTask"));
//                array.add(rs.getString("name"));
//                array.add(rs.getString("Date"));
//                array.add(rs.getString("idCategory1"));

            }
            return array;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
