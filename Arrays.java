package MyPackage;

import java.util.Scanner;

/*
17/3/22 Coping an original array to an duplicate array Program
 */
public class Arrays {


//    public static void main(String[] args) {
//        int[] x = new int[10];
//        x[0] = 00;
//        x[1] = 11;
//        x[2] = 22;
//        x[3] = 33;
//        x[4] = 44;
//
//        System.out.println("The array elements are : " + x);
//
//        for (int i : x) {
//
//            System.out.println(i);
//        }
//
//
//    }

    static String name;


    public static void main(String[] args) {
//        int[] originalArray = {10, 20, 30, 40, 50};
        int[] originalArray = new int[]{10, 20, 30, 40};

        int[] duplicateArray = new int[originalArray.length];


        //for an duplicate array
        System.out.println("Duplicate array copied from original array");
        for (int i = 0; i < originalArray.length; i++) {
            duplicateArray[i] = originalArray[i];
            System.out.print(duplicateArray[i] + " ");
        }
        System.out.println(" , ");

        //To print an original array
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println(",");
        Scanner scanner = new Scanner(System.in);

        System.out.println("COPING AN ARRAY FROM AN ORIGINAL ARRAY PROGRAM");
        name = scanner.next();

        System.out.println("Original Array " + originalArray);
        System.out.println("Duplicate Array " + duplicateArray);


    }

}
