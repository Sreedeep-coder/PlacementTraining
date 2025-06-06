package day08;

class priya{
    priya(){
        System.out.println("This is priya constructor");
    }
    priya(int a){
        System.out.println("This is parameterized constructor INT "+a);

    }
    priya(double a){
        System.out.println("This is paramerized constructor DOUBLE"+a);

    }
}
public class parameterizedconstructor {
    public static void main(String[] args) {
        priya Sreedeep = new priya(10.0);       
    }

    
}
