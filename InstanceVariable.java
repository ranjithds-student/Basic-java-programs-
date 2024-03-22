package MyPackage;

import java.util.Arrays;

public class InstanceVariable {
    static int i;


    public static void main(String[] args) {
        int j = 1;
        System.out.println("Instance global Static variable " + i);
        System.out.println("local variable " + j);


        int[] x = {10, 8, 9, 0, 9};
        int[] y = {10, 8};
        System.out.println("Before x[] " + (Arrays.toString(x)));
        System.out.println("Before  y[] " + Arrays.toString(y));

        x = y;   // internal elements wont be copied just reference variables will be reassigned

        System.out.println("After x[] " + Arrays.toString(x));
        y = x;
        System.out.println("After y[] " + Arrays.toString(y));
    }
}
