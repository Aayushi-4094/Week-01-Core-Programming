package day4.level1;

import java.util.*;

public class Ques3 {
    final static int DISTANCE  = 5;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side 1");
            int a = sc.nextInt();
            System.out.println("Enter the side 2");
            int b = sc.nextInt();
            System.out.println("Enter the side 3");
            int c = sc.nextInt();
            double result = calculateNumberOfRounds(a, b, c);
            System.out.println("the maximum number of round are " + result);
                }
                    public static double calculateNumberOfRounds(int a, int b, int c){
                return  DISTANCE / (a+b+c);
        }
    }
    

 
    

