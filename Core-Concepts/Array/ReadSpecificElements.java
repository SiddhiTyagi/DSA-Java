/**
 * PROBLEM NAME: Read Specific Elements
 * 
 * DESCRIPTION:
 * Given an array that already has numbers in it, grab the very first number from the array 
 * and print it out to the screen. Then, grab the last number from the array and print it.
 * 
 * APPROACH:
 * Arrays use "zero-based indexing". The first element is always at index `0`. 
 * The last element is always dynamically located at index `array.length - 1`.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(1) 
 * Accessing an element directly by its index takes the exact same amount of time, whether the array 
 * has 4 items or 4 million items. There are no loops!
 * - Space Complexity: O(1)
 */

public class ReadSpecificElements{
    public static void main(String[] args) {
        int firstArray[]={99, 88, 77, 66};
        int size=firstArray.length;

        System.out.println("First number from the array = "+firstArray[0]);
        System.out.println("Last number from the array = "+firstArray[size-1]);
        System.out.println();
    }
}
