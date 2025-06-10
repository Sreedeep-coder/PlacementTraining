package day13;
import java.util.*;
class Order {
    String OrderID;
    String CustomerName;
    public Order (String OrderID, String CustomerName){
        this.OrderID = OrderID;
        this.CustomerName = CustomerName;
    }
}    
public class swiggyorder{
    public static void main(String[]args){
        Queue <Order> orderqueue = new LinkedList<>();

        orderqueue.add(new Order("ORD101", "Sreedeep"));
        orderqueue.add(new Order("ORD101", "prem"));
        orderqueue.add(new Order("ORD101", "Bharath"));
        orderqueue.add(new Order("ORD101", "gangster"));
        while (!orderqueue.isEmpty()){
            Order currentOrder = orderqueue.poll();
            System.out.println("preparing order"+currentOrder.OrderID+"for "+ currentOrder);
            for (int i =0; i <3; i++){
                try{
                    Thread.sleep(1000);}
                    catch (Exception e){}
                    System.out.print(".");
            }
        }
    }

}