/**
 * PROBLEM NAME: Find the Maximum Element (Dynamic Input)
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and read their inputs to populate it. 
 * Then, scan through the array to find and print the largest (maximum) value present.
 * 
 * APPROACH:
 * 1. Set up a Scanner to read the size and fill the array using a loop.
 * 2. Initialize a variable `max` to hold the very first element (`firstArray[0]`).
 * 3. Loop through the array from index 1 to the end.
 * 4. Compare each element to `max`. If `firstArray[i] > max`, update `max = firstArray[i]`.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(3N) -> O(N)
 * - Space Complexity: O(N)
 */

import java.util.Scanner;
public class MaxElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int[] firstArray=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element = ");
            firstArray[i]=sc.nextInt();
        }

        System.out.print("Array = [");
        for(int i=0;i<size;i++){
            System.out.print(firstArray[i]);

            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int largest=firstArray[0];
        for(int i=0;i<size;i++){
            if(firstArray[i]>largest){
                largest=firstArray[i];
            }
        }
        System.out.println("Maximum element in the above array = "+largest);
        System.out.println();
        sc.close();
    }
}