package day13;
import java.util.Queue;
import java.util.PriorityQueue;
public class hi {
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);
        System.out.println("the head is :"+queue.peek());
    }   
}
