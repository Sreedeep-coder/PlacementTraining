abstract  class service{
    int a = 10;
    void settings(){

    }
    abstract void profile();

}
class Sreedeep extends service{
    void profile(){
        System.out.println("I will do this work ");
    }
}
public class abst {
    public static void main(String[] args) {
        Sreedeep klu = new Sreedeep();
        klu.settings();
        klu.profile();
    }

}