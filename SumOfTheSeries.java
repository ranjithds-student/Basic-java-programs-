package MyPackage;

import java.util.Scanner;

/*
// series:- 1 + 2 + 3 + 4 + ... + N

 */
public class SumOfTheSeries {


    private static void sumOfSeries(int in) {
        int sum = 0;
        for (int i = 1; i <= in; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of the series is " + sum);

    }

    public static void main(String[] args) {

        int in;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Sum of the Series\n");
        try {
            while (true) {
                System.out.println("Enter a number till the series");
                in = sc.nextInt();

                sumOfSeries(in);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }
}
