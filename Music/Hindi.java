package Projects.Music;

import Projects.Music.Functions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hindi implements Functions {
    public static final
    HashMap<String, List<String>> hsMap = new HashMap<String, List<String>>();

    @Override
    public void search(String artist) {

        // check if the the artist is present in map or not
        if (hsMap.containsKey(artist)) {
            System.out.println("All Songs by " + artist);

            // song_name will store the output from get functionCall of hashMap
            List<String> song_names = hsMap.get(artist);

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
        hsMap.forEach((key,value)->{
            System.out.println(value +  "  " + key );
        });
    }

    public static void main(String[] args) {
        hsMap.put("Sachet Tandon", Arrays.asList("Bekhayali", "Humraah"));
        hsMap.put("Darshan Raval", Arrays.asList("Rabba Mehar Kari", "Ek Tarfa", "Tera Zikr"));
        hsMap.put("Akhil Sachdeva", Arrays.asList("Mere Sohneya"));
        hsMap.put("Arijit Singh", Arrays.asList("Tum Hi Ho", "Raabta"));
        hsMap.put("Atif Aslam", Arrays.asList("Pehli Nazar Mein", "Rang Jo Lagiyo"));
        hsMap.put("Vishal Mishra", Arrays.asList("Kaise hua"));
        hsMap.put("Badshah", Arrays.asList("Heartless"));
        hsMap.put("Mohit Chauhan", Arrays.asList("Saiyaara", "Rabba"));
        hsMap.put("Mithoon", Arrays.asList("Chal Ghar Chaleen"));
    }

}

