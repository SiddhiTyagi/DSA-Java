/**
 * PROBLEM NAME: Create an Empty Array
 * 
 * DESCRIPTION:
 * Create an empty integer array that has exactly 5 slots (boxes) ready to hold numbers, 
 * but do not put any specific numbers in them yet.
 * 
 * APPROACH:
 * In Java, when you don't know the values yet but know the size, you use the `new` keyword 
 * followed by the data type and the size in square brackets: `int[] myArray = new int[size];`.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N) 
 * Java clears and sets every element in the new array to 0 sequentially behind the scenes.
 * - Space Complexity: O(N)
 * The memory allocated grows linearly with the 'size' variable specified by the user.
 */

import java.util.Scanner;
public class FixedSizeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int size=sc.nextInt();

        int[] firstArray=new int[size];
        for(int i=0;i<size;i++){
             System.out.print("Enter "+(i+1)+" element: ");
             firstArray[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(firstArray[i]);
            
            if(i<=size-2){
            System.out.print(", ");
        }
    }
    System.out.print("]");
    System.out.println();
    sc.close();
}
}
