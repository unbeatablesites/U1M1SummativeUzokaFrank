import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numIN = 0;
        System.out.println("Enter a number between 1 and 10. ");

        do {
            numIN = Integer.parseInt(scan.nextLine());
            if ((numIN < 1) || (numIN > 10))
                System.out.println("You must enter a number between 1 and 10, please try again.");
        }while ((numIN < 1) || (numIN > 10)) ;

        System.out.println("The Valid Number : " + numIN);
    }
}