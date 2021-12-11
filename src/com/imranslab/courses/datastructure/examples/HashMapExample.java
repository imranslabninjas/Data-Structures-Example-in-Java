package com.imranslab.courses.datastructure.examples;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Mercury", 100);
        map.put("Venus", 200);
        map.put("Earth", 300);
        map.put("Mars", 400);
        map.put("Saturn", 500);
        map.put("Jupiter", 600);
        map.put("Neptune", 700);
        map.put("Pluto", 800);

        System.out.println("Size of map is" + map.size());

        System.out.println(map);

        if (map.containsKey("Earth")) {

            Integer a = map.get("Earth");

            System.out.println("value for key" + " \"Earth\" is:" + a);
        }
    }
}
