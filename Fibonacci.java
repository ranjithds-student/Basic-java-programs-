package MyPackage;

import java.util.Scanner;  // Import the Scanner class

public class Fibonacci {

    private void fibonacciSeries(int n) {
        int a = 0, b = 1, sum;
        System.out.print("\t" + a);
        System.out.print("\t" + b);

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print("\t" + sum);
        }
    }

    public static void main(String[] args) {
//        int a = 0, b = 1, c;
//        System.out.println("Fibonacci Series :");
//        System.out.print("\t" + a);
//        System.out.print("\t" + b);
//        for (int i = 0; i <= 5; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.print("\t" + c);
//
//        }
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci Series");
        System.out.println("Enter up to where fibonacci series you want");
        int n = sc.nextInt();
        fibonacci.fibonacciSeries(n);
    }
}
