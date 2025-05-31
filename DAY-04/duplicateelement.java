import java.util.Scanner;

public class duplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements in the array:");

        // Check for duplicates
        boolean hasDuplicate = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    hasDuplicate = true;
                    break; // Skip checking same number again
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}
