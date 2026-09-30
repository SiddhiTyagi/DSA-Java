/**
 * PROBLEM NAME: Absolute Difference
 * 
 * DESCRIPTION:
 * Calculates the positive mathematical distance (absolute difference) between two 
 * dynamic user integers, ensuring the final output value is never negative.
 * 
 * APPROACH:
 * Accepts two integer values from the console. Subtracts the second input from 
 * the first. If the resulting difference drops below zero, a conditional structure 
 * transforms it into its positive counterpart before display.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first digit: ");
        double num1=sc.nextDouble();
        
        System.out.print("Enter second digit: ");
        double num2=sc.nextDouble();

        double difference=num1-num2;
        
        if(difference<0){
            difference=-difference;
        }
        System.out.println("Absolute difference between "+num1+" and "+num2+" = "+difference);
        sc.close();
    }
}
