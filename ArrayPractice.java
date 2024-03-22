package MyPackage;

public class ArrayPractice {



    public static void main(String[] args) {
//        int x[] = {10, 20, 30, 40, 50};
//        String s = "Hi";
//
//        System.out.println("Length of an array is " + x.length);
//        for (int y = 0; y < x.length; y++) {
//            System.out.println("iteration " + y + " " + x[y]);
////            if (x[y] == 20) {
////                System.out.println("Found " + x[y]);
//////                break;
//
//        }
//
//        String name = new String("R");
//        String na = new String("R");
//        System.out.println("Nam == na " + (name == na));

        System.out.println("TAbles ");
        int i = 1;

        while (i <= 10) {
            int j = 1; // J initialised here because to start from 1 here or else it would go fr 11 and out of loop

            while (j <= 10) {
                System.out.print(i + " * " + j + " = " + (i * j));

                j++;
            }
            System.out.println();
            i++;
        }


    }
}

