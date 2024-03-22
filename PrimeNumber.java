package MyPackage;

import java.util.Scanner;

public class PrimeNumber {
    private void prime(int n) {
        int count = 0;
        for (int i = 2; i <= n - 1; i++) {


            if (n % i == 0) {
                count += 1;
            }

        }
        if (count > 0 || (n == 1)) {
            System.out.println(n + " is a NOT a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }


    }

    public static void main(String[] args) {

        PrimeNumber p = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (n > 0) {
            System.out.println("\nEnter a number ");
            int in = scanner.nextInt();
            p.prime(in);


        }

    }
}
