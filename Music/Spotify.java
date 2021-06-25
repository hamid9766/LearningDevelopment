package Projects.Music;

import java.sql.*;

import static java.lang.Class.forName;

public class Spotify {
    public static void menu(){}
    public static void main(String[] args) {
        System.out.println("    SPOTIFY    ");

        System.out.println(" What do you want play --- SONGS OR PODCAST");

        System.out.println( "SONGS");

        System.out.println(" SELECT GENRE ");
        System.out.println( "ENGLISH/ HINDI/ PUNJABI");

        System.out.println("SELECT ARTIST");
        System.out.println("show all songs by artists");
        System.out.println("user selecting song");
        System.out.println("if user want to see metadata then fetch the data from table of that song");


        System.out.println(" PODCAST");

        System.out.println(" SELECT GENRE ");
        System.out.println(" EDUCATION/ MOTIVATIONAL");


        try{
            Connection con = ConnectionProvider.getConnection();
            String q = "select title from english";

            Statement stmt =  con.createStatement();
            ResultSet resultSet = stmt.executeQuery(q);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String song_title = resultSet.getString(2);
                String artist_name = resultSet.getString(3);
                String song_len = resultSet.getString(4);
            }

        }
        catch (Exception e){
            throw new RuntimeException("  !! Something Went Wrong !!  ");
        }
    }
}

