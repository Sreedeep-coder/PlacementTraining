package day08;

class ModifierExamples {
    String defaultmessage = "I am default access within the same package. Accessible.";
    public String publicmessage = "I am public access anywhere. Accessible.";
    private String privatemessage = "I am private access within the same class.";

    private void displayprivate() {
        System.out.println(privatemessage);
    }

    public void displayall() {
        System.out.println(defaultmessage);
        System.out.println(publicmessage);
        displayprivate();
    }
}

public class oops {
    public static void main(String[] args) {
        ModifierExamples access = new ModifierExamples();
        access.displayall();
    }
}