package MyPackage;

import java.util.Scanner;

/*
7/4/21
* Tables using a while loop
* While is a vertical representation of for loop :)
* Aste guru

 */
public class TableUsingWhile {

    private void tablesOf(int n) {
        int o = 1;
        while (o <= n) {


            int i = 1;
            while (i <= 10) {

                System.out.println(o + "*" + i + "=" + o * i);
                i++;

            }
            System.out.println("\n");
            o++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TableUsingWhile wl = new TableUsingWhile();
        System.out.println("Enter a number for tables ");
        int inputNumber = scanner.nextInt();

        wl.tablesOf(inputNumber);


    }
}
