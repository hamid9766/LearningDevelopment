package Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Created the singleton class and created a factory method which will provide connection

public class ConnectionProvider {
    private static Connection con;

   public static Connection getConnection()
   {
        try {
            if(con == null) {

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "Manis*****");
            }

        } catch (Exception e) {
               e.printStackTrace();
        }
       return con;
   }
}

