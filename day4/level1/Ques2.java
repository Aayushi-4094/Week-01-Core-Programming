package day4.level1;

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        double result = calculateMaximumNumberOfHanddhakes(number);
        System.out.println("the maximum number of handshakes are " + result);
            }
                public static double calculateMaximumNumberOfHanddhakes(int number){
            return  (number *(number-1))/2;
        }
    
}
