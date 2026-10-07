/**
 * PROBLEM NAME: Linear Search / Find Element Index
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and populate it.
 * Ask the user for a target element to search for.
 * Find the first occurrence of the target and print its index.
 * If not found, print an appropriate message.
 * 
 * APPROACH:
 * 1. Read size and populate the array using a Scanner.
 * 2. Read the target integer from the user.
 * 3. Create a tracking variable (e.g., `int foundIndex = -1`).
 * 4. Loop through the array from index 0 to size - 1.
 * 5. If `arr[i] == target`, update `foundIndex = i` and break out of the loop.
 * 6. After the loop, check if `foundIndex` is still `-1` or has changed to print the result.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N)
 * - Space Complexity: O(N) / O(1) Auxiliary Space
 */

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++) {
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array = [");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]);

            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        System.out.print("Enter target element = ");
        int target = sc.nextInt();
        int index = -1;

        for(int i = 0; i<size; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }

        if(index!=-1){
            System.out.println(target+" found at index "+index+".");
        }else{
            System.out.println(target+" NOT found.");
        }
        sc.close();
    }
}
