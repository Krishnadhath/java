import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String args[]) {

        // Create LinkedHashSet object
        LinkedHashSet<String> set =
                new LinkedHashSet<String>();

        // Add elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("Java"); // Duplicate
        set.add("C++");

        // Display set
        System.out.println("LinkedHashSet:");
        System.out.println(set);

        // Remove element
        set.remove("Python");

        System.out.println(
                "\nAfter Removing Python:");
        System.out.println(set);

        // Search element
        if (set.contains("Java")) {

            System.out.println(
                    "\nJava is present");
        }

        // Size of set
        System.out.println(
                "\nSize of Set: "
                + set.size());

        // Traverse set
        System.out.println("\nElements:");

        for (String s : set) {

            System.out.println(s);
        }
    }
} 
    

