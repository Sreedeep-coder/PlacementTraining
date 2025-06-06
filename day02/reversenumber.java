import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;         
            reversed = reversed * 10 + digit; 
            number = number / 10;            
        }

        System.out.println("Reversed number is: " + reversed);

        
    }
}