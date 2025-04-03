package day5.level3;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] uniqueChars = findUniqueChars(input);
        String[][] result = findCharFrequency(input, uniqueChars);
        System.out.println("Character Frequencies:");
        for (String[] row : result) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }
    public static String[] findUniqueChars(String str) {
        int[] charCount = new int[256];
        int uniqueChars = 0;
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int count : charCount) {
            if (count > 0) {
                uniqueChars++;
            }
        }
        String[] result = new String[uniqueChars];
        int index = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                result[index] = String.valueOf((char) i);
                index++;
            }
        }
        return result;
    }
    public static String[][] findCharFrequency(String str, String[] uniqueChars) {
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == uniqueChars[i].charAt(0)) {
                    count++;
                }
            }
            result[i][0] = uniqueChars[i];
            result[i][1] = String.valueOf(count);
        }
        return result;
    }
}
