/**
 * PROBLEM NAME: Prime Threshold Sentinel
 * 
 * DESCRIPTION:
 * Evaluates whether a user-entered positive integer greater than 1 is a prime 
 * number (divisible only by 1 and itself).
 * 
 * APPROACH:
 * Reads a primary number from the keyboard. Executes a checking loop running from 
 * 2 up to `number - 1`. If the primary number is evenly divisible by any of these loop 
 * counters, it trips a 'boolean isPrime' tracking flag to false and breaks out early.
 * 
 * HOLY GRAIL EDGE-CASE TRAP:
 * Numbers less than or equal to 1 are never prime. How will your logic defend against 
 * users typing in 0, 1, or negative numbers before your main factoring loop fires up?
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N)
 * - Space Complexity: O(1)
 */


import java.util.Scanner;
public class PrimeThresholdSentinel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int count=0;

        if(num<=1){
            System.out.println(num+" is NOT a Prime Number.");
        }else{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
                if(count==2){
                    System.out.println(num+" is a Prime Number.");
                }else{
                    System.out.println(num+" is NOT a Prime Number.");
                }
            }
            sc.close();
        }
    }