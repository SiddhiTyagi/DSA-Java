/**
 * PROBLEM NAME: The Continuous Sequence
 * 
 * DESCRIPTION:
 * Accepts an upper ceiling bound 'n' from a user and prints every whole digit 
 * sequentially starting from 1 up to and including 'n' on separate lines.
 * 
 * APPROACH:
 * Captures an integer limit variable. Implements a standard counting loop that 
 * executes starting from base index 1, terminating precisely when the incremental 
 * counter exceeds the user parameter.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

// import java.util.Scanner;
// public class LeetCodeWarmup {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.print("Enter the boundary digit: ");
//         int n=sc.nextInt();

//         System.out.println("The sequence is: ");
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//         sc.close();
//     }
// }

/**
 * PROBLEM NAME: The Double Factors Validator
 * 
 * DESCRIPTION:
 * Evaluates a single user-provided integer to verify if it is simultaneously 
 * a multiple of both 3 and 5.
 * 
 * APPROACH:
 * Captures a target number from the terminal console. Uses a conditional block 
 * armed with the logical AND operator (`&&`) combined with modulo operations 
 * to check dual divisibility before returning a status message.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class LeetCodeWarmup{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println(num+" is a multiple of both 3 & 5.");
        }else{
            System.out.println(num+" is NOT a multiple of both 3 & 5.");
        }
        sc.close();
    }
}


