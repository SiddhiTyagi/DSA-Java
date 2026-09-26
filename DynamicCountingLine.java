/**
 * PROBLEM NAME: Dynamic Counting Line
 * 
 * DESCRIPTION:
 * Prints numbers sequentially from 1 up to a user-defined limit on a single line 
 * cleanly separated by commas, ensuring no trailing symbols at the end.
 * 
 * APPROACH:
 * Utilizes a Scanner to capture a maximum integer boundary. A standard loop 
 * increments from 1 to the boundary, evaluating whether a comma is required 
 * after the printed index based on current sequence progress.
 * 
 * COMPLEXITY:
 * - Time Complexity:
 * - Space Complexity: 
 */

import java.util.Scanner;
public class DynamicCountingLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the last digit to print: ");
        int limit=sc.nextInt();

        for(int i=1;i<=limit;i++){
            System.out.print(i);

            if(i<limit){
                System.out.print(", ");
            }
        }
        System.out.println();
        sc.close();
    }
}
