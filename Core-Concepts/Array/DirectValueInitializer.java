/**
 * PROBLEM NAME: Initialize Array with Values
 * 
 * DESCRIPTION:
 * Create an integer array and immediately fill it with five specific numbers: 10, 20, 30, 40, and 50.
 * Print the array format to the console as: [10, 20, 30, 40, 50]
 * 
 * APPROACH:
 * When you know your numbers ahead of time, you don't need to specify a size number or use a Scanner. 
 * Instead, you can use curly braces `{}` to list them directly during declaration.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N) 
 * - Space Complexity: O(1)
 */

public class DirectValueInitializer{
    public static void main(String[] args) {
        int firstArray[]={10,20,30,40,50};

        System.out.print("[");
        for(int i=0;i<firstArray.length;i++){
            System.out.print(firstArray[i]);

            if(i<=firstArray.length-2){
                System.out.print(", ");        
            }
        }
        System.out.print("]");
        System.out.println("");
    }
}
