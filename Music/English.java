package Projects.Music;

import Projects.Music.Functions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class English implements Functions {
    public static final
    HashMap<String, List<String>> esMap = new HashMap<String, List<String>>();

    @Override
    public void search(String artist) {

        // check if the the artist is present in map or not
        if (esMap.containsKey(artist)) {
            System.out.println("All Songs by " + artist);

            // song_name will store the output from get functionCall of hashMap
            List<String> song_names = esMap.get(artist);

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
        esMap.forEach((key,value)->{
            System.out.println(value +  "  " + key );
        });
    }

    public static void main(String[] args) {
        esMap.put("Post Malone", Arrays.asList("Candy Paint","Circles","Goodbyes"));
        esMap.put("Twenty One Pilots", Arrays.asList("Stressed Out"));
        esMap.put("Sia", Arrays.asList("Cheap Thrills"));
        esMap.put("ZAYN", Arrays.asList("Trampoline", "Pillowtalk"));
        esMap.put("Eminem", Arrays.asList("Rap God", "Headlights"));
        esMap.put("Halsey", Arrays.asList("Closer", "Without Me"));
        esMap.put("Justin Bieber", Arrays.asList("Peaches"));
        esMap.put("Julia Wolf", Arrays.asList("In My Wolf"));
        esMap.put("Anne Marie", Arrays.asList("2002"));
    }
}
