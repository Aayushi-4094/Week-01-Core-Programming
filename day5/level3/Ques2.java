package day5.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int l = lengthOfString(s);
        System.out.println("Length of the string: " + l);
        char[] uniqueArray = findUniqueArray(s, l);
        System.out.println("Unique characters: " + new String(uniqueArray));
    }

    public static int lengthOfString(String s) {
        char[] chArray = s.toCharArray();
        int count = 0;
        for (char c : chArray) {
            count++;
        }
        return count;
    }

    public static char[] findUniqueArray(String s, int l) {
        List<Character> ch = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (!ch.contains(s.charAt(i))) {
                ch.add(s.charAt(i));
            }
        }
        char[] result = new char[ch.size()];
        for (int j = 0; j < ch.size(); j++) {
            result[j] = ch.get(j);
        }
        return result;
    }
}

