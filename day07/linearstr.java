package day07;
import java.util.Scanner;
public class linearstr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string:");
        String input = sc.nextLine();
        for (int i = 0; i< input.length(); i++){
            System.out.println(input.charAt(i));
        }
    }
    
}
