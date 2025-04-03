package day4.level1;

import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter the date");
        int date = sc.nextInt();
        boolean result = springOrNot(month, date);
        if(result == true){
        System.out.println("The month is spring");
        }
        else{
            System.out.println("It is not spring");
        }

    }

    public static boolean springOrNot(int month, int date){
        if(month == 3 && date >=20 || month == 4 && date<=30 || month == 5 && date<=31 || month == 6 && date <= 20){
                return true;
        }
        else{
            return false;
        }
    }
}
