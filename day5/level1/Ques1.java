package day5.level1;
import java.util.*;
class Ques1 {
  
    public static void main(String[] args) {        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string 1");
       String s1  = sc.next();
       System.out.println("Enter a string 2");
       String s2  = sc.next();
       boolean result = comparingString(s1, s2);
       if(result == true && s1.equals(s2) == true){
       System.out.println("The strings " + s1 +" and " + s2 + " are equal with the methods that is charAt and .equals");
       }
       if(result == false){
        System.out.println("The strings " + s1 +" and " + s2 + " are not equal with the methods that is charAt and .equals");
        }
    }

    public static boolean comparingString(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }
}
 