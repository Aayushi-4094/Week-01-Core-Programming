package day4.level3;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Is the number prime? " + isPrime(n));
        System.out.println("Is the number neon? " + isNeon(n));
        System.out.println("Is the number spy? " + isSpy(n));
        System.out.println("Is the number automorphic? " + isAutomorphic(n));
        System.out.println("Is the number buzz? " + isBuzz(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String strSquare = String.valueOf(square);
        String strN = String.valueOf(n);
        return strSquare.endsWith(strN);
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
