public class mathematics {
    void formula(){
        System.out.println("(A+B)^2 = A^2 + 2AB + B^2");
    }
    
}
class chemistry extends mathematics{
    void display(){
        System.out.println("Nothing");

    }
}
public class math{
    public static void main(String[] args){
        chemistry ch = new chemistry();
    }

}