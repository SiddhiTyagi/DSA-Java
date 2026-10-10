// Check whether an array is sorted or not.

import java.util.Scanner;
public class CheckIfSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 1; i < size; i++){
            if (arr[i] >= arr[i-1]){
                
            }else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}