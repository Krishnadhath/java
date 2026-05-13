import java.util.*;

public class PriorityQueueDemo {

    public static void main(String args[]) {

        // Create PriorityQueue object
        PriorityQueue<String> q =
                new PriorityQueue<String>();

        // Add elements
        q.add("Java");
        q.add("Python");
        q.add("C");
        q.add("C++");

        System.out.println("Priority Queue:");
        System.out.println(q);

        // Display first element
        System.out.println(
                "\nHead Element: "
                + q.peek());

        // Remove first element
        System.out.println(
                "\nRemoved Element: "
                + q.poll());

        // Queue after removal
        System.out.println(
                "\nQueue after poll:");
        System.out.println(q);

        // Traverse queue
        System.out.println("\nQueue Elements:");

        for (String s : q) {

            System.out.println(s);
        }
    }
} 
    

