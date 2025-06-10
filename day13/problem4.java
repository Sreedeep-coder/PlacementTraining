package day13;
import java.util.*;
public class problem4 {
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i =1; i <=200; i++){
            q.add(i);
        }
        Iterator<Integer>itr = q.iterator();
        while (itr.hasNext()){
            if (q.peek()%2 ==0){
                System.out.print(q.poll()+",");
            }
            else q.poll();
        }
       
        
    }
    
}
