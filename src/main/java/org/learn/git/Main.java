package org.learn.git;

import java.util.HashMap;
import java.util.Map;
import org.learn.git.model.Spotify;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Song World!");

    // TODO :: If it were mutable, then the hashcode() value or equals() condition might change, and
    // you would never be able to retrieve the key from your HashMap
    Map<Spotify, String> map = new HashMap<>();

    Spotify one = new Spotify(1,"Maa");
    Spotify two = new Spotify(1,"Maa");

    // TODO :: 2 equal objects, they have same hashcode
    //  2 objects have same hashcode, they are NOT equal
    map.put(one, "MP3");
    map.put(two, "MP4");

    System.out.println(map);
    System.out.println(map.size());
  }
}