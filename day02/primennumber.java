package day02;
import java.util.Scanner;
public class primennumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num % 2 ==0 || num %3 == 0){
            System.out.println("It is  not a Prime number");

        }
        else{
            System.out.println("it is  a prime number");
        }
    }

}
    

