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

//        languages.remove("Lisp"); // .remove() method returns true/false
        if (languages.remove("Algol", "an algorythmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        // .replace()
        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language eith impreative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));

        // .keySet() method and iterating through the map. No guaranteed order.
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
