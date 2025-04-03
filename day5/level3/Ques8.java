package day5.level3;

import java.util.Arrays;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter string 1");
        String s1 = sc.nextLine();
        System.out.println("ENter string 2");
        String s2 = sc.nextLine();
        if(isAnagram(s1, s2) == true){
            System.out.println("The strings are anagram");
        }
        else{
            System.out.println("The strings are not anagram");
        }
    }
    public static boolean isAnagram(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        if(lenS1 != lenS2){
            return false;
        }
        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();
        Arrays.sort(arrS1);
        Arrays.sort(arrS2);
        return Arrays.equals(arrS1, arrS2);
    }
}
