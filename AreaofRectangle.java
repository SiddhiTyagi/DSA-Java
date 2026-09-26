/**
 * PROBLEM NAME: Area of a Rectangle
 * 
 * DESCRIPTION:
 * Calculates the geometric area of a rectangle using dynamic, user-provided 
 * dimensions passed via the console.
 * 
 * APPROACH:
 * Employs Java's Scanner class to read high-precision floating-point numbers 
 * (`double`). It captures the length and width inputs and uses standard 
 * mathematical multiplication (`*`) to compute the final area metric.
 * 
 * COMPLEXITY:
 * Time Complexity: O(1) - The arithmetic operation executes instantaneously.
 * Space Complexity: O(1) - Minimal allocation of primitive double variables.
 */

import java.util.Scanner;

public class AreaofRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length=sc.nextDouble();

        System.out.print("Enter breadth of Rectangle: ");
        double breadth=sc.nextDouble();

        double area=length*breadth;

        System.out.println("Area of rectangle of length "+length+" cm and breadth "+breadth+" cm is "+area+" square cm.");
        sc.close();
    }
}