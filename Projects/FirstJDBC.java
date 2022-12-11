package Projects;
import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args){
        try {
            //loading the driver which is in com.mysql.jdbc package
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "XXXiXX9766";     // Pass hiden with x

            Connection con = DriverManager.getConnection(url, username, password);

            //check whether connection is working
            if (con.isClosed()) {
                System.out.println("Connection is Closed");
            } else {
                System.out.println("Connection Created...");
            }

            String q = "create table table1(tID int(20) primary key auto_increment, tName varChar(200) not null, " +
                    "tCity varChar(400))";

            //create Statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database");

            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
