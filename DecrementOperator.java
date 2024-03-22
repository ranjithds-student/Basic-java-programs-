package MyPackage;

import java.util.*;

public class DecrementOperator {

    static int x = 10;
    static int y = 20;
    static int z = 1;
    static char ch = 'a';

    static double d = 10.5;


//    public static int sum(int x,int y)l
//    {
//        return x+y;
//    }

    public static void main(String[] args) {
        int preInc;
        int postInc;
        System.out.println("Before x " + x);
        System.out.println("Before y " + y);
        System.out.println(z++);
        preInc = ++x;
        postInc = y++;
        d++;
        System.out.println("Incremental POST operator " + postInc);
        System.out.println("Incremental POST operator After increment" + postInc);
        System.out.println("Incremental POST operator After increment" + y);
        System.out.println("Incremental PRE operator " + preInc);
        System.out.println("Char OPERATOR  " + (++ch));
        System.out.println("Double variable OPERATOR  " + (d));
        System.out.println("Using the static variable ClassName access " + DecrementOperator.x);
        System.out.println("Square root using Math library " + Math.sqrt(16));
    }

}
