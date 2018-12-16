package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorythmic language");
        System.out.println(languages.put("BASIC", "Beginners all purpose symbolic instruction code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println(languages.put("Java", "This course is about Java"));
        System.out.println(languages.get("Java")); // value gets overwritten if the same key is used

        System.out.println("=======================================");

        //.keySet() method and iterating through the map. No guaranteed order.
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
