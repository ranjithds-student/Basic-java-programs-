package MyPackage;

import java.util.Scanner;

public class SquaresSeries {
    public static void main(String[] args) {
        int in, square = 1, sqAdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till the SQUARE series");
        in = sc.nextInt();

        for (int i = 1; i <= in; i++) {
            square = i * i;
            System.out.println("SQUARE of " + i + " is " + square);
            sqAdd = sqAdd + square;
            System.out.print("\t"+sqAdd);
        }
        System.out.println("Sum of the squares of  " + in + " are " + sqAdd);

        SumOfDigit sum=new SumOfDigit();
        sum.dataObtained(in);
    }
}
