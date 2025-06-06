package day07;
import java.util.Scanner;
public class task {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        String reversed  = new StringBuilder(input).reverse().toString();
        System.out.print(reversed);

    }
    
}
