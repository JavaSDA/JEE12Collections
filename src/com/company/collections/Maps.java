package com.company.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // A map is a collection interface that allows us to have key-value
        // pairs in a data structure.

        // A map is indexed using the keys.

        // Maps cannot have duplicate keys, i.e. each key has to be unique within a map.

        // there are 3 main implementations of a map.
        // HashMap: returns the keys in a random format, doesn't really care about
        // how the keys were entered, it doesn't bother to organize them.


        // TreeMap: organizes the keys in the natural ascending order, i.e numbers are
        // returned in ascending order and strings are returned in alphabetic order.

        // LinkedHashMap: this saves the manner in which the terms are added and returns them
        // in that particular order.


        Map<String, String> countries = new LinkedHashMap<>();

        // The put method is used to place a key-value pair into
        // the map.
        // It's also used to replace the value of the existing key.
        countries.put("Nigeria", "Abuja");
        countries.put("USA", "Washington D.C.");
        countries.put("China", "Hong Kong");
        countries.put("Japan", "Tokyo");

        // the keySet() method returns an array of all the keys in the map
        // the values() method returns an array of all the values in the map

        for (String country : countries.keySet()) {
            System.out.println("The capital of " + country + " is " + countries.get(country));
        }

        // Exercise: 5 mins.
        // Write a program that uses a Map to uniquely categorize 4 wild animals and the names of their kids.


        Map<String, String> countries1 = new LinkedHashMap<>();

        countries.put("Nigeria", "Abuja");
        countries.put("USA", "Washington D.C.");
        countries.put("China", "Hong Kong");
        countries.put("Japan", "Tokyo");

        // The == when used on an object checks if they are in the same location.
        // using the equals method on object checks the values of the objects.

        // if object.equals(object2) then you need cross-check object.hashCode() and object2.hashCode()
        // but if object.hashCode() == object.hashCode() then you don't need to confirm if object.equals(object2)

        Car car = new Car("Volvo", "suv");
        Car car1 = new Car("Ford", "suv");
        Car car2 = new Car("Ford", "suv");

        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.hashCode() == car2.hashCode());

        // 1. List (Highly used)
        // 2. Map
        // 3. Sets
        // 4. Queues and Deques.(Least used)


    }
}
