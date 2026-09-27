/**
 * PROBLEM NAME: LeetCode #231 - Power of Two
 * 
 * DESCRIPTION:
 * Evaluates a dynamic user integer to determine if it is a perfect power of two 
 * (e.g., 1, 2, 4, 8, 16...). Returns true if it matches the criteria, otherwise false.
 * 
 * APPROACH:
 * Employs an isolated evaluation method `isPowerOfTwo(int n)`. It implements an 
 * initial gatekeeper check to discard values <= 0. It then enters a loop that 
 * repeatedly divides the integer by 2, verifying that no odd remainders are left behind.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class LeetCodeEasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number = ");
        int num=sc.nextInt();

        System.out.print(num);

        while(num<=0){
            if(num==0){
                System.out.print(" is NOT a perfect power of two!");
                break;
            }else{
                System.out.print(" is NOT a perfect power of two!");
                break;
        }
    }

    if(num==1){
        System.out.print(" is a perfect power of two!");
    }
        while(num%2!=0){
            System.out.print(" is NOT a perfect power of two!");
            break;
        }

        for(int i=1;i<=num;i++){
            while(num%2==0){
                num=num/2;
            }
            if(num==1){
                System.out.print(" is a perfect power of two!");
            }
        }
        sc.close();
    }
}

