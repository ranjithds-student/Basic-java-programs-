package MyPackage;

import java.util.List;
import java.util.Scanner;

public class ForEach {


    public static void main(String[] args) // "String[] args" are called "COMMAND LINE ARGUMENTS"
    {
        ForEach forEach = new ForEach();
        Scanner sc = new Scanner(System.in);

        int a[] = {1, 13, 21, 13, 54, 33};
        System.out.println("The array contains");
        System.out.println("Array type " + a.getClass().getName());
        for (int i : a) {
            System.out.println("The " + " element in the array is " + i);
        }

        System.out.println("Enter a number to search");
        int in = sc.nextInt();

        for (int j : a) {
            if (in == j) {
                System.out.println("The element " + in + " is present in the array");
            }
        }


        System.out.println("End of the for each loop");
    }

}
