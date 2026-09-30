/**
 * PROBLEM NAME: Automated Product Tool
 * 
 * DESCRIPTION:
 * Demonstrates method invocation by taking two integers from the user, passing 
 * them to a custom multiplication method, and returning the calculated product.
 * 
 * APPROACH:
 * The main method captures two inputs. It calls `multiplyNumbers(a, b)`. 
 * The method receives them, calculates the product, and uses the `return` keyword 
 * to send the result back to main.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(1)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class AutomatedProductTool{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        int answer = multiplyNumbers(num1,num2);

        System.out.println("Product of "+num1+" and "+num2+" = "+answer);
        sc.close();
    }
    public static int multiplyNumbers(int num1, int num2){
        int product=num1*num2;
        return product;
    }
}