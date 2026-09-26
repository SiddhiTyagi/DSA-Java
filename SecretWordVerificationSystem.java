/**
 * PROBLEM NAME: Secret Word Verification System
 * 
 * DESCRIPTION:
 * Matches a user's typed terminal string against a hardcoded system word literal 
 * to securely authorize or deny standard program access.
 * 
 * APPROACH:
 * Defines a static validation keyword inside the code text. Captures a user guess 
 * string. Implements the strict character-matching method `.equals()` rather than 
 * reference operators to safely check text equivalence.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;

public class SecretWordVerificationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter word for verification: ");
        String input=sc.next();

        String verificationWord="SIDDHI";

        while(!input.equals(verificationWord)){
            System.out.println("VERIFICATION WORD NOT MATCHED!");
            System.out.println("Enter word for verification: ");
            input=sc.next();
        }
        System.out.println("VERIFICATION COMPLETE!");
        sc.close();
    }
}