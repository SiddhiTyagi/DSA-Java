/**
 * PROBLEM NAME: Find the Sum of Elements
 * 
 * DESCRIPTION:
 * Given an array of integers, write a program that adds all the numbers together 
 * and prints the total sum to the screen.
 * 
 * APPROACH:
 * Create a tracker variable (like an accumulator) initialized to 0 before the loop. 
 * Loop through the entire array, and on every step, add the current array element 
 * to your tracker variable (`sum = sum + firstArray[i];`).
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N) 
 * - Space Complexity: O(1)
 */

public class SumofElements {
    public static void main(String[] args) {
        int[] firstArray = {5, 10, 15, 20};
        int sum=0;

        for(int i=0;i<firstArray.length;i++){
            sum=sum+firstArray[i];
        }
        System.out.println("Sum of all array elements = "+sum);
        System.out.println();
    }
}