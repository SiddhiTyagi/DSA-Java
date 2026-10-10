// Left Rotate an Array by One Place.
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for (int i = 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        arr[size-1] = temp;

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
