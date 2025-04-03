package day4.level2;

import java.lang.*;
import java.util.*;
public class Ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number  = sc.nextInt();
        if(number <= 0){
            System.out.println("Enter a valid number");
        }
        int result1 = sumRecurr(number);
        System.out.println("The sum of numbers using recurssion is " + result1);
        int result2 = sumOfNumbers(number);
        System.out.println("The sum of numbers without recurssion is " + result2);
        if(result1 == result2){
            System.out.println("The sums are equal");
        }
        else{
            System.out.println("The sums are not eual");
        }
    }

    public static int sumRecurr(int number){
        if (number == 0) {
            return 0; 
        } else {
            return number + sumRecurr(number - 1);
        }

    }

    public static int sumOfNumbers(int number){
        return (number *(number + 1))/2;
    }
}