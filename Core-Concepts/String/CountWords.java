/**
 * PROBLEM NAME: Count Words in a String
 *
 * DESCRIPTION:
 * Given a sentence, count the number of words in it.
 * Words are separated by spaces. The sentence may
 * contain multiple consecutive spaces.
 *
 * EXAMPLE:
 * Input: Java is fun
 * Output: 3
 *
 * Example 2:
 * Input: Learn  Java   daily
 * Output: 3
 *
 * APPROACH:
 * 1. Take a sentence as input.
 * 2. Initialize a variable to count the words.
 * 3. Traverse the sentence character by character.
 * 4. Identify when a new word begins.
 * 5. Increase the count whenever a new word begins.
 * 6. Print the total number of words.
 *
 * COMPLEXITY:
 * - Time Complexity: O()
 * - Space Complexity: O()
 */

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter sentence = ");
        String input = sc.nextLine();

        int count = 0;

        for (int i = 1; i <= input.length(); i++) {
            if (input.charAt(i-1) == ' ' && input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words in given string = "+count);
        sc.close();
    }
}