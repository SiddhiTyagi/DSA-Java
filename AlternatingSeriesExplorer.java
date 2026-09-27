/**
 * PROBLEM NAME: Alternating Series Explorer
 * 
 * DESCRIPTION:
 * Evaluates an alternating sequence of addition and subtraction operations up to 
 * a user limit (e.g., 1 - 2 + 3 - 4 + 5...) and displays the final evaluated total.
 * 
 * APPROACH:
 * Employs a loop transitioning up to a user-provided integer ceiling. Uses a tracking 
 * conditional modulo logic to determine whether the current digit index needs to be 
 * added to or subtracted from the running sequence sum.
 * 
 * HOLY GRAIL EDGE-CASE TRAP:
 * Print out the sequence symbols cleanly along the way (e.g., "1 - 2 + 3 - 4 = -2"). 
 * Ensure that no trailing operator symbol sits awkwardly at the edge of the printed equation!
 * 
 * COMPLEXITY:
 * - Time Complexity: O(N)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class AlternatingSeriesExplorer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the last digit: ");
        int limit=sc.nextInt();
        int sum=0;

        System.out.print("Series = 1");  
        for(int i=1;i<=limit;i++){
            if(i%2==0){
                sum=sum-i;
                System.out.print(" - "+i);
            }else{
                if(i==1){
                    sum=sum+i;
                    System.out.print("");
                }else{
                sum=sum+i;
                System.out.print(" + "+i);
            }    
        }
    }
    System.out.println(" = "+sum);
    sc.close();
}
}
