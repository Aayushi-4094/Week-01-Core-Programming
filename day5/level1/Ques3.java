package day5.level1;

import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        char[] result1 = isCharArray(s);
        for(int i = 0;i<result1.length;i++){
            System.out.print(result1[i]);
        }
        System.out.println();

        char[] result2 = s.toCharArray();
        for(char ch : result2){
            System.out.print(ch);
        }
        System.out.println();

        if(Arrays.equals(result1, result2)){
            System.out.println("The array are equal");
        } else{
            System.out.println("The array are not equal");
        }
    }

    public static char[] isCharArray(String s){
        char[] ch = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}
