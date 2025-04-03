package day5.level2;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        int len1 = toFindTheLength(s);
        System.out.println("The length using custom method is " + len1);
        int len2 = s.length();
        System.out.println("The length using built-in method is " + len2);
        if(len1 == len2){
            System.out.println("The length using the custom method and the in-built method is same");
        } else{
            System.out.println("The length using the custom method and the in-built method is not same");
        }
    }

    public static int toFindTheLength(String s){
        int n = 0;
        for(int i = 0;;i++){
            try {
                char ch = s.charAt(i);
                n++;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException handled");
                break;
            }
        }
        return n;
    }
}

