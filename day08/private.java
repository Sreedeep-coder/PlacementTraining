package day08;

class Outer {
    private String Z = "Private Message";

    class Inner {
        void display() {
            System.out.println(Z);
        }
    }
}

public class private {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inobj = obj.new Inner();
        inobj.display();
    }
}