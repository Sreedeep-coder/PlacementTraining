package day13;
import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(20);
       
        Object[] array = queue.toArray();
        System.out.println("array");
        for (Object element : array) {
            System.out.println(element);
        }
    }
}
