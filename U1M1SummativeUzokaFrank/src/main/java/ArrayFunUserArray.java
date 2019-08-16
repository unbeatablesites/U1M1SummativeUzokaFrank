import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  array[] = new int[5];

        for (int i=0; i<array.length; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            array[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.print("Numbers in Array : ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
