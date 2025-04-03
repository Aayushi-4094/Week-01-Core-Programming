package day4.level2;

import java.lang.*;
import java.util.*;

public class Ques1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int[] fact = factorsOfNumbers(n);
System.out.println("Factors of a number :" + Arrays.toString(fact));
int resultSum = sumOfFactors(fact);
System.out.println("Sum of factors : " + resultSum);
long resultFact = productOfFactors(fact);
System.out.println("Product of factors : " + resultFact);
long resultSumSquare = findSumOfSquares(fact);
System.out.println("Sum of squares " + resultSumSquare);
}

public static int[] factorsOfNumbers(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            count++;
        }
    }
    int[] factors = new int[count];
    int index = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            factors[index++] = i;
        }
    }
    return factors;
}

public static int sumOfFactors(int[] fact) {
    int sum = 0;
    for (int i = 0; i < fact.length; i++) {
        sum += fact[i];
    }
    return sum;
}

public static long productOfFactors(int[] fact) {
    long product = 1;
    for (int i = 0; i < fact.length; i++) {
        product *= fact[i];
    }
    return product;
}

public static long findSumOfSquares(int[] fact) {
    long sum = 0;
    for (int i = 0; i < fact.length; i++) {
        sum += (long) Math.pow(fact[i], 2);
    }
    return sum;
}

}