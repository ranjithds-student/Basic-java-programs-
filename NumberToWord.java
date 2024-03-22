package MyPackage;

import java.util.Scanner;

public class NumberToWord {

    String numToWord;
    String output;

    private String singleDigit(int num, String s) {
//        String s = "";
        if (num == 1) {
            numToWord = s + " one";
            num = 0;
        }
        if (num == 2) {
            numToWord = s + " two";
            num = 0;
        }
        if (num == 3) {
            numToWord = s + " three";
            num = 0;
        }
        if (num == 4) {
            numToWord = s + " four";
            num = 0;
        }
        if (num == 5) {
            numToWord = s + " five";
            num = 0;
        }
        if (num == 6) {
            numToWord = s + " six";
            num = 0;
        }
        if (num == 7) {
            numToWord = s + " seven";
            num = 0;
        }
        if (num == 8) {
            numToWord = s + " eight";
            num = 0;
        }
        if (num == 9) {
            numToWord = s + " nine";
            num = 0;
        }
        return numToWord;
    }

    private String numberToWord(int in) {

        String numStringOutput = "";
        if (in != 0) {

            if (in == 10) {
                numToWord = "ten";
            }
            if (in == 11) {
                numToWord = "eleven";
            }
            if (in == 12) {
                numToWord = "twelve";
            }
            if (in == 13) {
                numToWord = "thirteen";
            }
            if (in == 14) {
                numToWord = "fourteen";
            }
            if (in == 15) {
                numToWord = "fifteen";
            }
            if (in == 16) {
                numToWord = "sixteen";
            }
            if (in == 17) {
                numToWord = "seventeen";
            }
            if (in == 18) {
                numToWord = "eighteen";
            }
            if (in == 19) {
                numToWord = "nineteen";
            }

            if (in >= 20 && in < 30) {
                numToWord = "twenty ";
                in = in - 20;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 30 && in < 40) {
                numToWord = " thirty";
                in = in - 30;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 40 && in < 50) {
                numToWord = " forty";
                in = in - 40;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 50 && in < 60) {
                numToWord = " fifty";
                in = in - 50;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 60 && in < 70) {
                numToWord = " sixty";
                in = in - 60;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 70 && in < 80) {
                numToWord = " seventy";
                in = in - 70;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 80 && in < 90) {
                numToWord = " eighty";
                in = in - 80;
//                numStringOutput = singleDigit(in, numToWord);
            }
            if (in >= 90 && in < 100) {
                numToWord = " ninety";
                in = in - 90;
//                numStringOutput = singleDigit(in, numToWord);


            }
        } else {
            System.out.println("You entered wrong input");
        }
        numStringOutput = singleDigit(in, numToWord);
        return numStringOutput;
    }

    public static void main(String[] args) {
        NumberToWord number = new NumberToWord();
        int num = 0;
        System.out.println("Number to string program");
        while (true) {
            System.out.println("Enter a number ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            String out = number.numberToWord(num);
            System.out.println(num + " is " + out);
        }
    }
}
