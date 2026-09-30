/**
 * PROBLEM NAME: Age Gate
 * 
 * DESCRIPTION:
 * Processes a user's age via an evaluation function to check if they meet an 
 * industry-standard voting eligibility threshold of 18 years or older.
 * 
 * APPROACH:
 * Main captures an integer age. It calls `isEligible(int age)`. The method 
 * evaluates the conditional parameter threshold and returns a boolean state flag.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(1)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class AgeGate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter age: ");
        int age=sc.nextInt();

        boolean gatekeeper= isEligible(age);

        if(gatekeeper){
            System.out.println("Candidate is eligible to vote.");
        }else{
            System.out.println("Candidate is NOT eligible to vote.");
        }
        sc.close();
    }
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}
