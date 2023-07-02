package org.learn.git;

import java.util.HashMap;
import java.util.Map;
import org.learn.git.model.Spotify;

public class Main {
  public static void main(String[] args) {
    System.out.println("Logged In!");
   // TODO :: If it were mutable, then the hashcode() value or equals() condition might change, and
    // you would never be able to retrieve the key from your HashMap
    Map<Spotify, String> map = new HashMap<>();
    Spotify one = new Spotify(1,"Pasoori","International");
    Spotify two = new Spotify(1,"Maa","Bollywood");

    // TODO :: 2 equal objects, they have same hashcode
    //  2 objects have same hashcode, they are NOT equal
    map.put(one, "MP3");
    map.put(two, "MP4");

    System.out.println(map.get(one) + " Hash Code One " + one.hashCode());
    System.out.println(map.get(two) + " Hash Code Two" + two.hashCode());

    System.out.println(map);
    System.out.println(map.size());

    System.out.println(one.hashCode() == two.hashCode());
    System.out.println(one.equals(two));

    System.out.println("Is key: " + two + " available? " + map.containsKey(two));
    System.out.println("Logged Off!");

        Map<String, Integer> playerToGoalsMap = new HashMap<>();
        playerToGoalsMap.put("Andy", 5);
        playerToGoalsMap.put("Michel", 7);
        playerToGoalsMap.put("Jan", 10);
        playerToGoalsMap.put("Dwight", 2);
        playerToGoalsMap.put("Jim", 20);

        for (String name : playerToGoalsMap.keySet()) {
            System.out.println(name);
        }

        playerToGoalsMap.forEach((key, val) -> System.out.println(key));

     Integer goalsByJim = 0;
        if (playerToGoalsMap.containsKey("Jim")) {
            goalsByJim = playerToGoalsMap.get("Jim");
        }
        System.out.println(goalsByJim);
    
  }
}
