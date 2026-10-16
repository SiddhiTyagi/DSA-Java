import java.util.Scanner;

public class LeftRotateArrayBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        System.out.print("Enter d = ");
        int d = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element = ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Original Array = [");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        int j = 0;
        for (int i = d; i < n; i++) {
            nums[j] = nums[i];
            j++;
        }

        int k = 0;
        for (int i = n - d; i < n; i++) {
            nums[i] = temp[k];
            k++;
        }

        System.out.print("Left Rotated Array by "+d+" places = [");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        sc.close();
    }
}