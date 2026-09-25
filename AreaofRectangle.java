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