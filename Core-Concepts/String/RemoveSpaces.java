/**
 * PROBLEM NAME: Remove All Spaces from a String
 *
 * DESCRIPTION:
 * Given a string, remove all space characters and
 * print the resulting string.
 *
 * EXAMPLE:
 * Input: Java is fun
 * Output: Javaisfun
 *
 * Example 2:
 * Input: I love coding
 * Output: Ilovecoding
 *
 * APPROACH:
 * 1. Take a string as input.
 * 2. Create a new string to store the result.
 * 3. Traverse the original string character by character.
 * 4. Check whether the current character is a space.
 * 5. If it is not a space, add it to the result.
 * 6. Print the resulting string.
 *
 * COMPLEXITY:
 * - Time Complexity: O(n)
 * - Space Complexity: O()
 */

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter sentence = ");
        String input = sc.nextLine();
        
        System.out.println(input.replace(" ",""));
        sc.close();
    }
}