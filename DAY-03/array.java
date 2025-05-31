import java.util.Scanner;
public class array {
    public static void main(String[] args){;
        Scanner sc = new Scanner(System.in);
        int[] ECE_F = new int[5];

        for (int i = 0; i < 5; i ++){
            ECE_F[i] = sc.nextInt();
        }
        for (int i = 0; i < 5 ; i++){
            System.out.print("Roll no "+ ECE_F[i]);
        }
    
    }
    
}
