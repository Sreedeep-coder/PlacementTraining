package day12;
import java.util.ArrayList;
import java.util.Collections;
public class colletions {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add("zyer");
        al.add("asdf");
        al.add("bjik");
        al.add("iopu");
        Collections.shuffle(al);
       
        System.out.println(al);
    }
    
}
