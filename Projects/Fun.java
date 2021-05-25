package Projects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Fun {
    public static void main(String[] args) {
        try{
            //loading the driver which is in com.mysql.jdbc package
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "**********";

            Connection con = DriverManager.getConnection(url,username,password );

            String q = "insert into table1(tName, tCity) values(?,?)";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name : ");
            String name = br.readLine();

            System.out.println("Enter City : ");
            String city = br.readLine();

            // get the prepared statement object
            PreparedStatement ps = con.prepareStatement(q);

            //set the values to query
            ps.setString(1,name);
            ps.setString(2,city);

            ps.executeUpdate();

            System.out.println("inserted...");

            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

