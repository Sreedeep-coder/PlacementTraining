package day07;
import java.util.*;
public class findleaderelementsright{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nummber");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >0; i--){
            if (arr [i]> temp){
                temp = arr[i];
                cpy[i] = temp;
            }
        }
        for (int i : cpy){
            if (i!=0){
                System.out.print(i+" ");
            }
        }
    }
}