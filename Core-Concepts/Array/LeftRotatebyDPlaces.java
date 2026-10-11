// Left Rotate an Array by D Places
import java.util.Scanner;

public class LeftRotatebyDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter D = ");
        int d = sc.nextInt();

        // Write your left rotation logic here


        // Print the array
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
