/**
 * PROBLEM NAME: String Concatenation (Full Name Generator)
 * 
 * DESCRIPTION:
 * Simulates a text profile generation tool by reading separate name components 
 * and assembling them into a uniform full-name output.
 * 
 * APPROACH:
 * Uses the Scanner class to read dynamic text tokens (`String`) from the terminal. 
 * It combines the separate string components using the `+` operator, inserting a 
 * space character literal in between them for proper formatting.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N) - String concatenation takes linear time relative to 
 *   the length of the combined characters.
 * - Space Complexity: O(N) - A new string object is created to store the combined result.
 */

import java.util.Scanner;
public class StringConcatenation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName=sc.next();

        System.out.println("Enter the last name: ");
        String lastName=sc.next();

        String fullName=firstName+" "+lastName;
        System.out.println("Full Name is "+fullName+".");
    }
}
