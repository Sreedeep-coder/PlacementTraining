package day08;

class Outer {
    static class StaticInner {
        void display2() {
            System.out.println("hi this is Static inner class");
        }
    }
}

public class staticclass {
    public static void main(String[] args) {
        Outer.StaticInner sobj = new Outer.StaticInner();
        sobj.display2();
    }
}