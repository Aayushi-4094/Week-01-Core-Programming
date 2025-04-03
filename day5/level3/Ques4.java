package day5.level3;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = findCharFrequency(input);
        System.out.println("Character Frequencies:");
        for (String[] row : result) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }
    public static String[][] findCharFrequency(String str) {
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
         String[][] result = new String[uniqueChars][2];
         int index = 0;
         for (int i = 0; i < charCount.length; i++) {
             if (charCount[i] > 0) {
                 result[index][0] = String.valueOf((char) i);
                 result[index][1] = String.valueOf(charCount[i]);
                 index++;
             }
         }
 
         return result;
     }
 }

