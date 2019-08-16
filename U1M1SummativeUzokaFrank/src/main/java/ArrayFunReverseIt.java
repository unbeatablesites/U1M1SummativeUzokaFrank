public class ArrayFunReverseIt {

    public static void main(String[] args) {
        int  array[] = {1, 2, 3, 4, 5};
        int j = array.length;
        int convert[] = new int[j];

        for (int i=0; i<array.length; i++){
            convert[i] = array[j-1];
            j--;
        }
        System.out.println("The Original Array : ");
        for (int i=0; i<array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe Reversed Array : ");
        for (int i=0; i<convert.length; i++) {

            System.out.print(convert[i] + " ");
        }
    }
}


