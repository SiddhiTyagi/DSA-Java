/**
 * PROBLEM NAME: Modulo Multiplier Check
 * 
 * DESCRIPTION:
 * Accepts a dynamic dividend and divisor from the user to verify mathematical 
 * divisibility. Employs defensive programming to gracefully handle division-by-zero.
 * 
 * APPROACH:
 * Using Java's Scanner class for real-time console input. It implements an 
 * initial logical guard check (`divisor == 0`) before using the modulo (`%`) 
 * operator to determine if the remainder is exactly zero.
 * 
 * COMPLEXITY:
 * Time Complexity: O(1) - The mathematical evaluation executes in constant time.
 * Space Complexity: O(1) - Only minimal integer variables are allocated in memory.
 */

import java.util.Scanner;
public class ModuloMultiplierCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to be divided (Dividend): ");
        int num=sc.nextInt();

        System.out.print("Enter the number to divide by (Divisor): ");
        int divisor=sc.nextInt();

        if(divisor==0){
            System.out.println("Error! The dividend can't be zero.");
        }else if(num%divisor==0){
            System.out.println(num+" is completely divisible by "+divisor);
        }else{
            System.err.println(num+" is NOT completely divisible by "+divisor);
        }
        sc.close();
   }
}


