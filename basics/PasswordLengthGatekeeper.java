/**
 * PROBLEM NAME: Password Length Gatekeeper
 * 
 * DESCRIPTION:
 * Evaluates a user-entered password string to ensure it meets an enterprise-standard 
 * minimum safety threshold of 8 characters or more.
 * 
 * APPROACH:
 * Captures the user's password string using the Scanner. Employs the built-in 
 * `.length()` method on the string variable inside a conditional statement to verify 
 * if the total number of characters satisfies the system gatekeeping rule.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class PasswordLengthGatekeeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Create Password (Min 8 characters): ");
        String password=sc.next();

        while(password.length()<8){
            System.out.println("PASSWORD NOT CREATED!");
            System.out.print("Create Password Again (Min 8 characters): ");
            password=sc.next();
        }
        System.out.println("Password created.");
        sc.close();
    }
}
