package day5.level3;

import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s  = sc.next();
        if(isPalindromeUisng2Pointers(s) == true){
            System.out.println("The string entered is palindrome using 2 pointers");
        }
        else {
            System.out.println("Not palindrome using 2 pointer");
        }
        if(isPalindoromeRecur(s,0,s.length()-1) == true){
            System.out.println("The string entered is palindrome using recursion ");
        }
        else {
            System.out.println("Not palindrome using recursion");
        }
        if(isBooleanReverse(s) == true){
            System.out.println("The string entered is palindrome using charArray ");
        }
        else {
            System.out.println("Not palindrome using charArray");
        } 
} 
    
    public static boolean isPalindromeUisng2Pointers(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true; 
    }

    public static boolean isPalindoromeRecur(String s, int i, int j){
        boolean x =true;
        if(x == false){
            return false;
        }
        if(i>=j)return true;
        if(s.charAt(i) == s.charAt(j)) {
         x = isPalindoromeRecur(s, i+1, j-1);
        }
        else{
            return false;
        }
        return true;
    }

    public static boolean isBooleanReverse(String s){
        char[] temp = s.toCharArray();
        char[] ch = new char[s.length()];
        for(int i = s.length(); i>= 0 ; i++){
            ch[i] = s.charAt(i);
        }
        for(int i = 0;i<s.length()-1;i++){
        if(temp[i] != ch[i]){
            return false;
        }
    }
        return true;
    }
}

