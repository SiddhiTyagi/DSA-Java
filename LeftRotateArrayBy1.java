import java.util.Scanner;

public class LeftRotateArrayBy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element = ");
            nums[i] = sc.nextInt();
        }

        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;

        System.out.print("Left Rotated Array = [");
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
