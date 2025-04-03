package day5.level2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        String[] words = splitText(s);
        String[][] wordLengths = getWordLengths(words);
        int[] shortestLongest = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);
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

    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        for (String[] wordLength : wordLengths) {
            int length = Integer.parseInt(wordLength[1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        return new int[] {shortest, longest};
}
}
