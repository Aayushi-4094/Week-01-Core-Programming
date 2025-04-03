package day5.level3;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] result = findCharFrequency(input);
        System.out.println("Character Frequencies:");
        for (String row : result) {
            System.out.println(row);
        }
    }
    public static String[] findCharFrequency(String str) {
        char[] chars = str.toCharArray();
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i] + ": 1";
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    int count = Integer.parseInt(result[i].split(":")[1].trim()) + 1;
                    result[i] = chars[i] + ": " + count;
                    chars[j] = '0';
                }
            }
        }
        return result;
}
}
