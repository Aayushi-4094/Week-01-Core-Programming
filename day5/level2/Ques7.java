package day5.level2;
import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        int[] trimPoints = trimString(s);
        String trimmedString = createSubstring(s, trimPoints[0], trimPoints[1]);

        String builtInTrimmedString = s.trim();

        boolean isEqual = compareStrings(trimmedString, builtInTrimmedString);

        System.out.println("Original String: " + s);
        System.out.println("Trimmed String using custom method: " + trimmedString);
        System.out.println("Trimmed String using built-in trim() method: " + builtInTrimmedString);
        System.out.println("Are the two trimmed strings equal? " + isEqual);
    }

    public static int[] trimString(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        while (start <= end && s.charAt(end) == ' ') {
            end--;
        }

        return new int[] {start, end};
    }

    public static String createSubstring(String s, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(s.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}