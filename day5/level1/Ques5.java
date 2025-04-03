package day5.level1;

import java.util.Scanner;

public class Ques5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        generateException(s);
        handleException(s);
    }
    public static void generateException(String s) {
        char invalidChar = s.charAt(s.length()); 
        System.out.println("This character should not be accessible: " + invalidChar);
    }
    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }
}
