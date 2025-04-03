package day5.level1;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        String lowerCaseString = toLowerCaseString(s);
        String javaLowerCaseString = s.toLowerCase();

        System.out.println("Lower case string using custom method: " + lowerCaseString);
        System.out.println("Lower case string using Java's toLowerCase() method: " + javaLowerCaseString);

        boolean isEqual = compareStrings(lowerCaseString, javaLowerCaseString);

        if (isEqual) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }
    }

    public static String toLowerCaseString(String s) {
        char[] newCh = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                newCh[i] = (char) (ch + 32);
            } else {
                newCh[i] = ch;
            }
        }
        return new String(newCh);
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }
}
