import java.util.Scanner;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of array = ");
        int n = sc.nextInt();

        while (n < 1) {
            if (n == 0) {
                System.out.print("Array is empty!\nEnter size of array = ");
                n = sc.nextInt();
            } else if (n < 0) {
                System.out.print("Invalid size!\nEnter size of array = ");
                n = sc.nextInt();
            }
        }

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nd is the places by which the array should left rotate.\nEnter d = ");
        int d = sc.nextInt();

        d = d % n;

        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = d; i < n; i++) {
            arr[j] = arr[i];
            j++;
        }

        int k = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[k];
            k++;
        }

        System.out.print("\nLeft Rotated Array = [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        sc.close();
    }
}