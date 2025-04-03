package day4.level3;

import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int digitsCount = countDigits(n);
        System.out.println("The count of digits in a number is " + digitsCount);
        int[] digitsArray = digitsInArray(n, digitsCount);
        System.out.println("The array of digits in a number is ");
        printArray(digitsArray);
        int[] reversedArray = reverseArray(digitsArray);
        System.out.println("The reversed array of digits in a number is ");
        printArray(reversedArray);
        System.out.println("Are the arrays equal? " + areArraysEqual(digitsArray, reversedArray));
        System.out.println("Is the number a palindrome? " + isPalindrome(digitsArray));
        System.out.println("Is the number a duck number? " + isDuckNumber(digitsArray));
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            int r = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] digitsInArray(int n, int digitsCount) {
        int[] result = new int[digitsCount];
        int i = 0;
        while (n != 0) {
            result[i++] = n % 10;
            n /= 10;
        }
        return result;
    }
    public static int[] reverseArray(int[] digitsArray) {
        int[] reversedArray = new int[digitsArray.length];
        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }
        return reversedArray;
    }
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digitsArray) {
        return areArraysEqual(digitsArray, reverseArray(digitsArray));
    }

    public static boolean isDuckNumber(int[] digitsArray) {
        for (int digit : digitsArray) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
}
}
