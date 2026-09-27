/**
 * PROBLEM NAME: The Digit Counter
 * 
 * DESCRIPTION:
 * Prompts the user to enter a positive integer and calculates the total count of 
 * individual digits making up that number without converting it to a string.
 * 
 * APPROACH:
 * Captures a raw integer via Scanner. Executes a while loop that continually 
 * divides the number by 10 (`num = num / 10`) to shave off the last digit on each 
 * turn, incrementing a tracking accumulator counter until the base value drops to 0.
 * 
 * HOLY GRAIL EDGE-CASE TRAP:
 * What happens if the user inputs the number 0? Think about how to structure 
 * your initialization or loop to ensure it prints 1 digit instead of 0 digits!
 * 
 * COMPLEXITY:
 * - Time Complexity: O(log<sub>10</sub>N)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        int count=0;

        if(num==0){
            count=1;
        }else{
            while(num>0 && num!=0){
            num=num/10;
            count++;
        }
    }
        System.out.println("Total number of individual digits = "+count);
        sc.close();
}
}
