package Projects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

//Updating database with the help of jdbc where we are taking dynamic data input
//Note- while entering query statement be careful about the syntax and commas

public class UpdateJDBC {
    public static void main(String[] args) {
        try {

            Connection con = ConnectionProvider.getConnection();

            String q  = "update table1 set tName =? , tCity =? where tId =?";
            BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name : ");
            String name = br.readLine();

            System.out.println("Enter new city : ");
            String city = br.readLine();

            System.out.println("Enter the tId : ");
            int tId = Integer.parseInt(br.readLine());

            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,name);
            ps.setString(2, city);
            ps.setInt(3,tId);
            ps.executeUpdate();

            System.out.println("Done....");
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
