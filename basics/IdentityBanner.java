/**
 * PROBLEM NAME: Identity Banner
 * 
 * DESCRIPTION:
 * Takes a username string, routes it through a text-formatting custom method, 
 * and returns a personalized greeting string.
 * 
 * APPROACH:
 * Main captures a string word and passes it into `createGreeting(String name)`. 
 * The method combines it with banner text and returns the combined result.
 * 
 * COMPLEXITY:
 * - Time Complexity: O(1)
 * - Space Complexity: O(1)
 */

import java.util.Scanner;
public class IdentityBanner {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);

        System.out.print("Enter username: ");
        String name=sc.next();

        String display= createGreeting(name);
        System.out.println(display);
        sc.close();
    }
    public static String createGreeting(String name){
        String personalizedMessage= "Welcome "+name+" to DSA-JAVA World!";
        return personalizedMessage;
    }
}
