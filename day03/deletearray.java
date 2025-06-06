import java.util.*;
public class deletearray{

  public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.remove(2); // remove element at index 2 (value 3)
        System.out.println(list); // Output: [1, 2, 4, 5]
    }
}

    

