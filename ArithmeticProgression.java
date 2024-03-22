package MyPackage;

import java.util.Scanner;

/*
15/3/22 Wrote a program after teaching ADI("A standard boy ") Arithmetic progression A n term
 The program gives the output for the below
   athTerm
   firstNthTerm
 */
public class ArithmeticProgression {


    private int athTerm(int a, int d, int n) {

        int an;
        an = a + (n - 1) * d;
        System.out.println("A " + n + "  th term of a is " + an);
        return an;
    }


    //Trying to solve so please wait
    private void firstNthTerm(int a, int d, int n) {

//        for (int i = a; i <= n; i++) {
//            System.out.println(a);
//            an = an + a + d;
//            System.out.println(an);
////            System.out.println(" , ");
//        }

        //Finally figured out after writing on the book Yo!
        System.out.println("1 term is " + a);
        for (int i = a; i < n; i++) {
            int nThTerm = a + (i * d);
            System.out.println(i + 1 + " term is " + nThTerm);
        }
        for (int b = a; b < n; b++) {
            int nThterm = a + (b * d);
        }


    }

    public static void main(String[] args) {
        int a, d, n;
        ArithmeticProgression progression = new ArithmeticProgression();
        Scanner s = new Scanner(System.in);

        System.out.println("ARITHMETIC PROGRESSION");
        System.out.println("Finding the A n th term ");

        System.out.println("Enter the value of a");
        a = s.nextInt();
        System.out.println("You entered a " + a);

        System.out.println("Enter the value of d Common Difference");
        d = s.nextInt();
        System.out.println("You entered d " + d);

        System.out.println("Enter the value of n");
        n = s.nextInt();
        System.out.println("You entered n " + n);

        progression.athTerm(a, d, n);
        progression.firstNthTerm(a, d, n);


    }
}
