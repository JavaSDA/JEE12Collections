package com.company.collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // parameterization
        // A queue is a collection interface that allows us to implement
        // FIFO and LIFO techniques.
        // FIFO- First-In-First-Out
        // LIFO - Last-In-First-Out
        // The primary or major implementation of a Queue is a linkedList.
        Queue<String> queue = new LinkedList<>();

//        queue.add("David");
//        queue.add("Fred");
//        queue.add("Johnson");
//        queue.add("Derrick");

        // --- add item to queue ---
        // offer() - returns true if the item was successfully added to the queue.
//        System.out.println(queue.offer("James"));

        // --- Return first item on queue ---
        // element() - returns an item from the front of the queue and returns an error when
        // there is no element in the queue.
        /*try {
            System.out.println(queue.element());
        } catch (NoSuchElementException e) {
            System.out.println("There is currently no item in the queue. Please Try again later.");
        }*/

        // peek() - works almost exactly the same as the element() but doesn't return an error if
        // there is no element in the queue.
//        System.out.println(queue.peek() == null ? "There's no item in the queue" : queue.peek());

        // ---Remove items ---
        // remove() - this just removes an item from the head of the queue, works similarly to the
        // element() method by throwing a NoSuchElementException if the queue is empty
//        System.out.println(queue.remove());

        // poll() - also removes item from the head of the queue, but does not throw any exception,
        // if empty.
//        System.out.println(queue.poll());


    }
}
