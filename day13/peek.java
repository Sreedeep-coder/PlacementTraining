package day13;
import java.util.Queue;
import java.util.PriorityQueue;
public class peek {
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<Integer>();
        queue.offer(4);
        queue.offer(8);
        queue.offer(12);
        queue.offer(16);
        queue.offer(20);
        System.out.println(queue);
        System.out.println("The removed element is :"+queue.poll());
        System.out.println(queue);
        System.out.println("the head is :"+queue.peek());
    }
    
}
