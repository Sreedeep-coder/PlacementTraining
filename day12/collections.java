package day12;
import java.util.ArrayList;
public class collections {
    public static void main(String[] args){
        //List l = new List(); we can't (Interface)
        ArrayList al = new ArrayList<>();
        al.add(99);
        al.add("Sreedeep");
        al.add(733737);
        al.add("i was broken from an young age");
        al.remove("i was broken from an young age");
        al.set(0,22);
        int s = (int) al.get(0);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("Sreedeep"));
        System.out.println(al.indexOf("Sreedeep"));
        System.out.println(al.lastIndexOf("i was broken from an young age"));
        al.forEach(System.out::println);
        al.clear();
        System.out.println(al);
        newlist.addAll(al);
        al.removeAll(newlist);
        System.out.println(al);


    }
    
}
