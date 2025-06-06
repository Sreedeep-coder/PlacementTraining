interface hr{
    int a = 10;
    void display();
}

interface finance{
    void budget();
}

interface Operations{
    void SOP();
}

class office implements hr, finance, Operations{
    public void display(){
        System.out.println("This is data Member of Interface " + a);
    }
    public void budget(){
        System.out.println("Budget from finance");
    }
    public void SOP(){
        System.out.println("standard operating procedure from Operations");
    }
}

public class Main {
    public static void main(String[] args){
        office o = new office();
        o.display();
        o.budget();
        o.SOP();
    }
}