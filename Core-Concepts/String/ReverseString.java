/**
 * PROBLEM NAME: Reverse String
 *
 * DESCRIPTION:
 * Given an array of characters, reverse the array in place.
 * The goal is to reverse the order of the characters without
 * creating another array for the result.
 *
 * APPROACH:
 * 1. Identify the positions of the characters at the beginning
 *    and the end of the array.
 * 2. Use an appropriate technique to reverse their positions.
 * 3. Continue until the required reversal is complete.
 * 4. Ensure that the original array contains the reversed characters.
 *
 * COMPLEXITY:
 * - Time Complexity: O(2n) - O(n)
 * - Space Complexity: O(n)
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String input = sc.next();

        char arr[] = input.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed string = "+ String.valueOf(arr));
        sc.close();
    }
}