package day13;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;
public class queue {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        int a,b,c,d,e;

        a = s1.nextInt();
        b = s1.nextInt();
        c = s1.nextInt();
        d = s1.nextInt();
        e = s1.nextInt();

        
        
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.add(s1.nextInt());
        dq.removeLast();
        Iterator<Integer>itr = dq.iterator();
        System.out.println(" ");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        

    }
    
}
