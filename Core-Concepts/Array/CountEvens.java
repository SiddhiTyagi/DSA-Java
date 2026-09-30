/**
 * PROBLEM NAME: Count Even Numbers
 * 
 * DESCRIPTION:
 * Given an array of integers, count how many numbers inside the array are even 
 * numbers (numbers that can be divided by 2 with no remainder) and print the count.
 * 
 * APPROACH:
 * 1. Initialize a counter variable (`count = 0`).
 * 2. Loop through the array.
 * 3. Inside the loop, use an `if` statement with the modulo operator (`%`) 
 *    to check if the number is even: `if (firstArray[i] % 2 == 0)`.
 * 4. If it is even, increment your counter (`count++`).
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N) 
 * - Space Complexity: O(1)
 */


public class CountEvens {
    public static void main(String[] args) {
        int[] firstArray = {4, 7, 12, 9, 2, 6};

        int frequency=0;

        for(int i=0;i<firstArray.length;i++){
            if(firstArray[i]%2==0){
                frequency++;
            }
        }
        System.out.println("Even numbers in array = "+frequency);
        System.out.println();
    }
}