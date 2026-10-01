/**
 * PROBLEM NAME: Running Sum of an Array
 * 
 * DESCRIPTION:
 * Ask the user for the size of an array and read inputs to populate it.
 * Create a new resulting array where each element at index `i` is the sum of all elements from index 0 up to `i` in the original array.
 * Print the final running sum array. 
 * (Example: Input [1, 2, 3, 4] becomes Output)
 * 
 * APPROACH:
 * 1. Read size and populate the initial array using a Scanner loop.
 * 2. Create a new tracking array `runningSum` of the same size.
 * 3. Set the first element: `runningSum[0] = arr[0]`.
 * 4. Loop from index 1 to the end of the array.
 * 5. Calculate each new element using the formula: `runningSum[i] = runningSum[i - 1] + arr[i]`.
 * 
 * COMPLEXITY:
 * - Time Complexity: O()
 * - Space Complexity: O()
 */


public class RunningSumArray {
    
}