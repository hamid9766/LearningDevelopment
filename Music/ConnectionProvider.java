package Projects.Music;

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
                //String url = "jdbc:mysql://localhost:3306/youtube";     this is for another db
                //String url = "jdbc:mysql://localhost:3306/cars";       // this is for another db
                String url = "jdbc:mysql://localhost:3306/songs";
                con = DriverManager.getConnection(url, "root", "Manish9766");
            }

        } catch (Exception e) {
               e.printStackTrace();
        }
       return con;
   }
}

