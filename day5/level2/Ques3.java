package day5.level2;
import java.lang.*;
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String[] words = splitText(s);
        String[][] wordLengths = getWordLengths(words);
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }
    }
    public static String[] splitText(String s) {
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[wordIndex++] = s.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        words[wordIndex] = s.substring(startIndex);
        return words;
    }
    public static int findLength(String s) {
        int n = 0;
        for (int i = 0;; i++) {
            try {
                char ch = s.charAt(i);
                n++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return n;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }
}



