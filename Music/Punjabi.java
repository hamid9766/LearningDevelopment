package Projects.Music;

import Projects.Music.Functions;

import java.util.*;

public class Punjabi implements Functions {
    public static final
    HashMap<String, List<String>> psMap = new HashMap<String, List<String>>();

    @Override
    public void search(String artist) {

        // check if the the artist is present in map or not
        if (psMap.containsKey(artist)) {
            System.out.println("All Songs by " + artist);

            // song_name will store the output from get functionCall of hashMap
            List<String> song_names = psMap.get(artist);

            // If we directly call value from hsMap then will get the value in hashcode of the object song_name
            // so this for loop is required to iterate through the list object
            for (String s : song_names) {
                System.out.println(s + " ");
            }
        }
        else
        {
            System.out.println("Sorry songs by " + artist + " are not available at the Moment  ");
        }
    }

    @Override
    public void play() {

        // This forEach loop is more concise: -- Java 8 Version
        psMap.forEach((key,value)->{
            System.out.println(value +  "  " + key );
        });
    }

    public static void main(String[] args) {
        psMap.put("Harnoor", Arrays.asList("Waalian", "MoonLight"));
        psMap.put("Bohemia", Arrays.asList("Salute", "Same Beef", "Cadillac"));
        psMap.put("Sidhu Moosewala", Arrays.asList("Burberry", "Racks & Round"));
        psMap.put("Jass Manak", Arrays.asList("Viah", "Prada", "Boss"));
        psMap.put("Ammy Virk", Arrays.asList("khabbi Seat"));
        psMap.put("Dilpreet", Arrays.asList("Picka"));
        psMap.put("B Praak", Arrays.asList("Baarish", "Filhal"));
        psMap.put("Maninder Buttar", Arrays.asList("Sakhiyaan"));
        psMap.put("", Arrays.asList(""));



    }
}
