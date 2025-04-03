package day4.level3;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Count of digits: " + countDigits(n));
        int[] digits = storeDigits(n);
        System.out.print("Digits array: ");
        printArray(digits);
        System.out.println("Is duck number: " + duckNumber(digits));
        System.out.println("Is armstrong number: " + armstrongNumber(digits));
        int[] largest = largeAndSecondlargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second largest: " + largest[1]);
        int[] smallest = smallAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second smallest: " + smallest[1]);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        int i = 0;
        while (n != 0) {
            digits[i++] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean duckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean armstrongNumber(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, digits.length);
        }
        int original = 0;
        for (int digit : digits) {
            original = original * 10 + digit;
        }
        return sum == original;
    }

    public static int[] largeAndSecondlargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        return new int[] {largest, secondLargest};
    }

    public static int[] smallAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
     }
}
}
