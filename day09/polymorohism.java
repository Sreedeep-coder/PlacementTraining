class overloading {
    int add(int a, int b){
        return a+b;
    }
    int add (int a ){
        return ++a;
    }
    double add(double a, double b){
        return a+b;
    }
    char[] add (char a[]){
        return a;
    }
    String add (String a , String b){
        return a+b;
    }
}

public class polymorohism{
    public static void main(String[]args){
        overloading metho_dover_loding = new overloading();
        char a[] = {'a', 'b'};
        System.out.println(metho_dover_loding.add(12,22));
    }
}