package MyPackage;

import java.util.Scanner;

/*
       15/3/22 Practicing the SUM OF DIGITS AND REVERSING A NUMBER
       15/3/22 Wrote PALINDROME PROGRAM BASED ON REVERSE NUMBER OWN LOGIC
*/
public class SumOfDigit {
    private static long inputNumber;

    public void dataObtained(int i) {
        int j = i * i;
        System.out.println("Data obtained from other class is " + j);
    }

    private void sumOfDigits(long input) {
        long sum = 0, remainder;
        while (input != 0) {
            remainder = input % 10;
            sum = sum + remainder;
            input = input / 10;
        }
        System.out.println("Sum of digits of " + inputNumber + " is " + sum);
    }


    private void reverseANumber(long input) {
        long reverse = 0, remainder;

        while (input != 0) {
            remainder = input % 10;
            reverse = reverse * 10 + remainder;
            input = input / 10;
        }
        System.out.println("Reverse of input number " + inputNumber + " is " + reverse);

        if (inputNumber == reverse) {
            System.out.println("the input number " + inputNumber + " and its reverse is " + reverse + " is a PALINDROME Number");
        } else {
            System.out.println("the input number " + inputNumber + " and its reverse is " + reverse + " is a NOT A PALINDROME Number");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SumOfDigit sumOfDigit = new SumOfDigit();
        System.out.println("Sum of all digits program");
        System.out.println("Enter a number ");
        inputNumber = sc.nextLong();
        sumOfDigit.sumOfDigits(inputNumber);
        sumOfDigit.reverseANumber(inputNumber);
    }

}
