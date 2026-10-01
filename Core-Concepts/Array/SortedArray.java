/**
 * PROBLEM NAME: Check if Array is Sorted
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and populate it with integers.
 * Scan through the array to check if the elements are sorted in non-decreasing (ascending) order.
 * Print "Sorted" if it is, or "Not Sorted" otherwise.
 * 
 * APPROACH:
 * 1. Read array size and populate elements via Scanner loop.
 * 2. Create a boolean flag `isSorted` initialized to true.
 * 3. Loop from index 0 up to `size - 2` (the second-to-last element).
 * 4. Compare the current element `arr[i]` with the next element `arr[i + 1]`.
 * 5. If any current element is strictly greater than the next element, flip the flag to false and break out of the loop early.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(3N) -> O(N)
 * - Space Complexity: O(N)
 */

import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array = ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
    
        for(int i=0;i<size;i++){
        System.out.print("Enter "+(i+1)+" element = ");
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

    boolean isSorted = true;
    for(int i=0;i<size-1;i++){
        if(arr[i]>arr[i+1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("The above array is sorted");
    }else{
        System.out.println("The above array is NOT sorted");
    }
    System.out.println();
    sc.close();
}
}