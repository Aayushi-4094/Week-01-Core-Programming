package day4.level2;

import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        String result = isLeapYear(year);
        System.out.println(result);
    }

    public static String isLeapYear(int year){
        if(year <= 1582){
            System.err.println("Enter valid Year");
        }
        if(year%4==0 || (year%100 ==0 && year % 400 == 0)){
            return "It is a Leap year";
        }
        return "Not a Leap Year";
    }
}
