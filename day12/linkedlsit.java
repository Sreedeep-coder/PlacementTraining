package day12;
import java.util.LinkedList;
public class linkedlsit {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add("milkshake:");
        ll.add(108);
        ll.add(9.7);
        ll.addFirst("My name");
        ll.addLast("your name");
        ll.add(2015);
        System.out.println(ll);
    }
    
}

