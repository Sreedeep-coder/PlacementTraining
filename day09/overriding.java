class Animalsound {
    void sound(){
        System.out.println("Animal Makes sound ");

    }    
}
class Dog extends Animalsound
{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animalsound
{
    void sound(){
        System.out.println("Meows");
    }
}
public class overriding{
    public static void main(String[]args){
        Animalsound animal =  new Animalsound();
        animal.sound();
        Dog  chimtu = new Dog();
        chimtu.sound();
        Cat guru = new Cat();
        guru.sound();
    }
}