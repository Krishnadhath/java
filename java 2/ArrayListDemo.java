import java.util.*;

public class ArrayListDemo {

    public static void main(String args[]) {

        // Create ArrayList
        ArrayList<String> list =
                new ArrayList<String>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("PHP");

        System.out.println("Original List:");
        System.out.println(list);

        // Add element at specific position
        list.add(2, "C");

        System.out.println("\nAfter Adding C:");
        System.out.println(list);

        // Remove element
        list.remove("PHP");

        System.out.println("\nAfter Removing PHP:");
        System.out.println(list);

        // Search element
        if (list.contains("Java")) {

            System.out.println(
                    "\nJava found in list");
        }

        // Get element
        System.out.println(
                "\nElement at index 1: "
                + list.get(1));

        // Replace element
        list.set(1, "JavaScript");

        System.out.println(
                "\nAfter Replacing:");
        System.out.println(list);

        // Size of list
        System.out.println(
                "\nSize of ArrayList: "
                + list.size());

        // Display using loop
        System.out.println("\nAll Elements:");

        for (String s : list) {

            System.out.println(s);
        }
    }
} 
    

