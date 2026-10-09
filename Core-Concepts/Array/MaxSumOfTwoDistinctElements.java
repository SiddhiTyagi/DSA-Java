// without creating an array

import java.util.*;
public class MaxSumOfTwoDistinctElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++){
            System.out.print("Enter "+(i+1)+" element = ");
            int num = sc.nextInt();

            if (num > largest){
                secondLargest = largest;
                largest = num;
            }else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        int sum = largest + secondLargest;
        System.out.println("Maximum sum of two distinct elements = "+sum);
        sc.close();
    }
}
