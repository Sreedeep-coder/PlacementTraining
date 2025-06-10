
import java.util.Scanner;
public class ntableusingusingwhielloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n table number :");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("multiplication table of "+n+ ":");
        while (i <= 10){
            System.out.println(n + "x"+i+ "="+(n*i));
            i++;
        }
    }
    
}
