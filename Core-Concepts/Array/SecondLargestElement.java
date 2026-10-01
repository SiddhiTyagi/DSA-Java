/**
 * PROBLEM NAME: Find the Second Largest Element
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and read their inputs to populate it. 
 * Then, scan through the array to find and print the second largest value present.
 * Assume all elements in the array are unique for this exercise.
 * 
 * APPROACH:
 * 1. Set up a Scanner to read the size and fill the array using a loop.
 * 2. Initialize two variables, `max` and `secondMax`, to the minimum possible integer value (`Integer.MIN_VALUE`).
 * 3. Loop through the array.
 * 4. If the current element is greater than `max`, update `secondMax = max` and then update `max = currentElement`.
 * 5. Else if the current element is greater than `secondMax` (and not equal to `max`), update `secondMax = currentElement`.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(3N) -> O(N)
 * - Space Complexity: O(N)
 */

import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element of array = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array = [");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);

            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>largest && arr[i]>slargest){
                slargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest Element = "+largest);
        System.out.println("Second Largest Element = "+slargest);
        System.out.println();
        sc.close();
    }
}
