/**
 * PROBLEM NAME: Leap Year
 * 
 * DESCRIPTION:
 * Prompts the user for a specific calendar year and determines its leap status 
 * based on three interlocking mathematical constraints using a custom method.
 * 
 * APPROACH:
 * Passes the year integer to `checkLeapYear(int year)`. Evaluates the divisible by 4 rule, 
 * handles the centenary year exception (divisible by 100), and validates against the 
 * 400-year alignment rule before returning a true or false state.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(1)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter year: ");
        int year=sc.nextInt();

        boolean result=checkLeapYear(year);
        if(result){
            System.out.println(year+" is a Leap Year!");
        }else{
            System.out.println(year+" is NOT a Leap Year!");
        }
        sc.close();
    }
    public static boolean checkLeapYear(int year) {
        return ((year%4==0 && year%100!=0) || (year%400==0));
    }
}
