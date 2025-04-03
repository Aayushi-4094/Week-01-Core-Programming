package day5.level2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("The character '" + ch + "' is a " + checkCharacter(ch));
        int[] count = findVowelsAndConsonants(s);
        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
    }

    public static String checkCharacter(char ch) {
        if(ch>= 'A' && ch<= 'Z'){
            ch = (char) (ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static int[] findVowelsAndConsonants(String s) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[] {vowelCount, consonantCount};
    }
}
