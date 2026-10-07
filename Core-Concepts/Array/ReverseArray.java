/**
 * PROBLEM NAME: Reverse an Array
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and populate it.
 * Reverse the elements of the array in-place.
 * Print the final reversed array.
 * 
 * APPROACH:
 * 1. Read size and populate the array using a Scanner loop.
 * 2. Create two pointer variables: `left = 0` and `right = size - 1`.
 * 3. Run a loop while `left < right`.
 * 4. Swap `arr[left]` and `arr[right]` using a temporary variable `temp`.
 * 5. Move `left` forward (`left++`) and `right` backward (`right--`).
 * 
 * COMPLEXITY:
 * - Time Complexity: O()
 * - Space Complexity: O()
 */

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            arr[i] = sc.nextInt();
        }

        

        sc.close();
    }
}