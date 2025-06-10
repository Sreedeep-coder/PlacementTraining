package day13;
import java.util.*;
public class problem {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        queue.offer("Date");
        System.out.println("Original Queue: " + queue);
        if (!queue.isEmpty()) {
            LinkedList<String> list = (LinkedList<String>) queue;
            String removed = list.removeLast();
            System.out.println("Removed from back: " + removed);
        } else {
            System.out.println("Queue is empty.");
        }
        System.out.println("Remaining Queue elements:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
