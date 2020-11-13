package com.java.interview.exercise.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ModificationError {
    public static void main(String args[]) {

        // Creating an object of ArrayList Object
        ArrayList<String> arr
                = new ArrayList<String>();

        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");

        try {
            // Printing the elements
            System.out.println(
                    "ArrayList: ");
            Iterator<String> iter = arr.iterator();

            arr.removeIf(val->val.startsWith("T"));

            for (Iterator<String> itr = arr.iterator(); itr.hasNext(); ) {
                String phone = itr.next();
                if (phone.startsWith("Three")) {
                    itr.remove(); // right call
                }
            }
            System.out.println("list after removal: " + arr);

            /*while (iter.hasNext()) {
                System.out.print(iter.next() + ", ");
                // ConcurrentModificationException is raised here as an element is added during the iteration
                System.out.println("\n\nTrying to add an element in between iteration\n");
                arr.add("Five");
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
