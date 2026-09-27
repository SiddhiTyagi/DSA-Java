/**
 * PROBLEM NAME: The Factorial Product Engine
 * 
 * DESCRIPTION:
 * Calculates the mathematical factorial product of a positive user integer 
 * (e.g., 5! = 1 * 2 * 3 * 4 * 5 = 120) using a dedicated calculation method.
 * 
 * APPROACH:
 * Main method reads the limit via Scanner and passes it into a separate custom function 
 * `public static int calculateFactorial(int n)`. The function runs a tracking loop, 
 * multiplying a running total accumulator variable sequentially up to `n`, then returns 
 * the computed integer back to main.
 * 
 * HOLY GRAIL EDGE-CASE TRAP:
 * Mathematically, the factorial of 0 is exactly 1 (0! = 1). How can you wrap your 
 * loop or an early check to make sure if a user inputs 0, it correctly returns 1?
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class FactorialProductEngine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int factorial=1;
        
        while(num<0){
            System.out.println("FACTORIAL OF NEGATIVE NUMBER IS NOT POSSIBLE!");
            System.out.print("Enter number: ");
            num=sc.nextInt();
        }
        
        if(num==0){
            System.out.println("Factorial of "+num+" = "+factorial);
        }else{
            System.out.print("Factorial of "+num+" = ");
            for(int i=1;i<=num;i++){
                System.out.print(i);
                factorial=factorial*i;
                
                if(i+1<=num){
                    System.out.print(" * ");
                }
            }
             System.out.print(" = "+factorial);
             System.out.println();
        }
        sc.close();
    }
}
