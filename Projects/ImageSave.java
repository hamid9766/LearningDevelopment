package Projects;
import java.io.FileInputStream;
import java.sql.*;
//In this we are saving image in database which is in binary format

public class ImageSave {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.Jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root", "Manis*****");

            //inserting query
            String q =  "insert into images(pic) values(?)";

            PreparedStatement ps = con.prepareStatement(q);

            //reading the file which is image
            FileInputStream fis = new FileInputStream("img.jpg");

            //set the image in binary format and saving and available function will give the remaining memory
            ps.setBinaryStream(1,fis,fis.available());

            //simply executing the update
            ps.executeUpdate();
            System.out.println("Done....");

        }catch(Exception e)
        {
            System.out.println("Error! ");
            e.printStackTrace();
        }
    }
}
