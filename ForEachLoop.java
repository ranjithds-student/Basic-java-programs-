package MyPackage;

public class ForEachLoop {

    public static void main(String[] args) {


//        int[][] x = {{10, 20, 30, 40,}, {50, 60}};

//        int[][][] y = {{{11, 22, 33}, {44, 55, 66}}};

        int[][][] z = {{{11, 22, 33}, {44, 55, 66}},{{111,222}}};


        System.out.println("For Each loop ");

//        for(int[] x1:x)
//        {
//            for(int x2:x1)
//            {
//                System.out.println(x2);
//            }
//        }


        /* For Two Dimensional Array
        for (int[][] y1 : y) {
            for (int[] y2 : y1) {
                for (int y3 : y2) {
                    System.out.println(y3);
                }
            }
        }

        */

        //For Three Dimensional Array
        for(int[][] z1:z)
        {
            for(int[] z2:z1)
            {
                for(int z3:z2)
                {
                    System.out.println(z3);
                }
            }
        }

                      

    }
}
