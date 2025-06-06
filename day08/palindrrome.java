package day08;
import java.util.Scanner;
public class palindrrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
         String original = sc.nextLine();
         String original1 = new StringBuilder(original).reverse().toString();
         if (original.equals(original1)){
            System.out.print("it is plaindrome");
         }else {
            System.out.println("it is not a palindrome");
         }
    }
    
}
