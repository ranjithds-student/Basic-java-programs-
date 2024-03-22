package MyPackage;

public class SketchBook {

    public static void main(String[] args) {
//        double d =\";
//        int d = 12_________1_3; //  READABILITY OF THE CODE we can use underscore symbols b/w digits as integral literals 27/10/21
//        System.out.println("Value of int in binary form is " + d);
//
//
//        int[][] x = new int[2][];
//        x[0] = new int[1];
//        x[1] = new int[2];
//
//
//        int[] m = new int[2];
//        System.out.println("The length of the two dimensional  array is : " + (x[0].length + x[1].length));
//

        sum(new int[]{
                11, 22, 33, 44, 55
        });  //anonymous array
        System.out.println("The command line argument the length is " + args.length);

        for (String j : args
                ) {
//            for (int k;)
            System.out.println(j);


        }
//        System.out.println("The " + args[i] + " argument is ");
    }

    public static void sum(int[] x) {

        System.out.println("The anonymous array element are");
        System.out.println("The anonymous array size is " + x.length);
        for (int i : x
                ) {
            System.out.println("The " + i + " element is ");
            System.out.println(i);
        }
    }


}
