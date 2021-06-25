package Projects.Music;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu extends Song {
    public static int n;

    public static void setN(int n) throws IOException {
        Menu.n = n;
        switch (n){
            case 1 :
                System.out.println("SONGS");
                break;

            case 2:
                System.out.println("PODCAST");
                break;

            case 3:
                System.out.println("ENGLISH");
                English all_eng_songs = new English();
                System.out.println("Showing all the English Songs" + "\n");
                all_eng_songs.play();
                break;

            case 4:
                System.out.println("HINDI");
                Hindi all_hindi_songs = new Hindi();
                System.out.println("Showing all the Hindi Songs" + "\n");
                all_hindi_songs.play();
                break;

            case 5:
                System.out.println("PUNJABI");
                Punjabi all_punj_songs = new Punjabi();
                System.out.println("Showing all the Punjabi Songs" + "\n");
                all_punj_songs.play();
                break;

            case  6:
                System.out.println("MOTIVATIONAL");
                break;

            case  7:
                System.out.println("EDUCATIONAL");
                break;

            case 8:
                System.out.println("SEARCH ARTIST");
                BufferedReader sa = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("---- Enter Artist Name -----");
                String artist_name = sa.readLine();

                System.out.println("---- Searching Songs by " + artist_name );
                English eng_artist = new English();
                eng_artist.search(artist_name);

                break;

            case 9:
                System.out.println("SEARCH SONG");
                BufferedReader ss = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("---- Enter Song Name -----");
                String song_name = ss .readLine();

                System.out.println("---- Searching -----  " + song_name );

                break;


            default:
                throw new IllegalStateException("Unexpected value: " + n + "\n Please Enter Value between 1 to 9");

        }
    }
}
