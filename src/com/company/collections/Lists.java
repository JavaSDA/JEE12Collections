package com.company.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        // A List is an ordered collection. i.e. it is indexed.
        // Indexing as we know starts from 0 in Java.
        // Lists have the ability to store duplicates.

        // the add() of sets returns a boolean and can be used
        // to filter duplicates.
//        Set<String> names = new HashSet<>();
//        System.out.println(names.add("harry"));
//        System.out.println(names.add("harry"));
        List<String> listImplementation;

        // Two main implementations of the List:
        // ArrayList:
        // Essentially works like an array. The main differences is that,
        // - you don't have to declare the size of the ArrayList at initialization,
        // - you can add as many items as you want to the ArrayList.

        listImplementation = new LinkedList<>();
        listImplementation.add("David");
        listImplementation.add("Fred");
        listImplementation.add("Johnson");
        listImplementation.add("Derrick");
        listImplementation.add(2, "Harvey");

        for (int i = 0; i < listImplementation.size(); i++) {
            // The get method allows us to find the element at a
            // given index.
            System.out.println(listImplementation.get(i));
        }

//        System.out.println(getAverage());

    }

    public static Float getAverage() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        float sum = 0;
        List<Integer> numbers = new ArrayList<>();
        // populate the list

        System.out.println("Enter any string to stop.");

        // Start the prompt outside in order to catch the value that the
        // hasNextInt() method was receiving.
        System.out.print("Enter a number: ");
        while (scanner.hasNextInt()) { // hasNext() checks if another value was entered and returns a boolean
            System.out.print("Enter a number: ");
            int nextValue = scanner.nextInt();
            double nextString = scanner.nextDouble();
            numbers.add(nextValue);
        }

        // Add the numbers together.
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum / numbers.size();

    }
}
