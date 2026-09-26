/**
 * PROBLEM NAME: Step Number Accumulator
 * 
 * DESCRIPTION:
 * Iterates through a numerical sequence up to a user's defined ceiling, tracking and 
 * aggregating only the even digits into a final running total sum.
 * 
 * APPROACH:
 * Takes a maximum integer boundary from the user. A loop steps through every value 
 * from 1 up to that limit. A modulo check inside the loop filters out odd indices, 
 * adding only valid even values directly to a running accumulator variable.
 * 
 * COMPLEXITY:
 * - Time Complexity: [Leave blank for now]
 * - Space Complexity: [Leave blank for now]
 */

import java.util.Scanner;
public class StepCountingAccumulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        System.out.print("Enter last digit: ");
        int limit=sc.nextInt();

        System.out.println("The sequence till "+limit+" is: ");
        for(int i=0;i<=limit;i++){
        System.out.print(i);

        if(i<limit){
        System.out.print(", ");
        }
    }

        System.out.println();
        
        System.out.print("The even sequence is: ");
        for(int i=1;i<=limit;i++){
            if(i%2==0){
                System.out.print(i);
                sum=sum+i;
                
                if(i+2<=limit){
                    System.out.print(", ");
        }
    }
}
System.out.println();
System.out.println("Sum of even digits from the sequence = "+sum);
sc.close();
}
}
