/**
 * PROBLEM NAME: Count Digits in a String
 *
 * DESCRIPTION:
 * Given a string, count how many characters are digits (0-9).
 *
 * EXAMPLE:
 * Input: hello123
 * Output: 3
 *
 * APPROACH:
 * 1. Take a string as input.
 * 2. Traverse each character using a loop.
 * 3. Check whether each character is a digit.
 * 4. Increase the count when a digit is found.
 * 5. Print the final count.
 *
 * COMPLEXITY:
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter string = ");
        String input = sc.next();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of digits in given string = "+count);
        sc.close();
    }
}