package day13;
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Queue<String>queue = new LinkedList();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(queue.peek());
            System.out.print(queue.poll()+" ");

        }
        System.out.println("n")
    }
}
