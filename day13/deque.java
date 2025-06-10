package day13;
import java.util.ArrayDeque;
public class deque {
    public static void main(String[] args) {
        ArrayDeque<String> dequeu = new ArrayDeque<String>();
        dequeu.add("day");
        dequeu.add("each");
        dequeu.add("make");
        dequeu.add("masterpiece");
        System.out.println("Deque elements:");
        for (String s : dequeu) {
            System.out.println(s);
        }
        dequeu.addFirst("start");
        dequeu.addLast("end");
        System.out.println("After addFirst and addLast:");
        for (String s : dequeu) {
            System.out.println(s);
        }
    }
}