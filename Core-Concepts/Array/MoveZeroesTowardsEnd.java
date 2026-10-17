// Optimal approach - can do shifting in-place using two-pointer approach without using temp
// Space Complexity = O(1)

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

        for (int i = 0; i < n; i++) {                              // O(n)
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            System.out.println("No zero element present in given array.");
        } else {
            for (int i = j + 1; i < n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;
                }
        }

        System.out.print("\nModified Array = [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        }

        System.out.println();
        sc.close();
    }
}



// Brute Force
// Time complexity = O(5n) = O(n)
// Auxiliary Space = O(countNonZeroes) because temp is the additional array
// Total Space complexity = O(n + countNonZeroes) = O(n) since countNonZeroes <= n

// import java.util.Scanner;
// public class MoveZeroesTowardsEnd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter size of array = ");  
//         int n = sc.nextInt();

//         while (n < 1) {
//             if (n == 0) {
//                 System.out.print("\nArray is empty!\nEnter size of array = ");
//                 n = sc.nextInt();
//             } else {
//                 System.out.print("\nInvalid size!\nEnter size of array = ");
//                 n = sc.nextInt();
//             }
//         }

//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {                              // O(n)
//             System.out.print("Enter "+(i+1)+" element = ");
//             arr[i] = sc.nextInt();
//         }

//         int countNonZeroes = 0;
//         for (int i = 0; i < n; i++) {                              // O(n)
//             if (arr[i] != 0) {
//                 countNonZeroes++;
//             }
//         }

//         int temp[] = new int[countNonZeroes];
//         int j = 0;
//         for (int i = 0; i < n; i++) {                              // O(n)
//             if (arr[i] != 0) {
//                 temp[j] = arr[i];
//                 j++;
//             }
//         }

//         for (int i = 0; i < countNonZeroes; i++) {                 // O(countNonZeroes)
//             arr[i] = temp[i];
//         }

//         for (int i = countNonZeroes; i < n; i++) {                 // O(n - countNonZeroes)
//             arr[i] = 0;
//         }

//         System.out.print("\nModified Array = [");
//         for (int i = 0; i < n; i++) {                              // O(n)
//             System.out.print(arr[i]);

//             if (i < n - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.print("]"); 

//         System.out.println();
//         sc.close();
//     }
// }