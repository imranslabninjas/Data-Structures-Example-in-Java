package com.company;// Java program to illustrate HashMap class of java.util

// Importing HashMap class
import java.util.HashMap;

// Main class
public class HashMapExample {

    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard add() method
        map.put("Mercury", 100);
        map.put("Venus", 200);
        map.put("Earth", 300);
        map.put("Mars", 400);
        map.put("Saturn", 500);
        map.put("Jupiter", 600);
        map.put("Neptune", 700);
        map.put("Pluto", 800);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Earth")) {

            // Mapping
            Integer a = map.get("Earth");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"Earth\" is:" + a);
        }
    }
}
