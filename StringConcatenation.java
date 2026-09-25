import java.util.Scanner;
public class StringConcatenation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName=sc.next();

        System.out.println("Enter the last name: ");
        String lastName=sc.next();

        String fullName=firstName+" "+lastName;
        System.out.println("Full Name is "+fullName+".");
    }
}
