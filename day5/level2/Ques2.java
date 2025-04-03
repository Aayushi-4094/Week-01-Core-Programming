package day5.level2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter a delimiter");
        char ch = sc.next().charAt(0);
        int n = toFindTheLength(s);
        System.out.println("The length of the string is : " + n);

        String[] usingCustomSplit = customSplit(s, ch, n);
        System.out.println("The split strings using custom split are: ");
        for (String word : usingCustomSplit) {
            System.out.print(word + " ");
        }

        String[] usingInBuiltSplit = s.split(String.valueOf(ch));
        System.out.println("\nThe split strings using in-built split are: ");
        for (String word : usingInBuiltSplit) {
            System.out.print(word + " ");
        }

        boolean isEqual = compareArrays(usingCustomSplit, usingInBuiltSplit);
        System.out.println("\nAre the two arrays equal? " + isEqual);
    }

    public static int toFindTheLength(String s) {
        int n = 0;
        for (int i = 0;; i++) {
            try {
                char ch = s.charAt(i);
                n++;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException handled");
                break;
            }
        }
        return n;
    }

    public static String[] customSplit(String s, char delimiter, int n) {
        int wordCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == delimiter) {
                wordCount++;
            }
        }
        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == delimiter) {
                words[wordIndex++] = s.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        words[wordIndex] = s.substring(startIndex);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
