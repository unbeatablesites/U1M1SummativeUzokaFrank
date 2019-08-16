import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  funw[] = new String[5];
        for (int i=0; i<funw.length; i++){
            System.out.println("Enter word no. " + (i+1) + " : ");
            funw[i] = scan.nextLine();
        }
        System.out.println("The Array of words : ");
        for (int i=0; i<funw.length; i++){
            System.out.print(funw[i] + " ");
        }
    }
}
