package day12;

class encap {
    private int  data = 404;

    public int wrap(){
        return data;
    }
}
public class encapsu {
    public static void main(String[] args) {
        encap cap = new encap();
        System.out.println(cap.wrap());
        
    }
}
