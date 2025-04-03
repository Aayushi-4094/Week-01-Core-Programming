package day4.level3;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors of the number are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor of the number is: " + greatestFactor);
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors of the number is: " + sumOfFactors);
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors of the number is: " + productOfFactors);
        long productOfCubeOfFactors = findProductOfCubeOfFactors(factors);
        System.out.println("Product of cube of factors of the number is: " + productOfCubeOfFactors);
        System.out.println("Is the number a perfect number? " + isPerfectNumber(n, sumOfFactors));
        System.out.println("Is the number an abundant number? " + isAbundantNumber(n, sumOfFactors));
        System.out.println("Is the number a deficient number? " + isDeficientNumber(n, sumOfFactors));
        System.out.println("Is the number a strong number? " + isStrongNumber(n));
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[j++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= (long) Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int n, int sumOfFactors) {
        return sumOfFactors - n == n;
    }

    public static boolean isAbundantNumber(int n, int sumOfFactors) {
        return sumOfFactors - n > n;
    }

    public static boolean isDeficientNumber(int n, int sumOfFactors) {
        return sumOfFactors - n < n;
    }

    public static boolean isStrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
