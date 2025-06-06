package day06;
import java.util.Scanner;
public class frequecyuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(), m;
        int arr[] = new int[n];

        system.out.println("Array values");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();        } 
        }

        Arrays.sort(arr);
        m=arr[arr.length-1];
        int cpy[] = new int[m +1];
        for (int i =0; i <arr.length; i++){
            cpy[arr[i]]++;
        }

        System.out.println("Duplicate numbers are:");
        for (int i = 0; i < cpy.length; i++) {
            if (cpy[i] > 1) {
                System.out.println(i);
            }
        }

        
    }
}
