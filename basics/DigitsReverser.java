/**
 * PROBLEM NAME: Digits Reverser
 * 
 * DESCRIPTION:
 * Reverses the numerical ordering of a user-entered integer, ensuring that if 
 * the original input was negative, the output remains negative.
 * 
 * APPROACH:
 * Main method reads the raw value and invokes `reverseDigits(int num)`. The method 
 * uses an initial flag check to track negative parameters. It strips trailing digits 
 * using modulo math, expands the placement, and reduces the base.
 * 
 * COMPLEXITY:
 * - Time Complexity: 
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class DigitsReverser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number = ");
        int num=sc.nextInt();

        int result=reverseDigits(num);

        if(num<0){
            System.out.println("-"+result);
        }else{
            System.out.println(result);
        }
        sc.close();
    }
    public static int reverseDigits(int num){
        int reversedNum=0;
        if(num<0){
            num=-num;
        }
        while(num>0){
            int lastDigit=num%10;
            reversedNum=(reversedNum*10) + lastDigit;
            num=num/10;
        }
        return reversedNum;
    }
}