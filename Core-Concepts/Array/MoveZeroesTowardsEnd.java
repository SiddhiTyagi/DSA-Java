// Brute Force 

import java.util.Scanner;
public class MoveZeroesTowardsEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        while (n < 1) {
            if (n == 0) {
                System.out.print("\nArray is empty!\nEnter size of array = ");
                n = sc.nextInt();
            } else {
                System.out.print("\nInvalid size!\nEnter size of array = ");
                n = sc.nextInt();
            }
        }

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        int countNonZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                countNonZeroes++;
            }
        }

        int temp[] = new int[countNonZeroes];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < countNonZeroes; i++) {
            arr[i] = temp[i];
        }

        for (int i = countNonZeroes; i < n; i++) {
            arr[i] = 0;
        }

        System.out.print("\nModified Array = [");
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
