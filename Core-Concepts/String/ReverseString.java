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
 * - Time Complexity: O()
 * - Space Complexity: O()
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter string = ");    
        char string[] = sc.next().toCharArray();

        int i = 0;
        int j = string.length - 1;
        
        while (i < j){
            char temp = string[i];
            string[i] = string[j];
            string[j] = temp;

            i++;
            j--;
        }
        System.out.println("Reverse of given string = "+new String(string));
        sc.close();
    }
}