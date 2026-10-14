/**
 * PROBLEM NAME: Count Vowels in a String
 *
 * DESCRIPTION:
 * Given a string, count the number of vowels in it.
 * Consider both uppercase and lowercase vowels.
 *
 * EXAMPLE:
 * Input: Education
 * Output: 5
 *
 * APPROACH:
 * 1. Take a string as input.
 * 2. Check each character of the string.
 * 3. If the character is a vowel, increase the count.
 * 4. Print the total number of vowels.
 *
 * COMPLEXITY:
 * - Time Complexity: O(n)
 * - Space Complexity: O()
 */

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter string = ");
        String input = sc.next().toLowerCase();
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels = "+count);
        sc.close();
    }
}