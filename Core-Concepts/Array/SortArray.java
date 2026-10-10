import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter "+(i+1)+" element = ");
            arr[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (arr[i] <= arr[j]){
                    // no swap is needed
                }else{
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i]);

            if (i < size-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        sc.close();
    }
}
