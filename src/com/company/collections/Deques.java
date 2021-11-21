package com.company.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        // Deque is a double-ended queue.
        // it allows us to manipulate items at the top and bottom of the deque.

        Deque<String> names = new ArrayDeque<>();
//        names.addFirst("David");
//        names.add("James");
//        names.addLast("Fred");
//        names.addLast("Frank");
//        names.addFirst("Barry");

        names.pollFirst();
        names.pollLast();


        System.out.println(names.pollFirst());
    }
}
