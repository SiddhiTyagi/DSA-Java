// Left Rotate an Array by 2 Places
import java.util.Scanner;

public class LeftRotateby2Places {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        while (size < 1){
            System.out.print("Enter size of array = ");
            size = sc.nextInt();
        }

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter D = ");
        int d = sc.nextInt();

        d = d % size;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        for (int i = d; i < size; i++){
            arr[i-d] = arr[i];
        }

        int j = 0;
        for (int i = size-d; i < size; i++){
            arr[i] = temp[j];
            j++;
        }

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
