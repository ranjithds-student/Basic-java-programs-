package MyPackage;

import java.util.Scanner;

public class NumberToString {


    private String oneToHundred(int number) {
        String numToString = "";

        while (number != 0) {
            if (number == 1) {
                numToString = numToString + " one";
                number = 0;
            } else if (number == 2) {
                numToString = numToString + " two";
                number = 0;
            } else if (number == 3) {
                numToString = numToString + " three";
                number = 0;
            } else if (number == 4) {
                numToString = numToString + " four";
                number = 0;
            } else if (number == 5) {
                numToString = numToString + " five";
                number = 0;
            } else if (number == 6) {
                numToString = numToString + " six";
                number = 0;
            } else if (number == 7) {
                numToString = numToString + " seven";
                number = 0;
            } else if (number == 8) {
                numToString = numToString + " eight";
                number = 0;
            } else if (number == 9) {
                numToString = numToString + " nine";
                number = 0;
            } else if (number == 10) {
                numToString = numToString + " ten";
                number = 0;
            } else if (number == 11) {
                numToString = numToString + " eleven";
                number = 0;
            } else if (number == 12) {
                numToString = numToString + " twelve";
                number = 0;
            } else if (number == 13) {
                numToString = numToString + " thirteen";
                number = 0;
            } else if (number == 14) {
                numToString = numToString + " fourteen";
                number = 0;
            } else if (number == 15) {
                numToString = numToString + " fifteen";
                number = 0;
            } else if (number == 16) {
                numToString = numToString + " sixteen";
                number = 0;
            } else if (number == 17) {
                numToString = numToString + " seventeen";
                number = 0;
            } else if (number == 18) {
                numToString = numToString + " eighteen";
                number = 0;
            } else if (number == 19) {
                numToString = numToString + " nineteen";
                number = 0;
            } else if (number >= 20 && number < 30) {
                numToString = numToString + " twenty";
                number = number - 20;
            } else if (number >= 30 && number < 40) {
                numToString = numToString + " thirty";
                number = number - 30;
            } else if (number >= 40 && number < 50) {
                numToString = numToString + " forty";
                number = number - 40;
            } else if (number >= 50 && number < 60) {
                numToString = numToString + " fifty";
                number = number - 50;
            } else if (number >= 60 && number < 70) {
                numToString = numToString + " sixty";
                number = number - 60;
            } else if (number >= 70 && number < 80) {
                numToString = numToString + " seventy";
                number = number - 70;
            } else if (number >= 80 && number < 90) {
                numToString = numToString + " eighty";
                number = number - 80;
            } else if (number >= 90 && number < 100) {
                numToString = numToString + " ninety";
                number = number - 90;
            }


        }
        return numToString;
    }


    public static void main(String[] args) {
        String outPutString = "";
        NumberToString numberToString = new NumberToString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number to String Program ");


        while (true) {


            System.out.println("Enter a number ");
            try {


                int inputNumber = scanner.nextInt();


                outPutString = numberToString.convertString(inputNumber);

            } catch (Exception e) {
                System.out.println("Something went wrong " + e);
            }
            System.out.println(outPutString);
        }
    }

    //Check the number range and send it to its respective
    private String convertString(int inputNumber) {
        String str = "";
        while (inputNumber != 0) {
            if (inputNumber >= 1 && inputNumber < 100) {
                str = oneToHundred(inputNumber);
                inputNumber = 0;
            } else if (inputNumber >= 100 && inputNumber < 1000) {
                str = str + oneToHundred(inputNumber / 100);
                str = str + " hundred"; //Till we get ONE HUNDRED
//                inputNumber = inputNumber % 100;
                str = str + oneToHundred(inputNumber % 100); //We get the remaining two digits i.e Twenty one
                inputNumber = 0;
            } else if (inputNumber >= 1000 && inputNumber < 10000) {
                str = str + oneToHundred(inputNumber / 1000);
                str = str + " Thousand";

//                str = str + oneToHundred(inputNumber % 1000);
//                str = str + oneToHundred(inputNumber / 100);
//                str = str + " hundred";
//                str = str + oneToHundred(inputNumber % 100);

                inputNumber = inputNumber % 1000;
            }

        }

        return str;
    }
}
