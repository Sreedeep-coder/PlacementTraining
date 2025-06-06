class Car {
    int model_no;
    String brand;
     Car (int model_no){
        this.model_no = model_no;
     }
    Car(int model_no, String brand){
        this.model_no = model_no;
        this.brand = brand;
    }
    void show(){
        System.out.println("model Number "+ this.model_no);
        System.out.println("Brand:"+this.brand);
    }
}

public class over2{
    public static void main(String[] args){
        Car Benz = new Car(2015,"Benz");
        Benz.show();
    }
}
