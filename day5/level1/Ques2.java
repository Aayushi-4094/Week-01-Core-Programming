package day5.level1;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println("Enter the staring index");
        int a  = sc.nextInt();
        System.out.println("Enter the end index");
        int b = sc.nextInt();
        if (a < 0 || b >= s.length() || a > b) {
            System.out.println("Invalid indices");
            return;
        }
        String result1 = substringUsingCharAt(s,a,b);
        System.out.println("the subtsring is using charAt " +result1);
        String result2 = s.substring(a,b);
        System.out.println("the subtsring is using substring method " +result2);
        boolean result = substringCharAtSub(result1, result2);
        if (result) {
            System.out.println("The substrings are equal using both methods");
        } else {
            System.out.println("The substrings are not equal using both methods");
        }
    }


    public static String substringUsingCharAt(String s, int a, int b){
        String s2 = "";
        for(int i = a;i<=b;i++){
            char ch = s.charAt(i);
            s2 += ch;
        }
        return s2;
    }

    public static boolean substringCharAtSub(String result1, String result2) {
        return result1.equals(result2);
    }
}
